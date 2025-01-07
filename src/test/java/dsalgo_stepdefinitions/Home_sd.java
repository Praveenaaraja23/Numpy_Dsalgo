package dsalgo_stepdefinitions;


import static org.testng.Assert.assertEquals;
import dsalgo_pagefactory.Homepage_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Home_sd 
{
	Homepage_pf home = new Homepage_pf();

		@Given("The user opens DS Algo portal link")
		public void the_user_opens_ds_algo_portal_link() {

		String dspage = home.pagetitle();
		LoggerLoad.info("User1 is in " + dspage + " page");
			
		}
	
		@When("The user clicks the Get Started button")
		public void the_user_clicks_the_get_started_button() {
		
		LoggerLoad.info("User clicks on Getstarted button on Main Page");
		home.GetStarted();

		}

		@Then("The user should be redirected to homepage")
		public void the_user_should_be_redirected_to_homepage() {
			
		String homepage=home.pagetitle();	
		assertEquals( homepage, "NumpyNinja");
		LoggerLoad.info("The user is able to redirected " + home.pagetitle() + " home page.");
		
		}
	
		@Given("The user is on Home page")
		public void the_user_is_on_home_page() {

		LoggerLoad.info("The user is in " + home.pagetitle() + "page.");
		home.GetStarted();

		}


		@When("^The user clicks on Get Started link on homepage (.*) without login$")
		public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) {
		
		home.buttonselect(option);

		}


		@Then("^The user wants to see (.*)$")
		public void The_home_user_gets(String warningmessage) {
	
		home.printwarnmsg(warningmessage);
		
		String alert = home.alert();
		LoggerLoad.info("Actual Message : " + alert);
		assertEquals(alert, warningmessage, "Title do not match");
		
		}

		
		@When("^The user clicks on dropdown (.*) without signin$")
		public void The_user_clicks_on_dropdown_without_signin(String option) {
		
			
			home.dropdownselect(option);
		}
	
		
		@When("The user clicks on signin link")
		public void the_user_clicks_on_signin_link() {
			
			LoggerLoad.info("User clicks on Sign in ");
			home.signin();
		}
		
		@Then("The user redirected to login page")
		public void the_user_redirected_to_login_page() {
		    
			
			String loginpage = home.pagetitle();
			assertEquals( loginpage, "Login");
			LoggerLoad.info("User1 is in " +loginpage+ " page");
		}

		@When("The user clicks on register link")
		public void The_user_clicks_on_register_link() {
			
			LoggerLoad.info("User clicks on Register link ");
			home.register();
		}
		
		@Then("The user redirected to Registration page")
		public void The_user_redirected_to_Registration_page() {
		    
			
			String Registerpage = home.pagetitle();
			assertEquals( Registerpage, "Registration");
			LoggerLoad.info("User1 is in " +Registerpage+ " page");
			
		}

		

}