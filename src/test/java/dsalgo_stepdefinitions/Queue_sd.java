package dsalgo_stepdefinitions;


import static org.testng.Assert.assertEquals;

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
		
		//System.out.println("validation done");
		String hometitle = queue.Homepagetext();
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
	    
		//System.out.println("Validation ");
		String queuetitle = queue.Queuepagetext();
		assertEquals( queuetitle, "Queue");
		LoggerLoad.info("The user1 be directed to " +queuetitle+ "Data Structure Page");
		
	}
	
	
	
	@Given("The user1 in queue page")
	public void the_user1_in_queue_page() {
		queue.GetStarted_Queue();
		String queuetitle = queue.Queuepagetext();
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
		 
		//System.out.println("Validation");
		String impqueue = queue.impQuepagetext();
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
		
		//System.out.println("Validation");
		String tryeditor = queue.tryeditorpage();
		assertEquals( tryeditor, "Assessment");
		LoggerLoad.info("The user1 be directed to " +tryeditor+ " Queue in Python");

		
	}

	
	@Given("The user1 is in the try editor page")
	public void the_user1_is_in_the_try_editor_page() {
		queue.GetStarted_Queue();
		queue.implelink_Queue();
		queue.click_Tryherebtn();
		
		
	}


	//-------------------------------------------- code for try editor ----------------------------------------------------------------------
	
	@When("^The user1 should  enters queue the valid and invalid pythoncode (.*) and clicks Run button Queue$")
	public void the_user1_should_enters_queue_the_valid_and_invalid_pythoncode_and_clicks_run_button_queue(String samplecode) {
		queue.Entercode_Tryeditor(samplecode);
		   
		   queue.runbutton();
	}


	@Then("The user1 should able to see output in the console Output Queue")
	public void the_user1_should_able_to_see_output_in_the_console_output_queue() {
		
		String actualMsg = queue.ActualOutput();
		LoggerLoad.info("Actual result  :" + actualMsg);
	//	String actualMsg1 = tree_pf.getErrormsg();
		LoggerLoad.info("Actual result  :" + actualMsg);
		System.out.println("validation done"); 
	}
	
	
	//-------------------------------------------------------------------------------------------------------------

		

		@When("The user1 clicks Implementation using collections.deque  link")
		public void the_user1_clicks_implementation_using_collections_deque_link() {
			
			queue.Queuecollection();
		   
		}
		

		@Then("The user1 should be directed to Implementation using collections.deque Page")
		public void the_user1_should_be_directed_to_implementation_using_collections_deque_page() {
			
			System.out.println("Validation");
		  
		}




		@Given("The user1 is in the Queue implementation of queue  page after logged in")
		public void the_user1_is_in_the_queue_implementation_of_queue_page_after_logged_in() {
		  
			queue.GetStarted_Queue();
			queue.Queuecollection();
			
			
		}

		@When("The user1 clicks Try Here button in deque Queue in Python page")
		public void the_user1_clicks_try_here_button_in_deque_queue_in_python_page() {
			
			queue.click_Tryherebtn();
		    
		}
		
		
		@Then("The user1 should be redirected to a page having an try Editor with a Run button to test dqueue")
		public void The_user1_should_be_redirected_to_a_page_having_an_try_Editor_with_a_Run_button_to_test_dqueue() {
			
			System.out.println("Validation");
		}

			
		@Given("The user1 is in the try editor page of dqueue")
		public void the_user1_is_in_the_try_editor_page_of_dqueue() {
			queue.GetStarted_Queue();
			queue.Queuecollection();
			queue.click_Tryherebtn();
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
			
			System.out.println("Validation");
		}
		
	    
		
	
		@Given("The user1 is in the Queue implementation of array page")
		public void The_user1_is_in_the_Queue_implementation_of_array_page() {
			queue.GetStarted_Queue();
			queue.implelinkArray();
		}

		@When("The user1 clicks Try Here button in Queue in Python page")
		public void The_user1_clicks_Try_Here_button_in_Queue_in_Python_page() {
			
			queue.click_Tryherebtn();
		}

		@Then("The user1 should be redirected to a page having an try Editor with a Run button to test array page")
		public void The_user1_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_array_page() {
			
			System.out.println("Validation");
			
			
		}

		@Given("The user1 is in the try editor page of array page")
		public void The_user1_is_in_the_try_editor_page_of_array_page() {
		   
			queue.GetStarted_Queue();
			queue.implelinkArray();
			queue.click_Tryherebtn();
		}


		@Then("The user1 should be redirected to a page having an try Editor with a Run button to test")
		public void The_user1_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			
			System.out.println("Validation");
		}
		
		
		
		
		@When("The user1 click Queueoperations page link")
		public void the_user1_click_queueoperations_page_link() {
			
			queue.QueueOplink();
		}

		@Then("The user1 should be  on Queueoperations page")
		public void the_user1_should_be_on_queueoperations_page() {
		    
			System.out.println("Validation");
			
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

		@When("The user clicks Practice Questions link")
		public void the_user_clicks_practice_questions_button() {
			queue.click_Practice_Questions();
		    
		}

		@Then("The user1 should be redirected to Practice page")
		public void the_user1_should_be_redirected_to_practice_page() {
		    
			System.out.println("Validation");
		}



		


}
	
	
	
	
	
	
	
	
	
	
	
	


