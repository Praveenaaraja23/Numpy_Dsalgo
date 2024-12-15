@linkedlist
Feature: Testing linked list Page functionality in dsportalapp.herokuapp.

   Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
  	When The user clicks login button after entering valid Vidya and Kanaka@185
  	
  	@TS_linkedlist_01
  	
    Scenario: Verify that user is able to navigate to linked list page
    Given The user is in home page after Sign in
    When The user clicks the Getting Started button under Linked List section
    Then The user should navigate to linked list home page
    
    
 #Introduction
    
    @TS_linkedlist_02
    
    Scenario: Verify that user is able to navigate to Introduction page
    Given The user is in "linked List" page after clicking on Getstarted
    When The user clicks on "Introduction" link
    Then The user should navigate to "Introduction" page
    
   
     @TS_linkedlist_03

    Scenario: Verify that user is able to navigate to try editor page in introduction page
    Given The user is in the "Introduction" page
    When The User clicks "Try Here" button in the Introduction page
    Then The user should be redirected to the page having an try Editor with a Run button
      
    @TS_linkedlist_04

    Scenario Outline: Verify that user is able to see output for valid and invalid python code for "Introduction" page
    Given The user is in try Editor page of Introduction page
     When The user enter valid and invalid python code in try Editor "<pythoncode>" and click on Run
    Then The user should be able to see output for valid input and error should be displayed for invalid input in console "<Result>"
    
   Examples: 
      | Pythoncode     | Result |
      | print("hello") | hello  |
      | hello          | NameError: name 'hello' is not defined on line 1 |
      
      
      
 #Creating Linked List

@TS_linkedlist_05
    
    Scenario: Verify that user is able to navigate to Creating Linked List page
    Given The user is in "Introduction" page 
    When The user clicks on "Creating Linked List" link 
    Then The user should navigate to "Creating Linked List" page
    
   
     @TS_linkedlist_06

    Scenario: Verify that user is able to navigate to try editor page in Creating Linked List page
    Given The user is in the "Creating Linked List" page
    When The User clicks "Try Here" button in the Creating Linked List page
    Then The user should be redirected to the page having an try Editor with a Run button

   @TS_linkedlist_07

    Scenario Outline: Verify that user is able to see output for valid and invalid python code for "Creating Linked List" page
    Given The user is in try Editor page of Creating Linked List page
     When The user enter valid and invalid python code in try Editor "<pythoncode>" and click on Run
    Then The user should be able to see output for valid input and error should be displayed for invalid input in console "<Result>"
    
   Examples: 
      | Pythoncode     | Result |
      | print("hello") | hello  |
      | hello          | NameError: name 'hello' is not defined on line 1 |

     
         
 #Types of Linked List

 @TS_linkedlist_08
    
    Scenario: Verify that user is able to navigate to Types of Linked List page
    Given The user is in "Creating Linked List" page 
    When The user clicks on "Types of Linked List" link 
    Then The user should navigate to "Types of Linked List" page
    
   
     @TS_linkedlist_09

    Scenario: Verify that user is able to navigate to try editor page in Types of Linked List page
    Given The user is in the "Types of Linked List" page
    When The User clicks "Try Here" button in the Types of Linked List page
    Then The user should be redirected to the page having an try Editor with a Run button

   @TS_linkedlist_10

    Scenario Outline: Verify that user is able to see output for valid and invalid python code for "Types of Linked List" page
    Given The user is in try Editor page of Types of Linked List page
     When The user enter valid and invalid python code in try Editor "<pythoncode>" and click on Run
    Then The user should be able to see output for valid input and error should be displayed for invalid input in console "<Result>"
    
   Examples: 
      | Pythoncode     | Result |
      | print("hello") | hello  |
      | hello          | NameError: name 'hello' is not defined on line 1 |  
      
      
 #Implement Linked List in Python

@TS_linkedlist_11
    
    Scenario: Verify that user is able to navigate to Implement Linked List in Python page
    Given The user is in "Types of Linked List" page 
    When The user clicks on "Implement Linked List in Python" link 
    Then The user should navigate to "Implement Linked List in Python" page
    
   
     @TS_linkedlist_12

    Scenario: Verify that user is able to navigate to try editor page in Implement Linked List in Python
    Given The user is in the "Implement Linked List in Python" page.
    When The User clicks "Try Here" button in the Implement Linked List in Python page
    Then The user should be redirected to the page having an try Editor with a Run button

   @TS_linkedlist_13

    Scenario Outline: Verify that user is able to see output for valid and invalid python code for "Implement Linked List in Python" page
    Given The user is in try Editor page of Implement Linked List in Python page
     When The user enter valid and invalid python code in try Editor "<pythoncode>" and click on Run
    Then The user should be able to see output for valid input and error should be displayed for invalid input in console "<Result>"
    
   Examples: 
      | Pythoncode     | Result |
      | print("hello") | hello  |
      | hello          | NameError: name 'hello' is not defined on line 1 |
 
 
 #Traversal

@TS_linkedlist_14
    
    Scenario: Verify that user is able to navigate to Traversal page
    Given The user is in "Implement Linked List in Python" page 
    When The user clicks on "Traversal" link 
    Then The user should navigate to "Traversal" page
    
   
     @TS_linkedlist_15

    Scenario: Verify that user is able to navigate to try editor page in Traversal
    Given The user is in the "Traversal" page.
    When The User clicks "Try Here" button in the Traversal page
    Then The user should be redirected to the page having an try Editor with a Run button

   @TS_linkedlist_16

    Scenario Outline: Verify that user is able to see output for valid and invalid python code for "Traversal" page
    Given The user is in try Editor page of Traversal page
     When The user enter valid and invalid python code in try Editor "<pythoncode>" and click on Run
    Then The user should be able to see output for valid input and error should be displayed for invalid input in console "<Result>"
    
   Examples: 
      | Pythoncode     | Result |
      | print("hello") | hello  |
      | hello          | NameError: name 'hello' is not defined on line 1 |

     
     
     
 #Insertion 

@TS_linkedlist_17
    
    Scenario: Verify that user is able to navigate to Insertion  page
    Given The user is in "Traversal" page 
    When The user clicks on "Insertion" link 
    Then The user should navigate to "Insertion" page
    
   
     @TS_linkedlist_18

    Scenario: Verify that user is able to navigate to try editor page in Insertion
    Given The user is in the "Insertion" page.
    When The User clicks "Try Here" button in the Insertion page
    Then The user should be redirected to the page having an try Editor with a Run button

   @TS_linkedlist_19

    Scenario Outline: Verify that user is able to see output for valid and invalid python code for "Insertion" page
    Given The user is in try Editor page of Insertion page
     When The user enter valid and invalid python code in try Editor "<pythoncode>" and click on Run
    Then The user should be able to see output for valid input and error should be displayed for invalid input in console "<Result>"
    
   Examples: 
      | Pythoncode     | Result |
      | print("hello") | hello  |
      | hello          | NameError: name 'hello' is not defined on line 1 |
      
      
    #Deletion
        
@TS_linkedlist_20
    
    Scenario: Verify that user is able to navigate to Deletion page
    Given The user is in "Insertion" page 
    When The user clicks on "Deletion" link 
    Then The user should navigate to "Deletion" page
    
   
     @TS_linkedlist_21

    Scenario: Verify that user is able to navigate to try editor page in Deletion
    Given The user is in the "Deletion" page
    When The User clicks "Try Here" button in the Deletion page
    Then The user should be redirected to the page having an try Editor with a Run button

   @TS_linkedlist_22

    Scenario Outline: Verify that user is able to see output for valid and invalid python code for "Deletion" page
    Given The user is in try Editor page of Deletion page
     When The user enter valid and invalid python code in try Editor "<pythoncode>" and click on Run
    Then The user should be able to see output for valid input and error should be displayed for invalid input in console "<Result>"
    
   Examples: 
      | Pythoncode     | Result |
      | print("hello") | hello  |
      | hello          | NameError: name 'hello' is not defined on line 1 |
      
#Practice questions
          
  @TS_linkedlist_23
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for Linked List page
    Given The user clicks Introduction link
    When The user clicks on the "Practice Questions" link
    Then The user should be redirected to Practice Questions of Linked List Page
    
     
     
      
    