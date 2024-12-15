@Register
Feature: Testing Register Page functionality in dsportalapp.herokuapp.

    Scenario: The user launches GetStarted page in DsAlgo portal
    Given The User navigates DSAlgo portal with url 
    When User clicks on Getstarted button
    Then User should be navigated to home page

 @TS_Register_Invalid 
    Scenario Outline: The user Registers with invalid Details
    Given The user clicks on Register link in home page
    When The user enters  "<UserName>" and "<Password>" and "<Passwordconfirmation>"
    Then The user should be able to see the error msg "<Errormsg>"

    Examples:
      | UserName    | Password        | Passwordconfirmation | Errormsg                     |                              
      |              |                |                      | UserName cannot be blank     |
      |              | navtej@12      |  navtej@12           | UserName cannot be blank     |
      | vidya        |                |                      | Passwords cannot be blank    |
      | vidya        | veena@12       |                      | password confirmation cannot be blank |
      | veena*2$     | veena@12       | veena@12             | characters other than Letters, digits and @/./+/-/_ are not allowed|
      | vidya        |  123185        | 123185               |  Passwords cannot be numeric  |
      | divya        |  priya         |  priya               |  password must contain at least 8 characters|
      | priya        |  kanaka@23     |  kanaka@12           |  Passwords cannot be different |
      | praveena     | praveena12     |  praveena12          |  Passwords cannot be similar to   full name or any additions to name|
      | vidya        | welcome@123    | welcome@123          |  Common passwords cannot be used |
   
  @TS_Register_valid
  
    Scenario Outline: User Registers with valid Details in register page
    Given The user navigates to Register Page in home page
    When The user tries to enter  "<UserName>" and "<Password>" and "<Passwordconfirmation>"
    Then The user should navigate to Home Page of DS Algo with "<Message>" New Account Created. You are logged in as <username>
    
    Examples:
    | UserName     | Password       | Passwordconfirmation | Message |
    |  vidya       | Kanaka@185     | Kanaka@185           | Login successfull |
     
