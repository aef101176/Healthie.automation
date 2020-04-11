# Description
Basic test framework. Tested Login functionality.

 Markup : * Bullet list
              * Nested bullet
                  * Sub-nested bullet etc
          * Bullet list item 2

# Test Tools:
```
Test automation framework: Selenium, (Mobile) Appium 
Language: Java 
Unit Testing framework: JUnit 
IDE: IntelliJ
```

# File Structure:
```
Utilities: fixtures, config files, helpers can go here. 
Src: Holds POM packages and files. 
TestScripts: Holds Test Cases.
```
# ----------------------------------------------------------
# Test Scenario: 
Check login functionality

###### Test Case: 
Check the response upon entering a valid Email Address and password

###### Pre condition: 
The Healthie app must be installed on device

###### Test Steps:
1. Lauch the application
2. Enter Email Address
3. Enter password
4. Click Log In button

###### Test Data:
Email Address: ffghy@yghy.com
Password: testpassword

###### Expected Result
Login was successful

###### Post condition:
The Journal page is displayed.
# -------------------------------------------------------------
# Gherkin Statement
```
Feature: Login functionality
      As a customer
      In order to use the application
      I want to login with an email and a password

Scenario: I login with valid credentials
   Given I am on the login page
      When I fill in the email textbox with value '<correct email>'
           And I fill in the password textbox with value '<correct password>' 
           And I click the log In button
       Then I am shown the application Journal page

Scenario: I log in with invalid credentials
   Given I am on the login page
      When I fill in the email textbox with value '<incorrect email>'
           And I fill in the password textbox with value '<incorrect password>' 
          And I click the log In button 
      Then I am shown a login error message
```
