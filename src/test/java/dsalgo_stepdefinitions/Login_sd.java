package dsalgo_stepdefinitions;

import static org.testng.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dsalgo_hooks.Hooks;
import dsalgo_utils.DriverManager;
import dsalgo_utils.LoggerLoad;
import dsalgo_pagefactory.Login_pf;

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
		login.validatesigninpage();
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
	    login.printsuccessmessage(SuccessMessage);
	    LoggerLoad.info("User clicks on login button");
		LoggerLoad.info("Expected Message - feature exampels :  " +SuccessMessage);
		
	}

	@Then("The user should logout from Ds Algo page")
	public void the_user_should_logout_from_ds_algo_page() {
		
		login.Signout();	    
	}

	@When("^The user clicks login button after entering invalid (.*) and (.*)$")
	public void the_user_clicks_login_button_after_entering_invalid_and(String Username, String Password) {
		 login.login(Username, Password);
		 LoggerLoad.info("Empty field value is validated");
		 
			
		
	}

	@Then("^The user should see an (.*)$")
	public void the_user_should_see_an(String Errormessage) {
		login.printErrormessage(Errormessage);	    
	}



}