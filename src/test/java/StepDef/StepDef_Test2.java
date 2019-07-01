package StepDef;

import EndUser.EndUser_Test1;
import EndUser.EndUser_Test2;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:TestTwo.feature")
public class StepDef_Test2 {

    @Steps
    EndUser_Test2 enduser;
    @Given("^site -  (.*)")
    public void site_https_dog_ceo_dog_api(String url) {
         enduser.site_https_dog_ceo_dog_api(url);
    }


    @Then("^Perform an API request to produce a list of all dog breeds$")
    public void perform_an_API_request_to_produce_a_list_of_all_dog_breeds() {
        enduser.perform_an_API_request_to_produce_a_list_of_all_dog_breeds();

    }

    @Then("^Using code verify retriever breed is within the list$")
    public void using_code_verify_retriever_breed_is_within_the_list() {
        enduser.using_code_verify_retriever_breed_is_within_the_list();

    }

    @Then("^Perform an API request to produce a list of sub-breeds for retriever$")
    public void perform_an_API_request_to_produce_a_list_of_sub_breeds_for_retriever() {
        enduser.perform_an_API_request_to_produce_a_list_of_sub_breeds_for_retriever();

    }

    @Then("^Perform an API request to produce a random image  link for the subbreed golden$")
    public void perform_an_API_request_to_produce_a_random_image_link_for_the_subbreed_golden() {
        enduser.perform_an_API_request_to_produce_a_random_image_link_for_the_subbreed_golden();

    }




}
