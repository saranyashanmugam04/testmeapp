Feature: Login Test
- Description(optional): Registered user can login into TestMeApp using proper credentials.
- Pre-Requiiste: Registration module should be completed
Example Mapping:

Business Rule1: Singnin link
Acceptance Criteria: Register user should be logged in success to TestMeApp for seacrh product
Example:john wish to purchasing an item from TestMeApp , he should login first to complete his transacion

Scenario: Login with valid credentials
Given user launch chrome browser And enter TestMeApp URL
When user enter username in username field
When user enter password in password field
When user clicks on OK button
Then verify result



