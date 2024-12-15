package dsalgo_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;

public class Linkedlist_pf {
	
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();
   
	   @FindBy (xpath = "//a[@href='linked-list']") WebElement getstartedlinkedlist;
	   @FindBy (xpath="//a[@href='introduction']")WebElement introductionLink;  
		@FindBy (xpath="//a[@href='creating-linked-list']")WebElement creatinglinkedlistLink; 
		@FindBy (xpath="//a[@href='types-of-linked-list']")WebElement typesOfLinkedlistLink;  
		@FindBy (xpath="//a[@href='implement-linked-list-in-python']")WebElement implementLinkedlistInPythonLink; 
		@FindBy (xpath="//a[@href='traversal']")WebElement traversalLink; 
		@FindBy (xpath="//a[@href='insertion-in-linked-list']")WebElement insertionLink; 
		@FindBy (xpath="//a[@href='deletion-in-linked-list']")WebElement deletionLink; 
		@FindBy (xpath="//a[@href='/linked-list/practice']")WebElement practicequestionLink; 
		@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryHerebtn;
		@FindBy(xpath = "//div[@class = 'CodeMirror-sizer']")WebElement tryeditor; 
		@FindBy(xpath = "//*[@id='answer_form']/button")WebElement runButton;
		@FindBy(id = "output")WebElement output;
		@FindBy(xpath= "//h4[text()='Linked List']") WebElement linkedlisthometext;
		@FindBy(xpath= "//p[@class='bg-secondary text-white']") WebElement liststext;
		 
		 public Linkedlist_pf() {
		    	//this.driver=driver;
				PageFactory.initElements(driver,this);
		}
		 
		 public void click_getstarted_linkedlist() {
			 getstartedlinkedlist.click();
			}
		 
		public void clickIntroductionLink() {
			
			introductionLink.click();
		}

		public void clickCreatingLinkedlistLink() {
		
			creatinglinkedlistLink.click();
		}

	
//	    public String Homepagetext() {
//	    	String hometitle=hometext.getText();
//	    	return hometitle;
//	    	
//	    }
	    public String linkedlistpagetext() {
	    	String linkedtitle=linkedlisthometext.getText();
	    	return linkedtitle;
	    	
	    }
	  
	    
public void clicktypesOfLinkedlistLink() {
		
	 typesOfLinkedlistLink.click();
			
		}
public void clickimplementLinkedlistInPythonLink() {
		
	 implementLinkedlistInPythonLink.click();
	}
public void clicktraversalLink() {
		
	 traversalLink.click();	
		}

public void clickdeletionLink() {
		
	 deletionLink.click();
	}

public void clicpracticequestionLinkk() {
	 
	 practicequestionLink.click(); 	
		
	}

public void clickTryhere() {
	tryHerebtn.click();
	 
}

public void Entercode_Tryeditor(String Pythoncode)  {

	System.out.println(Pythoncode);
	tryeditor.sendKeys(Pythoncode);


}
public void runbtn() {

	runButton.click();	  
}

 public String alertmsg() {
	 
	 String getalertmsg=driver.switchTo().alert().getText();
	 driver.switchTo().alert().accept();
     return getalertmsg;
	
}
 
 public void clickpracticeQuestion() {
	 practicequestionLink.click();
	
 }
 
 public String getScriptOutput() {
		return output.getText();
	}


}



