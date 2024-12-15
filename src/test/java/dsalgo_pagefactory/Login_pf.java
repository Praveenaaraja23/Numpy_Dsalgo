package dsalgo_pagefactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;

public class Login_pf {

	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();

	@FindBy(xpath = "//button[@class='btn']")
	WebElement getstarted;
	@FindBy(xpath="//div[@class='navbar-nav']/ul[1]/a[3]")
	WebElement SigninSingnout;
	@FindBy(xpath="//a[@href='/login']")
	WebElement Signin;
	@FindBy(id = "id_username")
	WebElement username1;
	@FindBy(id = "id_password")
	WebElement password1;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement Login;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement successmsg;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signout;
	//public  WebDriver driver;
	@FindBy(xpath ="//div[@role='alert']")
	WebElement errormessage;
	@FindBy(xpath="//label[@for='id_username']")
	WebElement usernamefield;
	@FindBy(xpath="//label[@for='id_password']")
	WebElement passwordfield;
	@FindBy(xpath="//a[text()=' Vidya ']")
	WebElement loginpage;
	String expectedname = "Sign in";
	String expectedname2 = "Sign out";


	public Login_pf() {

		System.out.println("inside login_pf driver initialized for :"+((RemoteWebDriver) driver).getCapabilities().getBrowserName());
		PageFactory.initElements(driver , this);

	}

	public void GetStarted() {
		getstarted.click();


	}

	public void clicksign() {
		System.out.println("User is about to enter sign in");
		try {	
			Signin.click();
		}catch (Exception e) {
			System.out.println("Already Signed in");
		}
	}


	public void  login(String Username, String Password ){
		try {
			username1.clear();
			username1.sendKeys(Username);
			password1.clear();
			password1.sendKeys(Password);
			Login.click();	
		}catch (Exception e) {
			System.out.println("Already Logged in");
		}

	}


	public String printsuccessmessage( String SuccessMessage) {
		try {
			if(successmsg.getText().equals(SuccessMessage)) {
				System.out.println(successmsg.getText());		

			}
			else  {
				System.out.println("Title Not matched");

			}
		}catch (Exception e) {
			System.out.println("Element doesnt exists");
		}
		return SuccessMessage;

	}

    public  void Signout() {		
		signout.click();
	}	



	public void printErrormessage(String Errormessage) {

		try {
			if(errormessage.getText().equals(Errormessage)) {
				System.out.println(errormessage.getText());		

			}
			else  {
				System.out.println("Title Not matched");

			}
		} catch (Exception e) {
			String errormessage1 = username1.getAttribute("validationMessage");
			if(errormessage1.equals(Errormessage)) {
				System.out.println("Username Error message : " + errormessage1);
			}
			else if (password1.getAttribute("validationMessage").equals(Errormessage)){
				System.out.println("Password Error message : " + Errormessage);
			}


		} 

	}


	public void validatesigninpage() {
		String expectedusrfield="Username:";
		String expectedpaswdfield="Password:";

		try {
			if(usernamefield.getText().equals(expectedusrfield)) {
				System.out.println("User is in sign in page :" + usernamefield.getText());	
			}
			if(passwordfield.getText().equals(expectedpaswdfield)){
				System.out.println("User is in sign in page :" + passwordfield.getText());	

			}
			else {

				System.out.println("User is not in sign in page");	
			}

		}catch(Exception e) {

			System.out.println("Element does not exists");	
		}

	}




}