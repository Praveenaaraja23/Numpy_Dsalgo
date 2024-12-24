@Graph
Feature: Graph Module
  
  
Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid Vidya and Kanaka@185
 
    @NavigatetoGraph
    Scenario: Verify that user is able to navigate to Graph data structure page
    Given The user is in the Home page after Sign into the Ds algo portal
    When The user clicks the Getting Started button in Graph Panel of the page OR The user select Graph item from the drop down menu
    Then The user be directed to Graph Page
   

    @Try_Here_in_Graph_Page
    Scenario: Verify that user is able to navigate to try Editor page for Graph page in the Graph module
    Given The user is on the Graph page    
    When The user clicks Try Here button in Graph page
    Then The user should be redirected to a page having an TryEditor with a Run button to test in Graph page
    
    
    
     @Try_Editor_in_Graph_Page
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Graph tryEditor
    Given The user is in the tryEditor page of Graph 
    When The user enters code in <SampleEditor> and clicks Run button in Graph page
    Then The user should able to see output in the console graph tryeditor page
     Examples: 
      | SampleEditor    | 
      | print("hello")  |
      | print           | 
      |                 |
    
    
    @Graph_Representations
    Scenario: Verify that user is able to navigate to Graph Representations in Graph page
    Given The user is in the Graph page after Sign in    
    When The user clicks Graph Representations button in the Graph page
    Then The user should be redirected to Graph Representations in Graph page
   

    @Try_Editor_in_Graph_Representations
    Scenario Outline: Verify that user is able to navigate to try Editor page for Graph Representations page in the Graph page
    Given The user1 is on the Graph Representations in Graph Representations page    
    When The user1 enters code in <SampleEditor> and clicks Run button in Graph Representations page
    Then The user1 should able to see output in the console graph Representations tryeditor page
     Examples: 
      | SampleEditor    | 
      | print("hello")  |
      | print           | 
      |                 |
    
    
   
   #@PracticeQueforGraphPage
    #Scenario: Verify that user is able to navigate to Practice Questions for Graph page
    #Given The user is in the Graph page after Sign in
    #When The user clicks Practice Questions button
    #Then The user should be redirected to Practice page
    #
#
