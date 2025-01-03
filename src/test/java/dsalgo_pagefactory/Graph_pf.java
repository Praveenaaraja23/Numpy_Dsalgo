package dsalgo_pagefactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
//import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;

public class Graph_pf {
//	
//WebDriver driver;
//	
//	String url = "https://dsportalapp.herokuapp.com";
//	

	@FindBy(xpath = "//a[@href='graph']")
	WebElement getstarted;

	@FindBy(xpath = "//a[@href='graph']")
	WebElement graph;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryEditorLink;

	@FindBy(xpath = "//button[@onclick='runit()']")
	WebElement runbutton;

	@FindBy(xpath = "//a[@href='graph-representations']")
	WebElement graphRepresentationsLink;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement tryEditor;

	@FindBy(xpath = "//button[@onclick='runit()']")
	WebElement runcmd;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement Output;

	@FindBy(xpath = "//a[@href='/graph/practice']")
	WebElement practiceQuestionsLink;

	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement hometext;

	String result;

	public void runbtn() {

		runcmd.click();

	}

	WebDriver driver = DriverManager.getdriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public Graph_pf() {

		PageFactory.initElements(driver, this);
	}

	public void GetStarted() {
		getstarted.click();

	}

	public void graph() {
		graph.click();
	}

	public void tryEditorLink() {
		tryEditorLink.click();
	}

	public void Entercode_Tryeditor(String SampleEditor) {

		System.out.println(SampleEditor);
		tryEditor.sendKeys(SampleEditor);

	}

	public String ActualOutput() {
		String result;
		try {
			Alert alert = driver.switchTo().alert();
			result = alert.getText();
			if (result != null) {
				System.out.println(result);
				Thread.sleep(2000);
				alert.accept();
			}
		} catch (Exception e) {
			result = Output.getText();
			System.out.println("No Alert");
		}
		return result;
	}

	public void graphRepresentationsLink() {
		graphRepresentationsLink.click();
	}

	public String getCodefromExcel(String Sheetname, int Rownumber)
			throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		ExcelReader reader = new ExcelReader();
		String Excelpath = ConfigReader.excelpath();
		LoggerLoad.info("Set the path");
		List<Map<String, String>> testData = reader.getData(Excelpath, Sheetname);
		LoggerLoad.info("To read the Data from Excelsheet");
		String pythoncode = testData.get(Rownumber).get("pythoncode");
		System.out.println(pythoncode);
		LoggerLoad.info("To get data from excel sheet");
		return pythoncode;
	}

	public String getoutputfromExcel(String Sheetname, int Rownumber)
			throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		ExcelReader reader = new ExcelReader();
		String Excelpath = ConfigReader.excelpath();
		LoggerLoad.info("Set the path");

		List<Map<String, String>> testData = reader.getData(Excelpath, Sheetname);
		LoggerLoad.info("To read the Data from Excelsheet");
		String Expectedresult1 = testData.get(Rownumber).get("ExpectedOutput");
		LoggerLoad.info("To get data from excel sheet");
		return Expectedresult1;
	}

	public String getActualResult() {
		result = Output.getText();
		return result;
	}

	public String getErrormsg() {
		LoggerLoad.info("Entered getErrormsg-");

		Alert alert = driver.switchTo().alert();
		result = alert.getText();
		LoggerLoad.info("Result Alert-" + result);
		alert.accept();
		LoggerLoad.info("popup alert is :" + result);

		return result;
	}

	public void click_Practice_Questions() {

		// driver.manage().window().maximize();
		practiceQuestionsLink.click();

	}

	public String Homepagetext1() {
		String hometitle = hometext.getText();
		return hometitle;

	}

	public String pagetitle() {
		return driver.getTitle();
	}

}
