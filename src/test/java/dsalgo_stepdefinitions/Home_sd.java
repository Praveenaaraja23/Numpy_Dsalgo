package dsalgo_stepdefinitions;


import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import dsalgo_pagefactory.Homepage_pf;
import dsalgo_pagefactory.Login_pf;
import dsalgo_pagefactory.Queue_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Home_sd 
{


	Homepage_pf home = new Homepage_pf();


	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {

		System.out.println("ds algo validation done");
		
		//String dspage = home.Dspage();
		//assertEquals( dspage, "NumpyNinja");
		//LoggerLoad.info("User1 is in" +dspage+ " page");
			
		LoggerLoad.info("The user is able to see the " + home.Dspage() + " Logo.");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {

		home.GetStarted();

	}


	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {

		//System.out.println("ds algo validation done");
		LoggerLoad.info("The user is able to redirected " + home.Gethome() + " home page.");
		

	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {

		LoggerLoad.info("The user is in " + home.Gethome() + "page.");
		home.GetStarted();

	}


	@When("^The user clicks on Get Started link on homepage (.*) without login$")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) {
		
		home.buttonselect(option);

	}


	@Then("^The user get (.*)$")
	public void The_user_get(String warningmessage) {
	
		home.printwarnmsg(warningmessage);
		
	}


	@When("^The user clicks on dropdown (.*) without signin$")
	public void The_user_clicks_on_dropdown_without_signin(String option) {
		
			
			home.dropdownselect(option);
			
		}

		@When("The user clicks on signin link")
		public void the_user_clicks_on_signin_link() {
		    
			home.signin();
		}
		@Then("The user redirected to login page")
		public void the_user_redirected_to_login_page() {
		    
			System.out.println("ds algo sign in validation done");
		}



		@When("The user clicks on register link")
		public void The_user_clicks_on_register_link() {
		    
			home.register();
		}
		@Then("The user redirected to Registration page")
		public void The_user_redirected_to_Registration_page() {
		    
			System.out.println("ds algo Reg validation done");
		}

		@Given("The user is on the DS Algo Portal")
		public void the_user_is_on_the_ds_algo_portal() {
		  
			System.out.println("ds algo validation done");
			
		}
		
		
		
		@Then("The user should be navigated to the Data Structure Introduction page, which displays the Register and Sign in links.")
		public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_register_and_sign_in_links() {
		    
			
			System.out.println("The user should be on homepage");
		}

}