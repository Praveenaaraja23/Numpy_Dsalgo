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
import dsalgo_utils.Practicequestionutil;

public class Arrays_pf {
	
	
	@FindBy (xpath="//a[@href='array']")WebElement getStarted;
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement Arrays_in_Python_Link;
	@FindBy (xpath="//a[@href='arrays-using-list']")WebElement Arrays_Using_List_Link;
	@FindBy (xpath="//a[@href='basic-operations-in-lists']")WebElement Basic_Operations_in_Lists_Link;
	@FindBy (xpath="//a[@href='applications-of-array']")WebElement Applications_of_Array_Link;
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHere_Link;	
	@FindBy (xpath="//a[@href='/array/practice']")WebElement PracticeQuestions_Link;
	@FindBy (xpath="//button[@type='button']")WebElement RunbuttonLink;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement TryEditorbox;
	@FindBy (xpath="//pre[@id='output']")WebElement Console_Output;
	@FindBy (xpath="//a[@href='/array/practice']")WebElement Practicequestions_button;
	@FindBy(xpath= "//a[text()='NumpyNinja']")	WebElement hometext;
	//@FindBy(xpath= "//a[text()='NumpyNinja']")	WebElement hometext;
	String result;
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy (xpath="//button[text()='Run']")WebElement Practicequestions_Run_button;	
	@FindBy (xpath="//*[@id='answer_form']")WebElement Practicequestion_Editorinput;
	@FindBy (xpath="//input[@value='Submit']")WebElement Practicequestion_Submitbutton;
//	@FindBy (xpath="//pre[@id='output']") WebElement Practicequestion_Editoroutput;
	@FindBy (xpath="//a[@href='/question/1']") WebElement SearchtheArrayLink;
	@FindBy (xpath="//a[@href='/question/2']") WebElement findMaxConsecutiveOnesLink;
	@FindBy (xpath="//a[@href='/question/3']") WebElement FindNumberswithEvenNumberofDigits;
	@FindBy (xpath="//a[@href='/question/4']") WebElement SquaresofaSortedArray;
	@FindBy (id="output")WebElement output;
//	@FindBy (xpath="//*[@id='answer_form']")WebElement answerform;
	
	
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	Practicequestionutil util=new Practicequestionutil();
	
	public Arrays_pf() {		
		
		PageFactory.initElements(driver,this);
	}
	
	public void getStarted_Arrays() {
		
		getStarted.click();
		
		
	}
	
	public void Arrays_in_Python_Link() {
		
		Arrays_in_Python_Link.click();
		
		
	}
	
	//Arrays_in_Python_Link
	
	public void Arrays_Using_List_Link() {
		
		Arrays_Using_List_Link.click();
		
		
	}
	
	//Basic_Operations_in_Lists_Link
	
   public void Basic_Operations_in_Lists_Link() {
		
	   Basic_Operations_in_Lists_Link.click();
		
		
	}
   
   //Applications_of_Array_Link
   
   public void Applications_of_Array_Link() {
		
	   Applications_of_Array_Link.click();
		
		
	}
   
   //SearchtheArrayLink
   
   public void SearchtheArrayLink()
   {
	   SearchtheArrayLink.click();
   }
   
   
   //findMaxConsecutiveOnes
   
   public void findMaxConsecutiveOnesLink()
   {
	   findMaxConsecutiveOnesLink.click();
   }
   
   //@FindNumberswithEvenNumberofDigits
   
   public void FindNumberswithEvenNumberofDigits() {
	   FindNumberswithEvenNumberofDigits.click();
   }
   
   //@SquaresofaSortedArray
   
   public void SquaresofaSortedArray() {
	   SquaresofaSortedArray.click();
   }

	public void TryHere_Link() {
		
		TryHere_Link.click();
		
		
	}
	
public void TryEditorbox(String TryEditor) {
		
	TryEditorbox.sendKeys(TryEditor);
		
		
	}


public void RunbuttonLink() {
	
	RunbuttonLink.click();
	
}

public void Practicequestions_button() {
	Practicequestions_button.click();
}

public void Practicequestions_Run_button() {

	Practicequestions_Run_button.click();
}

public void Practicequestion_Submitbutton() {
	Practicequestion_Submitbutton.click();
}


public void Entercode_Tryeditor(String excelValue)  {

	System.out.println();
	TryEditorbox.sendKeys(excelValue);


}

public String getActualResult1() {
	util.waitForElement(output);
	return output.getText();

}

public String getActualResult() {
	result = Console_Output.getText();
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

public String ActualOutput() {
	String result;
	try {
	Alert alert = driver.switchTo().alert();	
	result=alert.getText();
	if(result != null || result == null)
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

public String getArrayPageTitle() {
	String title = driver.getTitle();
	return title;
}

public String Homepagetext() {
	String hometitle=hometext.getText();
	return hometitle;

}

public String Practicequestionstext() {
	String Practicequestionstitle=hometext.getText();
	return Practicequestionstitle;

}

public void enterPythonCodePractice(String Sheetname,int Rownumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{
	util.waitForElement(Practicequestion_Editorinput);
	String code = util.getCodefromExcel(Sheetname, Rownumber);
	util.enterCodePractice(code, editorInput);

}

public String getExpectedResult(String Sheetname,int Rownumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
	String expectedResult = util.getResultfromExcel(Sheetname, Rownumber);
	return expectedResult;
}



}

