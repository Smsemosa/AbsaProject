package EndUser;

import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EndUser_Test2
{

    private Map<String, String> endPoint = new HashMap<String, String>();

    private String baseUrl = null;
    private Map messagesData=null;

    @Step
    public void site_https_dog_ceo_dog_api(String url) {


        //setup end points
        endPoint.put("listallDogbreeds", "breeds/list/all");
        endPoint.put("listofsubbreeds", "breed/retriever/list");
        endPoint.put("goldenDog", "breed/retriever/golden/images/random");
        baseUrl= url;

    }



    public void perform_an_API_request_to_produce_a_list_of_all_dog_breeds()
    {
        RestAssured.baseURI = baseUrl;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(endPoint.get("listallDogbreeds"));
        int statuscode  =    response.getStatusCode();


        System.err.println("_______________________________________________________Diagram 1_____________________________________________________________________________");
        System.out.println("Status Code  message  : "+statuscode);
        if(statuscode == 200)
        {
            System.out.println("Reponse message  : "+response.asString());

                try
                {
                    Object obj = new JSONParser().parse(response.asString());

                    // typecasting obj to JSONObject
                    JSONObject jo = (JSONObject) obj;
                    //drill into response
                    messagesData = ((Map)jo.get("message"));
                }
                catch(Exception ex)
                {
                    System.out.println("Message  : "+ex.getMessage());
                }

        }
        else
        {
            System.err.println("Error message  : "+response.asString());
        }




    }

    public void using_code_verify_retriever_breed_is_within_the_list() {
        System.err.println("____________________________________________________________Diagram 2________________________________________________________________________");

        //verify item exists
       boolean state  =   messagesData.containsKey("retriever");
       if(state)
       {
           System.out.println("retriever  : Exists");
       }
    }

    public void perform_an_API_request_to_produce_a_list_of_sub_breeds_for_retriever() {

        RestAssured.baseURI = baseUrl;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(endPoint.get("listofsubbreeds"));
        int statuscode  =    response.getStatusCode();
        System.err.println("____________________________________________________________Diagram 3________________________________________________________________________");

        System.out.println("Status Code  message  : "+statuscode);
        if(statuscode == 200) {
            System.out.println("Reponse message  : "+response.asString());

        }
    }

    public void perform_an_API_request_to_produce_a_random_image_link_for_the_subbreed_golden() {

        RestAssured.baseURI = baseUrl;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(endPoint.get("goldenDog"));
        int statuscode  =    response.getStatusCode();
        System.err.println("_______________________________________________________Diagram 4_____________________________________________________________________________");


        //print response
        System.out.println("Status Code  message  : "+statuscode);
        if(statuscode == 200)
        {
            System.out.println("Reponse message  : "+response.asString());

        }
        else
        {
            System.err.println("Error message  : "+response.asString());
        }
    }



}
