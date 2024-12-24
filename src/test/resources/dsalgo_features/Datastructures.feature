@DataStructures
	Feature: User to sign in the dsalgo application and test DataStructures page

  Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid Vidya and Kanaka@185
    
 
 @DataStructures_Introduction
  Scenario: The user is able to navigate to DataStructures Page
    Given The user is in homepage after signin
    When The user clicks the Getting Started button in DataStructures Panel OR The user select DataStructures item from the drop down menu
    Then The user be directed to Data Structures in Data Structures Page  
    
     @TimeComplexity
  Scenario: The user is able to navigate to Time Complexity in Data Structures Page
    Given The user is in Data Structures page
    When The user clicks the Time Complexity button in Data Structures Page
    Then The user be directed to Time Complexity in Data Structures Page
    
    
     @Try_Editor_in_TimeComplexity
    Scenario: Verify that user is able to navigate to try Editor button for Time Complexity in Data Structures page
    Given The user is on the Time Complexity in Data Structures page    
    When The user clicks Try Here button in Time Complexity page
    Then The user should be redirected to a page having an "TryEditor" with a Run button to test in the Time Complexity page
    
    @Try_Editor_in_DS
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for DataStructures tryEditor
    Given The user is in the tryEditor page of DataStructures   
    When The user enters code in <SampleEditor> and clicks Run button in DataStructures page
    Then The user should able to see output in the console DataStructures tryeditor page
    Examples: 
      | SampleEditor    | 
      | print("hello")  |
      | print           | 
      |                 |
   
    #
     #@PracticeQuestions
  #Scenario: Go to Practice Questions page from Data structures page
    #Given The user is in the Data structures page after logged in
    #When The user clicks Practice Questions link in Data structures
    #Then The user should be redirected to Practice Questions page in Data structures
    #
    #
    #
    #
    #
   