package dsalgo_pagefactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgo_hooks.Hooks;
import dsalgo_pagefactory.Login_pf;
import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;

public class Tree_pf {
	//public  WebDriver driver;
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
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement sign_out;
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

	
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();

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

	public void Entercode_Tryeditor(String pythoncode)  {

		System.out.println(pythoncode);
		TryEditor.sendKeys(pythoncode);


	}
	

	
	
	public void runbtn() {

		Runbutton.click();
		
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
	
	public void sign_out() {
		
		sign_out.click();
	}
	
	public  void ValidateTreeHomepage() {

		String current_url = driver.getCurrentUrl();
		if(current_url.equals("https://dsportalapp.herokuapp.com/tree/")) {
			System.out.println("Validation Successfull");
		}
		else {
			System.out.println("Validation UnSuccessfull and the address bar url is:" + current_url);
		}
	}



}