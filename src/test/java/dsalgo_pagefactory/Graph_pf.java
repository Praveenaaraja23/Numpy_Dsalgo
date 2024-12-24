package dsalgo_pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
//import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

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
	
	//a[@href='graph-representations']

	//a[@href='/graph/graph-representations/'
//	@FindBy(xpath = "//a[@href='/tryEditor']")
//	WebElement tryEditor;

	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement tryEditor;
	
	@FindBy(xpath = "//button[@onclick='runit()']")
	WebElement runcmd;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement Output;

	@FindBy(xpath = "//a[@href='/graph/practice']")
	WebElement practiceLink;

//	public Graph_pf(WebDriver driver)
//	{
//		this.driver = driver;
//		
//		PageFactory.initElements(driver , this);
//
//	}
//	
//	public void GetStarted_Graph() {
//
//		getstarted.click();
//		
//	}

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

	public void runcmd() {
		runcmd.click();

	}
	
	public void Entercode_Tryeditor(String SampleEditor)  {

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
	
}
