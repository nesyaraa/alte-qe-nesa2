$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckOut.feature");
formatter.feature({
  "line": 2,
  "name": "Feature check out",
  "description": "",
  "id": "feature-check-out",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 9806003042,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user can be check out",
  "description": "",
  "id": "feature-check-out;user-can-be-check-out",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User select \"Name (Z to A)\" to Filter Product",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User pick item Sauce Labs Onesie and T-shirt Red",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User remove item T-shirt Red on Cart Page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click Check Out Button on Cart Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User input \"Nesa\" as userName, input \"Andestra\" as password and \"13740\" as postal code",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User click Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click Finish Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 457892208,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 3278366041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 13
    }
  ],
  "location": "PurchaseSteps.filterProduct(String)"
});
formatter.result({
  "duration": 863168584,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket1()"
});
formatter.result({
  "duration": 5316457125,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickcartIcon()"
});
formatter.result({
  "duration": 5109895000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickremoveicon()"
});
formatter.result({
  "duration": 5083529500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.klikCO()"
});
formatter.result({
  "duration": 5100117500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nesa",
      "offset": 12
    },
    {
      "val": "Andestra",
      "offset": 38
    },
    {
      "val": "13740",
      "offset": 65
    }
  ],
  "location": "PurchaseSteps.inputInfromation(String,String,String)"
});
formatter.result({
  "duration": 968391833,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.klikContinue()"
});
formatter.result({
  "duration": 5266051250,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.klikFinish()"
});
formatter.result({
  "duration": 92980208,
  "status": "passed"
});
formatter.after({
  "duration": 20459,
  "status": "passed"
});
});