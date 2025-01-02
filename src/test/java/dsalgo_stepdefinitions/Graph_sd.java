package dsalgo_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import dsalgo_pagefactory.Graph_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph_sd {

	Graph_pf gra_pf = new Graph_pf();

	// NavigatetoGraph

	@Given("The user is in the Home page after Sign into the Ds algo portal")
	public void the_user_is_in_the_home_page_after_sign_in() {
		//public void the_user_is_in_homepage_after_signin() {
			String hometitle = gra_pf.pagetitle();
			assertEquals( hometitle, "NumpyNinja");
			LoggerLoad.info("User1 is in" + hometitle + " page");
		//LoggerLoad.info("You are in Ds algo portal page");
	}

	@When("The user clicks the Getting Started button in Graph Panel of the page OR The user select Graph item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_graph_panel_of_the_page_or_the_user_select_graph_item_from_the_drop_down_menu() {
		gra_pf.GetStarted();
	}

	@Then("The user be directed to Graph Page")
	public void the_user_be_directed_to_graph_page() {
		String graphtitle = gra_pf.pagetitle();
		assertEquals(graphtitle, "Graph");
		LoggerLoad.info("User1 is in" + graphtitle + " page");
		//LoggerLoad.info("The User is on the graph page");
	}

	// Try_Here_in_Graph_Page

	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		gra_pf.GetStarted();
		String graphtitle = gra_pf.pagetitle();
		assertEquals(graphtitle, "Graph");
		LoggerLoad.info("User1 is in" + graphtitle + " page");
		//LoggerLoad.info("You are in Ds algo portal - Graph page");
	}

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page() throws InterruptedException {
		//gra_pf.GetStarted();
		gra_pf.graph();
		Thread.sleep(1000);
		gra_pf.tryEditorLink();
	}

	@Then("The user should be redirected to a page having an TryEditor with a Run button to test in Graph page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_graph_page() {
		String graphtryhere = gra_pf.pagetitle();
		assertEquals(graphtryhere, "Assessment");
		LoggerLoad.info("User1 is in" + graphtryhere + " page");
		//LoggerLoad.info("The User is on the Graph's Tryhere page");
	}


	// @Try_Editor_in_Graph_with_DataDriven

	@Given("The user1 is in the tryEditor page for Graph page module")
	public void the_user1_is_in_the_try_editor_page_for_graph_page_module() {
		gra_pf.GetStarted();
		gra_pf.graph();
		gra_pf.tryEditorLink();
		LoggerLoad.info("The User is on the Graph's TryEditor page");
	}

	@When("^The user1 enter the valid and invalid pythoncode input from sheet (.*) and (.*) in Graph module$")
	public void the_user1_enter_the_valid_and_invalid_pythoncode_input_from_sheet_and_in_graph_module(String Sheetname,
			Integer Rownumber) throws InterruptedException, InvalidFormatException, IOException {
		String excelValue = gra_pf.getCodefromExcel(Sheetname, Rownumber);
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + Rownumber);

		gra_pf.Entercode_Tryeditor(excelValue);
		gra_pf.runbtn();;
		Thread.sleep(1000);
		
	}

	@Then("^The user1 should able to see output in the console with valid and invalid from excelsheet (.*) and (.*) in Graph module$")
	public void the_user1_should_able_to_see_output_in_the_console_with_valid_and_invalid_from_excelsheet_and_in_graph_module(
			String Sheetname, Integer Rownumber) throws InterruptedException, InvalidFormatException, IOException {
		String excelValue1 = gra_pf.getoutputfromExcel(Sheetname, Rownumber);
		LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
		String actual1 = gra_pf.getActualResult();
		LoggerLoad.info("Actual result  :" + actual1);
		assertEquals(actual1, excelValue1);
	}
	
	// @Try_Editor_in_Graph_Representations_with_DataDriven_Invaild

	@Then("^The user1 get the graph module error message from excelsheet (.*) and (.*)$")
	public void the_user1_get_the_graph_module_error_message_from_excelsheet_and(String Sheetname, Integer Rownumber)
			throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		String excelValue1 = gra_pf.getoutputfromExcel(Sheetname, Rownumber);
		String popup1 = gra_pf.getErrormsg();
		LoggerLoad.info("Actual popup :" + popup1);
		assertEquals(popup1, excelValue1);
	}

	// Graph Representations

	@Given("The user is in the Graph page after Sign in")
	public void the_user_is_in_the_graph_page_after_sign_in() {
		LoggerLoad.info("The User is on the Graph page");
	}

	@When("The user clicks Graph Representations button in the Graph page")
	public void the_user_clicks_graph_representations_button_in_the_graph_page() {
		gra_pf.GetStarted();
		gra_pf.graphRepresentationsLink();
	}

	@Then("The user should be redirected to Graph Representations in Graph page")
	public void the_user_should_be_redirected_to_graph_representations_in_graph_page() {
		String graphrepresetations = gra_pf.pagetitle();
		assertEquals(graphrepresetations, "Graph Representations");
		LoggerLoad.info(" User1 is in " + graphrepresetations + " page");
		//LoggerLoad.info("The User is on the Graph Representations link");
	}


	// @Try_Editor_in_Graph_Representations_with_DataDriven

	@Given("The user1 is in the tryEditor page for Graph Representations page module")
	public void the_user1_is_in_the_try_editor_page_for_graph_representations_page_module() {
		gra_pf.GetStarted();
		gra_pf.graphRepresentationsLink();
		gra_pf.tryEditorLink();
	}

	@When("^The user1 enter the valid and invalid pythoncode input from sheet (.*) and (.*) in Graph Representations module$")
	public void the_user1_enter_the_valid_and_invalid_pythoncode_input_from_sheet_and_in_graph_representations_module(
			String Sheetname, Integer Rownumber) throws InterruptedException, InvalidFormatException, IOException {
		String excelValue = gra_pf.getCodefromExcel(Sheetname, Rownumber);
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + Rownumber);

		gra_pf.Entercode_Tryeditor(excelValue);
		gra_pf.runbtn();;
		Thread.sleep(1000);
		
		
	}

	@Then("^The user1 should able to see output in the console with valid and invalid from excelsheet (.*) and (.*) in Graph Representations module$")
	public void the_user1_should_able_to_see_output_in_the_console_with_valid_and_invalid_from_excelsheet_and_in_Graph_Representations_module(
			String Sheetname, Integer Rownumber) throws InterruptedException, InvalidFormatException, IOException {
		String excelValue1 = gra_pf.getoutputfromExcel(Sheetname, Rownumber);
		LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
		String actual1 = gra_pf.getActualResult();
		LoggerLoad.info("Actual result  :" + actual1);
		assertEquals(actual1, excelValue1);
	}

	// @Try_Editor_in_Graph_Representations_with_DataDriven_Invaild

	@Then("^The user1 get the invaild error message from excelsheet (.*) and (.*)$")
	public void The_user1_get_the_invaild_error_message_from_excelsheet(String Sheetname, Integer Rownumber)
			throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		String excelValue1 = gra_pf.getoutputfromExcel(Sheetname, Rownumber);
		String popup1 = gra_pf.getErrormsg();
		LoggerLoad.info("Actual popup :" + popup1);

		assertEquals(popup1, excelValue1);
	}
	
	//@PracticeQuestions_Graph
	
	@Given("The user1 is in the Graph page after logged in")
	public void the_user1_is_in_the_graph_page_after_logged_in() {
		gra_pf.GetStarted();
		gra_pf.graphRepresentationsLink();
		//gra_pf.tryEditorLink();
		//gra_pf.click_Practice_Questions();
	}
	@When("The user1 clicks Practice Questions link in Graph module")
	public void the_user1_clicks_practice_questions_link_in_graph_module() throws InterruptedException {
		gra_pf.click_Practice_Questions();
		Thread.sleep(1000);
	}
	@Then("The user1 should be redirected to Practice Questions page in Graph module")
	public void the_user1_should_be_redirected_to_practice_questions_page_in_graph_module() {
		LoggerLoad.info("No practice Questions blank page is displayed");
		assertEquals(gra_pf.Homepagetext1(),"Practice Questions");
		LoggerLoad.info("NO questions found ");
	}


}
