package dsalgo_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import dsalgo_hooks.Hooks;
import dsalgo_pagefactory.Login_pf;
import dsalgo_pagefactory.Tree_pf;
import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_sd {

	Tree_pf tree_pf = new Tree_pf();

	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		
		String hometitle= tree_pf.Homepagetext();
		assertEquals(hometitle,"NumpyNinja");
		LoggerLoad.info("user is in "+hometitle);

	}

	@When("The user clicks the {string} button in Tree Page OR The user select {string} item from the drop down menu")
	public void the_user_clicks_the_button_in_tree_page_or_the_user_select_item_from_the_drop_down_menu(String string, String string2) {
		tree_pf.GetStarted();
	}

	@Then("The user should be redirected to {string} Data Structure Page")
	public void the_user_should_be_redirected_to_data_structure_page(String string) {
		String Title = tree_pf.getTreePageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, "Tree", "Title do not match");
	}

	@Given("The user is on the {string} page after clicks of getstarted")
	public void the_user_is_on_the_page_after_clicks_of_getstarted(String string) {
		tree_pf.GetStarted();
	}

	@When("The user clicks on the \"Overview of Trees\" link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		tree_pf.click_overview_tree();
	}

	@Then("The user should be redirected to the {string} of tree Page")
	public void the_user_should_be_redirected_to_the_of_tree_page(String string) {
		String Title = tree_pf.alltreetext();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, string);
}

	@Given("The user is in the {string} page")
	public void the_user_is_in_the_page(String string) {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
	}

	@When("The user clicks {string} button in a {string} page")
	public void the_user_clicks_button_in_a_page(String string, String string2) {
		tree_pf.click_Tryherebtn();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String Title = tree_pf.getTreePageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	@Given("The user is in the tryEditor page for Overview of Trees page")
	public void the_user_is_in_the_try_editor_page_for_overview_of_trees_page() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Tryherebtn();


	}

	@When("^The user enter the valid and invalid pythoncode input from sheet (.*) and (.*) in trees$")
	public void the_user_enters_the_valid_and_invalid_pythoncode_and_clicks_run_button(String Sheetname, Integer Rownumber) throws InterruptedException, InvalidFormatException, IOException {



		String excelValue=tree_pf.getCodefromExcel(Sheetname, Rownumber);
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + Rownumber);

		tree_pf.Entercode_Tryeditor(excelValue);
		tree_pf.runbtn();

	}


	@Then("^The user should able to see output in the console with valid and invalid from excelsheet (.*) and (.*) in trees$")
	public void the_user_should_able_to_see_output_in_the_console_output(String Sheetname , Integer Rownumber) throws InvalidFormatException, IOException {

		String excelValue1=tree_pf.getoutputfromExcel(Sheetname, Rownumber);
		LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
		String actual1=tree_pf.getActualResult();
		LoggerLoad.info("Actual result  :" + actual1);
		assertEquals(actual1, excelValue1);
	}
	@Then("^The user get the error message from excelsheet (.*) and (.*)$")
	public void the_user_get_the_error_message(String Sheetname,Integer Rownumber) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, InvalidFormatException, IOException {
		String excelValue1=tree_pf.getoutputfromExcel(Sheetname, Rownumber);
		String popup1=tree_pf.getErrormsg();
		LoggerLoad.info("Actual popup :" + popup1);

		assertEquals(popup1, excelValue1);
	}
	@When("The user clicks on the \"Terminologies\" link")
	public void the_user_clicks_on_the_Terminologies_link() {
	   
        tree_pf.click_Tree_terminologies();
	}

	@When("The user clicks {string} button in a Tree -Terminologies page")
	public void the_user_clicks_button_in_a_tree_terminologies_page(String string) {
		tree_pf.click_Tryherebtn();

	}

	@Given("The user is in the tryEditor page for Tree -Terminologies Page")
	public void the_user_is_in_the_try_editor_page_for_tree_terminologies_page() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Tree_terminologies();
		tree_pf.click_Tryherebtn();

	}

	@When("The user clicks on the \"Types of Trees\" link")
	public void the_user_clicks_on_the_Types_of_Trees_link() {
	   
		tree_pf.click_Types_of_Trees();

	}

	@When("The user clicks {string} button in a Tree -Types of Tree page")
	public void the_user_clicks_button_in_a_tree_types_of_tree_page(String string) {
		tree_pf.click_Tryherebtn();

	}

	@Given("The user is in the tryEditor page for Tree -Types of Tree page")
	public void the_user_is_in_the_try_editor_page_for_tree_types_of_tree_page() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Types_of_Trees();
		tree_pf.click_Tryherebtn(); 
	}
	
	
	@When("The user clicks on the \"Tree Traversals\"link")
	public void the_user_clicks_on_the_tree_traversals_link() {
	    tree_pf.click_Tree_Traversal();
	}
	@When("The user clicks {string} button in a Tree -Tree Traversals")
	public void the_user_clicks_button_in_a_tree_tree_traversals(String string) {
		tree_pf.click_Tryherebtn();

	}
	@Given("The user is in the tryEditor page for Tree -Tree Traversals")
	public void the_user_is_in_the_try_editor_page_for_tree_tree_traversals() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		 tree_pf.click_Tree_Traversal();
		 tree_pf.click_Tryherebtn();

	}



	@When("The user clicks on the \"Traversals-Illustration\" link")
	public void the_user_clicks_on_the_traversals_illustration_link() {
		tree_pf.click_Traversals_Illustration();

	}

	@When("The user clicks {string} button in a Traversals-Illustration page")
	public void the_user_clicks_button_in_a_traversals_illustration_page(String string) {
		tree_pf.click_Tryherebtn();

	}

	@Given("The user is in the tryEditor page for Traversals-Illustration")
	public void the_user_is_in_the_try_editor_page_for_traversals_illustration() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Traversals_Illustration();
		tree_pf.click_Tryherebtn(); 

	}

	@When("The user clicks on the \"Binary Trees\" link")
	public void the_user_clicks_on_the_binary_trees_link() {
		tree_pf.click_Binary_Trees();

	}

	@When("The user clicks {string} button in a Binary Trees page")
	public void the_user_clicks_button_in_a_binary_trees_page(String string) {
		tree_pf.click_Tryherebtn(); 
	}

	@Given("The user is in the tryEditor page for Binary Trees")
	public void the_user_is_in_the_try_editor_page_for_binary_trees() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Binary_Trees();
		tree_pf.click_Tryherebtn(); 
	}

	@When("The user clicks on the \"Types of Binary Trees\" link")
	public void the_user_clicks_on_the_types_of_binary_trees_link() {
		tree_pf.click_Types_of_Binary_Trees();

	}

	@When("The user clicks {string} button in a Types of Binary Trees page")
	public void the_user_clicks_button_in_a_types_of_binary_trees_page(String string) {
		tree_pf.click_Tryherebtn(); 
	}

	@Given("The user is in the tryEditor page for Types of Binary Trees")
	public void the_user_is_in_the_try_editor_page_for_types_of_binary_trees() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Types_of_Binary_Trees();
		tree_pf.click_Tryherebtn(); 

	}

	@When("The user clicks on the \"Implementation in Python\" link")
	public void the_user_clicks_on_the_implementation_in_python_link() {
		tree_pf.click_Implementation_in_Python();
	}

	@When("The user clicks {string} button in a Implementation in Python page")
	public void the_user_clicks_button_in_a_implementation_in_python_page(String string) {
		tree_pf.click_Tryherebtn();
	}

	@Given("The user is in the tryEditor page for Implementation in Python")
	public void the_user_is_in_the_try_editor_page_for_implementation_in_python() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Implementation_in_Python();
		tree_pf.click_Tryherebtn(); 
	}

	@When("The user clicks on the \"Binary Tree Traversals\" link")
	public void the_user_clicks_on_the_binary_tree_traversals_link() {
		tree_pf.Binary_Tree_Traversals();
	}

	@When("The user clicks {string} button in a Binary Tree Traversals page")
	public void the_user_clicks_button_in_a_binary_tree_traversals_page(String string) {
		tree_pf.click_Tryherebtn();
	}

	@Given("The user is in the tryEditor page for Binary Tree Traversals")
	public void the_user_is_in_the_try_editor_page_for_binary_tree_traversals() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.Binary_Tree_Traversals();
		tree_pf.click_Tryherebtn(); 
	}

	@When("The user clicks on the \"Implementation of Binary Trees\" link")
	public void the_user_clicks_on_the_implementation_of_binary_trees_link() {
		tree_pf.click_Implementation_of_Binary_Trees();
	}

	@When("The user clicks {string} button in a Implementation of Binary Trees page")
	public void the_user_clicks_button_in_a_implementation_of_binary_trees_page(String string) {
		tree_pf.click_Tryherebtn(); 
	}

	@Given("The user is in the tryEditor page for Implementation of Binary Trees")
	public void the_user_is_in_the_try_editor_page_for_implementation_of_binary_trees() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Implementation_of_Binary_Trees();
		tree_pf.click_Tryherebtn(); 
	}

	@When("The user clicks on the \"Applications of Binary trees\" link")
	public void the_user_clicks_on_the_applications_of_binary_trees_link() {
		tree_pf.click_Applications_of_Binary_trees();
	}

	@When("The user clicks {string} button in a Applications of Binary trees page")
	public void the_user_clicks_button_in_a_applications_of_binary_trees_page(String string) {
		tree_pf.click_Tryherebtn();
	}

	@Given("The user is in the tryEditor page for Applications of Binary trees")
	public void the_user_is_in_the_try_editor_page_for_applications_of_binary_trees() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Applications_of_Binary_trees();
		tree_pf.click_Tryherebtn(); 
	}

	@When("The user clicks on the \"Binary Search Trees\" link")
	public void the_user_clicks_on_the_binary_search_trees_link() {
		tree_pf.click_Binary_Search_Trees();
	}

	@When("The user clicks {string} button in a Binary Search Trees page")
	public void the_user_clicks_button_in_a_binary_search_trees_page(String string) {
		tree_pf.click_Tryherebtn(); 
	}

	@Given("The user is in the tryEditor page for Binary Search Trees")
	public void the_user_is_in_the_try_editor_page_for_binary_search_trees() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Binary_Search_Trees();
		tree_pf.click_Tryherebtn(); 
	}

	@When("The user clicks on the \"Implementation Of BST\" link")
	public void the_user_clicks_on_the_implementation_of_bst_link() {
		tree_pf.click_Implementation_Of_BST();
	}

	@When("The user clicks {string} button in a Implementation Of BST page")
	public void the_user_clicks_button_in_a_implementation_of_bst_page(String string) {
		tree_pf.click_Tryherebtn();
	}

	@Given("The user is in the tryEditor page for Implementation Of BST")
	public void the_user_is_in_the_try_editor_page_for_implementation_of_bst() {
		tree_pf.GetStarted();
		tree_pf.click_overview_tree();
		tree_pf.click_Implementation_Of_BST();
		tree_pf.click_Tryherebtn(); 
	}

	@When("The User clicks  {string}  link")
	public void the_user_clicks_link(String string) {
		tree_pf.click_Practice_Questions();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		LoggerLoad.info("No practice Questions blank page is displayed");
		assertEquals(tree_pf.Homepagetext(),"practice Questions");
		LoggerLoad.info("NO questions found ");



	}



}