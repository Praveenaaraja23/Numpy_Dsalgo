@Tree
Feature: Testing Login
  I want to Enter details and Login

  Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid Vidya and Kanaka@185

  @TS_tree_02
  Scenario: Verify that user is able to navigate to "Tree  page" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the "Getting Started" button in Tree Page OR The user select "Tree" item from the drop down menu
    Then The user should be redirected to "TREE" Data Structure Page

  #Overview of trees
  @TS_tree_03
  Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the "Tree" page after clicks of getstarted
    When The user clicks on the "Overview of Trees" link
    Then The user should be redirected to the "Overview of Trees" of tree Page

  @TS_tree_04
  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given The user is in the "overview of trees" page
    When The user clicks "Try Here" button in a "overview of trees" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_05
  Scenario Outline: The user is able to run code in tryEditor for Overview of Trees page
    Given The user is in the tryEditor page for Overview of Trees page
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_06
   Scenario Outline: The user is able to run code in tryEditor for Overview of Trees page
    Given The user is in the tryEditor page for Overview of Trees page
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
      
  #Tree-Terminologies page
  @TS_tree_07
  Scenario: Verify that user is able to navigate to "Tree -Terminologies Page" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Terminologies" link
    Then The user should be redirected to the "Terminologies" of tree Page

  @TS_tree_08
  Scenario: The user is able to navigate to a page having an tryEditor from "Terminologies" page
    Given The user is in the "Terminologies" page
    When The user clicks "Try Here" button in a Tree -Terminologies page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
  @TS_tree_09
  Scenario Outline: The user is able to run code in tryEditor for Tree -Terminologies Page page
    Given The user is in the tryEditor page for Tree -Terminologies Page
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_10
   Scenario Outline: The user is able to run code in tryEditor for Tree -Terminologies Page page
    Given The user is in the tryEditor page for Tree -Terminologies Page
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
  #Tree-types of tree
  @TS_tree_11
  Scenario: Verify that user is able to navigate to "Tree -Types of Tree" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Types of Trees" link
    Then The user should be redirected to the "Types of Trees" of tree Page

  @TS_tree_12
  Scenario: The user is able to navigate to a page having an tryEditor from "Types of Trees"page
    Given The user is in the "Types of Trees" page
    When The user clicks "Try Here" button in a Tree -Types of Tree page
    Then The user should be redirected to a page having an try Editor with a Run button to test

 @TS_tree_13
  Scenario Outline: The user is able to run code in tryEditor for Tree -Types of Tree page
    Given The user is in the tryEditor page for Tree -Types of Tree page
    
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_14
   Scenario Outline: The user is able to run code in tryEditor for Tree -Types of Tree page
    Given The user is in the tryEditor page for Tree -Types of Tree page
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
      
    #Tree-Tree Traversals
  @TS_tree_15
  Scenario: Verify that user is able to navigate to "Tree -Types of Tree" for "Tree - Tree Traversals" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Tree Traversals"link
    Then The user should be redirected to the "Tree Traversals" of tree Page

  @TS_tree_16
  Scenario: The user is able to navigate to a page having an tryEditor from "Tree -Tree Traversals"page
    Given The user is in the "Tree -Tree Traversals" page
    When The user clicks "Try Here" button in a Tree -Tree Traversals
    Then The user should be redirected to a page having an try Editor with a Run button to test

 @TS_tree_17
  Scenario Outline: The user is able to run code in tryEditor for Tree -Tree Traversals
    Given The user is in the tryEditor page for Tree -Tree Traversals
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_18
   Scenario Outline: The user is able to run code in tryEditor for Tree -Tree Traversals
    Given The user is in the tryEditor page for Tree -Tree Traversals
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
  #Traversals-Illustration
  @TS_tree_19
  Scenario: Verify that user is able to navigate to "Traversals-Illustration" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Traversals-Illustration" link
    Then The user should be redirected to the "Traversals-Illustration" of tree Page

  @TS_tree_20
  Scenario: The user is able to navigate to a page having an tryEditor from "Traversals-Illustration"page
    Given The user is in the "Traversals-Illustration" page
    When The user clicks "Try Here" button in a Traversals-Illustration page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_21
  Scenario Outline: The user is able to run code in tryEditor for Traversals-Illustration page
    Given The user is in the tryEditor page for Traversals-Illustration 
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_22
   Scenario Outline: The user is able to run code in tryEditor for Traversals-Illustration page
    Given The user is in the tryEditor page for Traversals-Illustration 
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      

  #Binary Trees
  @TS_tree_23
  Scenario: Verify that user is able to navigate to "Binary Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Binary Trees" link
    Then The user should be redirected to the "Binary Trees" of tree Page

  @TS_tree_24
  Scenario: The user is able to navigate to a page having an tryEditor from "Binary Trees"page
    Given The user is in the "Binary Trees" page
    When The user clicks "Try Here" button in a Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

 @TS_tree_25
  Scenario Outline: The user is able to run code in tryEditor for Binary Trees page
    Given The user is in the tryEditor page for Binary Trees 
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_26
   Scenario Outline: The user is able to run code in tryEditor for Binary Trees page
    Given The user is in the tryEditor page for Binary Trees 
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
  #Types of Binary Trees
  @TS_tree_27
  Scenario: Verify that user is able to navigate to "Types of Binary Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Types of Binary Trees" link
    Then The user should be redirected to the "Types of Binary Trees" of tree Page

  @TS_tree_28
  Scenario: The user is able to navigate to a page having an tryEditor from "Types of Binary Trees"page
    Given The user is in the "Types of Binary Trees" page
    When The user clicks "Try Here" button in a Types of Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_29
  Scenario Outline: The user is able to run code in tryEditor for Types of Binary Trees page
    Given The user is in the tryEditor page for Types of Binary Trees 
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_30
   Scenario Outline: The user is able to run code in tryEditor for Types of Binary Trees page
    Given The user is in the tryEditor page for Types of Binary Trees 
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      

  #Implementation in Python
  @TS_tree_31
  Scenario: Verify that user is able to navigate to "Implementation in Python" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Implementation in Python" link
    Then The user should be redirected to the "Implementation in Python" of tree Page

  @TS_tree_32
  Scenario: The user is able to navigate to a page having an tryEditor from "Implementation in Python"page
    Given The user is in the "Implementation in Python" page
    When The user clicks "Try Here" button in a Implementation in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_33
  Scenario Outline: The user is able to run code in tryEditor for Implementation in Python page
    Given The user is in the tryEditor page for Implementation in Python
		When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_34
   Scenario Outline: The user is able to run code in tryEditor for Implementation in Python page
    Given The user is in the tryEditor page for Implementation in Python
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
       
  #Binary Tree Traversals
  @TS_tree_35
  Scenario: Verify that user is able to navigate to "Binary Tree Traversals" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Binary Tree Traversals" link
    Then The user should be redirected to the "Binary Tree Traversals" of tree Page

  @TS_tree_36
  Scenario: The user is able to navigate to a page having an tryEditor from "Binary Tree Traversals"page
    Given The user is in the "Binary Tree Traversals" page
    When The user clicks "Try Here" button in a Binary Tree Traversals page
    Then The user should be redirected to a page having an try Editor with a Run button to test

   @TS_tree_37
  Scenario Outline: The user is able to run code in tryEditor for Binary Tree Traversals page
    Given The user is in the tryEditor page for Binary Tree Traversals
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_38
   Scenario Outline: The user is able to run code in tryEditor for Binary Tree Traversals page
    Given The user is in the tryEditor page for Binary Tree Traversals
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
  #Implementation of Binary Trees
  @TS_tree_39
  Scenario: Verify that user is able to navigate to "Implementation of Binary Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Implementation of Binary Trees" link
    Then The user should be redirected to the "Implementation of Binary Trees" of tree Page

  @TS_tree_40
  Scenario: The user is able to navigate to a page having an tryEditor from "Implementation of Binary Trees"page
    Given The user is in the "Implementation of Binary Trees" page
    When The user clicks "Try Here" button in a Implementation of Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_41
  Scenario Outline: The user is able to run code in tryEditor for Implementation of Binary Trees page
    Given The user is in the tryEditor page for Implementation of Binary Trees
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_42
   Scenario Outline: The user is able to run code in tryEditor for Implementation of Binary Trees page
    Given The user is in the tryEditor page for Implementation of Binary Trees
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
  #Applications of Binary trees
  @TS_tree_43
  Scenario: Verify that user is able to navigate to "Applications of Binary trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Applications of Binary trees" link
    Then The user should be redirected to the "Applications of Binary trees" of tree Page

  @TS_tree_44
  Scenario: The user is able to navigate to a page having an tryEditor from "Applications of Binary trees"page
    Given The user is in the "Applications of Binary trees" page
    When The user clicks "Try Here" button in a Applications of Binary trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

   @TS_tree_45
  Scenario Outline: The user is able to run code in tryEditor for Applications of Binary trees page
    Given The user is in the tryEditor page for Applications of Binary trees
		When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_46
   Scenario Outline: The user is able to run code in tryEditor for Applications of Binary trees
    Given The user is in the tryEditor page for Applications of Binary trees
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 
      
 # Binary Search Trees
  @TS_tree_47
  Scenario: Verify that user is able to navigate to "Binary Search Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Binary Search Trees" link
    Then The user should be redirected to the "Binary Search Trees" of tree Page

  @TS_tree_48
  Scenario: The user is able to navigate to a page having an tryEditor from "Binary Search Trees"page
    Given The user is in the "Binary Search Trees" page
    When The user clicks "Try Here" button in a Binary Search Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_49
  Scenario Outline: The user is able to run code in tryEditor for Binary Search Trees
    Given The user is in the tryEditor page for Binary Search Trees
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_50
   Scenario Outline: The user is able to run code in tryEditor for Binary Search Trees
    Given The user is in the tryEditor page for Binary Search Trees
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 

  #Implementation Of BST
  @TS_tree_51
  Scenario: Verify that user is able to navigate to "Implementation Of BST" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the "Implementation Of BST" link
    Then The user should be redirected to the "Implementation Of BST" of tree Page

  @TS_tree_52
  Scenario: The user is able to navigate to a page having an tryEditor from "Implementation Of BST"page
    Given The user is in the "Implementation Of BST" page
    When The user clicks "Try Here" button in a Implementation Of BST page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_53
  Scenario Outline: The user is able to run code in tryEditor for Implementation Of BST page
    Given The user is in the tryEditor page for Implementation Of BST
		 When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in trees
    
   
     Examples: 
      |Sheetname  |RowNumber  |
      |phythoncode|         0 |
      
     @TS_tree_54
   Scenario Outline: The user is able to run code in tryEditor for Implementation Of BST page
    Given The user is in the tryEditor page for Implementation Of BST
    When The user enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in trees
    Then The user get the error message from excelsheet <Sheetname> and <RowNumber>
    Examples:
      |Sheetname  |RowNumber  |
      |phythoncode|         1 |
      |phythoncode|         2 | 


  #Practice Questions
  @TS_tree_55
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The User clicks  " Practice questions"  link
    Then The user should be redirected to "Practice" page


