@Stack
Feature: Stack Module
  I want to use this template for my feature file

  Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid Username and Password
      
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


  @Try_Editor_in_Operations_in_Stack_in_DataDriven
  Scenario Outline: The user is able to run code in tryEditor for Operations in Stack page
    Given The user1 is in the tryEditor page for Operations in Stack
    When The user1 enter the valid pythoncode input from sheet <Sheetname> and <RowNumber> in Operations in Stack
    Then The user1 should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in Stack

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         0 |

  @Try_Editor_in_Operations_in_Stack_in_DataDriven_invalid
  Scenario Outline: The user is able to run code in tryEditor for Operations in Stack
    Given The user1 is in the tryEditor page for Operations in Stack
    When The user1 enter the valid pythoncode input from sheet <Sheetname> and <RowNumber> in Operations in Stack
    Then in Stack The user1 gets error message from excelsheet <Sheetname> and <RowNumber>

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         1 |
      | phythoncode |         2 |

  @Practice_questions_page
  Scenario: Verify that user is able to navigate to Practice Questions Page for Operations in Stack page
    Given The user is in the Stack page after Sign in
    When The User clicks Practice questions link
    Then The user should be redirected to Practice page

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


  @Try_Editor_in_Implementaion_in_Stack_in_DataDriven
  Scenario Outline: The user is able to run code in tryEditor for Implementaion in Stack page
    Given The user1 is in the tryEditor page for Implementaion in Stack
    When The user1 enter the valid pythoncode input from sheet <Sheetname> and <RowNumber> in Implementaion in Stack
    Then The user1 should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in Stack

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         0 |

  @Try_Editor_in_Implementaion_in_Stack_in_DataDriven_invalid
  Scenario Outline: The user is able to run code in tryEditor for Implementaion in Stack
    Given The user1 is in the tryEditor page for Operations in Stack
    When The user1 enter the valid pythoncode input from sheet <Sheetname> and <RowNumber> in Operations in Stack
    Then in Stack The user1 gets error message from excelsheet <Sheetname> and <RowNumber>

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         1 |
      | phythoncode |         2 |

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


  @Try_Editor_in_Application_in_Stack_in_DataDriven
  Scenario Outline: The user is able to run code in tryEditor for Application in Stack page
    Given The user1 is in the tryEditor page for Application in Stack
    When The user1 enter the valid pythoncode input from sheet <Sheetname> and <RowNumber> in Application in Stack
    Then The user1 should able to see output in the console with valid and invalid from excelsheet <Sheetname> and <RowNumber> in Stack

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         0 |

  @Try_Editor_in_Application_in_Stack_in_DataDriven_invalid
  Scenario Outline: The user is able to run code in tryEditor for Application in Stack
    Given The user1 is in the tryEditor page for Application in Stack
    When The user1 enter the valid pythoncode input from sheet <Sheetname> and <RowNumber> in Application in Stack
    Then in Stack The user1 gets error message from excelsheet <Sheetname> and <RowNumber>

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         1 |
      | phythoncode |         2 |
