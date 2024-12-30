package dsalgo_stepdefinitions;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import dsalgo_hooks.Hooks;
import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;
import dsalgo_pagefactory.Linkedlist_pf;
import dsalgo_pagefactory.Login_pf;
import dsalgo_pagefactory.Register_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register_sd {

	//String Excelpath = ConfigReader.getExcelFilePath();
	Register_pf registerPage=new Register_pf();
	Linkedlist_pf linkedlist = new Linkedlist_pf();
	String expectedMessage = "";
	String actualMessage = "";
		
	
	@Given("The user navigates DSAlgo portal with url")
	public void the_user_navigates_ds_algo_portal_with_url() {
		
		assertEquals(registerPage.getstartedtext(),"Get Started" );
		LoggerLoad.info("User is in " +registerPage.getstartedtext()+ "page");
	    
	}
	
	@When("The user chooses to clicks on Getstarted button")
	public void the_user_chooses_to_clicks_on_getstarted_button() {
	    
		registerPage.GetStarted();
	}
	
	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		
		assertEquals(registerPage.getHomeDSText(), "Data Structures-Introduction", "title match");
		LoggerLoad.info("Error message is displaed " +registerPage.getHomeDSText()+ " below Password textbox");
	   
	}
	
	@Given("User initiates by clicking on Register link in home page")
	public void user_initiates_by_clicking_on_register_link_in_home_page() {
	
		registerPage.GetStarted();
		registerPage.Rlink();
	    
	}
	
	@When("The user verifies with {string} and {string} and {string} and click on login button.")
	public void the_user_verifies_with_and_and_and_click_on_login_button(String UserName, String pwd, String confpwd) {
		
		registerPage.login(UserName, pwd, confpwd);
		registerPage.click_login();
	}
	
	
	@Then("User must be able to see message {string} with inputs {string} and {string} and {string}")
	public void user_must_be_able_to_see_message_with_inputs_and_and(String Message, String UserName, String Password, String Passwordconfirmation) {
	
		String popupmsg=registerPage.printPopupmessage(UserName, Password, Passwordconfirmation);
		LoggerLoad.info("User Enters username as "  + UserName +  " and Password as "  + Password + 
				" and confirmPassword as "  + Passwordconfirmation);
		assertEquals(popupmsg, Message);
	    
	}
	
	@Then("User must be able to see the error msg {string}")
	public void user_must_be_able_to_see_the_error_msg(String Message) {
		String errormsg = registerPage.getActualMessage();
		assertEquals(errormsg, Message);
		
	}
	
	@Given("The user navigates to Register Page in home page")
	public void the_user_navigates_to_register_page_in_home_page() {
	  
		registerPage.GetStarted();
		registerPage.Rlink();
	}
	
	@When("The user tries to enter  {string} and {string} and {string} and clicks on login button")
	public void the_user_tries_to_enter_and_and_and_clicks_on_login_button(String UserName, String pwd, String confpwd) {
	  
		registerPage.login(UserName, pwd, confpwd);
		registerPage.click_login();	
	}
	
	@Then("User must be able to navigate to Home Page of DS Algo with {string} New Account Created. You are logged in as <username>")
	public void user_must_be_able_to_navigate_to_home_page_of_ds_algo_with_new_account_created_you_are_logged_in_as_username(String successMessage) {
	  
		String actualMessage=registerPage.getActualMessage();
		LoggerLoad.info("Sucess Message: " + actualMessage);
		assertEquals(actualMessage, successMessage);	
	}
	
	
	@When("^User wants to enter data from excel sheet (.*) and (.*)$")
	public void user_wants_to_enter_data_from_excel_sheet_and(String Sheetname, Integer rowNumber)
			throws InvalidFormatException, IOException {

		registerPage.login(registerPage.getExpectedValue(rowNumber, "UserName"),
				registerPage.getExpectedValue(rowNumber, "Password"),
				registerPage.getExpectedValue(rowNumber, "Passwordconfirmation"));
		registerPage.click_login();
	}

	@Then("^User is expected to see the Message in console output from excel sheet (.*) and (.*)$")
	public void user_is_expected_to_see_the_message_in_console_output_from_excel_sheet_and(String sheetName,
			Integer rowNumber) throws InvalidFormatException, IOException {

		expectedMessage = registerPage.getExpectedMessage(rowNumber);
		actualMessage = registerPage.getActualMessage(rowNumber);
		assertEquals(actualMessage,expectedMessage);
	}

	@Then("^User is expected to see the Error message in console output from excel sheet (.*) and (.*)$")
	public void user_is_expected_to_see_the_error_message_in_console_output_from_excel_sheet_and(String sheetName,
			Integer rowNumber) throws InvalidFormatException, IOException {

		expectedMessage = registerPage.getExpectedMessage(rowNumber);
		actualMessage = registerPage.getActualMessage();
		assertEquals(actualMessage,expectedMessage);
	}

	@Then("User is expected to navigate to home page and Message in console output from excel sheet (.*) and (.*)$")
	public void user_is_expected_to_navigate_to_home_page_and_message_in_console_output_from_excel_sheet_and(
			String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {

		expectedMessage = registerPage.getExpectedMessage(rowNumber);
		actualMessage = registerPage.getActualMessage();
		assertEquals(actualMessage,expectedMessage);
	}

}




