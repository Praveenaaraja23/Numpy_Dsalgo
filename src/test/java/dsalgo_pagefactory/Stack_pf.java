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
import dsalgo_utils.ExcelReader;
import dsalgo_utils.LoggerLoad;

public class Stack_pf {	
	
	@FindBy(xpath="//a[@href='stack']")WebElement getStarted;
	@FindBy(xpath="//a[@href='operations-in-stack']")WebElement Operations_in_Stack_Link;
	@FindBy(xpath="//a[@href='implementation']")WebElement Implementations_Link;
	@FindBy(xpath="//a[@href='stack-applications']")WebElement Applications_Link;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryHere_Link;
	@FindBy(xpath="//a[@href='/stack/practice']")WebElement PracticeQuestions_Link;
	@FindBy(xpath="//button[@type='button']")WebElement RunbuttonLink;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement TryEditorbox;
	@FindBy (xpath="//pre[@id='output']")WebElement Console_Output;
	@FindBy(xpath= "//a[text()='NumpyNinja']")	WebElement hometext;
	String result;
	
	
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	public Stack_pf()
	{
				
		PageFactory.initElements(driver,this);

	}
	
	public void GetStarted_Stack() {

		getStarted.click();
		
	}

	//Operations_in_Stack_Link
	
	public void Operations_in_Stack_Link() {
		
		Operations_in_Stack_Link.click();
		
		
	}
	
	//Implementations_Link
	
    public void Implementations_Link() {
	
    	Implementations_Link.click();
	
	
}
    
    //Applications_Link
    
    public void Applications_Link() {
    	
    	Applications_Link.click();
	
	
}

	
	
	
   public void TryHere_Link() {
		
		TryHere_Link.click();
		
		
	}
   
   public void TryEditorbox(String TryEditor1) {
		
		TryEditorbox.sendKeys(TryEditor1);
   }
   
   public void RunButton() {
	   
	   RunbuttonLink.click();
	   
   }
   
   public void PracticeQuestions_Link() {
	   PracticeQuestions_Link.click();
   }
   
   public String ActualOutput() {
		String result;
		try {
		Alert alert = driver.switchTo().alert();	
		result=alert.getText();
		if(result != null)
		{
				System.out.println(result);
				Thread.sleep(2000);
				alert.accept();			
		}
		}catch(Exception e){
		 result = Console_Output.getText();
		 System.out.println("No Alert");
		}
		return result;
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

	public String getErrormsg() {
		LoggerLoad.info("Entered getErrormsg-");
		
		Alert alert = driver.switchTo().alert();	
			   result=alert.getText();
			   LoggerLoad.info("Result Alert-"+result);
		           alert.accept();
		           LoggerLoad.info("popup alert is :" + result);
		          
		return result;
	}
	
	public void Entercode_Tryeditor(String excelValue)  {

		System.out.println();
		TryEditorbox.sendKeys(excelValue);


	}

	public String getActualResult() {
		result = Console_Output.getText();
		return result;
	}
	
	public String getStackPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String Homepagetext() {
		String hometitle=hometext.getText();
		return hometitle;

	}
   
}


			
		
