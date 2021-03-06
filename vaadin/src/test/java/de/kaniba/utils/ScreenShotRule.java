package de.kaniba.utils;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class ScreenShotRule extends TestWatcher {
	private WebDriver browser;

	public ScreenShotRule(WebDriver browser) {
		this.browser = browser;
	}

	public void setDriver(WebDriver driver) {
		this.browser = driver;
	}

	@Override
	protected void failed(Throwable e, Description description) {
		System.out.println("tests failed");
		TakesScreenshot takesScreenshot = (TakesScreenshot) browser;

		File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = getDestinationFile(description);
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException ioe) {
			System.out.println("Fail on saving screenshot");
			throw new RuntimeException(ioe);
		}
		browser.quit();
	}

	@Override
	protected void finished(Description description) {
		if (browser != null) {
			browser.quit();
		}
	}

	private File getDestinationFile(Description description) {
		String fileName = "./screenshots/" + description.getDisplayName() + "_fail_"
				+ Calendar.getInstance().getTimeInMillis() + ".png";
		String absoluteFileName = fileName;
		System.out.println(absoluteFileName);
		return new File(absoluteFileName);
	}
}