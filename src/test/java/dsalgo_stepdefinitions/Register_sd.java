package dsalgo_stepdefinitions;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import dsalgo_hooks.Hooks;
import dsalgo_utils.DriverManager;
import dsalgo_utils.LoggerLoad;
import dsalgo_pagefactory.Login_pf;
import dsalgo_pagefactory.Register_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_sd {
	


	Register_pf Registerpage=new Register_pf();
	
@Given("The User navigates DSAlgo portal with url")
public void the_user_navigates_ds_algo_portal_with_url() {
	LoggerLoad.info("Navigated to dsalgoportal");
	
	
}

@When("User clicks on Getstarted button")
public void user_clicks_on_get_started_button() throws InterruptedException {
	
	Registerpage.GetStarted();
	
	
  
}

@Then("User should be navigated to home page")
public void user_should_be_navigated_to_home_page() {
	
	String hometitle = Registerpage.Homepagetext();
	assertEquals( hometitle, "NumpyNinja", "title match");
	//System.out.println("Error message is displaed " + register.emptyPwdErrorMsg() + " below Password textbox");
	//assertEquals(register.emptyPwdErrorMsg(), expErrorMsg);
	
    }

//@Given("The user clicks on Register link in home page")
//public void the_user_clicks_on_register_link_in_home_page() {
//	
//	Registerpage.GetStarted();
//	Registerpage.Rlink();
//	
//}


//@When("^The user enters (.*) and (.*) and (.*)$")
//public void the_user_enters_and_and(String username, String password, String confirmpassword) throws InterruptedException {
//	
//	Registerpage.login(username, password, confirmpassword);
//	
//}
//
//@Then("The user should be able to see the error msg {string}")
//public void the_user_should_be_able_to_see_the_error_msg(String Errormsg) {
//	
//	String actualMessage = Registerpage.actMsg();
//	Assert.assertEquals("Please fill out this field", Errormsg, actualMessage);
//    
//}


@Given("The user navigates to Register Page in home page")
public void the_user_navigates_to_register_page_in_home_page() throws InterruptedException {

	Registerpage.GetStarted();
	Registerpage.Rlink();
}


@When("The user tries to enter  {string} and {string} and {string}")
public void the_user_tries_to_enter_and_and(String username, String password, String confirmpassword) throws InterruptedException {
    
	Registerpage.login(username, password, confirmpassword);
	
}

@Then("The user should navigate to Home Page of DS Algo with {string} New Account Created. You are logged in as <username>")
public void the_user_should_navigate_to_home_page_of_ds_algo_with_new_account_created_you_are_logged_in_as_username(String Message) {
    
	 LoggerLoad.info("valid user:" +Message);
	
}



	
}



	