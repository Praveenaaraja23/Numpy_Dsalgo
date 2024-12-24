package dsalgo_pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;

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
   
   
   
}


			
		
