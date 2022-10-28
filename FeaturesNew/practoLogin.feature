Feature: Practo login
Description: This test is to check th elogin functionality of the HotelApp

Scenario: Login Successfull
Given User is on Practo homepage
And user clicks on signIn button
When User enters Username
And User enters Password
And user clicks on login button
Then Login is Successfull 