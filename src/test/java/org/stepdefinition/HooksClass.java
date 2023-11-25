package org.stepdefinition;

import org.sam.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void preCondition() {
		launchBrowser();
		windowMaximize();
	}

	@After
	public void postCondition() {
		closeEntireBrowser();

	}
}
