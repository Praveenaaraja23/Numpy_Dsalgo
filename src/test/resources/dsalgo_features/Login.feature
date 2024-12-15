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
  	Then The user should see an <Errormessage>
    Examples:       
 |Username  | Password | Errormessage             |
 |madhu     |Kanaka@185| Invalid Username and Password |
 | madhu    | chandu   | Invalid Username and Password |
 | Vidya    | sri      | Invalid Username and Password |
 |          |Kanaka@185| Please fill out this field.   |
 | Vidya    |          | Please fill out this field.    |
 |          |          | Please fill out this field.    |
      
  #@Login3 @madhu @pusuluri
  #Scenario Outline: user able to land on Home page after entering invalid Username and Password fields from excel sheet
    #Given The user is on the DS Algo Sign in Page	
    #Then The user clicks login button after entering invalid "<Username>"and valid "<Password>"from excel sheet
  #	Then The user should land in Data Structure Home Page with message "<Message>" 
 #
    #
    #Examples: 
      #| Sheetname | Rownumber |
      #|Sheet1    | 0         |
      #|Sheet1    | 1         |
      #|Sheet1    | 2         |
      #|Sheet1    | 3         |
      #|Sheet1    | 4         |
      #|Sheet1    | 5         |
          