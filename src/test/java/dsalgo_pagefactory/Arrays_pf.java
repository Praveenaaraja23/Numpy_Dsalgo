package dsalgo_pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;

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
//	@FindBy (xpath="//button[text()='Run']")WebElement Practicequestions_Run_button;	
//	@FindBy (xpath="//*[@id='answer_form']")WebElement Practicequestion_Editorinput;
//	@FindBy (xpath="//input[@value='Submit']")WebElement Practicequestion_Submitbutton;
//	@FindBy (xpath="//pre[@id='output']") WebElement Practicequestion_Editoroutput;
	
	
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
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
}

