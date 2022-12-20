Feature: Test login feature


  Scenario Outline: Email fill Password empty

    Given User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Sign In" button
    Then User should see the error message and close it

    Examples:
      | email                      | password      |
      | kale.nilay                 |               |



  Scenario Outline: Fail Login

    Given User navigates to login page
    Then User enters <email> and <password>
    Then User navigates to login page

    Examples:
      | email                     | password      |
      | kale.nilay                | studenttt     |


  Scenario Outline: Login Success

    Given User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Sign In" button
    Then User should see the home page

    Examples:
      | email                     | password      |
      | kale.nilay                | student       |



  Scenario Outline: Change My Profile Information

    Then Click on "My Profile" button
    Then Click on "Gender" button
    Then Select the "Male" option
    Then User changes <day> and <month> and <year>
    Then User add <birthPlace>
    Then Click on "Save Changes" button
    Then Check the Pop-up

    Examples:
      | email                     | password      | day | month | year | birthPlace |
      | kale.nilay                | student       | 12  |  02   | 1997 | Istanbul   |


  Scenario Outline: Create New Request
    Then Click on "Dashboard" button
    Then User should see the home page
    Then Click on "Request" button
    Then Click on "Create New Request" button
    Then User choose <receiver>
    Then User new <subject> and <request>


    Examples:
      | email                     | password      |   receiver     |   subject        |    request            |
      | kale.nilay                | student       | Ervin Domazet  |   Master Project | Trying Web Automation |

  Scenario Outline: Log Out
    Then Click on "Dashboard" button
    Then User should see the home page
    Then Click on "Log Out"
    Then User should see the login page

    Examples:
      | email                     | password      |
      | kale.nilay                | student       |