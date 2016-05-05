package de.kaniba.presenter;

import java.io.Serializable;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public interface MyBarsPresenterInterface extends SecuredPresenter, Serializable {

	void enter(ViewChangeEvent event);

}
