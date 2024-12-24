package dsalgo_pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;

public class Datastructures_pf {
	
	
//WebDriver driver;
//	
//	String url = "https://dsportalapp.herokuapp.com";

@FindBy(xpath="//a[@href='data-structures-introduction']")WebElement getstarted;

@FindBy(xpath="//a[@href='time-complexity']")WebElement Timecomplexity;

@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryHere;

@FindBy(xpath = "//textarea[@tabindex='0']")WebElement TryEditor;

@FindBy(xpath="//button[@onclick='runit()']")WebElement Runcommand;

@FindBy (xpath="//pre[@id='output']")WebElement Output;

//@FindBy(xpath="//list-group-item list-group-item-light text-info//']

@FindBy(xpath="//a[@href='/data-structures-introduction/practice']")WebElement PracticeQuestions;


WebDriver driver= DriverManager.getdriver();
ConfigReader configFileReader=DriverManager.configReader();

public Datastructures_pf() {
	
	PageFactory.initElements(driver , this);
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

public void Entercode_Tryeditor(String pythoncode)  {

	System.out.println(pythoncode);
	TryEditor.sendKeys(pythoncode);

}

public void Runcommand() {
	Runcommand.click();

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
	 result = Output.getText();
	 System.out.println("No Alert");
	}
	return result;
}


}

