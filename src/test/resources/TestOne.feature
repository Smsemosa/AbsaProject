Feature: Login Functionality
  Scenario: Successful Login with to google website
    Given  Navigate to - http://www.way2automation.com/angularjs-protractor/webtables/
    Then Validate that you are on the User List Table

    Then Click Add user
    Then Add users with the following details:
    Then Ensure that User Name is unique on each run
      |fName|lName|uName|uPass|customerType|role|email|cell|
      |FName1|LName1|User1|Pass1|Company AAA|Admin|admin@mail.com|082555|
      |FName2|LName2|User2|Pass2|Company BBB|Customer|customer@mail.com|083444|
    Then Ensure that your users are added to the list


