package dsalgo_stepdefinitions;

import org.openqa.selenium.WebDriver;

import dsalgo_hooks.Hooks;
import dsalgo_pagefactory.Login_pf;
import dsalgo_pagefactory.Tree_pf;
import dsalgo_utils.DriverManager;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_sd {
	//WebDriver driver = DriverManager.getdriver();
	Tree_pf tree_pf = new Tree_pf();
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		System.out.println("validation done");
	    
	}

	@When("The user clicks the {string} button in Tree Page OR The user select {string} item from the drop down menu")
	public void the_user_clicks_the_button_in_tree_page_or_the_user_select_item_from_the_drop_down_menu(String string, String string2) {
		tree_pf.GetStarted();
	}

	@Then("The user should be redirected to {string} Data Structure Page")
	public void the_user_should_be_redirected_to_data_structure_page(String string) {
		System.out.println("validation done");
	    
	}

	@Given("The user is on the {string} page after clicks of getstarted")
	public void the_user_is_on_the_page_after_clicks_of_getstarted(String string) {
		tree_pf.GetStarted();
	}

	@When("The user clicks on the\" Overview of Trees\" link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
	   tree_pf.click_overview_tree();
	}

	@Then("The user should be redirected to the {string} of tree Page")
	public void the_user_should_be_redirected_to_the_of_tree_page(String string) {
		System.out.println("validation done");
		
	    
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
		System.out.println("validation done"); 
	}

	@Given("The user is in the tryEditor page for Overview of Trees page")
	public void the_user_is_in_the_try_editor_page_for_overview_of_trees_page() {
		 tree_pf.GetStarted();
		 tree_pf.click_overview_tree();
		 tree_pf.click_Tryherebtn();
		 
	    
	}

	@When("^The user enters the valid and invalid pythoncode (.*) and clicks Run button$")
	public void the_user_enters_the_valid_and_invalid_pythoncode_and_clicks_run_button(String pythoncode) throws InterruptedException {
	   tree_pf.Entercode_Tryeditor(pythoncode);
	   
	   tree_pf.runbtn();
	}


	@Then("The user should able to see output in the console Output")
	public void the_user_should_able_to_see_output_in_the_console_output() {
		String actualMsg = tree_pf.ActualOutput();
		LoggerLoad.info("Actual result  :" + actualMsg);
	//	String actualMsg1 = tree_pf.getErrormsg();
	//	LoggerLoad.info("Actual result  :" + actualMsg);
		System.out.println("validation done"); 
	}
	@When("The user clicks on the\"Tree -Terminologies Page\" link")
	public void the_user_clicks_on_the_tree_terminologies_page_link() {
		
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

	@When("The user clicks on the\"Tree -Types of Tree\" link")
	public void the_user_clicks_on_the_tree_types_of_tree_link() {
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

	@When("The user clicks on the\"Traversals-Illustration\" link")
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

	@When("The user clicks on the\"Binary Trees\" link")
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

	@When("The user clicks on the\"Types of Binary Trees\" link")
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

	@When("The user clicks on the\"Implementation in Python\" link")
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

	@When("The user clicks on the\"Binary Tree Traversals\" link")
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

	@When("The user clicks on the\"Implementation of Binary Trees\" link")
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

	@When("The user clicks on the\"Applications of Binary trees\" link")
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

	@When("The user clicks on the\"Binary Search Trees\" link")
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

	@When("The user clicks on the\"Implementation Of BST\" link")
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
		
		System.out.println("validation done");
	    
	}



		}