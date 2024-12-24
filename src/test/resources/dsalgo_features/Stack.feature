

@Stack
Feature: Stack Module
  I want to use this template for my feature file
  
  Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid Vidya and Kanaka@185

    @StackPage
    Scenario: Verify that user is able to navigate to Stack data structure page
    Given The user is in the Home page after Sign in for Stack page
    When The user clicks the Getting Started button in Stack Panel of the page OR The user select Stack item from the drop down menu
    Then The user be directed to Stack Data Structure Page
    
    @Operations_in_Stack
    Scenario: Verify that user is able to navigate to Operations in Stack page
    Given The user is in the Stack page after Sign in    
    When The user clicks Operations in Stack button
    Then The user should be redirected to Operations in Stack page
    
    @Try_Editor_in_Operations_in_Stack1
    Scenario: Verify that user is able to navigate to try Editor page for Operations in Stack page
    Given The user is on the Operations in Stack page    
    When The user clicks Try Here button in Operations in Stack page
    Then The user should be redirected to a page having an TryEditor with a Run button to test in Operations in Stack page
    
    
    @Try_Editor_in_Operations_in_Stack2
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Operations in Stack page tryEditor
    Given The user is in the tryEditor pageof Operations in Stack page
     When The user enters code in <TryEditor1> and clicks Run button in Python page
    Then The user should able to see output in the console Stack tryeditor page
    Examples: 
      | TryEditor1      | 
      | print("hello")  |
      | printfgh        | 
      |                 |   
  
   
    #@Practice_questions_page
    #Scenario: Verify that user is able to navigate to Practice Questions Page for Operations in Stack page
    #Given The user is in the Stack page after Sign in    
    #When The User clicks Practice questions link
    #Then The user should be redirected to Practice page
    #
   @Implementations_in_Stack
    Scenario: Verify that user is able to navigate to Implementation page
    Given The user is in the Stack page after Sign in    
    When The user clicks Implementation button
    Then The user should be redirected to Implementation page
   
    

   @Try_Editor_in_Implementation_in_Stack1
    Scenario: Verify that user is able to navigate to try Editor page for Implementaion in Stack page
    Given The user is on the Implementation in Stack page    
    When The user clicks Try Here button in Implementation_in_Stack in Stack page
    Then The user should be redirected to a page having an TryEditor with a Run button to test of the Implementation page
    
    
    @Try_Editor_in_Implementation_in_Stack2
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Implementation in Stack page tryEditor
    Given The user is in the tryEditor page of Implementation Page in Stack Module   
     When The user enters code in <TryEditor1> and clicks Run button in Python page
    Then The user should able to see output in the console Stack tryeditor page
    Examples: 
      | TryEditor1      | 
      | print("hello")  |
      | print           | 
      |                 |       
      
    @Applications_in_Stack
    Scenario: Verify that user is able to navigate to Application page
    Given The user is in the Stack page after Sign in    
    When The user clicks Application button
    Then The user should be redirected to Application page
   
    

   @Try_Editor_in_Application_in_Stack1
    Scenario: Verify that user is able to navigate to try Editor page for Application in Stack page
    Given The user is on the Application in Stack page    
    When The user clicks Try Here button in Application in Stack page
    Then The user should be redirected to a page having an TryEditor with a Run button to test of the Application in Stack page
    
    
    @Try_Editor_in_Application_in_Stack2
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Application in Stack page tryEditor
    Given The user is in the tryEditor page of Application in Stack2
    When The user enters code in <TryEditor1> and clicks Run button in Python page
    Then The user should able to see output in the console Stack tryeditor page
    Examples: 
      | TryEditor1      | 
      | print("hello")  |
      | print           | 
      |                 | 
 