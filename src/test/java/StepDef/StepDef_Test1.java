package StepDef;

import EndUser.EndUser_Test1;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:TestOne.feature")
public class StepDef_Test1 {

    @Steps
    private
    EndUser_Test1 enduser;
    @Given("^Navigate to - (.*)$")
    public void navigate_to_http_www_way_automation_com_angularjs_protractor_webtables(String url) {
        System.out.println(url);
        enduser.navigate_to_http_www_way_automation_com_angularjs_protractor_webtables(url);
    }

    @Then("^Validate that you are on the User List Table$")
    public void validate_that_you_are_on_the_User_List_Table() {
        enduser.validate_that_you_are_on_the_User_List_Table();
    }

    @Then("^Click Add user$")
    public void click_Add_user() {
        enduser.click_Add_user();
    }

    @Then("^Add users with the following details:$")
    public void add_users_with_the_following_details() {
        enduser.add_users_with_the_following_details();
    }

    @Then("^Ensure that User Name is unique on each run$")
    public void ensure_that_User_Name_is_unique_on_each_run(DataTable dataTable ) {


        enduser.ensure_that_User_Name_is_unique_on_each_run( dataTable);
    }

    @Then("^Ensure that your users are added to the list$")
    public void ensure_that_your_users_are_added_to_the_list() {
        enduser.ensure_that_your_users_are_added_to_the_list();
    }


}
