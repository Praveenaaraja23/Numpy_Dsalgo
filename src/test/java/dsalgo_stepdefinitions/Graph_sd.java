package dsalgo_stepdefinitions;

import dsalgo_pagefactory.Graph_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph_sd {
	
	Graph_pf gra_pf = new Graph_pf();

	//NavigatetoGraph
	
	@Given("The user is in the Home page after Sign into the Ds algo portal")
	public void the_user_is_in_the_home_page_after_sign_in() {
		 System.out.println("You are in Ds algo portal page");
	}

	@When("The user clicks the Getting Started button in Graph Panel of the page OR The user select Graph item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_graph_panel_of_the_page_or_the_user_select_graph_item_from_the_drop_down_menu() {
		gra_pf.GetStarted();
	}

	@Then("The user be directed to Graph Page")
	public void the_user_be_directed_to_graph_page() {
		System.out.println("The User is on the graph page");
	}
	
	//Try_Here_in_Graph_Page
	
	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		System.out.println("You are in Ds algo portal - Graph page");
	}

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page() throws InterruptedException {
		gra_pf.GetStarted();
		gra_pf.graph();
		Thread.sleep(1000);
		gra_pf.tryEditorLink();
	}

	@Then("The user should be redirected to a page having an TryEditor with a Run button to test in Graph page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_graph_page() {
		System.out.println("The User is on the Graph's Tryhere page");
	}
	
	// @Try_Editor_in_Graph_Page
	
	@Given("The user is in the tryEditor page of Graph")
	public void the_user_is_in_the_try_editor_page_of_graph() {
		gra_pf.GetStarted();
		gra_pf.graph();
		gra_pf.tryEditorLink();
		System.out.println("The User is on the Graph's TryEditor page");
	}
	@When("^The user enters code in (.*) and clicks Run button in Graph page$")
	public void the_user_enters_code_in_and_clicks_run_button_in_graph_page(String SampleEditor) {
		gra_pf.Entercode_Tryeditor(SampleEditor);
		gra_pf.runcmd();
	}
	@Then("The user should able to see output in the console graph tryeditor page")
	public void the_user_should_able_to_see_output_in_the_console_graph_tryeditor_page() throws InterruptedException {
		String actualMsg = gra_pf.ActualOutput();
        LoggerLoad.info("Actual result  :" + actualMsg);
		Thread.sleep(1000);
        System.out.println(" the user is on try editor in DS page");
	    //System.out.println("The User is on the Graph's console page\");
	}


	//Graph Representations
	
	@Given("The user is in the Graph page after Sign in")
	public void the_user_is_in_the_graph_page_after_sign_in() {
		System.out.println("The User is on the Graph page");
	}

	@When("The user clicks Graph Representations button in the Graph page")
	public void the_user_clicks_graph_representations_button_in_the_graph_page() {
		gra_pf.GetStarted();
		gra_pf.graphRepresentationsLink();
	}

	@Then("The user should be redirected to Graph Representations in Graph page")
	public void the_user_should_be_redirected_to_graph_representations_in_graph_page() {
		System.out.println("The User is on the Graph Representations link");
	}

	@Given("The user is on the Graph Representations in Graph page")
	public void the_user_is_on_the_graph_representations_in_graph_page() {
		System.out.println("The User is on the Graph Representations in Graph page");
	}

	@When("The user clicks Try Here button in Graph Representations in Graph page")
	public void the_user_clicks_try_here_button_in_graph_representations_in_graph_page() {
		gra_pf.GetStarted();
		gra_pf.graphRepresentationsLink();
		gra_pf.tryEditorLink();
	}

	@Then("The user should be redirected to  page having an TryEditor with a Run button to test the python code in Graph page")
	public void the_user_should_be_redirected_to_page_having_an_try_editor_with_a_run_button_to_test_the_python_code_in_graph_page() {
		System.out.println("The User is on the Try here Graph Representations in Graph page");
	}
	
	 //Try_Editor_in_Graph_Representations
	
	@Given("The user1 is on the Graph Representations in Graph Representations page")
	public void the_user1_is_on_the_graph_representations_in_graph_representations_page() {
		gra_pf.GetStarted();
		gra_pf.graphRepresentationsLink();
		gra_pf.tryEditorLink();
	}
	//^The user enters code in (.*) and clicks Run button in Graph page$
	@When("^The user1 enters code in (.*) and clicks Run button in Graph Representations page$")
	public void the_user1_enters_code_in_and_clicks_run_button_in_graph_representations_page(String SampleEditor) {
		gra_pf.Entercode_Tryeditor(SampleEditor);
		gra_pf.runcmd();
	}
	@Then("The user1 should able to see output in the console graph Representations tryeditor page")
	public void the_user1_should_able_to_see_output_in_the_console_graph_representations_tryeditor_page() throws InterruptedException {
		String actualMsg = gra_pf.ActualOutput();
        LoggerLoad.info("Actual result  :" + actualMsg);
		Thread.sleep(1000);
        System.out.println(" the user is on try editor in DS page");
	}

	
}



	

