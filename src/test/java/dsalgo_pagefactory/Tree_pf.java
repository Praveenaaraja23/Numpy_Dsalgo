package dsalgo_pagefactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.Alert;
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

public class Tree_pf {

	@FindBy (xpath="//a[@href='tree']")
	WebElement Tree_Getstarted;
	@FindBy(xpath="//a[@href='overview-of-trees']")
	WebElement OverviewofTrees;
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement TryHere;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement TryEditor;
	@FindBy(xpath = "//button[@type='button']")
	WebElement Runbutton;
	@FindBy (xpath="//pre[@id='output']")
	WebElement Output;
	@FindBy(xpath="//a[@href='/tree/terminologies/']")
	WebElement Tree_terminologies;
	@FindBy(xpath="//a[@href='/tree/types-of-trees/']")
	WebElement Types_of_Trees;
	@FindBy(xpath="//a[@href='/tree/tree-traversals/']")
	WebElement Tree_Traversal;
	@FindBy(xpath="//a[@href='/tree/traversals-illustration/']")
	WebElement Traversals_Illustration;
	@FindBy(xpath="//a[@href='/tree/binary-trees/']")
	WebElement Binary_Trees;
	@FindBy(xpath="//a[@href='/tree/types-of-binary-trees/']")
	WebElement Types_of_Binary_Trees;
	@FindBy(xpath="//a[@href='/tree/implementation-in-python/']")
	WebElement Implementation_in_Python;
	@FindBy(xpath="//a[@href='/tree/binary-tree-traversals/']")
	WebElement Binary_Tree_Traversals;
	@FindBy(xpath="//a[@href='/tree/implementation-of-binary-trees/']")
	WebElement Implementation_of_Binary_Trees;
	@FindBy(xpath="//a[@href='/tree/applications-of-binary-trees/']")
	WebElement Applications_of_Binary_trees;
	@FindBy(xpath="//a[@href='/tree/binary-search-trees/']")
	WebElement Binary_Search_Trees;
	@FindBy(xpath="//a[@href='/tree/implementation-of-bst/']")
	WebElement Implementation_Of_BST;
	@FindBy(xpath="//a[@href='/tree/practice']")
	WebElement Practice_Questions;
	@FindBy(xpath="//div[@class='col-sm']/strong/p[@class='bg-secondary text-white']")
	WebElement Textfrompage;
	@FindBy(xpath= "//a[text()='NumpyNinja']")
	WebElement hometext;
	String result;
	ExcelReader reader = new ExcelReader();
	String Excelpath = ConfigReader.excelpath();
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();
	public Object alert;
	String   excelValue;

	public Tree_pf() {

		PageFactory.initElements(driver , this);
	}

	public void GetStarted() {
		Tree_Getstarted.click();

	}

	public void click_overview_tree() {
		OverviewofTrees.click();

	}
	public void click_Tree_terminologies() {
		Tree_terminologies.click();

	}
	public void click_Types_of_Trees() {
		Types_of_Trees.click();

	}
	public void click_Tree_Traversal() {
		Tree_Traversal.click();

	}
	public void click_Traversals_Illustration() {
		Traversals_Illustration.click();

	}
	public void click_Binary_Trees() {
		Binary_Trees.click();

	}
	public void click_Types_of_Binary_Trees() {
		Types_of_Binary_Trees.click();

	}

	public void click_Implementation_in_Python() {
		Implementation_in_Python.click();

	}
	public void Binary_Tree_Traversals() {
		Binary_Tree_Traversals.click();

	}
	public void click_Implementation_of_Binary_Trees() {
		Implementation_of_Binary_Trees.click();

	}
	public void click_Applications_of_Binary_trees() {
		Applications_of_Binary_trees.click();

	}
	public void click_Binary_Search_Trees() {
		Binary_Search_Trees.click();

	}
	public void click_Implementation_Of_BST() {
		Implementation_Of_BST.click();

	}
	public void click_Practice_Questions() {
		Practice_Questions.click();

	}

	public void click_Tryherebtn() {
		TryHere.click();

	}

	public String Entercode_Tryeditor(String excelValue)  {

		 TryEditor.sendKeys(excelValue);
		  return  excelValue;
	}

	public void runbtn() {

		Runbutton.click();
	}

	public String getActualResult() {
		result = Output.getText();
		return result;
	}

	public String getErrormsg() {
     try {
    	 
        Alert alert = driver.switchTo().alert();	
		result=alert.getText();
		alert.accept();
      }catch(NoAlertPresentException e) {
    	 result=" ";
    	 System.out.println("No alert found");
    	  }
     return result;
     }
	public String getTreePageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getCodefromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {

		LoggerLoad.info("Set the path");
		List<Map<String,String>> testData = reader.getData(Excelpath, Sheetname);
		String pythoncode  = testData.get(Rownumber).get("pythoncode");
		return pythoncode;
	}

	public String getoutputfromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {

		List<Map<String,String>> testData = reader.getData(Excelpath, Sheetname);
	    String Expectedresult1 = testData.get(Rownumber).get("ExpectedOutput");
		return Expectedresult1;
	}
	public String alltreetext() {
		String Text=Textfrompage.getText();
		return Text;
	}
	public String Homepagetext() {
		String hometitle=hometext.getText();
		return hometitle;

	}
	
}