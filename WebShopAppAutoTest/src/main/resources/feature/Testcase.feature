@Webshopapp
Feature: DemoWebshp website
@TC01_Webshopapp
Scenario Outline:
Login into Webshopapp
Given the user launch the chrome application i am on the home page
When the user clicks the login button
Then the user login using <email> and <password>
And click on the login button user nagivate to the next page
Examples:
 		| email | password  |
		|manitejakotha51@gmail.com | mani9959970193|
		|bunty123@gmail.com|9989955230|

@TC02_Webshopapp
Scenario:
Select product in Webshopapp
Given the user launch the chrome application i am on the home page and logs in
Given the user clicks on books
Then the user clicks on computers
Then the user clicks on phones

@TC03_Webshopapp
Scenario:
select shopping cart in webshop app
Given the user launch the chrome application i am on the home page and logs in and selects the products
Given the user clicks the shopping cart link
Then the user selects the country
And the user selects state
And the user enters zipcode
And the user clicks on accept

@TC04_Webshopapp
Scenario:
click on checkouts page
Given the user launch the chrome application i am on the home page and logs and selects the products and selects shipping cart link
Then user cicks on checkout link
Then the user clicks on continue buttons as address is already filled
Then click on logout
