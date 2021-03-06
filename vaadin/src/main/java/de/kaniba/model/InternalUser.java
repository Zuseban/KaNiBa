package de.kaniba.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.vaadin.server.VaadinSession;

import de.kaniba.utils.LoggingUtils;
import de.kaniba.utils.Utils;

/**
 * This class represents an InternalUser. A user becomes an InternalUser by
 * logging in.
 * 
 * @author Philipp
 *
 */
public class InternalUser extends User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sessionID;
	private int userID;
	private Email email;
	private String password;
	private String name;
	private String firstname;
	private Date birthdate;
	private Address address;

	/**
	 * Initializes the user. All the fields have to be initialized with the setters.
	 */
	public InternalUser() {
		super();
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * Methode, um einfach eine Bar zu bewerten.
	 * 
	 * @param bar
	 *            Die Bar, die bewertet werden soll.
	 * @param rating
	 *            Das Ratig, das abgegeben wird.
	 * @throws SQLException
	 */
	public void rateBar(Bar bar, Rating rating) throws SQLException {
		if (ratedBar(bar)) {
			Rating oldRating = getRating(bar.getBarID());
			int diffGeneral = rating.getGeneralRating() - oldRating.getGeneralRating();
			int diffPpr = rating.getPprRating() - oldRating.getPprRating();
			int diffMusic = rating.getMusicRating() - oldRating.getMusicRating();
			int diffPeople = rating.getPeopleRating() - oldRating.getPeopleRating();
			int diffAtmosphere = rating.getAtmosphereRating() - oldRating.getAtmosphereRating();

			bar.setSumAtmosphereRating(bar.getSumAtmosphereRating() + diffAtmosphere);
			bar.setSumGeneralRating(bar.getSumGeneralRating() + diffGeneral);
			bar.setSumMusicRating(bar.getSumMusicRating() + diffMusic);
			bar.setSumPeopleRating(bar.getSumPeopleRating() + diffPeople);
			bar.setSumPprRating(bar.getSumPprRating() + diffPpr);

			Database.saveBarRating(rating);
		} else {
			bar.setSumAtmosphereRating(bar.getSumAtmosphereRating() + rating.getAtmosphereRating());
			bar.setSumGeneralRating(bar.getSumGeneralRating() + rating.getGeneralRating());
			bar.setSumMusicRating(bar.getSumMusicRating() + rating.getMusicRating());
			bar.setSumPeopleRating(bar.getSumPeopleRating() + rating.getPeopleRating());
			bar.setSumPprRating(bar.getSumPprRating() + rating.getPprRating());
			bar.setCountRating(bar.getCountRating() + 1);

			Database.saveBarRating(rating);
		}
	}

	/**
	 * Methode um zu bestimmen, ob der User eine bestimmte Bar schon bewertet
	 * hat. Die UserID wird hierbei aus dem aktuellen User genommen
	 * 
	 * @param bar
	 *            Die Bar, die überprüft wird.
	 * @return Gibt true, wenn der User die Bar bereits bewertet hat.
	 */
	public boolean ratedBar(Bar bar) {
		try {
			return Database.getRating(userID, bar.getBarID()) != null;
		} catch (SQLException e) {
			LoggingUtils.exception(e);
			return false;
		}
	}

	/**
	 * Gibt das Rating, dass der User für eine Bar abgegeben hat.
	 * 
	 * @param barID
	 *            Die Bar, von der das Rating abgefragt wird
	 * @return Gibt das Rating zurück, oder null falls die Bar noch nicht
	 *         bewertet wurde.
	 * @throws SQLException
	 */
	public Rating getRating(int barID) throws SQLException {
		return Database.getRating(userID, barID);
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getBirthdate() {
		return new Date(birthdate.getTime());
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = new Date(birthdate.getTime());
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return this.address;
	}

	/**
	 * Save the user to the database
	 * @throws SQLException
	 */
	public void saveUser() throws SQLException {
		this.userID = Database.saveUser(this);
	}

	/**
	 * This returns the user, that is stored in the ession. If the user
	 * informations change from somwhere elese than this users view, the changes
	 * will not be reflected in this user. If this is the case read the user
	 * from database.
	 * 
	 * @return The user in the session
	 */
	public static InternalUser getUser() {
		VaadinSession session = Utils.getSession();
		Admin admin = session.getAttribute(Admin.class);
		InternalUser internalUser = (InternalUser) session.getAttribute("user");

		if (admin != null) {
			return new Admin(internalUser);
		}

		return internalUser;
	}

	public List<Bar> getSuggestions() throws SQLException {
		return Database.getSuggestions(userID);
	}

}
