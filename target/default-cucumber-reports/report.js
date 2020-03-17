$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/expedia.feature");
formatter.feature({
  "line": 1,
  "name": "Flights Search",
  "description": "",
  "id": "flights-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Find flights from Chicago to Miami",
  "description": "",
  "id": "flights-search;find-flights-from-chicago-to-miami",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters Chicago to from",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user enters Miami as destination",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user enters departing and return dates",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the new tab with flight results should open",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});