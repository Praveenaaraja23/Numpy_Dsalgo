@Home
Feature: User launch dsalgo application and test Home page

  @TS_home_01
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to homepage

  @TS_home_02
  Scenario Outline: User is on Home page and click getstarted link <option> on home page without sign in
    Given The user is on Home page
    When The user clicks on Get Started link on homepage <option> without login
    Then The user wants to see <warningmessage>

    Examples: 
      | option         | warningmessage        |
      | Datastructures | You are not logged in |
      | Arrays         | You are not logged in |
      | Linkedlist     | You are not logged in |
      | Stack          | You are not logged in |
      | Queue          | You are not logged in |
      | Tree           | You are not logged in |
      | Graph          | You are not logged in |

  @TS_home_03
  Scenario Outline: User is on Home page and click on dropdown <option> without sign in
    Given The user is on Home page
    When The user clicks on dropdown <option> without signin
    Then The user wants to see <warningmessage>

    Examples: 
      | option     | warningmessage        |
      | Arrays     | You are not logged in |
      | Linkedlist | You are not logged in |
      | Stack      | You are not logged in |
      | Queue      | You are not logged in |
      | Tree       | You are not logged in |
      | Graph      | You are not logged in |

  @TS_home_04
  Scenario: User is on Home page and click on sign in
    Given The user is on Home page
    When The user clicks on signin link
    Then The user redirected to login page

  @TS_home_05
  Scenario: User is on Home page and click on Register
    Given The user is on Home page
    When The user clicks on register link
    Then The user redirected to Registration page
