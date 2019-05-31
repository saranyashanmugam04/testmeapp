Feature: The use one who wants to select product and proceed with checkout


Scenario: Select Product and Checkout

Given user loggin to Testmeapp 
When user selects product as "laptop"
When user clicks on add to cart
When User clicks on cart link
When user provides quantity as 1
When user proceed checkout
Then verify the review and payment page


