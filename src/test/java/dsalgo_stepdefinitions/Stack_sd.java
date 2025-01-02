package dsalgo_stepdefinitions;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import dsalgo_pagefactory.Stack_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//Background
public class Stack_sd {
	
	Stack_pf stack= new Stack_pf();
	
	//@StackPage
	
	@Given("The user is in the Home page after Sign in for Stack page")
	public void the_user_is_in_the_home_page_after_sign_in_for_stack_page() {
//		System.out.println("The user is in Stack Page");
		LoggerLoad.info("The user is in Stack Page");
	  
	}	

	@When("The user clicks the Getting Started button in Stack Panel of the page OR The user select Stack item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_stack_panel_of_the_page_or_the_user_select_stack_item_from_the_drop_down_menu() throws InterruptedException {
	 
		
		stack.GetStarted_Stack();
		Thread.sleep(2000);
	}

	@Then("The user be directed to Stack Data Structure Page")
	public void the_user_be_directed_to_stack_data_structure_page() {
		String Title = stack.getStackPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, "Stack", "Title do not match");
	    System.out.println("the user is on Stack page");
	}

	
	
	@Given("The user is in the Stack page after Sign in")
	public void the_user_is_in_the_stack_page_after_sign_in() {
	LoggerLoad.info(" the user is in Stack page");
		stack.GetStarted_Stack();
		
	}

	@When("The user clicks Operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {
	
		stack.Operations_in_Stack_Link();
	}

	@Then("The user should be redirected to Operations in Stack page")
	public void the_user_should_be_redirected_to_operations_in_stack_page() {
	    System.out.println("the user is on OPerations Stack Page");
	    String Title = stack.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Operations in Stack", "Title do not match");
	    
	}

	//@Try_Editor_in_Operations_in_Stack1
	@Given("The user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
		System.out.println("the user is on the OPerations Stack Page");
	}

	@When("The user clicks Try Here button in Operations in Stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
	   stack.GetStarted_Stack();
	   stack.Operations_in_Stack_Link();
	   stack.TryHere_Link();
	}

	@Then("The user should be redirected to a page having an TryEditor with a Run button to test in Operations in Stack page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_operations_in_stack_page() {
//		System.out.println("the user is on Editor Page");
		String Title = stack.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}
//@Try_Editor_in_Operations_in_Stack2
	
	@Given("The user is in the tryEditor pageof Operations in Stack page")
	public void the_user_is_in_the_try_editor_pageof_operations_in_stack_page() {
	   stack.GetStarted_Stack();
	   stack.Operations_in_Stack_Link();
	   stack.TryHere_Link();
	}
	@When("^The user enters code in (.*) and clicks Run button in Python page$")
	public void the_user_enters_code_in_print_hello_and_clicks_run_button_in_operations_in_stack_in_python_page(String TryEditor1) {
       stack.TryEditorbox(TryEditor1);
       stack.RunButton();
       
	}
	@Then("The user should able to see output in the console Stack tryeditor page")
	public void the_user_should_able_to_see_output_in_the_console_operations_in_stack_tryeditor_page() {
		String actualMsg = stack.ActualOutput();	
		LoggerLoad.info("Actual result  :" + actualMsg);

		System.out.println(" the user is on try editor in Python page");
	}
	
	
	//Try_Editor_in_Operations_in_Stack_in_DataDriven
	@Given("The user1 is in the tryEditor page for Operations in Stack")
	public void the_user_is_in_the_try_editor_page_for_operations_in_stack() {
		
		   stack.GetStarted_Stack();
		   stack.Operations_in_Stack_Link();
		   stack.TryHere_Link();
	   	}
	@When("^The user1 enter the valid pythoncode input from sheet (.*) and (.*) in Operations in Stack$")
	public void the_user_enter_the_valid_pythoncode_input_from_sheet_and_in_operations_in_stack(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		String excelValue=stack.getCodefromExcel(Sheetname, Rownumber);
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + Rownumber);

		stack.Entercode_Tryeditor(excelValue);
		stack.RunButton();
	}
	@Then("^The user1 should able to see output in the console with valid and invalid from excelsheet (.*) and (.*) in Stack$")
	public void the_user_should_able_to_see_output_in_the_console_with_valid_and_invalid_from_excelsheet_and_in_stack(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		String excelValue1=stack.getoutputfromExcel(Sheetname, Rownumber);
		LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
		String actual1=stack.getActualResult();
		LoggerLoad.info("Actual result  :" + actual1);
		assertEquals(actual1, excelValue1);
	}
	
	
	@Then("^in Stack The user1 gets error message from excelsheet (.*) and (.*)$")
	public void in_stack_the_user_gets_error_message_from_excelsheet_and(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		String excelValue1=stack.getoutputfromExcel(Sheetname, Rownumber);
		String popup1=stack.getErrormsg();
		LoggerLoad.info("Actual popup :" + popup1);

		assertEquals(popup1, excelValue1);
	}
	
	
	//@Implementations_in_Stack
	@When("The user clicks Implementation button")
	public void the_user_clicks_implementation_button() throws InterruptedException {
	   stack.Implementations_Link();
	   Thread.sleep(1000);
	}
	@Then("The user should be redirected to Implementation page")
	public void the_user_should_be_redirected_to_implementation_page() {
	  
	   System.out.println("THe user is in Implementaion page");
	   String Title = stack.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Implementation", "Title do not match");
	   
	}

	
	//@Try_Editor_in_Implementation_in_Stack1
	
	@Given("The user is on the Implementation in Stack page")
	public void the_user_is_on_the_implementation_in_stack_page() {
		stack.GetStarted_Stack();
		stack.Implementations_Link();
	   
	}
	
	@When("The user clicks Try Here button in Implementation_in_Stack in Stack page")
	public void the_user_clicks_try_here_button_in_implementation_in_stack_in_stack_page() {
		 stack.TryHere_Link();
	}
	
	@Then("The user should be redirected to a page having an TryEditor with a Run button to test of the Implementation page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_of_the_implementation_page() {
	  System.out.println("THe user is on try editor page");
	}
	
	//@Try_Editor_in_Implementation_in_Stack2
	
		@Given("The user is in the tryEditor page of Implementation Page in Stack Module")
		public void the_user_is_in_the_try_editor_page_of_implementation_page_in_stack_module() {
			 stack.GetStarted_Stack();
			   stack.Implementations_Link();
			   stack.TryHere_Link();
		   
		}
		
		//Try_Editor_in_Implementaion_in_Stack_in_DataDriven
		@Given("The user1 is in the tryEditor page for Implementaion in Stack")
		public void the_user1_is_in_the_try_editor_page_for_implementaion_in_stack() {
			   stack.GetStarted_Stack();
			   stack.Implementations_Link();
			   stack.TryHere_Link();
		}
		@When("^The user1 enter the valid pythoncode input from sheet (.*) and (.*) in Implementaion in Stack$")
		public void the_user1_enter_the_valid_pythoncode_input_from_sheet_phythoncode_and_in_implementaion_in_stack(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
			String excelValue=stack.getCodefromExcel(Sheetname, Rownumber);
			LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
					+ " and row number : " + Rownumber);

			stack.Entercode_Tryeditor(excelValue);
			stack.RunButton();	String excelValue1=stack.getoutputfromExcel(Sheetname, Rownumber);
			LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
			String actual1=stack.getActualResult();
			LoggerLoad.info("Actual result  :" + actual1);
			assertEquals(actual1, excelValue1);
		}



//@Applications_in_Stack
	@When("The user clicks Application button")
	public void the_user_clicks_application_button() {
	   stack.Applications_Link();
	}

	@Then("The user should be redirected to Application page")
	public void the_user_should_be_redirected_to_application_page() {
		String Title = stack.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Applications", "Title do not match");
	}
//@Try_Editor_in_Application_in_Stack1
	@Given("The user is on the Application in Stack page")
	public void the_user_is_on_the_application_in_stack_page() {
		 System.out.println("The user is on Application page");
	}

	@When("The user clicks Try Here button in Application in Stack page")
	public void the_user_clicks_try_here_button_in_application_in_stack_page() {
	    stack.GetStarted_Stack();
	    stack.Applications_Link();
	    stack.TryHere_Link();
	}

	@Then("The user should be redirected to a page having an TryEditor with a Run button to test of the Application in Stack page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_of_the_application_in_stack_page() {
	    System.out.println("the user is on Try here Editor");
	}

	@Given("The user is in the tryEditor page of Application in Stack2")
	public void the_user_is_in_the_try_editor_page_of_application_in_stack2() {
		
		stack.GetStarted_Stack();
	    stack.Applications_Link();
	    stack.TryHere_Link();
	   
	}

	//Try_Editor_in_Application_in_Stack_in_DataDriven
	@Given("The user1 is in the tryEditor page for Application in Stack")
	public void the_user1_is_in_the_try_editor_page_for_application_in_stack() {
		stack.GetStarted_Stack();
	    stack.Applications_Link();
	    stack.TryHere_Link();
	}
	@When("^The user1 enter the valid pythoncode input from sheet (.*) and (.*) in Application in Stack$")
	public void the_user1_enter_the_valid_pythoncode_input_from_sheet_and_in_application_in_stack(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		
		String excelValue=stack.getCodefromExcel(Sheetname, Rownumber);
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + Rownumber);

		stack.Entercode_Tryeditor(excelValue);
		stack.RunButton();
	    
	}
	
	//Practice_questions_page
	@When("The User clicks Practice questions link")
	public void the_user_clicks_practice_questions_link() {
		 
		 stack.Operations_in_Stack_Link();
		stack.PracticeQuestions_Link(); 
	}
	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		System.out.println("THe user is in Practice questions page");
		LoggerLoad.info("No practice Questions blank page is displayed");
		assertEquals(stack.Homepagetext(),"practice Questions");
		LoggerLoad.info("NO questions found ");
	}
	
	
}
	
	



