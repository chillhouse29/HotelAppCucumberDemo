Feature: HotelApp login
Description: This test is to check th elogin functionality of the HotelApp

Scenario: Login Successfull
Given User is on HotelApp homepage
When user enters username and password
| username | password |
| vasuvespag | vasu1234 |
| aryan1207 | Aryan@120799 |

And user clicks on login button
Then Login is Successfull