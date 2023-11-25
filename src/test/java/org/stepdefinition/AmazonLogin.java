package org.stepdefinition;

import java.util.List;

import org.pojo.AmazonPojo;
import org.sam.BaseClass;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonLogin extends BaseClass {
	AmazonPojo a;

	@When("To launch the url of amazon application")
	public void toLaunchTheUrlOfAmazonApplication() {
		launchUrl("https://www.amazon.in/");
	}

	@When("To click signIn button")
	public void toClickSignInButton() {
		a = new AmazonPojo();
		clickBtn(a.getAccount());
	}

	@When("To pass the valid email in email field")
	public void toPassTheValidEmailInEmailField(DataTable d) {
		List<String> l = d.asList();
		a = new AmazonPojo();
		passText(l.get(1), a.getEmail());
	}

	@When("To click the continue button")
	public void toClickTheContinueButton() {
		a = new AmazonPojo();
		clickBtn(a.getConBtn());
	}

	@When("To pass the valid password in the password field")
	public void toPassTheValidPasswordInThePasswordField(DataTable d) {
		List<List<String>> l = d.asLists();
		a = new AmazonPojo();
		passText(l.get(0).get(2), a.getPasswrd());
	}

	@When("To click the login button")
	public void toClickTheLoginButton() {
		a = new AmazonPojo();
		clickBtn(a.getSignIn());
	}

	@When("To check whether navigate to home page or not")
	public void toCheckWhetherNavigateToHomePageOrNot() {
		System.out.println("To check your login credentials");
	}

}
