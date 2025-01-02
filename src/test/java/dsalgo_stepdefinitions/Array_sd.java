package dsalgo_stepdefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import dsalgo_pagefactory.Arrays_pf;
import dsalgo_pagefactory.Tree_pf;
import dsalgo_utils.LoggerLoad;

public class Array_sd {
	
	Arrays_pf arrays = new Arrays_pf();
	
	static String expectedMsg;


//Background
@Given("The user is in the Home page after Sign in for Arrays")
public void the_user_is_in_the_home_page_after_sign_in_for_Arrays() {
//	arrays.getStarted_Arrays();
	String hometitle= arrays.Homepagetext();
	assertEquals(hometitle,"NumpyNinja");
	LoggerLoad.info("user is in "+hometitle);
	System.out.println("in the home page Action Done");
}

//Array1
@When("The user clicks the Getting Started button in Array Panel OR The user select Array item from the drop down menu")
public void the_user_clicks_the_getting_started_button_in_array_panel_or_the_user_select_array_item_from_the_drop_down_menu() {
	arrays.getStarted_Arrays();
	LoggerLoad.info(" Action Done");
}

@Then("The user be directed to ARRAY Data Structure Page")
public void the_user_be_directed_to_array_data_structure_page() {
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is : " + Title);
	assertEquals(Title, "Array", "Title do not match");
    System.out.println("the user is on Array page");
}
// @Arrays_in_Python
@Given("The user is in the Array page after Sign in")
public void the_user_is_in_the_array_page_after_sign_in() {
	LoggerLoad.info(" the user is in Array page");
	
}

@When("The user clicks Arrays in Python button in Array Page")
public void the_user_clicks_arrays_in_python_button_in_array_page() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
    
}

@Then("The user should be redirected to Arrays in Python page")
public void the_user_should_be_redirected_to_arrays_in_python_page() {
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Arrays in Python", "Title do not match");

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
	//System.out.println(" the user is on try editor in Python page");
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Assessment", "Title do not match");
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


//Try_Editor_in_Arrays_in_DataDriven
@Given("The user is in the tryEditor page for Arrays in Python")
public void the_user_is_in_the_try_editor_page_for_arrays_in_python() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.TryHere_Link();
    
}

@When("^The user enter the valid pythoncode input from sheet (.*) and (.*) in Arrays$")
public void the_user_enter_the_valid_pythoncode_input_from_sheet_and_in_arrays(String Sheetname, Integer Rownumber) throws IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	String excelValue=arrays.getCodefromExcel(Sheetname, Rownumber);
	LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
			+ " and row number : " + Rownumber);

	arrays.Entercode_Tryeditor(excelValue);
	arrays.RunbuttonLink();
}
@Then("^The user should able to see output in the console with valid and invalid from excelsheet (.*) and (.*) in Arrays$")
public void the_user_should_able_to_see_output_in_the_console_with_valid_and_invalid_from_excelsheet_and_in_arrays(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
	String excelValue1=arrays.getoutputfromExcel(Sheetname, Rownumber);
	LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
	String actual1=arrays.getActualResult();
	LoggerLoad.info("Actual result  :" + actual1);
	assertEquals(actual1, excelValue1);

}


//Try_Editor_in_Arrays_in_DataDriven_invalid
@Then("^The user gets error message from excelsheet (.*) and (.*)$")
public void the_user_gets_error_message_from_excelsheet_and(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
	String excelValue1=arrays.getoutputfromExcel(Sheetname, Rownumber);
	String popup1=arrays.getErrormsg();
	LoggerLoad.info("Actual popup :" + popup1);

	assertEquals(popup1, excelValue1);
}

//@Arrays_Using_List
@When("The user clicks Arrays Using List button in Array Page")
public void the_user_clicks_arrays_using_list_button_in_array_page() {
    
	arrays.getStarted_Arrays();
	 
	arrays.Arrays_Using_List_Link();
}
@Then("The user should be redirected to Arrays Using List page")
public void the_user_should_be_redirected_to_arrays_using_list_page() {
  //System.out.println("THe user is on Arrays_Using_list page");
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Arrays Using List", "Title do not match");
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

//Try_Editor_in_ArraysUsingList_in_DataDriven
@Given("The user is in the tryEditor page for ArraysUsingList")
public void the_user_is_in_the_try_editor_page_for_arrays_using_list() {
    arrays.getStarted_Arrays();
	arrays.Arrays_Using_List_Link();
	arrays.TryHere_Link();
}
@When("^The user enter the valid pythoncode input from sheet (.*) and (.*) in ArraysUsingList$")
public void the_user_enter_the_valid_pythoncode_input_from_sheet_and_in_arrays_using_list(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	String excelValue=arrays.getCodefromExcel(Sheetname, Rownumber);
	LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
			+ " and row number : " + Rownumber);

	arrays.Entercode_Tryeditor(excelValue);
	arrays.RunbuttonLink();
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
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Basic Operations in Lists", "Title do not match");
    
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
  String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Assessment", "Title do not match");
}

//@Try_Editor_in_Basic_Operations_in_Lists2
@Given("The user is in the tryEditor page of Basic Operations in Lists")
public void the_user_is_in_the_try_editor_page_of_basic_operations_in_lists() {
	arrays.getStarted_Arrays();
	arrays.Basic_Operations_in_Lists_Link();
	arrays.TryHere_Link();
	
}
//Try_Editor_in_BasicOperationsofArray_in_DataDriven
@Given("The user is in the tryEditor page for BasicOperationsofArray")
public void the_user_is_in_the_try_editor_page_for_basic_operationsof_array() {
	
	arrays.getStarted_Arrays();
	arrays.Basic_Operations_in_Lists_Link();
	arrays.TryHere_Link();
    
}
@When("^The user enter the valid pythoncode input from sheet (.*) and (.*) in BasicOperationsofArray$")
public void the_user_enter_the_valid_pythoncode_input_from_sheet_and_in_basic_operationsof_array(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	String excelValue=arrays.getCodefromExcel(Sheetname, Rownumber);
	LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
			+ " and row number : " + Rownumber);

	arrays.Entercode_Tryeditor(excelValue);	
	arrays.RunbuttonLink();
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
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Applications of Array", "Title do not match");
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

@Given("The user is in the tryEditor page for Applications of Arrays")
public void the_user_is_in_the_try_editor_page_for_applications_of_arrays() {
	
	arrays.getStarted_Arrays();
	arrays.Applications_of_Array_Link();
	arrays.TryHere_Link();
	
    
}
@When("^The user enter the valid pythoncode input from sheet (.*) and (.*) in Applications of Arrays$")
public void the_user_enter_the_valid_pythoncode_input_from_sheet_and_in_applications_of_arrays(String Sheetname, Integer Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	
	String excelValue=arrays.getCodefromExcel(Sheetname, Rownumber);
	LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
			+ " and row number : " + Rownumber);

	arrays.Entercode_Tryeditor(excelValue);
	arrays.RunbuttonLink();
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
	 //System.out.println("The user is on practice questions page");
	
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Practice Questions", "Title do not match");
}

//@Search_the_array-2
@Given("The user is on the Practice  Questions page of Array page")
public void the_user_is_on_the_practice_questions_page_of_array_page() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.Practicequestions_button();

}
@When("The user clicks the Search the array link")
public void the_user_clicks_the_search_the_array_link() {
    arrays.SearchtheArrayLink();
}
@Then("The user should be redirected to the Search_the_array Question page contains a question,and try Editor with Run and Submit buttons")
public void the_user_should_be_redirected_to_the_search_the_array_question_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Assessment", "Title do not match");

}

//@Code_Editor_for_Search_the_array_link_Run_Button-3


@Given("The user is in Question page of Search the Array")
public void the_user_is_in_question_page_of_search_the_array() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.Practicequestions_button();
	arrays.SearchtheArrayLink();
	LoggerLoad.info("THe user is in Search the Array page");
   
}
@When("^User enters valid Python code from sheet (.*) and (.*) for Question Page$")
public void user_enters_valid_python_code_from_sheet_and_for_question_page(String Sheetname,int Rownumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
	
//	String excelValue=arrays.getCodefromExcel(Sheetname, Rownumber);
	LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
			+ " and row number : " + Rownumber);
     
     arrays.enterPythonCodePractice(Sheetname, Rownumber);
		expectedMsg = arrays.getExpectedResult(Sheetname, Rownumber);
}
@When("clicks Run button in Question Page")
public void clicks_run_button_in_question_page() {
	arrays.Practicequestions_Run_button();
}
@Then("The user should able to see output in the console for Question Page")
public void the_user_should_able_to_see_output_in_the_console_for_question_page() {
	String actualMsg = arrays.getActualResult1();
	LoggerLoad.info("Actual result  : " + actualMsg);
	assertEquals(actualMsg, expectedMsg, "Result do not match");
}

//@Code_Editor_for_Search_the_array_link_Submit_Button-4
//@Given("User is on Question page of Search the array")
//public void user_is_on_question_page_of_search_the_array() {
//  
//}
@When("clicks Submit button in Question Page")
public void clicks_submit_button_in_question_page() {
  arrays.Practicequestion_Submitbutton();
}




//@Max_Consecutive_Ones-5
@Given("The user is on the Practice questions Page in Python page")
public void the_user_is_on_the_practice_questions_page_in_python_page() {
	
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.Practicequestions_button();
    
}
@When("The user clicks findMaxConsecutiveOnes link")
public void the_user_clicks_find_max_consecutive_ones_link() {
	arrays.findMaxConsecutiveOnesLink();
   
}
@Then("The user should be redirected to Find Max Consecutive Question Page contains a question,and try Editor with Run and Submit buttons")
public void the_user_should_be_redirected_to_find_max_consecutive_question_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
	
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Assessment", "Title do not match");
    
}

//@Max_Consecutive_Ones_link_Run_Button-6
@Given("The user is in Question page of Find_Max_Consecutive_Ones")
public void the_user_is_in_question_page_of_find_max_consecutive_ones() {
   
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.Practicequestions_button();
	arrays.findMaxConsecutiveOnesLink();
}

//@Max_Consecutive_Ones_link_Submit_Button-7

//@Find_Numbers_with_Even_Number_of_Digits-8
@When("The user clicks find FindNumberWithEvenNumberofDigits link")
public void the_user_clicks_find_find_number_with_even_numberof_digits_link() {
  arrays.FindNumberswithEvenNumberofDigits();
}
@Then("The user should be redirected to FindNumberWithEvenNumberofDigits Page contains a question,and try Editor with Run and Submit buttons")
public void the_user_should_be_redirected_to_find_number_with_even_numberof_digits_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Assessment", "Title do not match");
}




//@Find_Numbers_with_Even_Number_of_Digits_link_Run_Button-9

@Given("The user is in Question page of FindNumberWithEvenNumberofDigits")
public void the_user_is_in_question_page_of_find_number_with_even_numberof_digits() {
	
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.Practicequestions_button();
	arrays.FindNumberswithEvenNumberofDigits();
   
}


//@Find_Numbers_with_Even_Number_of_Digits_link_Submit_Button-10
//@Squares_of_a_Sorted_Array-11

@When("The user clicks find Squares of a Sorted Array Page link")
public void the_user_clicks_find_squares_of_a_sorted_array_page_link() {
	
	arrays.SquaresofaSortedArray();
	
    }
@Then("The user should be redirected to Squares of a Sorted Array Question Page contains a question,and try Editor with Run and Submit buttons")
public void the_user_should_be_redirected_to_squares_of_a_sorted_array_question_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
	String Title = arrays.getArrayPageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	assertEquals(Title, "Assessment", "Title do not match");
}

//@Squares_of_a_Sorted_Array_link_Run_Button-12

@Given("The user is in Question page of Squares of a Sorted Array")
public void the_user_is_in_question_page_of_squares_of_a_sorted_array() {
	arrays.getStarted_Arrays();
	arrays.Arrays_in_Python_Link();
	arrays.Practicequestions_button();
	arrays.SquaresofaSortedArray();
}
//@Squares_of_a_Sorted_Array_link_Submit_Button-13

}


