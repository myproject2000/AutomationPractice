$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("summerdresses.feature");
formatter.feature({
  "line": 1,
  "name": "Add to Cart Functionality of Summer Dress",
  "description": "",
  "id": "add-to-cart-functionality-of-summer-dress",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5503668800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user i want to verify product has been added to cart",
  "description": "",
  "id": "add-to-cart-functionality-of-summer-dress;as-a-user-i-want-to-verify-product-has-been-added-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hoover on dresses link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on summer dresses",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I scroll down to pic",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I mouse hoover on pic and click on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Proceed to checkout link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Proceed to checkout again",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter email address \"pvrajesh404@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password \"Abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Proceed to checkout link 3rd time",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on checkbox of agree terms \u0026 condition",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Proceed to checkout again 4th time",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on pay by bank wire link",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I can see \"ORDER CONFIRMATION\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "SummerDressStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 75146600,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iMouseHooverOnDressesLink()"
});
formatter.result({
  "duration": 161138000,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnSummerDresses()"
});
formatter.result({
  "duration": 2398075500,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnPic()"
});
formatter.result({
  "duration": 219370100,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iMouseHooverAndClickOnAddToCart()"
});
formatter.result({
  "duration": 52485800,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnProceedToCheckoutLink()"
});
formatter.result({
  "duration": 1557660500,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnProceedToCheckoutAgain()"
});
formatter.result({
  "duration": 21477352200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pvrajesh404@gmail.com",
      "offset": 23
    }
  ],
  "location": "SummerDressStepdefs.iEnterEmailAddress(String)"
});
formatter.result({
  "duration": 76137100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abcd1234",
      "offset": 18
    }
  ],
  "location": "SummerDressStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 76168400,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnSignInButton()"
});
formatter.result({
  "duration": 25439055400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 36
    }
  ],
  "location": "SummerDressStepdefs.iClickOnProceedToCheckoutLinkRdTime(int)"
});
formatter.result({
  "duration": 21422498600,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnCheckboxOfAgreeTermsCondition()"
});
formatter.result({
  "duration": 103468700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 37
    }
  ],
  "location": "SummerDressStepdefs.iClickOnProceedToCheckoutAgainThTime(int)"
});
formatter.result({
  "duration": 21462365500,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnPayByBankWireLink()"
});
formatter.result({
  "duration": 22349110100,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iClickOnConfirmMyOrder()"
});
formatter.result({
  "duration": 22706224400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ORDER CONFIRMATION",
      "offset": 11
    }
  ],
  "location": "SummerDressStepdefs.iCanSeeMessage(String)"
});
formatter.result({
  "duration": 36222400,
  "status": "passed"
});
formatter.after({
  "duration": 663629600,
  "status": "passed"
});
});