$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_021_Read_All_Countries.feature");
formatter.feature({
  "name": "read all country data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@country"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@country"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go to api end point \"https://www.gmibank.com/api/tp-countries\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_021_Read_All_Countries.user_go_to_api_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "read all countries and write",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_021_Read_All_Countries.read_all_countries_and_write()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate countries",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_021_Read_All_Countries.validate_countries()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});