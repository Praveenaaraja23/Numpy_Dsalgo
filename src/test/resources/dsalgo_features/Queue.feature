@Queue
	Feature: User to sign in the dsalgo application and test Queue page


	Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
  	When The user clicks login button after entering valid Vidya and Kanaka@185
  	

 @QueueSelection
  Scenario: The user is able to navigate to Queue Data Structure Page
    Given The user1 is in homepage
    When The user1 clicks the Getting Started button in Queue Panel OR The user select Queue item from the drop down menu
    Then The user1 be directed to Queue Data Structure Page
    
  
   @ImplementationofQlink1
  Scenario: The user is able to navigate to Implementation of Queue in Python link page
    Given The user1 in queue page
    When The user1 clicks on Implementation of queue in python link
    Then The user1 should be directed to Implementation of Queue in Python page
    
    @TryEditorPage1
    Scenario: Verify that user is able to navigate to try Editor page for Implementation of Queue in Python page
    Given The user1 is on the Implementation of Queue in Python page
    When The user1 clicks Try Here button in Queue in Python page
    Then The user1 should be redirected to a page having an try Editor with a Run button to test Queue
    
  
    @TryEditorinputs1
    Scenario Outline: The user is able to run code in tryEditor  for Implementation of Queue in Python page
    Given The user1 is in the try editor page
     When The user1 should  enters queue the valid and invalid pythoncode <samplecode> and clicks Run button Queue
    Then The user1 should able to see output in the console Output Queue 
    
   	Examples: 
      | samplecode     |
      | print("hello") |
      | vidya          |

    
  
    @DeQueue2
   	Scenario: Verify that user is able to navigate  Implementation using collections.deque page
    Given The user1 is in the Queue page after logged in
    When The user1 clicks Implementation using collections.deque  link
    Then The user1 should be directed to Implementation using collections.deque Page
    
    @TryEditorPage2
   	Scenario: Verify that user is able to navigate to try Editor page for Implementation using collections.deque page
    Given The user1 is in the Queue implementation of queue  page after logged in
    When The user1 clicks Try Here button in deque Queue in Python page
    Then The user1 should be redirected to a page having an try Editor with a Run button to test dqueue
    
      
    @TryEditorinputs2
    Scenario Outline: The user is able to run code in tryEditor  for Implementation using collections.deque page
    Given The user1 is in the try editor page of dqueue
     When The user1 should  enters queue the valid and invalid pythoncode <samplecode> and clicks Run button Queue
    Then The user1 should able to see output in the console Output Queue 
    
   Examples: 
      | samplecode     |
      | print("hello") |
      | vidya          |
     
    
     @ImplementationUsingarray
  	Scenario: Verify that user is able to navigate to   Implementation using Array page
    Given The user1 is in the Queue page after logged in
    When The user1 click Implementation using Array link
    Then The user1 should be on Implementation using Array Page
    
    @TryEditorPage3
   	Scenario: Verify that user is able to navigate to try Editor page for Implementation using Array page
    Given The user1 is in the Queue implementation of array page
    When The user1 clicks Try Here button in Queue in Python page
    Then The user1 should be redirected to a page having an try Editor with a Run button to test array page 
    
  
    @TryEditorinputs3
    Scenario Outline: The user is able to run code in tryEditor  for Implementation using Array page
    Given The user1 is in the try editor page of array page
     When The user1 should  enters queue the valid and invalid pythoncode <samplecode> and clicks Run button Queue
    Then The user1 should able to see output in the console Output Queue 
    
   Examples: 
      | samplecode     |
      | print("hello") |
      | vidya          |
    
 
    
    
    @Queueoperations
  	Scenario: Verify that user is able to  Queueoperations page
    Given The user1 is in the Queue page after logged in
    When The user1 click Queueoperations page link
    Then The user1 should be  on Queueoperations page 
    
    @TryEditorPage4
   	Scenario: Verify that user is able to navigate to try Editor page for Queueoperations page
    Given The user1 is in the Queueoperation page after logged in
    When The user1 clicks Try Here button in Queue in Python page
    Then The user1 should be redirected to a page having an try Editor with a Run button to test
    

    
     @TryEditorinputs4
    Scenario Outline: The user is able to run code in tryEditor  for Queueoperations page
    Given The user1 is in the try editor page of array page
     When The user1 should  enters queue the valid and invalid pythoncode <samplecode> and clicks Run button Queue
    Then The user1 should able to see output in the console Output Queue 
    
   Examples: 
      | samplecode     |
      | print("hello") |
      | vidya          |
     
    
   
  @PracticeQuestion
  Scenario: Verify that user1 is able to navigate to Practice Questions Page
    Given The user is in the Queue operation page after Sign in
    When The user clicks Practice Questions link
    Then The user1 should be redirected to Practice page
    
    
   
    
    
    