package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class AmazonPojo extends BaseClass{
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	private WebElement account;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(id = "continue")
	private WebElement conBtn;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwrd;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement signIn;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getConBtn() {
		return conBtn;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getSignIn() {
		return signIn;
	}

}
