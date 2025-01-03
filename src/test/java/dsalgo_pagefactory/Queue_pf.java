package dsalgo_pagefactory;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;


public class Queue_pf {
	
	
	//------------------------locators-------------------------------------------------//
	
	//dropdown queue
	@FindBy(xpath = "*//a[contains(text(),'Data Structures')]")WebElement dropdown;
	
	@FindBy(xpath = "//a[@href=\"/queue\']")WebElement dropdown_queue;
	
	
	//getstarted queue
	@FindBy(xpath = "//a[@href='queue']")WebElement getstartedqueue;
	
	//link queue
	@FindBy(xpath = "//a[@href='implementation-lists']")WebElement implementationLink; 
	
	@FindBy(xpath = "//a[@href='implementation-collections']")WebElement implementationCollections;
	
	@FindBy(xpath = "//a[@href='Implementation-array']")WebElement ImplementationArray;
	
	@FindBy(xpath = "//a[@href='QueueOp']")WebElement QueueOp;
	
	//tryeditor queue
	
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement tryHere;
	
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement tryEditor;
	
	@FindBy(xpath = "//button[@type='button']")WebElement runButton;
	
	
	@FindBy(id = "output")WebElement output;

	// practice questions 
	
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement PracticeQuestionsLink;
	 
	//signout
	@FindBy(xpath="//a[text()='Sign out']")WebElement sign_out;
	
	@FindBy(xpath= "//a[text()='NumpyNinja']")WebElement hometext;
	
	String result;
	
//--------------------------------------------Methods ----------------------------------------------------------//
	
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();

	public Queue_pf() {
		
		PageFactory.initElements(driver , this);
	}
	
   public void GetStarted_Queue() {
		
		driver.manage().window().maximize();
		
		getstartedqueue.click();
		
	}
	
	
  public void implelink_Queue() {
		
		driver.manage().window().maximize();
		
		implementationLink.click();
		
	}
  
  public void Queuecollection() {
		
		driver.manage().window().maximize();
  
		
		implementationCollections.click();
		
	}
  
  
  public void implelinkArray() {
		
		driver.manage().window().maximize();
		
		ImplementationArray.click();
		
	}
  
  
  public void QueueOplink() {
		
		driver.manage().window().maximize();
		
		QueueOp.click();
		
	}
  
  
  public void Tryherebtn() {
		
	  tryHere.click();

	}
  
  public void runbutton() {
	  
	  driver.manage().window().maximize();
		
		runButton.click();
		
	  
  }
  
  public String getCodefromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {
		ExcelReader reader = new ExcelReader();
		String Excelpath = ConfigReader.excelpath();
		LoggerLoad.info("Set the path");
		List<Map<String,String>> testData = reader.getData(Excelpath, Sheetname);
		LoggerLoad.info("To read the Data from Excelsheet");
		String pythoncode  = testData.get(Rownumber).get("pythoncode");
		System.out.println(pythoncode);
		LoggerLoad.info("To get data from excel sheet");
		return pythoncode;
	}
 
  public String getoutputfromExcel(String Sheetname, int Rownumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException  {
		ExcelReader reader = new ExcelReader();
		String Excelpath = ConfigReader.excelpath();
		LoggerLoad.info("Set the path");
		
		List<Map<String,String>> testData = reader.getData(Excelpath, Sheetname);
		LoggerLoad.info("To read the Data from Excelsheet");
		String Expectedresult1 = testData.get(Rownumber).get("ExpectedOutput");
		LoggerLoad.info("To get data from excel sheet");
       return Expectedresult1;
	}
  
  

	public String getActualResult() {
		result = output.getText();
		return result;
	}
 
  
  public void Entercode_Tryeditor(String excelValue)  {

		System.out.println();
		tryEditor.sendKeys(excelValue);


	}
  
  
  public String getErrormsg() {
		LoggerLoad.info("Entered getErrormsg-");
		
		Alert alert = driver.switchTo().alert();	
		result=alert.getText();
		LoggerLoad.info("Result Alert-"+result);
		alert.accept();
		LoggerLoad.info("popup alert is :" + result);
		          
		return result;
	}
  

		public void click_Practice_Questions() {
		
		driver.manage().window().maximize();
		PracticeQuestionsLink.click();

	}
	
	
	public void sign_out() {
		
		driver.manage().window().maximize();
		sign_out.click();
	}
		
	
	public String pagetitle()
	{
		
			return driver.getTitle();
	}
	
	
	public String Homepagetext1() 
	{
		String hometitle=hometext.getText();
		return hometitle;
	
	}
		
	
}
	
	
	
	
	
	
	

