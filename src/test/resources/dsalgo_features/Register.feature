@Register
Feature: Testing Register Page functionality in dsportalapp.herokuapp.

    Scenario: The user launches GetStarted page in DsAlgo portal
    Given The user navigates DSAlgo portal with url 
    When The user chooses to clicks on Getstarted button
    Then User should be navigated to home page
    
    
     #@TS_Register_invalidblank
    Scenario Outline: The user Registers with blank field invalid Details
    Given User initiates by clicking on Register link in home page
    When The user verifies with "<UserName>" and "<Password>" and "<Passwordconfirmation>" and click on login button.
    Then User must be able to see message "<Message>" with inputs "<UserName>" and "<Password>" and "<Passwordconfirmation>"

    Examples:
      | UserName    | Password      | Passwordconfirmation |Message                      |
      |             |               |                      |Please fill out this field.   |
      |             |navtej@12      |navtej@12             |Please fill out this field.    |
      |vidya        |               |                      |Please fill out this field.   |
      |vidya        |veena@12       |                      |Please fill out this field. |   
     

 #@TS_Register_Invalid 
    Scenario Outline: The user Registers with invalid Details
    Given User initiates by clicking on Register link in home page
    When The user verifies with "<UserName>" and "<Password>" and "<Passwordconfirmation>" and click on login button.
    Then User must be able to see the error msg "<Message>"

    Examples:
      |UserName    | Password        | Passwordconfirmation | Message                     |                              
      |veena*2$     |veena@12        |veena@12              |password_mismatch:The two password fields didn’t match.|
      |vidya        |123185          |123185                |password_mismatch:The two password fields didn’t match.  |
      |divya        |priya           |priya                 |password_mismatch:The two password fields didn’t match.|
      |priya        |kanaka@23       |kanaka@12             |password_mismatch:The two password fields didn’t match. |
      |praveena     |praveena12      |praveena12            |password_mismatch:The two password fields didn’t match.|
      |vidya        |welcome@123     |welcome@123           |password_mismatch:The two password fields didn’t match. |
   
  #@TS_Register_valid
  
    Scenario Outline: User Registers with valid Details in register page
    Given The user navigates to Register Page in home page
    When The user tries to enter  "<UserName>" and "<Password>" and "<Passwordconfirmation>" and clicks on login button
    Then User must be able to navigate to Home Page of DS Algo with "<Message>" New Account Created. You are logged in as <username>
    
    Examples:
    | UserName     | Password       | Passwordconfirmation | Message |
    |  vidya       | Kanaka@185     | Kanaka@185           |  New Account Created. You are logged in as <username> |


    # @Ts_Register01_emptyexcel 

    Scenario Outline: The user Registers with Invalid(blank) credentials
    Given User initiates by clicking on Register link in home page
    When User wants to enter data from excel sheet <Sheetname> and <RowNumber>
    Then User is expected to see the Message in console output from excel sheet <Sheetname> and <RowNumber>
         
      Examples: 
      |Sheetname   |RowNumber |
      |Register    |         0|
      |Register    |         1| 
      |Register    |         2|
      |Register    |         3|
   
   
    # @Ts_Register02_invalidexcel
   
    Scenario Outline: The user Registers with Invalid credentials
    Given User initiates by clicking on Register link in home page
    When User wants to enter data from excel sheet <Sheetname> and <RowNumber>
    Then User is expected to see the Error message in console output from excel sheet <Sheetname> and <RowNumber>
    
     
     Examples: 
      |Sheetname   |RowNumber |
      |Register    |         4|
      |Register    |         5|
      |Register    |         6|
      |Register    |         7|
      |Register    |         8|
      |Register    |         9|
      
    #@Ts_Register0_validexcel 

    Scenario Outline: The user Registers with Valid credentials
    Given User initiates by clicking on Register link in home page
    When User wants to enter data from excel sheet <Sheetname> and <RowNumber>
    Then User is expected to navigate to home page and Message in console output from excel sheet <Sheetname> and <RowNumber>
    
     Examples: 
      |Sheetname   |RowNumber |
      |Register    |         10|
      
 