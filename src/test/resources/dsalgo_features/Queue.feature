@Queue
Feature: User to sign in the dsalgo application and test Queue page

  Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid Username and Password

   @QueueSelection
  Scenario: The user is able to navigate to Queue Data Structure Page
    Given The user navigate to homepage
    When The user clicks the Getting Started button in Queue Panel OR The user select Queue item from the drop down menu
    Then The user be directed to Queue Data Structure Page

  @ImplementationofQlink1
  Scenario: The user is able to navigate to Implementation of Queue in Python link page
    Given The user navigate queue page
    When The user clicks on Implementation of queue in python link
    Then The user could be directed to Implementation of Queue in Python page

  @TryEditorPage1
  Scenario: Verify that user is able to navigate to try Editor page for Implementation of Queue in Python page
    Given The user navigate the Implementation of Queue in Python page
    When The user wanted to click Try Here button in Queue in Python page
    Then The user could be redirected to a page having an try Editor with a Run button to test Queue

  @TryEditorinputs1valid
  Scenario Outline: The user is able to run code in tryEditor for Implementation of Queue in Python page
    Given The user landing in the tryEditor page for Implementation of Queue page
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user checks output in the console output from excelsheet <Sheetname> and <RowNumber> in Queue

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         0 |

  @TryEditorinputs1invalid
  Scenario Outline: The user is able to run code in tryEditor for Implementation of Queue in Python page
    Given The user landing in the tryEditor page for Implementation of Queue page
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user could get error message from excelsheet <Sheetname> and <RowNumber>

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         1 |
      | phythoncode |         2 |

  @DeQueue2
  Scenario: Verify that user is able to navigate  Implementation using collections.deque page
    Given The user navigate the Queue page after logged in
    When The user wanted to click Implementation using collections.deque  link
    Then The user could be directed to Implementation using collections.deque Page

  @TryEditorPage2
  Scenario: Verify that user is able to navigate to try Editor page for Implementation using collections.deque page
    Given The user is in the Queue implementation of queue  page after logged in
    When The user clicks Try Here button in deque Queue in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test dqueue

  @TryEditorinputs2valid
  Scenario Outline: The user1 is able to run code in tryEditor for Implementation using collections.deque page
    Given The user is in the try editor page of dqueue
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user checks output in the console output from excelsheet <Sheetname> and <RowNumber> in Queue

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         0 |

  @TryEditorinputs2invalid
  Scenario Outline: The user1 is able to run code in tryEditor for Implementation using collections.deque page
    Given The user is in the try editor page of dqueue
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user could get error message from excelsheet <Sheetname> and <RowNumber>

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         1 |
      | phythoncode |         2 |

  @ImplementationUsingarray
  Scenario: Verify that user is able to navigate to   Implementation using Array page
    Given The user navigate the Queue page after logged in
    When The user wanted to click Implementation using Array link
    Then The user could be Implementation using Array Page

  @TryEditorPage3
  Scenario: Verify that user is able to navigate to try Editor page for Implementation using Array page
    Given The user1 is in the Queue implementation of array page
    When The user wanted to click Try Here button in Queue in Python page
    Then The user1 should be redirected to a page having an try Editor with a Run button to test array page

  @TryEditorinputs3valid
  Scenario Outline: The user1 is able to run code in tryEditor for Implementation using Array page
    Given The user1 is in the try editor page of array page
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user checks output in the console output from excelsheet <Sheetname> and <RowNumber> in Queue

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         0 |

  @TryEditorinputs3invalid
  Scenario Outline: The user1 is able to run code in tryEditor for Implementation using Array page
    Given The user1 is in the try editor page of array page
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user could get error message from excelsheet <Sheetname> and <RowNumber>

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         1 |
      | phythoncode |         2 |

  @Queueoperations
  Scenario: Verify that user is able to  Queueoperations page
    Given The user navigate the Queue page after logged in
    When The user1 click Queueoperations page link
    Then The user1 should be  on Queueoperations page

  @TryEditorPage4
  Scenario: Verify that user is able to navigate to try Editor page for Queueoperations page
    Given The user1 is in the Queueoperation page after logged in
    When The user wanted to click Try Here button in Queue in Python page
    Then The user1 should be redirected to a page having an try Editor with a Run button to test

  @TryEditorinputs4valid
  Scenario Outline: The user1 is able to run code in tryEditor for Queueoperations page
    Given The user1 is in the try editor page of queue op page
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user checks output in the console output from excelsheet <Sheetname> and <RowNumber> in Queue

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         0 |

  @TryEditorinputs4invalid
  Scenario Outline: The user1 is able to run code in tryEditor for Queueoperations page
    Given The user1 is in the try editor page of queue op page
    When The user just enter the valid and invalid pythoncode input from sheet <Sheetname> and <RowNumber> in Queue Clicks_run_button
    Then The user could get error message from excelsheet <Sheetname> and <RowNumber>

    Examples: 
      | Sheetname   | RowNumber |
      | phythoncode |         1 |
      | phythoncode |         2 |

  @PracticeQuestion
  Scenario: Verify that user is able to navigate to Practice Questions Page
    Given The user is in the Queue operation page after Sign in
    When The user clicks Practice Questions link
    Then The user redirected to Practice page
