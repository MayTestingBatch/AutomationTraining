$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\ADMIN\\18th Batch 06th May 2024\\Framework\\CucumberPractice\\src\\test\\java\\features\\SauceDemoProducts.feature");
formatter.feature({
  "name": "Check add to cart product fucntionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on login page of the application",
  "keyword": "Given "
});
formatter.match({
  "location": "SauceDemoLoginStepDefi.user_on_login_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid \"standard_user\" and \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "SauceDemoLoginStepDefi.user_enter_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "SauceDemoLoginStepDefi.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SauceDemoLoginStepDefi.user_is_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check user able to logout an application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@homepage"
    },
    {
      "name": "@testlogout"
    }
  ]
});
formatter.step({
  "name": "user click on dashboard menu",
  "keyword": "And "
});
formatter.match({
  "location": "SauceDemoHomepageStepDefi.user_click_on_dashboard_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "SauceDemoLoginStepDefi.user_click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});