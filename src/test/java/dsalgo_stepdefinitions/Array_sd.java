package dsalgo_stepdefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

import dsalgo_pagefactory.Arrays_pf;
import dsalgo_pagefactory.Tree_pf;
import dsalgo_utils.LoggerLoad;

public class Array_sd {
	
	Arrays_pf arrays = new Arrays_pf();

//Background
@Given("The user is in the Home page after Sign in for Arrays")
public void the_user_is_in_the_home_page_after_sign_in_for_Arrays() {
//	arrays.getStarted_Arrays();
	System.out.println("in the home page Action Done");
}

//Array1
@When("The user clicks the Getting Started button in Array Panel OR The user select Array item from the drop down menu")
public void the_user_clicks_the_getting_started_button_in_array_panel_or_the_user_select_array_item_from_the_drop_down_menu() {
	arrays.getStarted_Arrays();
	System.out.println(" Action Done");
}

@Then("The user be directed to ARRAY Data Structure Page")
public void the_user_be_directed_to_array_data_structure_page() {
	System.out.println(" validation  Done");
}
// @Arrays_in_Python
@Given("The user is in the Array page after Sign in")
public void the_user_is_in_the_array_page_after_sign_in() {
	System.out.println(" the user is in Array page");
	
}

@When("The user clicks Arrays in Python button in Array Page")
public void the_user_clicks_arrays_in_python_button_in_array_page() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
    
}

@Then("The user should be redirected to Arrays in Python page")
public void the_user_should_be_redirected_to_arrays_in_python_page() {
	System.out.println(" the user is in Arrays in Python page");
}
// @Try_Editor_in_Arrays_in_Python1
@Given("The user is on the Arrays in Python page")
public void the_user_is_on_the_arrays_in_python_page() {
	System.out.println(" the user is on Arrays in Python page");
}

@When("The user clicks Try Here button in Arrays in Python page")
public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.TryHere_Link();
}

@Then("The user should be redirected to a page having a Try Editor with a Run button to test in Array in Python page")
public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_in_array_in_python_page() {
	System.out.println(" the user is on try editor in Python page");
}


//@Try_Editor_in_Arrays_in_Python2
@Given("The user is in the tryEditor page of Arrays in Python")
public void the_user_is_in_the_try_editor_page_of_arrays_in_python() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.TryHere_Link();
	System.out.println(" the user is on try editor in Python page");
}


@When("^The user enters code in (.*) and clicks Run button in Arrays in Python page$")
public void the_user_enters_code_in_and_clicks_run_button_in_arrays_in_python_page(String TryEditor) {

	arrays.TryEditorbox(TryEditor);
	arrays.RunbuttonLink();
  
}
@Then("The user should able to see output in the console Arrays in Python tryeditor page")
public void the_user_should_able_to_see_output_in_the_console_arrays_in_python_tryeditor_page() {
	String actualMsg = arrays.ActualOutput();
	LoggerLoad.info("Actual result  :" + actualMsg);

	System.out.println(" the user is on try editor in Python page");
	
}


//@Arrays_Using_List
@When("The user clicks Arrays Using List button in Array Page")
public void the_user_clicks_arrays_using_list_button_in_array_page() {
    
	arrays.getStarted_Arrays();
	 
	arrays.Arrays_Using_List_Link();
}
@Then("The user should be redirected to Arrays Using List page")
public void the_user_should_be_redirected_to_arrays_using_list_page() {
  System.out.println("THe user is on Arrays_Using_list page");
}

// @Try_Editor_in_Arrays_Using_List2

@Given("The user is in the tryEditor page of Arrays Using List")
public void the_user_is_in_the_try_editor_page_of_arrays_using_list() {
	arrays.getStarted_Arrays();
	 
	arrays.Arrays_Using_List_Link();
	arrays.TryHere_Link();
    System.out.println("THe user in on try editor page of arrays_using_list");
}

//    @Try_Editor_in_Arrays_Using_List1
@Given("The user is on the Arrays Using List page")
public void the_user_is_on_the_arrays_using_list_page() {
	
	arrays.getStarted_Arrays();
	 
	arrays.Arrays_Using_List_Link();
	
   
}
@When("The user clicks Try Here button in Arrays Using List page")
public void the_user_clicks_try_here_button_in_arrays_using_list_page(){
	
	arrays.TryHere_Link();
}
@Then("The user should be redirected to a page having a Try Editor with a Run button to test in Arrays Using List page")
public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_in_arrays_using_list_page() {
    System.out.println("the user is on try editor page");
}

//@Basic_Operations_in_Lists
@Given("The user is in the Basic Operations in Lists after Sign in")
public void the_user_is_in_the_basic_operations_in_lists_after_sign_in() {
   arrays.getStarted_Arrays();
   
}
@When("The user clicks Basic Operations in Lists button in Array Page")
public void the_user_clicks_basic_operations_in_lists_button_in_array_page() {
	
	arrays.Basic_Operations_in_Lists_Link();
}
@Then("The user should be redirected to Basic Operations in Lists page")
public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
	System.out.println("THe user is on Basic Operations in list page");
    
}

//@Try_Editor_in_Basic_Operations_in_Lists1
@Given("The user is on the Basic Operations in Lists page")
public void the_user_is_on_the_basic_operations_in_lists_page() {
	arrays.getStarted_Arrays();
	arrays.Basic_Operations_in_Lists_Link();
}
@When("The user clicks Try Here button in Basic Operations in Lists page")
public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page(){
	arrays.TryHere_Link();
	
}
@Then("The user should be redirected to a page having a Try Editor with a Run button to test in Basic Operations in Lists page")
public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_in_basic_operations_in_lists_page() {
  arrays.RunbuttonLink();
}

//@Try_Editor_in_Basic_Operations_in_Lists2
@Given("The user is in the tryEditor page of Basic Operations in Lists")
public void the_user_is_in_the_try_editor_page_of_basic_operations_in_lists() {
	arrays.getStarted_Arrays();
	arrays.Basic_Operations_in_Lists_Link();
	arrays.TryHere_Link();
	
}

//@Applications_of_Array
@Given("The user is in the Applications of Array after Sign in")
public void the_user_is_in_the_applications_of_array_after_sign_in() {
	arrays.getStarted_Arrays();
	  
}


@When("The user clicks Applications of Array button in Array Page")
public void the_user_clicks_applications_of_array_button_in_array_page(){

	  
	  arrays.Applications_of_Array_Link();
}

@Then("The user should be redirected to Applications of Array in Lists page")
public void the_user_should_be_redirected_to_applications_of_array_in_lists_page() {
   System.out.println("the user is on Applications of array");
}






//@Try_Editor_in_Applications_of_Array1

@Given("The user is on the Applications of Array page")
public void the_user_is_on_the_applications_of_array_page() {
	
	arrays.getStarted_Arrays();
	arrays.Applications_of_Array_Link();
 
}
@When("The user clicks Try Here button in Applications of Arrays page")
public void the_user_clicks_try_here_button_in_applications_of_arrays_page(){
	
	  arrays.TryHere_Link();
    
}

@Then("The user should be redirected to a page having a Try Editor with a Run button to test in Applications of Array page")
public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_in_applications_of_array_page() {
	arrays.RunbuttonLink();
 
}
@Given("The user is in the tryEditor page of Applications of Array")
public void the_user_is_in_the_try_editor_page_of_applications_of_array(){
	arrays.getStarted_Arrays();
	arrays.Applications_of_Array_Link();
	arrays.TryHere_Link();
	
    
}

//@PracticePage-1

@When("The user clicks Practice Questions button in Array page")
public void the_user_clicks_practice_questions_button_in_array_page() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.Practicequestions_button();
	}
@Then("The user should be redirected to Practice pageof Array page")
public void the_user_should_be_redirected_to_practice_pageof_array_page() {
	 System.out.println("The user is on practice questions page");
	 
}


}


