package de.kaniba.model;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vaadin.tapio.googlemaps.client.LatLon;

import de.kaniba.utils.LoggingUtils;
import de.kaniba.utils.Utils;

/**
 * This Class represents a bar.
 * 
 * @author philipp
 *
 */
public class Bar {
	public static final int UNKNOWNBARID = -1;

	private int barID;
	private Admin barOwner;
	private Pinboard pinboard;
	private Address address;
	private List<Special> currentSpecials;
	private List<Special> allSpecials;
	private int sumGeneralRating;
	private int sumPprRating;
	private int sumMusicRating;
	private int sumPeopleRating;
	private int sumAtmosphereRating;
	private int countRating;
	private String description;
	private String name;

	/**
	 * Creates a bar but does not set a valid id.
	 */
	public Bar() {
		barID = UNKNOWNBARID;
	}

	/**
	 * Reads a bar from the database. If the bar does not exisist, this throws a null pointer exception.
	 * @param barID The ID of the bar. Must be a valid one.
	 * @throws SQLException
	 */
	public Bar(int barID) throws SQLException {
		Bar t = Database.readBar(barID);

		this.barID = barID;
		this.barOwner = t.getBarOwner();
		this.pinboard = t.getPinboard();
		this.address = t.getAddress();
		this.sumAtmosphereRating = t.getSumAtmosphereRating();
		this.sumGeneralRating = t.getSumGeneralRating();
		this.sumMusicRating = t.getSumMusicRating();
		this.sumPeopleRating = t.getSumPeopleRating();
		this.sumPprRating = t.getSumPprRating();
		this.countRating = t.getCountRating();
		this.name = t.getName();
		this.description = t.getDescription();
	}

	/**
	 * Writes the bar to the database. If the bar is already in the database, it
	 * is just updated.
	 * 
	 * @return Returns true, if there were no problems writing to the database.
	 * @throws SQLException
	 *             Throws an Excepton, if the database could not be accessed, or
	 *             other problemes related to the database occured.
	 */
	public boolean saveBar() throws SQLException {
		return Database.saveBar(this);
	}

	public int getBarID() {
		return barID;
	}

	public void setBarID(int barID) {
		this.barID = barID;
	}

	public DisplayRating getDisplayRating() {
		double general = getGeneralRating();
		double price = getPprRating();
		double music = getMusicRating();
		double people = getPeopleRating();
		double atmosphere = getAtmosphereRating();

		return new DisplayRating(general, price, music, people, atmosphere);
	}

	public double getGeneralRating() {
		if (countRating == 0) {
			return 0;
		}
		return (double) sumGeneralRating / (double) countRating;
	}

	public double getPprRating() {
		if (countRating == 0) {
			return 0;
		}
		return (double) sumPprRating / (double) countRating;
	}

	public double getMusicRating() {
		if (countRating == 0) {
			return 0;
		}
		return (double) sumMusicRating / (double) countRating;
	}

	public double getPeopleRating() {
		if (countRating == 0) {
			return 0;
		}
		return (double) sumPeopleRating / (double) countRating;
	}

	public double getAtmosphereRating() {
		if (countRating == 0) {
			return 0;
		}
		return (double) sumAtmosphereRating / (double) countRating;
	}

	public Admin getBarOwner() {
		return barOwner;
	}

	public void setBarOwner(Admin barOwner) {
		this.barOwner = barOwner;
	}

	/**
	 * Returns the pinboard. The pinboard is read only once from the database.
	 * 
	 * @return Returns the pinboard. This pinboard might be outdated.
	 */
	public Pinboard getPinboard() {
		if (pinboard == null) {
			try {
				pinboard = Database.givePinboard(barID);
			} catch (SQLException e) {
				LoggingUtils.exception(e);
			}
		}
		return pinboard;
	}

	/**
	 * Returns the pinboard. This methods reads the pinboard from the database,
	 * while the getPinboard method only reads the pinboards once and then just
	 * returns the local copy of it, which might not reflect changes made.
	 * 
	 * @return Returns the pindoard. This is always the latetst pinboard.
	 */
	public Pinboard forceGetPinboard() {
		try {
			pinboard = Database.givePinboard(barID);
		} catch (SQLException e) {
			LoggingUtils.exception(e);
		}
		return pinboard;
	}

	public void setPinboard(Pinboard pinboard) {
		this.pinboard = pinboard;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getSumGeneralRating() {
		return sumGeneralRating;
	}

	public void setSumGeneralRating(int sumGeneralRating) {
		this.sumGeneralRating = sumGeneralRating;
	}

	public int getSumPprRating() {
		return sumPprRating;
	}

	public void setSumPprRating(int sumPprRating) {
		this.sumPprRating = sumPprRating;
	}

	public int getSumMusicRating() {
		return sumMusicRating;
	}

	public void setSumMusicRating(int sumMusicRating) {
		this.sumMusicRating = sumMusicRating;
	}

	public int getSumPeopleRating() {
		return sumPeopleRating;
	}

	public void setSumPeopleRating(int sumPeopleRating) {
		this.sumPeopleRating = sumPeopleRating;
	}

	public int getSumAtmosphereRating() {
		return sumAtmosphereRating;
	}

	public void setSumAtmosphereRating(int sumAtmosphereRating) {
		this.sumAtmosphereRating = sumAtmosphereRating;
	}

	public int getCountRating() {
		return countRating;
	}

	public void setCountRating(int countRating) {
		this.countRating = countRating;
	}

	// Es macht unter Umständen Sinn, nur die Specials anzuzeigen, die aktuell
	// laufen, z.B. beim anzeigen der specials für den normalen User.
	public List<Special> getCurrentSpecials() throws SQLException {
		if (currentSpecials != null) {
			return Utils.copyList(currentSpecials);
		} else {
			currentSpecials = Database.readCurrentSpecials(barID);
			return Utils.copyList(currentSpecials);
		}
	}

	// Zeigt alle Specials an, hilfreich für Admins
	public List<Special> getAllSpecials() throws SQLException {
		if (allSpecials != null) {
			return Utils.copyList(allSpecials);
		} else {
			allSpecials = Database.readCurrentSpecials(barID);
			return Utils.copyList(allSpecials);
		}
	}

	/*
	 * TODO: Das Special nur auf die aktuelle Liste setzen, wenn es da wirklich
	 * hingehört, also auf das Datum prüfen
	 */
	/**
	 * Add a special to this bar.
	 * 
	 * @param special
	 *            The special to add.
	 */
	public void addSpecial(Special special) {
		currentSpecials.add(special);
		allSpecials.add(special);
	}

	/**
	 * Muss vielleicht von Zeit zu Zeit ausgeführt werden, falls es Probleme mit
	 * der kontinuierlichen Zählung der Ratings gibt
	 */
	public void updateRating() {
		try {
			Database.checkRatings(barID);
		} catch (SQLException e) {
			LoggingUtils.exception(e);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return name + ", " + description + ", Ratings: " + countRating;
	}

	/**
	 * Returns a one line representation of a bar.
	 * 
	 * @param bar
	 *            The bar to format
	 * @return Returns the formatted address.
	 */
	public String getOneLineAddress() {
		String onleLineAddress = "";

		onleLineAddress += getAddress().getStreet();
		onleLineAddress += " " + getAddress().getNumber();
		onleLineAddress += ", " + getAddress().getZip();
		onleLineAddress += " " + getAddress().getCity();

		return onleLineAddress;
	}

	/**
	 * Returns the coordinates of a bar.
	 * 
	 * @param bar
	 *            The bar to search for
	 * @return Returns the coordinates.
	 */
	public LatLon getLatLon() {
		String jsonString;
		String url = "http://maps.google.com/maps/api/geocode/json?address=" + prepareAddressForGoogle()
				+ "&sensor=false";
		try {
			jsonString = Utils.downloadURL(url);
		} catch (MalformedURLException e) {
			jsonString = "";
			LoggingUtils.exception(e);
		}

		try {
			JSONArray results = new JSONObject(jsonString).getJSONArray("results");
			JSONObject result = (JSONObject) results.get(0);

			double lat = result.getJSONObject("geometry").getJSONObject("location").getDouble("lat");
			double lon = result.getJSONObject("geometry").getJSONObject("location").getDouble("lng");
			return new LatLon(lat, lon);
		} catch (JSONException e) {
			LoggingUtils.exception(e);
			LoggingUtils.log(url);
			LoggingUtils.log(jsonString);
			return null;
		}
	}

	private String prepareAddressForGoogle() {

		String preparedAddress = "";
		preparedAddress += getAddress().getStreet();
		preparedAddress += " " + getAddress().getNumber();
		preparedAddress += "," + getAddress().getZip();
		preparedAddress += " " + getAddress().getCity();

		try {
			preparedAddress = URLEncoder.encode(preparedAddress, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			LoggingUtils.exception(e);
			return null;
		}

		return preparedAddress;
	}

	/**
	 * Tries to find a bar from a parameter. The paramater is expected to be one
	 * single number.
	 * 
	 * @param params
	 *            The param string.
	 * @return Returns a bar or null if none was found.
	 */
	public static Bar getBarFromParams(String params) {
		Bar bar = null;

		if (params != null) {

			int id = -1;
			try {
				id = Integer.parseInt(params);
			} catch (NumberFormatException e) {
				// don't do anything.
				// An invalid ID was supplied
			}

			if (id != -1) {
				try {
					bar = Database.readBar(id);
				} catch (SQLException e) {
					// don't do anything.
					// An invalid ID was supplied
				}
			}
		}
		return bar;
	}
}
