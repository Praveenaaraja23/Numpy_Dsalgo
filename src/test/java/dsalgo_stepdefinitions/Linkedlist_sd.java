package dsalgo_stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import dsalgo_hooks.Hooks;
import dsalgo_utils.DriverManager;
import dsalgo_utils.LoggerLoad;
import dsalgo_pagefactory.Login_pf;
import dsalgo_pagefactory.Register_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Linkedlist_sd {

	Register_pf Registerpage=new Register_pf();
	Linkedlist_pf linkedlistpage=new Linkedlist_pf()
	
@Given("The user is in home page after Sign in")
public void the_user_is_in_home_page_after_sign_in() {
  
}

@When("The user clicks the Getting Started button under Linked List section")
public void the_user_clicks_the_getting_started_button_under_linked_list_section() {
   
}

@Then("The user should navigate to linked list home page")
public void the_user_should_navigate_to_linked_list_home_page() {
    
}

@Given("The user is in {string} page after clicking on Getstarted")
public void the_user_is_in_page_after_clicking_on_getstarted(String string) {
   
}

//introduction

@When("The user clicks on {string} link")
public void the_user_clicks_on_link(String string) {
   
}

@Then("The user should navigate to {string} page")
public void the_user_should_navigate_to_page(String string) {
  
}

@When("The User clicks {string} button in the Introduction page")
public void the_user_clicks_button_in_the_introduction_page(String string) {
   
}

@Then("The user should be redirected to the page having an try Editor with a Run button")
public void the_user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button() {
   
}

@Given("The user is in try Editor page of Introduction page")
public void the_user_is_in_try_editor_page_of_introduction_page() {
   
}

@When("The user enter valid and invalid python code in try Editor {string} and click on Run")
public void the_user_enter_valid_and_invalid_python_code_in_try_editor_and_click_on_run(String string) {
  
}

@Then("The user should be able to see output for valid input and error should be displayed for invalid input in console {string}")
public void the_user_should_be_able_to_see_output_for_valid_input_and_error_should_be_displayed_for_invalid_input_in_console(String string) {
  
}
//creating linked list

@Given("The user is in {string} page")
public void the_user_is_in_page(String string) {
   
}

@When("The User clicks {string} button in the Creating Linked List page")
public void the_user_clicks_button_in_the_creating_linked_list_page(String string) {
   
}

@Given("The user is in try Editor page of Creating Linked List page")
public void the_user_is_in_try_editor_page_of_creating_linked_list_page() {
    
}

@When("The User clicks {string} button in the Types of Linked List page")
public void the_user_clicks_button_in_the_types_of_linked_list_page(String string) {
   
}

@Given("The user is in try Editor page of Types of Linked List page")
public void the_user_is_in_try_editor_page_of_types_of_linked_list_page() {
  
}

@Given("The user is in the {string} page.")
public void the_user_is_in_the_page(String string) {
    
}

@When("The User clicks {string} button in the Implement Linked List in Python page")
public void the_user_clicks_button_in_the_implement_linked_list_in_python_page(String string) {
} 

@Given("The user is in try Editor page of Implement Linked List in Python page")
public void the_user_is_in_try_editor_page_of_implement_linked_list_in_python_page() {
    
}

@When("The User clicks {string} button in the Traversal page")
public void the_user_clicks_button_in_the_traversal_page(String string) {
  
}

@Given("The user is in try Editor page of Traversal page")
public void the_user_is_in_try_editor_page_of_traversal_page() {
   
}

@When("The User clicks {string} button in the Insertion page")
public void the_user_clicks_button_in_the_insertion_page(String string) {
   
}

@Given("The user is in try Editor page of Insertion page")
public void the_user_is_in_try_editor_page_of_insertion_page() {
    
}

@When("The User clicks {string} button in the Deletion page")
public void the_user_clicks_button_in_the_deletion_page(String string) {
   
}

@Given("The user is in try Editor page of Deletion page")
public void the_user_is_in_try_editor_page_of_deletion_page() {
   
}

@Given("The user clicks Introduction link")
public void the_user_clicks_introduction_link() {
   
}

@When("The user clicks on the {string} link")
public void the_user_clicks_on_the_link(String string) {
  
}

@Then("The user should be redirected to Practice Questions of Linked List Page")
public void the_user_should_be_redirected_to_practice_questions_of_linked_list_page() {
   
}





}