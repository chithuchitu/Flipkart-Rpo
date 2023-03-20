$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fb.feature");
formatter.feature({
  "line": 1,
  "name": "To Test Facebook Functionality",
  "description": "",
  "id": "to-test-facebook-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "To Check the Login Funtionality and Create Account With InValid Functionality",
  "description": "",
  "id": "to-test-facebook-functionality;to-check-the-login-funtionality-and-create-account-with-invalid-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user give the Invalid Username and Invalid Password",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Click The Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Take Screenshot For Invalid Credential error Message",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user Go Back To The Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user Clik The Create New Account Button and Fill The Details",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user Take Scrrenshot For The Registeration Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_give_the_invalid_username_and_invalid_password()"
});
formatter.result({
  "duration": 445439200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 139775300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_take_screenshot_for_invalid_credential_error_message()"
});
formatter.result({
  "duration": 1798430500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_go_back_to_the_home_page()"
});
formatter.result({
  "duration": 721818400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clik_the_create_new_account_button_and_fill_the_details()"
});
formatter.result({
  "duration": 18761668600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_take_scrrenshot_for_the_registeration_page()"
});
formatter.result({
  "duration": 193252300,
  "status": "passed"
});
});