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
 
      
      
    @Try_Editor_in_Graph_with_DataDriven 
    Scenario Outline: The user is able to run code in tryEditor for Graph page
    Given The user3 is in the tryEditor page for Graph page module
    When The user3 enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Graph module
    Then The user3 should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in Graph module
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
      
    @Try_Editor_in_Graph_with_DataDriven_Invaild
   Scenario Outline: The user is able to run code in tryEditor for Graph page
    Given The user3 is in the tryEditor page for Graph page module
    When The user3 enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Graph module
    Then The user3 get the graph module error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
   
      
    
    
    @Graph_Representations
    Scenario: Verify that user is able to navigate to Graph Representations in Graph page
    Given The user is in the Graph page after Sign in    
    When The user clicks Graph Representations button in the Graph page
    Then The user should be redirected to Graph Representations in Graph page
   

      
    @Try_Editor_in_Graph_Representations_with_DataDriven 
    Scenario Outline: The user is able to run code in tryEditor for Graph Representations page
    Given The user3 is in the tryEditor page for Graph Representations page module
    When The user3 enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Graph Representations module
    Then The user3 should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in Graph Representations module
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
      
     @Try_Editor_in_Graph_Representations_with_DataDriven_Invaild
   Scenario Outline: The user is able to run code in tryEditor for Graph Representations page
    Given The user3 is in the tryEditor page for Graph Representations page module
    When The user3 enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Graph Representations module
    Then The user3 get the invaild error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
   
      
      @PracticeQuestions_Graph
    Scenario: Go to Practice Questions page from Graph page
    Given The user3 is in the Graph page after logged in
    When The user3 clicks Practice Questions link in Graph module
    Then The user3 should be redirected to Practice Questions page in Graph module
    
