package dsalgo_pagefactory;

	import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import dsalgo_utils.ConfigReader;
	import dsalgo_utils.DriverManager;
	import dsalgo_utils.LoggerLoad;


	public class Homepage_pf {
		
		WebDriver driver= DriverManager.getdriver();
		ConfigReader configFileReader=DriverManager.configReader();
		
		// get started
		@FindBy(xpath = "//button[text()='Get Started']") WebElement getStarted_home;
		
		
		// getstared for modules
		@FindBy	(xpath = "//a[@href='data-structures-introduction']") WebElement getStarted_datastructure;
		@FindBy (xpath ="//a[@href='array']")WebElement getstarted_array;
		@FindBy (xpath ="//a[@href='linked-list']")WebElement getstarted_linkedlist;
		@FindBy (xpath ="//a[@href='stack']")WebElement getstarted_stack;
		@FindBy (xpath ="//a[@href='queue']")WebElement getstarted_queue;
		@FindBy (xpath ="//a[@href='tree']")WebElement getstarted_tree;
		@FindBy (xpath ="//a[@href='graph']")WebElement getstarted_graph;

		
		
			//dropdown for modules
		@FindBy (xpath ="//a[text()='Data Structures']")WebElement dropdown_datastructure;
		@FindBy (xpath ="//div[@class='dropdown-menu show']/a[text()='Arrays']")WebElement dropdown_arrays;
		@FindBy (xpath ="//div[@class='dropdown-menu show']/a[text()='Linked List']")WebElement dropdown_linkedlist;
		@FindBy (xpath ="//div[@class='dropdown-menu show']/a[text()='Stack']")WebElement dropdown_stack;
		@FindBy (xpath ="//div[@class='dropdown-menu show']/a[text()='Queue']")WebElement dropdown_queue;
		@FindBy (xpath ="//div[@class='dropdown-menu show']/a[text()='Tree']")WebElement dropdown_tree;
		@FindBy (xpath ="//div[@class='dropdown-menu show']/a[text()='Graph']")WebElement dropdown_graph;		
		
		
	
		// register and login
		@FindBy (xpath ="//a[@href='/register']")WebElement register;
		@FindBy (xpath ="//a[@href='/login']")WebElement signin;
		
		//warning msg
		@FindBy(xpath = "//div[contains(text(),'You are not logged in')]") WebElement buttonwarningmsg;

		
	public Homepage_pf() {

			
		PageFactory.initElements(driver , this);

	}
		
		
	public void GetStarted() {
		
		getStarted_home.click();


	}
	
	
	public void buttonselect(String option) {
		
		
	
	switch (option) {
	
	case "Datastructures":
		LoggerLoad.info("click " + getStarted_datastructure.getText() + "link on  DataStructures ");
		getStarted_datastructure.click();
		break;
	case "Arrays":
		LoggerLoad.info("click " + getstarted_array.getText() + "link on Array ");
		getstarted_array.click();
		break;
	case "Linkedlist":
		LoggerLoad.info("click " + getstarted_linkedlist.getText() + "link on LinkedList");
		getstarted_linkedlist.click();
		break;
	case "Stack":
		LoggerLoad.info("click " + getstarted_stack.getText() + "link on stack");
		getstarted_stack.click();
		break;
	case "Queue":
		LoggerLoad.info("click " + getstarted_queue.getText() + "link on queue ");
		getstarted_queue.click();
		break;
	case "Tree":
		LoggerLoad.info("click " + getstarted_tree.getText() + "link on Tree ");
		getstarted_tree.click();
		break;
	case "Graph":
		LoggerLoad.info("click " + getstarted_graph.getText() + "link on Graph ");
		getstarted_graph.click();
		break;
	}
}
	
	
	public String printwarnmsg( String warningmessage) {
		try {
			if(buttonwarningmsg.getText().equals(warningmessage)) {
				
				System.out.println(buttonwarningmsg.getText());		

			}
			else  {
				System.out.println("Title Not matched");

			}
		}catch (Exception e) {
			System.out.println("Element doesnt exists");
		}
		return warningmessage;

	}
	
	
	public void dropdownselect(String option) {
		
		dropdown_datastructure.click();
		
		switch (option) 
		
		{
	
		case "Arrays":
			LoggerLoad.info("User click on " + option);
			dropdown_arrays.click();
			break;
		case "Linkedlist":
			LoggerLoad.info("User click on " + option);
			dropdown_linkedlist.click();
			break;
		case "Stack":
			LoggerLoad.info("User click on " + option);
			dropdown_stack.click();
			break;
		case "Queue":
			LoggerLoad.info("User click on " + option);
			dropdown_queue.click();
			break;
		case "Tree":
			LoggerLoad.info("User click on " + option);
			dropdown_tree.click();
			break;
		case "Graph":
			LoggerLoad.info("User click on " + option);
			dropdown_graph.click();
			break;
		}
	}
		
	
	public void signin()
	{
		
		signin.click();
	}
	
	
	public void register()
	
	{
		register.click();
	
	}

	public String Dspage()
	{
		return driver.getTitle();
	}
	
	public String Gethome()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
}