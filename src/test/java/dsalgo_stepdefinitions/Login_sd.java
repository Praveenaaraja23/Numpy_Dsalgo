package dsalgo_stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dsalgo_hooks.Hooks;
import dsalgo_pagefactory.Login_pf;
import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class Login_sd {

	Login_pf login=new  Login_pf();
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {

		login.GetStarted();	
		LoggerLoad.info("User is on Home Page");   
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
		login.clicksign();    
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		String username = login.validatesigninpage();
		assertEquals(username, "Username:", "Title do not match");
		
	}	


	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {

		login.GetStarted();	
		login.clicksign();   
		LoggerLoad.info("User is on Signin Page");
	}

	@When("^The user clicks login button after entering valid (.*) and (.*)$")
	public void the_user_clicks_login_button_after_entering_valid_and(String Username, String Password) {
		login.login(Username , Password);	
	}

	@Then("^The user should land in Data Structure Home Page with message (.*)$")
	public void the_user_should_land_in_data_structure_home_page_with_message(String SuccessMessage ) {
		
		String successmsg = login.printsuccessmessage();
		assertEquals(successmsg, SuccessMessage);
		LoggerLoad.info("Expected Message - feature exampels :  " +SuccessMessage);
		

	}

	@Then("The user should logout from Ds Algo page")
	public void the_user_should_logout_from_ds_algo_page() {

		login.Signout();	    
	}

	@When("^The user clicks login button after entering invalid (.*) and (.*)$")
	public void the_user_clicks_login_button_after_entering_invalid_and(String Username, String Password) {
		login.login(Username, Password);
		



	}

	@Then("^The user should see an (.*)$")
	public void the_user_should_see_an(String ErrorMessage) {
		
		String errormsg=login.printErrormessage();
		assertEquals(errormsg, ErrorMessage);
		
		
	}
	@Then("^The user1 should see an (.*) and takes input (.*) and (.*)$")
	public void the_user1_should_see_an(String popupmessage,String Username, String Password) {
		
		String popup=login.printPopupmessage(Username,Password);
		assertEquals(popup, popupmessage);
		
	}
	@When("user clicks login to DsAlgo application for valid with {string} and {int}")
	public void user_clicks_login_to_ds_algo_application_for_valid_with_and(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException {
		
		String username =login.getusernamefromExcel(Sheetname, Rownumber);
		String password =login.getpasswordfromExcel(Sheetname, Rownumber);
		
		login.login(username, password);
		
		
		
	}
	@Then("^user should see an (.*) and (.*)$")
	public void user_should_see_an(String Sheetname, int Rownumber) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, InvalidFormatException, IOException {
		
		String excelSuccess=login.getsuccessmsgfromExcel(Sheetname, Rownumber);
		String actualSuccess=login.printsuccessmessage();
		assertEquals(actualSuccess,excelSuccess); 
	}
	@Then("^user14 should see an (.*) and (.*)$")
	public void user14_should_see_an_and_row_number(String Sheetname, Integer Rownumber) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, InvalidFormatException, IOException {
		String errorMessage=login.geterrormsgfromExcel(Sheetname, Rownumber);
		String actualError=login.printErrormessage();
		assertEquals(actualError,errorMessage);
	}

	@Then("^user15 should see an (.*) and (.*)$")
	public void user15_should_see_an(String Sheetname ,Integer Rownumber) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, InvalidFormatException, IOException {
		String username =login.getusernamefromExcel(Sheetname, Rownumber);
		String password =login.getpasswordfromExcel(Sheetname, Rownumber);
		String popupmsg=login.getpopupmsgfromExcel(Sheetname, Rownumber);
			String actualpopup=login.printPopupmessage(username,password);
				assertEquals(actualpopup,popupmsg);
	}

}
