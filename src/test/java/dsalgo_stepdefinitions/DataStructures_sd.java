//Datastructures stepdefinitions

package dsalgo_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;

import dsalgo_pagefactory.Datastructures_pf;
//import dsalgo_pagefactory.Tree_pf;
import dsalgo_utils.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructures_sd {

	Datastructures_pf ds_pf = new Datastructures_pf();

	// DataStructures

	@Given("The user is in homepage after signin")
	public void the_user_is_in_homepage_after_signin() {
		String hometitle = ds_pf.pagetitle();

		LoggerLoad.info("user4 is in" + hometitle + " page");

	}

	@When("The user clicks the Getting Started button in DataStructures Panel OR The user select DataStructures item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_data_structures_panel_or_the_user_select_data_structures_item_from_the_drop_down_menu() {
		ds_pf.GetStarted();
	}

	@Then("The user be directed to Data Structures in Data Structures Page")
	public void the_user_be_directed_to_data_structures_in_data_structures_page() {
		String dstitle = ds_pf.pagetitle();
		assertEquals(dstitle, "Data Structures-Introduction");
		LoggerLoad.info("user4 is in" + dstitle + " page");

	}

	// TimeComplexity

	@Given("The user is in Data Structures page")
	public void the_user_is_in_data_structures_page() {
		ds_pf.GetStarted();
		String dstitle = ds_pf.pagetitle();

		LoggerLoad.info("user4 is in" + dstitle + " page");

	}

	@When("The user clicks the Time Complexity button in Data Structures Page")
	public void the_user_clicks_the_time_complexity_button_in_data_structures_page() throws InterruptedException {
		ds_pf.Timecomplexity();

	}

	@Then("The user be directed to Time Complexity in Data Structures Page")
	public void the_user_be_directed_to_time_complexity_in_data_structures_page() {
		String dstimetitle = ds_pf.pagetitle();
		assertEquals(dstimetitle, "Time Complexity");
		LoggerLoad.info("user4 is in" + dstimetitle + " page");
	}

	// Try_Editor_in_TimeComplexity

	@Given("The user is on the Time Complexity in Data Structures page")
	public void the_user_is_on_the_time_complexity_in_data_structures_page() {
		ds_pf.GetStarted();
		ds_pf.Timecomplexity();
		String dstimetitle = ds_pf.pagetitle();

		LoggerLoad.info("user4 is in" + dstimetitle + " page");
	}

	@When("The user clicks Try Here button in Time Complexity page")
	public void the_user_clicks_try_here_button_in_time_complexity_page() {
		ds_pf.TryHere();
	}

	@Then("The user should be redirected to a page having an {string} with a Run button to test in the Time Complexity page")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_run_button_to_test_in_the_time_complexity_page(
			String string) throws InterruptedException {
		String dstimetryeditortitle = ds_pf.pagetitle();
		assertEquals(dstimetryeditortitle, "Assessment");
		LoggerLoad.info("user4 is in" + dstimetryeditortitle + " page");
	}

	// @Try_Editor_in_DS_with_DataDriven

	@Given("The user4 is in the tryEditor page for DataStructures page")
	public void the_user4_is_in_the_try_editor_page_for_data_structures_page() {
		ds_pf.GetStarted();
		ds_pf.Timecomplexity();
		ds_pf.TryHere();
		LoggerLoad.info("The user4 is on the Tryeditor page for DataStructures Module");
	}

	@When("^The user4 enter the valid and invalid pythoncode input from sheet (.*) and (.*) in DataStructures$")
	public void the_user4_enter_the_valid_and_invalid_pythoncode_input_from_sheet_and_in_data_structures(
			String Sheetname, Integer Rownumber) throws InterruptedException, InvalidFormatException, IOException {
		String excelValue = ds_pf.getCodefromExcel(Sheetname, Rownumber);
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + Rownumber);

		ds_pf.Entercode_Tryeditor(excelValue);
		ds_pf.Runcommand();
	}

	@Then("^The user4 should able to see output in the console with valid and invalid from excelsheet (.*) and (.*) in DataStructures$")
	public void the_user4_should_able_to_see_output_in_the_console_with_valid_and_invalid_from_excelsheet_and_in_data_structures(
			String Sheetname, Integer Rownumber) throws InterruptedException, InvalidFormatException, IOException {
		String excelValue1 = ds_pf.getoutputfromExcel(Sheetname, Rownumber);
		LoggerLoad.info("Expected result - Excel Sheet :  " + excelValue1);
		String actual1 = ds_pf.getActualResult();
		LoggerLoad.info("Actual result  :" + actual1);
		assertEquals(actual1, excelValue1);
	}

	// @Try_Editor_in_DS_with_DataDriven_Invaild

	@Then("^The user4 get the error message from excelsheet (.*) and (.*)$")
	public void The_user4_get_the_error_message_from_excelsheet(String Sheetname, Integer Rownumber)
			throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		String excelValue1 = ds_pf.getoutputfromExcel(Sheetname, Rownumber);
		String popup1 = ds_pf.getErrormsg();
		LoggerLoad.info("Actual popup :" + popup1);

		assertEquals(popup1, excelValue1);
	}

	// Practice_Questions

	@Given("The user4 is in the Data structures page after logged in")
	public void the_user4_is_in_the_data_structures_page_after_logged_in() {
		ds_pf.GetStarted();
		ds_pf.Timecomplexity();

	}

	@When("The user4 clicks Practice Questions link in Data structures")
	public void the_user4_clicks_practice_questions_link_in_data_structures() {

		ds_pf.click_Practice_Questions();
		
	}

	@Then("The user4 should be redirected to Practice Questions page in Data structures")
	public void the_user4_should_be_redirected_to_practice_questions_page_in_data_structures() {
		LoggerLoad.info("No practice Questions blank page is displayed");
		assertEquals(ds_pf.Homepagetext1(), "Practice Questions");
		LoggerLoad.info("NO questions found ");
	}
}
