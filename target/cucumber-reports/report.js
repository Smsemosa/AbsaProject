$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestTwo.feature");
formatter.feature({
  "name": "API Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "DOG API TEST",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "site -  https://dog.ceo/api/",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef_Test2.site_https_dog_ceo_dog_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Perform an API request to produce a list of all dog breeds",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef_Test2.perform_an_API_request_to_produce_a_list_of_all_dog_breeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Using code verify retriever breed is within the list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef_Test2.using_code_verify_retriever_breed_is_within_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Perform an API request to produce a list of sub-breeds for retriever",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef_Test2.perform_an_API_request_to_produce_a_list_of_sub_breeds_for_retriever()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Perform an API request to produce a random image  link for the subbreed golden",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef_Test2.perform_an_API_request_to_produce_a_random_image_link_for_the_subbreed_golden()"
});
formatter.result({
  "status": "passed"
});
});