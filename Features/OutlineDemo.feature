Feature: HotelApp login
Description: This test is to check the login functionality of the HotelApp


Scenario Outline: Login Successfull
Given User is on HotelApp homepage
When User enters "<username>" and "<password>"
And user clicks on login button
Then login is successfull

Examples:
| username | password |
| vasuvespag | vasu1234 |
| aryan1207 | Aryan@120799 |
