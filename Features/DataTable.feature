Feature: HotelApp dataDeals
Description: This test is to check the method other than- examples for data driven testing


Scenario: Login Successfull
Given User is on HotelApp homepage
When User enters username and password
#for index accessing
#| vasuvespag | vasu1234 |

#accessing through Map
| username | password |
| vasuvespag | vasu1234 |


And user clicks on login button
Then login is successfull


