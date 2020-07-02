$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/SeleniumPOM.feature");
formatter.feature({
  "name": "CyclosBank login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user logs in with a valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Happy"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"https://demo.cyclos.org/#login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserNavigatesTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters username \"demo\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserEntersUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters password \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserEntersPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserClicksSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks pay user",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserClicksPayUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Contact",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserClicksContact()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects \"Henry George\" from contact",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserSelectsFromContact(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"100\" to amount area",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserEntersToAmountArea(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user types \"haziran bursu, gule gule harca\" to description",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserTypesToDescription(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks submit",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserClicksSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks confirm",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserClicksConfirm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user views \"The payment was successful\" on transfer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.MyStepdefs.theUserViewsOnTransferPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});