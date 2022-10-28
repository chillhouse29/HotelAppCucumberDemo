Feature: HotelApp search hotel
Description: This test is to check the various functionality of the HotelApp

Background: User is logged in
Given User is on HotelApp homepage
When User enters Username
And User enters Password
And user clicks on login button

Scenario: search hotel
And User selects location from the dropdown
And user clicks on search button
Then list of hotels is displayed

Scenario: select Hotel
And user selects a radio button
And user clicks on continue button
Then list of hotels is displayed