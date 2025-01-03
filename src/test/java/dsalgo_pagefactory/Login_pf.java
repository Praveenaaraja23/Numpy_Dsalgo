package dsalgo_pagefactory;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;

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
	ExcelReader reader = new ExcelReader();
	String Excelpath = ConfigReader.excelpath();

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

    public String printsuccessmessage() {

		String succesmsg=successmsg.getText();

		return succesmsg;

	}

	public  void Signout() {		
		signout.click();
	}	

     public String printErrormessage() {
		String errormsg;
		errormsg=errormessage.getText();
		return errormsg;
	}
	public String printPopupmessage(String Username, String Password) {
		String popupmessage="";
		if(Username.isEmpty() || (Username.isEmpty() && Password.isEmpty()))
		{
			popupmessage = username1.getAttribute("validationMessage");
		}
		else if (Password.isEmpty())
		{
			popupmessage = password1.getAttribute("validationMessage");
		}
		return popupmessage;	
	}

    public String validatesigninpage() {
		String username=usernamefield.getText();
		return username;

	}

    public String getsuccessmsgfromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {	
		
		LoggerLoad.info("Set the path");
		LoggerLoad.info("ExcelPath-"+Excelpath);
		LoggerLoad.info("Sheetname-"+Sheetname);
		List<Map<String,String>> testData = reader.getData(Excelpath, Sheetname);
		LoggerLoad.info("To read the Data from Excelsheet");
		String SuccessMessage = testData.get(Rownumber).get("SuccessMessage");
		return SuccessMessage;

	}
	public String getusernamefromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {	
		
		LoggerLoad.info("Set the path");
		List<Map<String,String>> testData = 
				reader.getData(Excelpath, Sheetname);

		String Username  = testData.get(Rownumber).get("Username");
		return Username;
	}

	public String getpasswordfromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {	
		
		LoggerLoad.info("Set the path");
		List<Map<String,String>> testData = 
				reader.getData(Excelpath, Sheetname);

		String password  = testData.get(Rownumber).get("Password");
		return password;
	}

	public String geterrormsgfromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {	
		LoggerLoad.info("Set the path");
		List<Map<String,String>> testData = 
				reader.getData(Excelpath, Sheetname);

		String ErrorMessage = testData.get(Rownumber).get("ErrorMessage");
		return ErrorMessage;

	}
	public String getpopupmsgfromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {	
		System.out.println(Excelpath);
		LoggerLoad.info("Set the path");
		List<Map<String,String>> testData = 
				reader.getData(Excelpath, Sheetname);

		String popupmsg = testData.get(Rownumber).get("ErrorMessage");
		return popupmsg;


	}
}