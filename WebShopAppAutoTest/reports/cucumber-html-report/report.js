$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "DemoWebshp website",
  "description": "",
  "id": "demowebshp-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Webshopapp"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login into Webshopapp",
  "description": "",
  "id": "demowebshp-website;login-into-webshopapp",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Webshopapp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user launch the chrome application i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user clicks the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user login using \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "demowebshp-website;login-into-webshopapp;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 10,
      "id": "demowebshp-website;login-into-webshopapp;;1"
    },
    {
      "cells": [
        "manitejakotha51@gmail.com",
        "mani9959970193"
      ],
      "line": 11,
      "id": "demowebshp-website;login-into-webshopapp;;2"
    },
    {
      "cells": [
        "bunty123@gmail.com",
        "9989955230"
      ],
      "line": 12,
      "id": "demowebshp-website;login-into-webshopapp;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login into Webshopapp",
  "description": "",
  "id": "demowebshp-website;login-into-webshopapp;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Webshopapp"
    },
    {
      "line": 1,
      "name": "@Webshopapp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user launch the chrome application i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user clicks the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user login using manitejakotha51@gmail.com and mani9959970193",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "And "
});
formatter.match({
  "location": "Webshop_Login.the_user_launch_the_chrome_application_i_am_on_the_home_page()"
});
formatter.result({
  "duration": 27396210185,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Login.the_user_clicks_the_login_button()"
});
formatter.result({
  "duration": 1982467930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manitejakotha51@gmail.com",
      "offset": 21
    },
    {
      "val": "mani9959970193",
      "offset": 51
    }
  ],
  "location": "Webshop_Login.the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 1290300304,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Login.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 9822575556,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login into Webshopapp",
  "description": "",
  "id": "demowebshp-website;login-into-webshopapp;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Webshopapp"
    },
    {
      "line": 1,
      "name": "@Webshopapp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user launch the chrome application i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user clicks the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user login using bunty123@gmail.com and 9989955230",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "And "
});
formatter.match({
  "location": "Webshop_Login.the_user_launch_the_chrome_application_i_am_on_the_home_page()"
});
formatter.result({
  "duration": 35460093148,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Login.the_user_clicks_the_login_button()"
});
formatter.result({
  "duration": 3073887117,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bunty123@gmail.com",
      "offset": 21
    },
    {
      "val": "9989955230",
      "offset": 44
    }
  ],
  "location": "Webshop_Login.the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 1170561509,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Login.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 3620785548,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "select product in Webshopapp",
  "description": "",
  "id": "demowebshp-website;select-product-in-webshopapp",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@TC02_Webshopapp"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the user launch the chrome application i am on the home page and logs in",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the user clicks on books",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "the user clicks on computers",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the user clicks on phones",
  "keyword": "Then "
});
formatter.match({
  "location": "Webshop_Selectproduct.the_user_launch_the_chrome_application_i_am_on_the_home_page_and_logs_in()"
});
formatter.result({
  "duration": 94421503138,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Selectproduct.the_user_clicks_on_books()"
});
formatter.result({
  "duration": 3588892067,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Selectproduct.the_user_clicks_on_computers()"
});
formatter.result({
  "duration": 6146976129,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Selectproduct.the_user_clicks_on_phones()"
});
formatter.result({
  "duration": 5704538575,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "select shopping cart in webshop app",
  "description": "",
  "id": "demowebshp-website;select-shopping-cart-in-webshop-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@TC03_Webshopapp"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the user launch the chrome application i am on the home page and logs in and selects the products",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "the user clicks the shopping cart link",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "the user selects the country",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the user selects state",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "the user enters zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "the user clicks on accept",
  "keyword": "And "
});
formatter.match({
  "location": "Webshop_Shoppingcart.the_user_launch_the_chrome_application_i_am_on_the_home_page_and_logs_in_and_selects_the_products()"
});
formatter.result({
  "duration": 42888390740,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Shoppingcart.the_user_clicks_the_shopping_cart_link()"
});
formatter.result({
  "duration": 2275145268,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Shoppingcart.the_user_selects_the_country()"
});
formatter.result({
  "duration": 1140246318,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Shoppingcart.the_user_selects_state()"
});
formatter.result({
  "duration": 359243266,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Shoppingcart.the_user_enters_zipcode()"
});
formatter.result({
  "duration": 631624288,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Shoppingcart.the_user_clics_on_accept()"
});
formatter.result({
  "duration": 3377087665,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "click on checkouts page",
  "description": "",
  "id": "demowebshp-website;click-on-checkouts-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@TC04_Webshopapp"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "the user launch the chrome application i am on the home page and logs and selects the products and selects shipping cart link",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user cicks on checkout link",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "the user clicks on continue buttons as address is already filled",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click on logout",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Webshop_Checkout.the_user_launch_the_chrome_application_i_am_on_the_home_page_and_logs_and_selects_the_products_and_selects_shipping_cart_link()"
});
formatter.result({
  "duration": 77472082644,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Checkout.user_cicks_on_checkout_link()"
});
formatter.result({
  "duration": 4693438706,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Checkout.the_user_clicks_on_continue_buttons_as_address_is_already_filled()"
});
formatter.result({
  "duration": 10312789969,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Checkout.click_on_logout()"
});
formatter.result({
  "duration": 4280593759,
  "status": "passed"
});
formatter.match({
  "location": "Webshop_Checkout.closes_the_browser()"
});
formatter.result({
  "duration": 252700405,
  "status": "passed"
});
});