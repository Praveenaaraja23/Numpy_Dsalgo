package dsalgo_stepdefinitions;


import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import dsalgo_pagefactory.Login_pf;
import dsalgo_pagefactory.Queue_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queue_sd 
{
	

WebDriver driver;
Queue_pf queue= new Queue_pf();


	@Given("The user1 is in homepage")
	public void the_user1_is_in_homepage() {
		
	
		String hometitle = queue.pagetitle();
		assertEquals( hometitle, "NumpyNinja");
		LoggerLoad.info("User1 is in" +hometitle+ "home page");
		

	}

	@When("The user1 clicks the Getting Started button in Queue Panel OR The user select Queue item from the drop down menu")
	public void the_user1_clicks_the_getting_started_button_in_queue_panel_or_the_user_select_queue_item_from_the_drop_down_menu() {
		
		LoggerLoad.info("User1 clicks on Getstarted button under linked list in home page");
		queue.GetStarted_Queue();
		
	}

	@Then("The user1 be directed to Queue Data Structure Page")
	public void the_user1_be_directed_to_queue_data_structure_page() {
	    
		
		String queuetitle = queue.pagetitle();
		assertEquals( queuetitle, "Queue");
		LoggerLoad.info("The user1 be directed to " +queuetitle+ "Data Structure Page");
		
	}
	
	
	
	@Given("The user1 in queue page")
	public void the_user1_in_queue_page() {
		queue.GetStarted_Queue();
		String queuetitle = queue.pagetitle();
		assertEquals( queuetitle, "Queue");
		LoggerLoad.info("The user1 be directed to " +queuetitle+ "Data Structure Page");
		
	}

	@When("The user1 clicks on Implementation of queue in python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
		
		LoggerLoad.info("The user1 clicks on Implementation of queue in python link");
		queue.implelink_Queue();
	}

	@Then("The user1 should be directed to Implementation of Queue in Python page")
	public void the_user1_should_be_directed_to_implementation_of_queue_in_python_page() {
		 
		
		String impqueue = queue.pagetitle();
		assertEquals( impqueue, "Implementation of Queue in Python");
		LoggerLoad.info("The user1 be directed to " +impqueue+ " of Queue in Python");
		
	}

	
	
	@Given("The user1 is on the Implementation of Queue in Python page")
	public void the_user1_is_on_the_implementation_of_queue_in_python_page() {
		
		queue.GetStarted_Queue();
		queue.implelink_Queue();
		
	}


	@Then("The user1 should be redirected to a page having an try Editor with a Run button to test Queue")
	public void the_user1_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_Queue() {
		
		
		String tryeditor = queue.pagetitle();
		assertEquals( tryeditor, "Assessment");
		LoggerLoad.info("The user1 be directed to " +tryeditor+ " Queue in Python");

		
	}

	

	//------------------------------------code for try editor ----------------------------------------------------//
	
	@Given("The user1 is in the tryEditor page for Implementation of Queue page")
	public void the_user_is_in_the_try_editor_page_for_Implementation_of_queue_page() {
		queue.GetStarted_Queue();
		queue.implelink_Queue();
		queue.Tryherebtn();
	}
	
	
	@When("^The user1 enter the valid and invalid pythoncode input from sheet (.*) and (.*) in Queue Clicks_run_button$")
	public void the_user1_enter_the_valid_pythoncode_input_from_sheet_and_in_queue_clicks_run_button(String Sheetname, Integer Rownumber) throws IOException, InvalidFormatException, IOException {
		
		String excelValue=queue.getCodefromExcel(Sheetname, Rownumber);
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + Rownumber);

		queue.Entercode_Tryeditor(excelValue);
		queue.runbutton();
	
	}

	@Then("^The user1 should able to see output in the console output from excelsheet (.*) and (.*) in Queue$")
	public void the_user1_should_able_to_see_output_in_the_console_output(String Sheetname , Integer Rownumber) throws InvalidFormatException, IOException {
	   
		String excelValue1=queue.getoutputfromExcel(Sheetname, Rownumber);
		LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
		String actual1=queue.getActualResult();
		LoggerLoad.info("Actual result  :" + actual1);
		assertEquals(actual1, excelValue1);
		
	}

	@Then("^The user1 get the error message from excelsheet (.*) and (.*)$")
	public void the_user1_get_the_error_message(String Sheetname,Integer Rownumber) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, InvalidFormatException, IOException {
		
		String excelValue1=queue.getoutputfromExcel(Sheetname, Rownumber);
		String popup1=queue.getErrormsg();
		LoggerLoad.info("Actual popup :" + popup1);
		assertEquals(popup1, excelValue1);

	}
//-------------------------------------------------------------------------------------------------//
		
		@When("The user1 clicks Implementation using collections.deque  link")
		public void the_user1_clicks_implementation_using_collections_deque_link() {
			
			queue.Queuecollection();
		   
		}
		

		@Then("The user1 should be directed to Implementation using collections.deque Page")
		public void the_user1_should_be_directed_to_implementation_using_collections_deque_page() {
			
			String dqueue = queue.pagetitle();
			assertEquals( dqueue, "Implementation using collections.deque");
			LoggerLoad.info("The user1 be directed to " +dqueue+ " page");
		  
		}

		@Given("The user1 is in the Queue implementation of queue  page after logged in")
		public void the_user1_is_in_the_queue_implementation_of_queue_page_after_logged_in() {
		  
			queue.GetStarted_Queue();
			queue.Queuecollection();
			
			
		}

		@When("The user1 clicks Try Here button in deque Queue in Python page")
		public void the_user1_clicks_try_here_button_in_deque_queue_in_python_page() {
			
			queue.Tryherebtn();
		    
		}
		
		
		@Then("The user1 should be redirected to a page having an try Editor with a Run button to test dqueue")
		public void The_user1_should_be_redirected_to_a_page_having_an_try_Editor_with_a_Run_button_to_test_dqueue() {
			
			String tryeditor = queue.pagetitle();
			assertEquals( tryeditor, "Assessment");
			LoggerLoad.info("The user1 be directed to " +tryeditor+ " to test dqueue");
		}

			
		@Given("The user1 is in the try editor page of dqueue")
		public void the_user1_is_in_the_try_editor_page_of_dqueue() {
			queue.GetStarted_Queue();
			queue.Queuecollection();
			queue.Tryherebtn();
		}
		
		
	
		@Given("The user1 is in the Queue page after logged in")
		public void The_user1_is_in_the_Queue_page_after_logged_in() {
			queue.GetStarted_Queue();
		}

		@When("The user1 click Implementation using Array link")
		public void The_user1_click_Implementation_using_Array_link() {
		
			
			queue.implelinkArray();
		}
		
		@Then("The user1 should be on Implementation using Array Page")
		public void The_user1_should_be_on_Implementation_using_Array_page() {
			
			String imparray = queue.pagetitle();
			assertEquals( imparray, "Implementation using array");
			LoggerLoad.info("The user1 be directed to " +imparray+ " page");
		  
		}
		
	   
		@Given("The user1 is in the Queue implementation of array page")
		public void The_user1_is_in_the_Queue_implementation_of_array_page() {
			queue.GetStarted_Queue();
			queue.implelinkArray();
		}

		@When("The user1 clicks Try Here button in Queue in Python page")
		public void The_user1_clicks_Try_Here_button_in_Queue_in_Python_page() {
			
			queue.Tryherebtn();
		}

		@Then("The user1 should be redirected to a page having an try Editor with a Run button to test array page")
		public void The_user1_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_array_page() {
			
		
			String tryeditor = queue.pagetitle();
			assertEquals( tryeditor, "Assessment");
			LoggerLoad.info("The user1 be directed to " +tryeditor+ " page");
			
			
		}

		@Given("The user1 is in the try editor page of array page")
		public void The_user1_is_in_the_try_editor_page_of_array_page() {
		   
			queue.GetStarted_Queue();
			queue.implelinkArray();
			queue.Tryherebtn();
		}


		@Then("The user1 should be redirected to a page having an try Editor with a Run button to test")
		public void The_user1_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			
			String tryeditor = queue.pagetitle();
			assertEquals( tryeditor, "Assessment");
			LoggerLoad.info("The user1 be directed to " +tryeditor+ " page");
		}
		
		
		
		
		@When("The user1 click Queueoperations page link")
		public void the_user1_click_queueoperations_page_link() {
			
			queue.QueueOplink();
		}

		@Then("The user1 should be  on Queueoperations page")
		public void the_user1_should_be_on_queueoperations_page() {
		    
			String queop = queue.pagetitle();
			assertEquals( queop, "Queue Operations");
			LoggerLoad.info("The user1 be directed to " +queop+ " page");
			
		}
			
		
	
		@Given("The user1 is in the Queueoperation page after logged in")
		public void the_user1_is_in_the_queueoperation_page_after_logged_in() {
		   
			queue.GetStarted_Queue();
		    queue.QueueOplink();
		}
		
	
		@Given("The user is in the Queue operation page after Sign in")
		public void the_user_is_in_the_queue_page_after_sign_in() {
		 
			queue.GetStarted_Queue();
			queue.QueueOplink();
			
			
		}
		
		
		@Given("The user1 is in the try editor page of queue op page")
		public void the_user1_is_in_the_try_editor_page_of_queue_op_page() {
			
			queue.GetStarted_Queue();
			queue.QueueOplink();
			queue.Tryherebtn();
		}
		
	

		@When("The user clicks Practice Questions link")
		public void the_user_clicks_practice_questions_button() {
			queue.click_Practice_Questions();
		    
		}

		@Then("The user1 should be redirected to Practice page")
		public void the_user1_should_be_redirected_to_practice_page() {
		    
			LoggerLoad.info("No practice Questions blank page is displayed");
			assertEquals(queue.Homepagetext1(),"Practice Questions");
			LoggerLoad.info("NO questions found ");
		}
		

}
	
	
	
	
	
	
	
	
	
	
	
	


