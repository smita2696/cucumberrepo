Feature: Search the product and place the order for products

Scenario Outline: Search experience in both home and offer page

Given User is on landing page
When user searched with shortname <Name> and extracted actual name of product
Then user searched for same shortname <Name> in offers page to check if product exist
And matched actual name and offer name
Examples:
|Name|
|Tom|
|Pot|

