package dsalgo_pagefactory;



import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;


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
  
  
  public void click_Tryherebtn() {
		
	  tryHere.click();

	}
  
  public void runbutton() {
	  
	  driver.manage().window().maximize();
		
		runButton.click();
		
	  
  }
  

  
	public void Entercode_Tryeditor(String samplecode)  {

		System.out.println(samplecode);
		tryEditor.sendKeys(samplecode);


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
		 result = output.getText();
		 System.out.println("No Alert");
		}
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
		
	
	public  void ValidateQueueHomepage() {

		String current_url = driver.getCurrentUrl();
		if(current_url.equals("https://dsportalapp.herokuapp.com/queue/")) {
			System.out.println("Validation Successfull");
		}
		else {
			System.out.println("Validation UnSuccessfull and the address bar url is:" + current_url);
		}
	}

	
	public String Homepagetext()
	{
		
			return driver.getTitle();
		}
	
	public String Queuepagetext()
	{
			return driver.getTitle();
	}
	
	
	public String impQuepagetext()
	{
		return driver.getTitle();
	}
	
	public String tryeditorpage()
	{
		return driver.getTitle();
	}
	
	
	//comment
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	

