//Datastructures stepdefinitions

package dsalgo_stepdefinitions;


import dsalgo_pagefactory.Datastructures_pf;
//import dsalgo_pagefactory.Tree_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructures_sd {
	
	Datastructures_pf ds_pf = new Datastructures_pf();

	//DataStructures
	
	@Given("The user is in homepage after signin")
	public void the_user_is_in_homepage_after_signin() {
	    System.out.println("You are in DS page");
	}

	@When("The user clicks the Getting Started button in DataStructures Panel OR The user select DataStructures item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_data_structures_panel_or_the_user_select_data_structures_item_from_the_drop_down_menu() {
		ds_pf.GetStarted();
	}

	@Then("The user be directed to Data Structures in Data Structures Page")
	public void the_user_be_directed_to_data_structures_in_data_structures_page() {
		 System.out.println("The User is on the Data structures page");
			}
	
	 //TimeComplexity
	
	@Given("The user is in Data Structures page")
	public void the_user_is_in_data_structures_page() {
		System.out.println("The User is on the Data structures page");
	}

	@When("The user clicks the Time Complexity button in Data Structures Page")
	public void the_user_clicks_the_time_complexity_button_in_data_structures_page() {
		ds_pf.GetStarted();
		ds_pf.Timecomplexity();
	}

	@Then("The user be directed to Time Complexity in Data Structures Page")
	public void the_user_be_directed_to_time_complexity_in_data_structures_page() {
		System.out.println("The User is on the Timecomplexity page");
	}
	
	//Try_Editor_in_TimeComplexity
	
	@Given("The user is on the Time Complexity in Data Structures page")
	public void the_user_is_on_the_time_complexity_in_data_structures_page() {
		System.out.println("The User is on the Timecomplexity page");
	}

	@When("The user clicks Try Here button in Time Complexity page")
	public void the_user_clicks_try_here_button_in_time_complexity_page() {
		ds_pf.GetStarted();
		ds_pf.Timecomplexity();
		ds_pf.TryHere();
	}

	@Then("The user should be redirected to a page having an {string} with a Run button to test in the Time Complexity page")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_run_button_to_test_in_the_time_complexity_page(String string) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("The User is on the TryHere page");
	}
	
	@Given("The user is in the tryEditor page of DataStructures")
	public void the_user_is_in_the_try_editor_page_of_data_structures() {
		ds_pf.GetStarted();
		ds_pf.Timecomplexity();
		ds_pf.TryHere();
		System.out.println("The User is on the Tryeditor page");
	}
	
	@When("^The user enters code in (.*) and clicks Run button in DataStructures page$")
	public void the_user_enters_code_in_and_clicks_run_button_in_data_structures_page(String string) {
	   ds_pf.Entercode_Tryeditor(string);
	   ds_pf.Runcommand();
	}
	
	@Then("The user should able to see output in the console DataStructures tryeditor page")
	public void the_user_should_able_to_see_output_in_the_console_data_structures_tryeditor_page() throws InterruptedException {
		String actualMsg = ds_pf.ActualOutput();
		LoggerLoad.info("Actual result  :" + actualMsg);
		Thread.sleep(1000);
        System.out.println(" the user is on try editor in DS page");
	}


	@When("The user gave sample code as  wrongcode in tryeditor and click run button in Time Complexity page")
	public void the_user_gave_sample_code_as_wrongcode_in_tryeditor_and_click_run_button_in_time_complexity_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get NameError:name'wrongcode'	is not defined on line {int}")
	public void the_user_should_get_name_error_name_wrongcode_is_not_defined_on_line(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user gave sample code as   in tryeditor and click run button in Time Complexity page")
	public void the_user_gave_sample_code_as_in_tryeditor_and_click_run_button_in_time_complexity_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get Some error should come")
	public void the_user_should_get_some_error_should_come() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
