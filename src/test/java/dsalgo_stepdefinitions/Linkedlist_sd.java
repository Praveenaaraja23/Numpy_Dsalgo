package dsalgo_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import dsalgo_pagefactory.Linkedlist_pf;
import dsalgo_pagefactory.Register_pf;
import dsalgo_utils.ConfigReader;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Linkedlist_sd {
	
	
		Linkedlist_pf linkedlist = new Linkedlist_pf();
		Register_pf register =new Register_pf();
		
		
	@Given("The user is in home page after Sign in")
	public void the_user_is_in_home_page_after_sign_in() {
		String hometitle = register.Homepagetext();
		assertEquals( hometitle, "NumpyNinja");
		LoggerLoad.info("User is in" +hometitle+ "home page");
		
	}

	@When("The user clicks the {string} button under Linked List section")
	public void the_user_clicks_the_button_under_linked_list_section(String string) {
		LoggerLoad.info("User clicks on Getstarted button under linked list in home page");
		linkedlist.clickLLgetstarted();
	}

	@Then("The user should navigate to linked list home page")
	public void the_user_should_navigate_to_linked_list_home_page() {
	   
		LoggerLoad.info("user navigated to" +linkedlist.linkedlistpagetext()+ "page");
	}

	@Given("The user is on the {string} page after clicks on get started")
	public void the_user_is_on_the_page_after_clicks_on_get_started(String string) {
		
		linkedlist.clickLLgetstarted();
	    
	}

	@When("User clicks on\"Introduction\" link")
	public void User_clicks_on_introduction_link() {
	   linkedlist.clickIntroductionLink();
	}

	@Then("The user should be redirected to the {string} of linked list Page")
	public void the_user_should_be_redirected_to_the_of_linked_list_page(String stringpages) {
		//System.out.println("I am in "+stringpages);
		assertEquals(linkedlist.getallpagestext(),stringpages );
		LoggerLoad.info("user navigated to" +linkedlist.getallpagestext()+ "page");

		}


	@Given("User is in {string} page")
	public void User_is_in_page(String string) {

		
		linkedlist.clickLLgetstarted();
		 linkedlist.clickIntroductionLink();
		
	}

	@When("The users clicks on {string} button in {string} page")
	public void the_users_clicks_on_button_in_page(String string, String string2) {
	  
		linkedlist.clickTryhere();
	}

	@Then("The user should be redirected to the page having an try Editor with a Run button")
	public void the_user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button() {
	    
		LoggerLoad.info("user is in try editor page with" +linkedlist.gettextrun()+ "button");
	}

	@Given("The user is in the try Editor page for Introduction page")
	public void the_user_is_in_the_try_editor_page_for_introduction_page() {
		LoggerLoad.info("User is in tryeditor page of Introduction page"); 
		linkedlist.clickLLgetstarted();
		 linkedlist.clickIntroductionLink();
		 linkedlist.clickTryhere();
	}

	/*

	@When("^The user tries to enter valid and invalid python code in try Editor (.*) and click on Run$")
	public void the_user_tries_to_enter_valid_and_invalid_python_code_in_try_editor_and_click_on_run(String Pythoncode) throws InterruptedException {
		
		linkedlist.EnterTryeditor(Pythoncode);
		
		linkedlist.clickrunbtn();
		Thread.sleep(2000);
		
	}


	@When("^User gets valid and invalid inputs from (.*) and (.*) in try Editor and click on Run$")
	public void user_gets_valid_and_invalid_inputs_from_and_in_try_editor_and_click_on_run(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	String pythoncode= linkedlist.CodefromExcel(Sheetname, RowNumber);
		linkedlist.EnterTryeditor(pythoncode);
		linkedlist.clickrunbtn();
		Thread.sleep(2000);
	}
	*/

	@When("^User gets inputs from (.*) and (.*) in try Editor and click on Run")
	public void user_gets_inputs_from_and_in_try_editor_and_click_on_run(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		String pythoncode= linkedlist.CodefromExcel(Sheetname, RowNumber);
		linkedlist.EnterTryeditor(pythoncode);
		linkedlist.clickrunbtn();
		Thread.sleep(2000);	
	}



	@Then("^User should be able to see output in the console Output for valid data from (.*) and (.*)$")
	public void user_should_be_able_to_see_output_in_the_console_output_for_valid_data_from_and(String sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		 String result=linkedlist.ResultfromExcel(sheetname,RowNumber);
		   LoggerLoad.info("Expected result - Excel Sheet :" + result);
		   System.out.println("excel" +result);
		   LoggerLoad.info("Actual Result is:" +linkedlist.getActualResult());
		   System.out.println("Actual Result is:" +linkedlist.getActualResult());
		   assertEquals(linkedlist.getActualResult(),result);
		
	}

	@Then("^User should be able to see output in the console Output for invalid data from (.*) and (.*)$")
	public void user_should_be_able_to_see_output_in_the_console_output_for_invalid_data_from_and(String sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		String result=linkedlist.ResultfromExcel(sheetname,RowNumber);
		LoggerLoad.info("Expected result - Excel Sheet :" + result);
		System.out.println("Expected result - Excel Sheet :" + result);
		String result1 = linkedlist.alertmsg();
		   LoggerLoad.info("Actual Result is:" + result1);
		   System.out.println("Actual Result is:" +result1);
		  assertEquals(result1,result);
		
	}



	@When("User clicks on the\"Creating Linked List\" link")
	public void User_clicks_on_the_creating_linked_list_link() {
		
		linkedlist.clickCreatingLinkedlistLink();
	}

	@When("The user clicks {string} button in a Creating Linked List page")
	public void the_user_clicks_button_in_a_creating_linked_list_page(String string) {
	   
		linkedlist.clickTryhere();
	}

	@Given("The user is in try Editor page of Creating Linked List page")
	public void the_user_is_in_try_editor_page_of_creating_linked_list_page() {
		LoggerLoad.info("User is in tryeditor page of Creating Linked List page with" +linkedlist.gettextrun()+ "button");
		linkedlist.clickLLgetstarted();
		linkedlist.clickIntroductionLink();
		 linkedlist.clickCreatingLinkedlistLink();
		 linkedlist.clickTryhere();
	}


	@When("User clicks on\"Types of Linked List\" link")
	public void User_clicks_on_types_of_linked_list_link() {
		
		linkedlist.clicktypesOfLinkedlistLink();
	}

	@When("User clicks {string} button in a Types of Linked List page")
	public void User_clicks_button_in_a_types_of_linked_list_page(String string) {
		linkedlist.clickTryhere(); 
		
	}

	@Given("The user is in the try Editor page for Types of Linked List page")
	public void the_user_is_in_the_try_editor_page_for_types_of_linked_list_page() {
		
		LoggerLoad.info("User is in tryeditor page of Types of Linked List page");
		linkedlist.clickLLgetstarted();
		linkedlist.clickIntroductionLink();
		linkedlist.clicktypesOfLinkedlistLink();
		 linkedlist.clickTryhere();
		
	}

	@When("User clicks on\"Implement Linked List in Python\" link")
	public void User_clicks_on_implement_linked_list_in_python_link() {
	  
		linkedlist.clickimplementLinkedlistInPythonLink();
	}

	@When("The user clicks {string} button in a Implement Linked List in Python page")
	public void the_user_clicks_button_in_a_implement_linked_list_in_python_page(String string) {
	  
		linkedlist.clickTryhere();
	}
	@Given("The user is in the try Editor page for Implement Linked List")
	public void the_user_is_in_the_try_editor_page_for_implement_linked_list() {
		LoggerLoad.info("User is in tryeditor page of Implement Linked List page");
		linkedlist.clickLLgetstarted();
		linkedlist.clickIntroductionLink();
		linkedlist.clickimplementLinkedlistInPythonLink();
		 linkedlist.clickTryhere();
	}

	@When("User clicks on\"Traversal\" link")
	public void User_clicks_on_traversal_link() {
		
		linkedlist.clicktraversalLink();
	   
	}

	@When("The user clicks {string} button in a Traversal page")
	public void the_user_clicks_button_in_a_traversal_page(String string) {
		
		linkedlist.clickTryhere();
	 
	}

	@Given("The user is in the try Editor page for Traversal")
	public void the_user_is_in_the_try_editor_page_for_traversal() {
		LoggerLoad.info("User is in tryeditor page of Traversal page");
		linkedlist.clickLLgetstarted();
		linkedlist.clickIntroductionLink();
		linkedlist.clicktraversalLink();
		 linkedlist.clickTryhere();
	}

	@When("User clicks on\"Insertion\" link")
	public void User_clicks_on_insertion_link() {
	  
		linkedlist.clickinsertion();
	}

	@When("The user clicks {string} button in a Insertion page")
	public void the_user_clicks_button_in_a_insertion_page(String string) {
	  
		linkedlist.clickTryhere();
	}

	@Given("The user is in the try Editor page for Insertion")
	public void the_user_is_in_the_try_editor_page_for_insertion() {
		LoggerLoad.info("User is in tryeditor page of Insertion page");
		linkedlist.clickLLgetstarted();
		linkedlist.clickIntroductionLink();
		linkedlist.clickinsertion();
		linkedlist.clickTryhere();
	}

	@When("User clicks on\"Deletion\" link")
	public void User_clicks_on_deletion_link() {
	  
		linkedlist.clickdeletionLink();
	}

	@When("The user clicks {string} button in a Deletion page")
	public void the_user_clicks_button_in_a_deletion_page(String string) {
		linkedlist.clickTryhere();
	}

	@Given("The user is in the try Editor page for Deletion")
	public void the_user_is_in_the_try_editor_page_for_deletion() {
	  
		LoggerLoad.info("User is in tryeditor page of Deletion page");
		linkedlist.clickLLgetstarted();
		linkedlist.clickIntroductionLink();
		linkedlist.clickdeletionLink();
		linkedlist.clickTryhere();
	}

	@Given("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		linkedlist.clickLLgetstarted();
		linkedlist.clickIntroductionLink();
	   
	}

	@When("The user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
	   linkedlist.clickpracticeQuestion();
	}

	@Then("The user should be redirected to Practice Questions of Linked List Page")
	public void the_user_should_be_redirected_to_practice_questions_of_linked_list_page() {
		
		LoggerLoad.info("No practice Questions blank page is displayed");
		assertEquals(register.Homepagetext(),"practice Questions");
	   
	}


	}





