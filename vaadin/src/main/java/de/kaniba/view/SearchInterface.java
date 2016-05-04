package de.kaniba.view;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public interface SearchInterface {

	/**
	 * Searches the database
	 * @param searchValue The string to search for
	 */
	void updateSearchView(String searchValue);

	/**
	 * Forwards the enter event.
	 * @param event
	 */
	void enter(ViewChangeEvent event);

}