<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PasswordChange.feature");
formatter.feature({
  "name": "Password Strength",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PasswordStrength"
    }
  ]
});
formatter.background({
  "name": "Entrance of the page",
=======
<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_003_Registration_Password.feature");
formatter.feature({
  "name": "Go to Registration Page",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/registration.feature");
formatter.feature({
  "name": "Go to homepage",
>>>>>>> master
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
<<<<<<< HEAD
formatter.scenarioOutline({
  "name": "TC_0001 User type to New Password_There should be at least 1 uppercase char",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.step({
  "name": "user type New \u003cPassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Password"
      ]
    },
    {
      "cells": [
        "\"\u003cAaaaaaa\u003e\""
      ]
    },
    {
      "cells": [
        "\"\u003cAaaa\u003e\""
      ]
    }
  ]
});
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0001 User type to New Password_There should be at least 1 uppercase char",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_New_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type New \"\u003cAaaaaaa\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_type_New(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.check_the_bar_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0001 User type to New Password_There should be at least 1 uppercase char",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_New_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type New \"\u003cAaaa\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_type_New(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.check_the_bar_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level(US_003_Registration_Password_sd.java:82)\r\n\tat ✽.verify level(file:///C:/Users/Administrator/IdeaProjects/gmibankproject/src/test/resources/features/US_003_Registration_Password.feature:15)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0002 User type to New Password_There should be at least 1 lowercase char",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.step({
  "name": "user type New \u003cPassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Password"
      ]
    },
    {
      "cells": [
        "\"\u003caAAAAAA\u003e\""
      ]
    }
  ]
});
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0002 User type to New Password_There should be at least 1 lowercase char",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_New_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type New \"\u003caAAAAAA\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_type_New(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.check_the_bar_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0003 User type to New Password_There should be at least 1 digit",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.step({
  "name": "user type New \u003cPassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Password"
      ]
    },
    {
      "cells": [
        "\"\u003c1aaaaaa\u003e\""
      ]
    }
  ]
});
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0003 User type to New Password_There should be at least 1 digit",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_New_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type New \"\u003c1aaaaaa\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_type_New(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.check_the_bar_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0004 User type to New Password_There should be  at least 1 special char",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.step({
  "name": "user type New \u003cPassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Password"
      ]
    },
    {
      "cells": [
        "\"\u003c.aaaaaa\u003e\""
      ]
    }
  ]
});
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0004 User type to New Password_There should be  at least 1 special char",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_New_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type New \"\u003c.aaaaaa\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_type_New(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.check_the_bar_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0005 User type to New Password_There should be at least 7 chars",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.step({
  "name": "user type New \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Password"
      ]
    },
    {
      "cells": [
        "Aaaaaaa"
      ]
    },
    {
      "cells": [
        "Aaaa12"
      ]
    }
  ]
});
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0005 User type to New Password_There should be at least 7 chars",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_New_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type New \"Aaaaaaa\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_type_New(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.check_the_bar_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
=======
>>>>>>> master
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
<<<<<<< HEAD
  "name": "TC_0005 User type to New Password_There should be at least 7 chars",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to register button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to New Password button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_New_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type New \"Aaaa12\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_type_New(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the bar level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.check_the_bar_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify level",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat gmibank.stepdefinitions.US_003_Registration_Password_sd.verify_level(US_003_Registration_Password_sd.java:82)\r\n\tat ✽.verify level(file:///C:/Users/Administrator/IdeaProjects/gmibankproject/src/test/resources/features/US_003_Registration_Password.feature:70)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "screenshots");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US_015_Manage_Account.feature");
formatter.feature({
  "name": "go to Registration Page",
  "description": "",
  "keyword": "Feature",
=======
  "name": "TC_001-007 User type several informations",
  "description": "",
  "keyword": "Scenario",
>>>>>>> master
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
<<<<<<< HEAD
formatter.background({
  "name": "User go to GMI Bank homepage",
>>>>>>> master
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfo.user_is_on_the_home_page()"
=======
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to dropdown button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to Sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_to_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click User name button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_User_name_button()"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "sign in as \"user\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfo.sign_in_as(java.lang.String)"
=======
  "name": "user type Username \"team21customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_type_Username(java.lang.String)"
=======
formatter.step({
  "name": "user clik to register box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_clik_to_register_box()"
>>>>>>> master
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "Click on user icon and click on Password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.PasswordChange.click_on_user_icon_and_click_on_Password()"
=======
<<<<<<< HEAD
  "name": "user click to Password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_to_Password()"
=======
  "name": "user clik to register button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_clik_to_register_button()"
>>>>>>> master
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "Enter \"team21User\" to the current password textbox.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.PasswordChange.enter_to_the_current_password_textbox(java.lang.String)"
=======
<<<<<<< HEAD
  "name": "user type Password \"team21Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_type_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click My Operation button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_My_Operation_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Manage Accounts button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_Manage_Accounts_button()"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
<<<<<<< HEAD
  "name": "Edit Password",
=======
  "name": "TC_0001 User should see all account types and balace populated",
>>>>>>> master
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@PasswordStrength"
    },
    {
      "name": "@edit"
=======
      "name": "@registrationpage"
>>>>>>> master
    }
  ]
});
formatter.step({
<<<<<<< HEAD
  "name": "Enter \"team21User\" to the New password textbox.",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.PasswordChange.enter_to_the_New_password_textbox(java.lang.String)"
=======
  "name": "check all account types",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.check_all_account_types()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check all balance",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.check_all_balance()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User go to GMI Bank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user got to GMI Bank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_got_to_GMI_Bank_homepage()"
=======
  "name": "user clik to SSn number box and send \"454-42-1223\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_clik_to_SSn_number_box_and_send(java.lang.String)"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user click to dropdown button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_003_Registration_Password_sd.user_click_to_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to Sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_to_Sign_in_button()"
=======
  "name": "user click to first name box and send \"Hans\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_click_to_first_name_box_and_send(java.lang.String)"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user click User name button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_User_name_button()"
=======
  "name": "user click to last name box and send \"Kern\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_click_to_last_name_box_and_send(java.lang.String)"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user type Username \"team21customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_type_Username(java.lang.String)"
=======
  "name": "user click to address box and send \"Ernst Straße 2, 17299 Hamburg\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_click_to_address_box_and_send(java.lang.String)"
>>>>>>> master
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "Enter \"team21User\" to the New confirmation password textbox.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.PasswordChange.enter_to_the_New_confirmation_password_textbox(java.lang.String)"
=======
<<<<<<< HEAD
  "name": "user click to Password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_to_Password()"
=======
  "name": "user click to mobile phone number box and send \"404-421-2236\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_click_to_mobile_phone_number_box_and_send(java.lang.String)"
>>>>>>> master
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "Click on the save button.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.PasswordChange.click_on_the_save_button()"
=======
<<<<<<< HEAD
  "name": "user type Password \"team21Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_type_Password(java.lang.String)"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "There should be a Error Message",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.PasswordChange.there_should_be_a_Error_Message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat org.testng.Assert.assertTrue(Assert.java:53)\r\n\tat gmibank.stepdefinitions.PasswordChange.there_should_be_a_Error_Message(PasswordChange.java:52)\r\n\tat ✽.There should be a Error Message(file:///C:/Users/user/IdeaProjects/gmibankproject/src/test/resources/features/PasswordChange.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
=======
  "name": "user click Sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click My Operation button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_My_Operation_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Manage Accounts button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_click_Manage_Accounts_button()"
=======
  "name": "user click to username box and send \"hanskern1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_click_to_username_box_and_send(java.lang.String)"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
<<<<<<< HEAD
formatter.scenario({
  "name": "TC_0002 User can view transaction",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@registrationpage"
    }
  ]
});
formatter.step({
  "name": "user view transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_015_Manege_Account_sd.user_view_transaction()"
=======
formatter.step({
  "name": "user click to email box and send \"hanskern@fakemail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepdefinition.user_click_to_email_box_and_send(java.lang.String)"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
>>>>>>> master
formatter.after({
  "status": "passed"
});
});