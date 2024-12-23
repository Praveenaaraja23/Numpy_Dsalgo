@DsalgoLogin
Feature: Testing Login
  I want to Enter details and Login
  
  @Login1 @madhu @pusuluri
  Scenario Outline:Verify that user is able to land on Login Page
  	Given The user is on the DS Algo Home Page
  	When The user should click the Sign in link
  	Then The user should be redirected to Sign in page
  	
  @Login2 @madhu @pusuluri
  Scenario Outline:Verify that user able to land on Home page after entering valid Username and Password fields
  	Given The user is on the DS Algo Sign in Page
  	When The user clicks login button after entering valid <Username> and <Password>
  	Then The user should land in Data Structure Home Page with message <SuccessMessage> 
  	Then The user should logout from Ds Algo page
   

  Examples: 
      | Username | Password | SuccessMessage|
      | Vidya    | Kanaka@185 | You are logged in|
      
      
   @Login3 @madhu @pusuluri
   Scenario Outline: user able to land on Home page after entering invalid Username and Password fields
    Given The user is on the DS Algo Sign in Page	
    When The user clicks login button after entering invalid <Username> and <Password>
  	Then The user should see an <ErrorMessage>
  	
    Examples:       
 |Username  | Password | ErrorMessage             |
 |madhu     |Kanaka@185| Invalid Username and Password |
 |madhu    | chandu   | Invalid Username and Password |
 |Vidya    | sri      | Invalid Username and Password |
 
  @Login3 @madhu @pusuluri
   Scenario Outline: user able to land on Home page after entering invalid Username and Password fields
    Given The user is on the DS Algo Sign in Page	
    When The user clicks login button after entering invalid <Username> and <Password>
  	Then The user1 should see an <popupmessage> and takes input <Username> and <Password>
  	
    Examples:       
 |Username  | Password | popupmessage             |
 |          |Kanaka@185| Please fill out this field.   |
 |Vidya    |          | Please fill out this field.    |
 |          |          | Please fill out this field.    |
      

  @Login4 @madhu @pusuluri
  Scenario Outline: user able to land on Home page after entering valid Username and Password fields from excel sheet
    Given The user is on the DS Algo Sign in Page	
    When user clicks login to DsAlgo application for valid with "<Sheetname>" and <Rownumber>
    Then user should see an <Sheetname> and <Rownumber> 
    
    Examples: 
      | Sheetname | Rownumber |
      | Login     | 0         |
      
      

   @Login5 @madhu @pusuluri
  Scenario Outline: user able to land on Home page after entering invalid Username and Password fields from excel sheet
    Given The user is on the DS Algo Sign in Page	
    When user clicks login to DsAlgo application for valid with "<Sheetname>" and <Rownumber>
    Then user14 should see an <Sheetname> and <Rownumber>
    
    Examples: 
      | Sheetname | Rownumber |
      |Login1     | 0         |
      |Login1     | 1         |
      |Login1     | 2         |
     
      
       @Login5 @madhu @pusuluri
  Scenario Outline: user able to land on Home page after entering invalid Username and Password fields from excel sheet
    Given The user is on the DS Algo Sign in Page	
    When user clicks login to DsAlgo application for valid with "<Sheetname>" and <Rownumber>
    Then user15 should see an <Sheetname> and <Rownumber>
    
    Examples: 
      | Sheetname | Rownumber |
      |Login1     | 3         |
      |Login1     | 4         |
      |Login1     | 5         |

          