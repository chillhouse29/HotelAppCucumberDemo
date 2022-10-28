Feature: HotelApp search hotel
Description: This test is to check the various functionality of the HotelApp

Scenario: User is logged in
Given User is on HotelApp homepage
When User enters "vasuvespag" and "vasu1234"
And user clicks on login button
Then login is successfull