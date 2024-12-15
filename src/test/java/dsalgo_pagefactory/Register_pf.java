package dsalgo_pagefactory;

import org.openqa.selenium.WebDriver;
import dsalgo_utils.ConfigReader;
import dsalgo_utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register_pf {
	
	
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();
	    
	    @FindBy (xpath="//button[text()='Get Started']") WebElement Getstartedbtn;
	    @FindBy(xpath= "//a[text()='NumpyNinja']") WebElement hometext;
	    @FindBy (xpath="//a[text()=' Register ']") WebElement Registerlink;
	    @FindBy (name= "username") WebElement UserName;
		@FindBy (name="password1") WebElement Password;
		@FindBy (name="password2") WebElement confirmpwd;
		 @FindBy (xpath="//input[@value='Register']") WebElement Registerbtn;
		 @FindBy (xpath="//div[@class='alert alert-primary']") WebElement Errormessage;
		@FindBy (xpath="//div[@class='alert alert-primary']") WebElement sucessmessage;  
		 
		 	 
		 public Register_pf() {
		    	this.driver=driver;
				PageFactory.initElements(driver,this);
		}
		
		    public void GetStarted() {
				 Getstartedbtn.click();
				 
			 }
		    
		    public String Homepagetext() {
		    	String hometitle=hometext.getText();
		    	return hometitle;
		    	
		    }
			    
		    
		    public void Rlink() {
		    	
		    	Registerlink.click();
		    	//driver.navigate().to("https://dsportalapp.herokuapp.com/register");
		    	
		    	
		    }
		    public void login(String uname,String Pwd,String cnfpwd) {
		    	
		    	UserName.clear();
		    	UserName.sendKeys(uname);
		    	Password.clear();
		    	Password.sendKeys(Pwd);
		    	confirmpwd.clear();
		    	confirmpwd.sendKeys(cnfpwd);
		    	Registerbtn.click();
		    		
		    	}
		    public void closebrowser() {
		    	driver.quit();
		    }
		    
		    public String getErrorMsg() {
				String msg = Errormessage.getText();
				return msg;
			}
		    
		    public String actMsg() {
				WebElement activeElement = driver.switchTo().activeElement();
				String messageStr = activeElement.getAttribute("validationMessage");
				return messageStr;
			
			}
	
		    public String emptyUserErrorMsg() {
				return UserName.getAttribute("validationMessage");
			}

			public String emptyPwdErrorMsg() {
				return Password.getAttribute("validationMessage");
			}

			public String emptyPwdConfirmErrorMsg() {
				return confirmpwd.getAttribute("validationMessage");
			}
}


		 /*   if (username.isBlank()) {
				JavascriptExecutor js_user = (JavascriptExecutor) driver;
				 isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", UserName);
				return isRequired;
			} else if (password.isBlank()) {
				JavascriptExecutor js_password = (JavascriptExecutor) driver;
				isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", Password);
				return isRequired;

			}
			return isRequired;
		}
		  */ 
		    
		    /*
		    public Boolean userfieldsempty() {
		    	
		    	// isRequired =false;
		    	if(UserName.getText().isBlank()) {
		    		JavascriptExecutor js_user = (JavascriptExecutor) driver;
		    		isRequired =(Boolean) js_user.executeScript("return arguments[0].required;", UserName);
		    		return isRequired;
		    	}
		    	
		    		
		    else if(Password.getText().isBlank()) {
	    		JavascriptExecutor js_user = (JavascriptExecutor) driver;
	    		isRequired =(Boolean) js_user.executeScript("return arguments[0].required;", Password);
	    		return isRequired;
	    	}
		    else if(confirmpwd.getText().isBlank()) {
    			JavascriptExecutor js_user = (JavascriptExecutor) driver;
    			isRequired =(Boolean) js_user.executeScript("return arguments[0].required;", confirmpwd);
    		    return isRequired;
    		}
		    }
		    	
		  //field is left empty, the validation message could indicate that the field cannot be empty
			
	    	public String userfieldsempty() {
	    		return UserName.getAttribute("validationMessage");
	    		
	    	}
	    	

		    	//public Boolean confmpwfieldsempty() {
		    		
		    		//boolean isRequired =false;
		    		
		    	public String errormsgEmptyUser() {
		    		return UserName.getAttribute("validationMessage");
		    		
		    	}
		    	
		    	public String errormsgEmptyPw() {
		    		return Password.getAttribute("validationMessage");
		    		
		    	}
		    	public String errormsgEmptyConfPw() {
	*/	    		




