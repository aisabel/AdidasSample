$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/searchPositions.feature");
formatter.feature({
  "name": "search QA positions in Careers Adidas Group",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "search QA positions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in Careers Adidas Group",
  "keyword": "Given "
});
formatter.step({
  "name": "search for \"\u003cposition\u003e\" in \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click Find Jobs button",
  "keyword": "And "
});
formatter.step({
  "name": "results are displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "position",
        "location"
      ]
    },
    {
      "cells": [
        "Quality Assurance Engineer",
        "Amsterdam"
      ]
    },
    {
      "cells": [
        "QA Software Engineer",
        "Amsterdam"
      ]
    }
  ]
});
formatter.scenario({
  "name": "search QA positions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in Careers Adidas Group",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "search for \"Quality Assurance Engineer\" in \"Amsterdam\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click Find Jobs button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "results are displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "search QA positions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in Careers Adidas Group",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "search for \"QA Software Engineer\" in \"Amsterdam\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click Find Jobs button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "results are displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});