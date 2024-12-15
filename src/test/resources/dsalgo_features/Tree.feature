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
    When The user clicks on the" Overview of Trees" link
    Then The user should be redirected to the "Overview of Trees" of tree Page

  @TS_tree_04
  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given The user is in the "overview of trees" page
    When The user clicks "Try Here" button in a "overview of trees" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_05
  Scenario Outline: The user is able to run code in tryEditor for Overview of Trees page
    Given The user is in the tryEditor page for Overview of Trees page
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("Hello") |
      | madhu          |

  #Tree-Terminologies page
  @TS_tree_06
  Scenario: Verify that user is able to navigate to "Tree -Terminologies Page" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Tree -Terminologies Page" link
    Then The user should be redirected to the "Tree -Terminologies Page" of tree Page

  @TS_tree_07
  Scenario: The user is able to navigate to a page having an tryEditor from "Tree -Types of Tree"page
    Given The user is in the "Tree -Terminologies Page" page
    When The user clicks "Try Here" button in a Tree -Terminologies page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_08
  Scenario Outline: The user is able to run code in tryEditor for Tree -Terminologies Page
    Given The user is in the tryEditor page for Tree -Terminologies Page
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output
    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Tree-types of tree
  @TS_tree_09
  Scenario: Verify that user is able to navigate to "Tree -Types of Tree" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Tree -Types of Tree" link
    Then The user should be redirected to the "Tree -Types of Tree" of tree Page

  @TS_tree_10
  Scenario: The user is able to navigate to a page having an tryEditor from "Tree -Types of Tree"page
    Given The user is in the "Tree -Types of Tree" page
    When The user clicks "Try Here" button in a Tree -Types of Tree page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_11
  Scenario Outline: The user is able to run code in tryEditor for Tree -Types of Tree page
    Given The user is in the tryEditor page for Tree -Types of Tree page
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output
    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Traversals-Illustration
  @TS_tree_12
  Scenario: Verify that user is able to navigate to "Traversals-Illustration" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Traversals-Illustration" link
    Then The user should be redirected to the "Traversals-Illustration" of tree Page

  @TS_tree_13
  Scenario: The user is able to navigate to a page having an tryEditor from "Traversals-Illustration"page
    Given The user is in the "Traversals-Illustration" page
    When The user clicks "Try Here" button in a Traversals-Illustration page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_14
  Scenario Outline: The user is able to run code in tryEditor for Traversals-Illustration
    Given The user is in the tryEditor page for Traversals-Illustration
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Binary Trees
  @TS_tree_15
  Scenario: Verify that user is able to navigate to "Binary Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Binary Trees" link
    Then The user should be redirected to the "Binary Trees" of tree Page

  @TS_tree_16
  Scenario: The user is able to navigate to a page having an tryEditor from "Binary Trees"page
    Given The user is in the "Binary Trees" page
    When The user clicks "Try Here" button in a Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_17
  Scenario Outline: The user is able to run code in tryEditor for Binary Trees
    Given The user is in the tryEditor page for Binary Trees
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output
    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Types of Binary Trees
  @TS_tree_18
  Scenario: Verify that user is able to navigate to "Types of Binary Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Types of Binary Trees" link
    Then The user should be redirected to the "Types of Binary Trees" of tree Page

  @TS_tree_19
  Scenario: The user is able to navigate to a page having an tryEditor from "Types of Binary Trees"page
    Given The user is in the "Types of Binary Trees" page
    When The user clicks "Try Here" button in a Types of Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_20
  Scenario Outline: The user is able to run code in tryEditor for Types of Binary Trees
    Given The user is in the tryEditor page for Types of Binary Trees
     When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output
    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Implementation in Python
  @TS_tree_21
  Scenario: Verify that user is able to navigate to "Implementation in Python" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Implementation in Python" link
    Then The user should be redirected to the "Implementation in Python" of tree Page

  @TS_tree_22
  Scenario: The user is able to navigate to a page having an tryEditor from "Implementation in Python"page
    Given The user is in the "Implementation in Python" page
    When The user clicks "Try Here" button in a Implementation in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_23
  Scenario Outline: The user is able to run code in tryEditor for Implementation in Python
    Given The user is in the tryEditor page for Implementation in Python
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Binary Tree Traversals
  @TS_tree_24
  Scenario: Verify that user is able to navigate to "Binary Tree Traversals" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Binary Tree Traversals" link
    Then The user should be redirected to the "Binary Tree Traversals" of tree Page

  @TS_tree_25
  Scenario: The user is able to navigate to a page having an tryEditor from "Binary Tree Traversals"page
    Given The user is in the "Binary Tree Traversals" page
    When The user clicks "Try Here" button in a Binary Tree Traversals page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_26
  Scenario Outline: The user is able to run code in tryEditor for Binary Tree Traversals
    Given The user is in the tryEditor page for Binary Tree Traversals
   When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Implementation of Binary Trees
  @TS_tree_27
  Scenario: Verify that user is able to navigate to "Implementation of Binary Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Implementation of Binary Trees" link
    Then The user should be redirected to the "Implementation of Binary Trees" of tree Page

  @TS_tree_28
  Scenario: The user is able to navigate to a page having an tryEditor from "Implementation of Binary Trees"page
    Given The user is in the "Implementation of Binary Trees" page
    When The user clicks "Try Here" button in a Implementation of Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_29
  Scenario Outline: The user is able to run code in tryEditor for Implementation of Binary Trees
    Given The user is in the tryEditor page for Implementation of Binary Trees
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Applications of Binary trees
  @TS_tree_30
  Scenario: Verify that user is able to navigate to "Applications of Binary trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Applications of Binary trees" link
    Then The user should be redirected to the "Applications of Binary trees" of tree Page

  @TS_tree_31
  Scenario: The user is able to navigate to a page having an tryEditor from "Applications of Binary trees"page
    Given The user is in the "Applications of Binary trees" page
    When The user clicks "Try Here" button in a Applications of Binary trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_32
  Scenario Outline: The user is able to run code in tryEditor for Applications of Binary trees
    Given The user is in the tryEditor page for Applications of Binary trees
     When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Binary Search Trees
  @TS_tree_33
  Scenario: Verify that user is able to navigate to "Binary Search Trees" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Binary Search Trees" link
    Then The user should be redirected to the "Binary Search Trees" of tree Page

  @TS_tree_34
  Scenario: The user is able to navigate to a page having an tryEditor from "Binary Search Trees"page
    Given The user is in the "Binary Search Trees" page
    When The user clicks "Try Here" button in a Binary Search Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_35
  Scenario Outline: The user is able to run code in tryEditor for Binary Search Trees
    Given The user is in the tryEditor page for Binary Search Trees
    When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Implementation Of BST
  @TS_tree_36
  Scenario: Verify that user is able to navigate to "Implementation Of BST" for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The user clicks on the"Implementation Of BST" link
    Then The user should be redirected to the "Implementation Of BST" of tree Page

  @TS_tree_37
  Scenario: The user is able to navigate to a page having an tryEditor from "Implementation Of BST"page
    Given The user is in the "Implementation Of BST" page
    When The user clicks "Try Here" button in a Implementation Of BST page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TS_tree_38
  Scenario Outline: The user is able to run code in tryEditor for Implementation Of BST
    Given The user is in the tryEditor page for Implementation Of BST
     When The user enters the valid and invalid pythoncode <pythoncode> and clicks Run button
    Then The user should able to see output in the console Output

    Examples: 
      | pythoncode     |
      | print("hello") |
      | madhu          |

  #Practice Questions
  @TS_tree_39
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Tree - Overview of Trees" page
    Given The user is in the "overview of trees" page
    When The User clicks  " Practice questions"  link
    Then The user should be redirected to "Practice" page
