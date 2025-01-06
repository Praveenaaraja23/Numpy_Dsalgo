package dsalgo_pagefactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;

public class Datastructures_pf {

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement getstarted;

	@FindBy(xpath = "//a[@href='time-complexity']")
	WebElement Timecomplexity;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement TryHere;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement TryEditor;

	@FindBy(xpath = "//button[@onclick='runit()']")
	WebElement Runcommand;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement Output;

	@FindBy(xpath = "//a[@href='/data-structures-introduction/practice']")
	WebElement PracticeQuestions;

	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement hometext;

	WebDriver driver = DriverManager.getdriver();
	ConfigReader configFileReader = DriverManager.configReader();

	String result;

	public Datastructures_pf() {

		PageFactory.initElements(driver, this);
	}

	public void GetStarted() {
		getstarted.click();

	}

	public void Timecomplexity() {

		Timecomplexity.click();

	}

	public void TryHere() {
		TryHere.click();

	}

	public void Entercode_Tryeditor(String pythoncode) {

		TryEditor.sendKeys(pythoncode);

	}

	public void Runcommand() {
		Runcommand.click();

	}

	public void click_Practice_Questions() {

		driver.manage().window().maximize();
		PracticeQuestions.click();

	}

	public String Homepagetext1() {
		String hometitle = hometext.getText();
		return hometitle;

	}

	public String getCodefromExcel(String Sheetname, int Rownumber)
			throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		ExcelReader reader = new ExcelReader();
		String Excelpath = ConfigReader.excelpath();

		List<Map<String, String>> testData = reader.getData(Excelpath, Sheetname);

		String pythoncode = testData.get(Rownumber).get("pythoncode");

		LoggerLoad.info("To get data from excel sheet");
		return pythoncode;
	}

	public String getoutputfromExcel(String Sheetname, int Rownumber)
			throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		ExcelReader reader = new ExcelReader();
		String Excelpath = ConfigReader.excelpath();

		List<Map<String, String>> testData = reader.getData(Excelpath, Sheetname);

		String Expectedresult1 = testData.get(Rownumber).get("ExpectedOutput");

		return Expectedresult1;
	}

	public String getActualResult() {
		result = Output.getText();
		return result;
	}

	public String pagetitle() {
		return driver.getTitle();
	}

	public String getErrormsg() {
		try {

			Alert alert = driver.switchTo().alert();
			result = alert.getText();

			alert.accept();

		} catch (NoAlertPresentException e) {
			result = " ";
			System.out.println("No alert found");
		}
		return result;
	}
}
