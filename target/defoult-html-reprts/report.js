$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login SougeDemo Web Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login With Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@shopping"
    },
    {
      "name": "@a"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to web page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sauceDemoTests.step_defs.LoginStepDefs.go_to_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters user name \"standard_user\" and password \"secret_sauce\" and clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.sauceDemoTests.step_defs.LoginStepDefs.theUserEntersUserNameAndPasswordAndClicksLoginButton(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the user access the product page \"Products\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sauceDemoTests.step_defs.ProductPageStepDefs.verifyThatTheUserAccessTheProductPageSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});