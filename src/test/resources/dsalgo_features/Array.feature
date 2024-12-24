
@Array
Feature: Array module
  I want to use this template for my feature file
  
  Background: The user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid Vidya and Kanaka@185

  @Array1
  Scenario: Verify that user is able to navigate to Array data structure page
    Given The user is in the Home page after Sign in for Arrays  
    When The user clicks the Getting Started button in Array Panel OR The user select Array item from the drop down menu
    Then The user be directed to ARRAY Data Structure Page
    
    @Arrays_in_Python
    Scenario: Verify that user is able to navigate to Arrays in Python page
    Given The user is in the Array page after Sign in    
    When The user clicks Arrays in Python button in Array Page
    Then The user should be redirected to Arrays in Python page
    
    @Try_Editor_in_Arrays_in_Python1
    Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
    Given The user is on the Arrays in Python page    
    When The user clicks Try Here button in Arrays in Python page
    Then The user should be redirected to a page having a Try Editor with a Run button to test in Array in Python page
    
     @Try_Editor_in_Arrays_in_Python2
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Arrays in Python page tryEditor
    Given The user is in the tryEditor page of Arrays in Python   
    When The user enters code in <TryEditor> and clicks Run button in Arrays in Python page
    Then The user should able to see output in the console Arrays in Python tryeditor page
    Examples: 
      | TryEditor       | 
      | print("hello")  |
      | print           | 
      |                 |    

  
    @Arrays_Using_List1
    Scenario: Verify that user is able to navigate to Arrays Using List page
    Given The user is in the Array page after Sign in    
    When The user clicks Arrays Using List button in Array Page
    Then The user should be redirected to Arrays Using List page
    
    @Try_Editor_in_Arrays_Using_List1
    Scenario: Verify that user is able to navigate to try Editor page for Arrays Using List page
    Given The user is on the Arrays Using List page    
    When The user clicks Try Here button in Arrays Using List page
    Then The user should be redirected to a page having a Try Editor with a Run button to test in Arrays Using List page
  
    
    @Try_Editor_in_Arrays_Using_List2
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Arrays Using List page tryEditor
    Given The user is in the tryEditor page of Arrays Using List   
    When The user enters code in <TryEditor> and clicks Run button in Arrays in Python page
    Then The user should able to see output in the console Arrays in Python tryeditor page
    Examples: 
      | TryEditor       | 
      | print("hello")  |
      | jkj             | 
      |                 |
      
    @Basic_Operations_in_Lists
    Scenario: Verify that user is able to navigate to Basic Operations in Lists page
    Given The user is in the Basic Operations in Lists after Sign in    
    When The user clicks Basic Operations in Lists button in Array Page
    Then The user should be redirected to Basic Operations in Lists page
    
    @Try_Editor_in_Basic_Operations_in_Lists1
    Scenario: Verify that user is able to navigate to try Editor page for Basic Operations in Lists page
    Given The user is on the Basic Operations in Lists page    
    When The user clicks Try Here button in Basic Operations in Lists page
    Then The user should be redirected to a page having a Try Editor with a Run button to test in Basic Operations in Lists page
    
     @Try_Editor_in_Basic_Operations_in_Lists2
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Basic Operations in Lists page tryEditor
    Given The user is in the tryEditor page of Basic Operations in Lists  
    When The user enters code in <TryEditor> and clicks Run button in Arrays in Python page
    Then The user should able to see output in the console Arrays in Python tryeditor page
    Examples: 
      | TryEditor       | 
      | print("hello")  |
      | jkj             |
    @Applications_of_Array
    Scenario: Verify that user is able to navigate to Applications of Array in Lists page
    Given The user is in the Applications of Array after Sign in    
    When The user clicks Applications of Array button in Array Page
    Then The user should be redirected to Applications of Array in Lists page
    
    @Try_Editor_in_Applications_of_Array1
    Scenario: Verify that user is able to navigate to try Editor page for Applications of Array page
    Given The user is on the Applications of Array page    
    When The user clicks Try Here button in Applications of Arrays page
    Then The user should be redirected to a page having a Try Editor with a Run button to test in Applications of Array page
    
     @Try_Editor_in_Applications_of_Array2
    Scenario Outline: Verify that user receives output for different combinations of code when click on Run button for Applications of Arrays page tryEditor
    Given The user is in the tryEditor page of Applications of Array  
     When The user enters code in <TryEditor> and clicks Run button in Arrays in Python page
    Then The user should able to see output in the console Arrays in Python tryeditor page
    Examples: 
      | TryEditor       | 
      | print("hello")  |
      | jkj             |
      
        
    
     @PracticePage-1
    Scenario: Verify that user is able to navigate to Practice Questions Page for Arrays in Python page
    Given The user is in the Array page after Sign in    
    When The user clicks Practice Questions button in Array page
    Then The user should be redirected to Practice pageof Array page  
      #
      #
    #@Search_the_array-2
    #Scenario: Verify that user is able to navigate to Search the Array Page from Practice question page of Arrays in Python page
    #Given The user is on the Practice  Questions page of Array page
    #When The user clicks the Search the array link
    #Then The user should be redirected to the Search_the_array Question page contains a question,and try Editor with Run and Submit buttons
    #
    #
   #
 #
    #@Code_Editor_for_Search_the_array_link_Run_Button-3    
    #Scenario Outline: Verify that user receives output for valid and invalid python code for Search the array Code question and clicks RUn button
    #Given The user is in Question page of Search the Array   
    #When User enters valid Python code from sheet "<SheetName>" 
    #When The user enters code from <SheetName>  and <RowNumber> for Search the Array Question Page
    #And clicks Run button in Question Page
    #Then The user should able to see output in the console for Question Page
    #Examples: 
      #| SheetName  | RowNumber |
#			| PythonCode | 3         |
      #
    #@Code_Editor_for_Search_the_array_link_Submit_Button-4
    #Scenario Outline:Verify that user receives output for valid and invalid python code for Search the array Code question and clicks Submit button 
    #Given User is on Question page of Search the array
#		When User enters Python code from sheet <SheetName> and <RowNumber> for Search the Array Question Page
#		And User clicks on Submit button
#		Then User should get success output message  from sheet <SheetName> and <RowNumber> 
#		Examples:
#			| SheetName  | RowNumber |
#			| PythonCode | 4         |
#			
    #
    #
    #
    #@Max_Consecutive_Ones-5
    #Scenario: Verify that user is able to navigate to FindMaxConsecutiveOnes Page from Practice question page of Arrays in Python page
    #Given The user is on the Practice questions Page in Python page
    #When The user clicks findMaxConsecutiveOnes link
    #Then The user should be redirected to Find Max Consecutive Question Page contains a question,and try Editor with Run and Submit buttons 
    #
    #
   #
 #
    #@Max_Consecutive_Ones_link_Run_Button-6    
    #Scenario Outline: Verify that user receives output for valid and invalid python code for Find Max Consecutive Ones Editor page and clicks Run button
    #Given The user is in Question page of Find_Max_Consecutive_Ones  
    #When User enters valid Python code from sheet "<SheetName>" 
    #When The user enters code from <SheetName>  and <RowNumber> for find_Max_Consecutive_Ones Question Page
    #And clicks Run button Question Page
    #Then The user should able to see output in the console for Question Page
    #Examples: 
      #| SheetName  | RowNumber |
#			| PythonCode | 5         |
      #
    #@Max_Consecutive_Ones_link_Submit_Button-7
    #Scenario Outline: Validation of Submit button in Practice Questions page for Search for Array 
    #Given User is on Question page of Search the array
#		When User enters Python code from sheet <SheetName> and <RowNumber> for the PracticeQuestions
#		And User clicks on Submit button
#		Then User should get success output message  from sheet <SheetName> and <RowNumber> 
#		Examples:
#			| SheetName  | RowNumber |
#			| PythonCode | 6         |
    #
    #
    #@Find_Numbers_with_Even_Number_of_Digits-8
    #Scenario: Verify that user is able to navigate to FindMaxConsecutiveOnes Page from Practice question page of Arrays in Python page
    #Given The user is on the Practice questions Page in Python page
    #When The user clicks find Max Consecutive Ones link
    #Then The user should be redirected to Find Max Consecutive Question Page contains a question,and try Editor with Run and Submit buttons 
    #
    #
   #
 #
    #@Find_Numbers_with_Even_Number_of_Digits_link_Run_Button-9    
    #Scenario Outline: Verify that user receives output for valid and invalid python code for Find Max Consecutive Ones Editor page and clicks Run button
    #Given The user is in Question page of Find_Max_Consecutive_Ones  
    #When User enters valid Python code from sheet "<SheetName>" 
    #When The user enters code from <SheetName>  and <RowNumber> for find_Max_Consecutive_Ones Question Page
    #And clicks Run button Question Page
    #Then The user should able to see output in the console for Question Page
    #Examples: 
      #| SheetName  | RowNumber |
#			| PythonCode | 5         |
      #
    #@Find_Numbers_with_Even_Number_of_Digits_link_Submit_Button-10
    #Scenario Outline: Validation of Submit button in Practice Questions page for Find_Numbers_with_Even_Number_of_Digits 
    #Given User is on Question page of Find Numbers with Even Number of Digits
#		When User enters Python code from sheet <SheetName> and <RowNumber> for the PracticeQuestions
#		And User clicks on Submit button
#		Then User should get success output message  from sheet <SheetName> and <RowNumber> 
#		Examples:
#			| SheetName  | RowNumber |
#			| PythonCode | 6         |
  #
  #
  #
  #@Squares_of_a_Sorted_Array-11
    #Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page from Practice question page of Arrays in Python page
    #Given The user is on the Practice questions Page in Python page
    #When The user clicks find Max Consecutive Ones link
    #Then The user should be redirected to Squares of a Sorted Array Question Page contains a question,and try Editor with Run and Submit buttons 
    #
    #
   #
 #
    #@Squares_of_a_Sorted_Array_link_Run_Button-12    
    #Scenario Outline: Verify that user receives output for valid and invalid python code for Squares of a Sorted Array Editor page and clicks Run button
    #Given The user is in Question page of Squares of a Sorted Array 
    #When User enters valid Python code from sheet "<SheetName>" 
    #When The user enters code from <SheetName>  and <RowNumber> for find_Max_Consecutive_Ones Question Page
    #And clicks Run button Question Page
    #Then The user should able to see output in the console for Question Page
    #Examples: 
      #| SheetName  | RowNumber |
#			| PythonCode | 7         |
      #
    #@Squares_of_a_Sorted_Array_link_Submit_Button-13
    #Scenario Outline: Validation of Submit button in Practice Questions page for Squares of a Sorted Array 
    #Given User is on Question page of Find Numbers with Even Number of Digits
#		When User enters Python code from sheet <SheetName> and <RowNumber> for the PracticeQuestions
#		And User clicks on Submit button
#		Then User should get success output message  from sheet <SheetName> and <RowNumber> 
#		Examples:
#			| SheetName  | RowNumber |
#			| PythonCode | 8         |
  