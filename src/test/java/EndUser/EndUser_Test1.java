package EndUser;

import GlobalFunctions.User;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EndUser_Test1
{


    private WebDriver driver;
    private String fName  =  null;
    private List<String>   dataLoaded= new ArrayList<>();
    Map<String,String> userData = null;
@Step



    public void navigate_to_http_www_way_automation_com_angularjs_protractor_webtables(String url) {


        //initialize driver
        this.driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertNotNull(driver);
        //dedicated site
        driver.get(url);
        driver.manage().window().maximize();


    }


    public void validate_that_you_are_on_the_User_List_Table() {

   String columnName  = driver.findElement(By.xpath("/html/body/table/thead/tr[3]/th[1]/span")).getText();
   System.out.println("Page Validation   :"+ columnName);

   //validate that you are on table  by asserting
        assertEquals("First Name",columnName);
    }


    public void click_Add_user() {


    }

    public void add_users_with_the_following_details()
    {

    }



    public void ensure_that_User_Name_is_unique_on_each_run(DataTable dataTable)
    {
        //convert datatable to object list
        List<User> userData  =  dataTable.asList(User.class);

       // DataTable tableData = null;
      //  userData =  tableData.asMap(String.class,String.class );

        //loop through object to insert
        for (User userInfo : userData)
        {
            //add new user btn
            driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button")
            ).click();

            //switch to active element
                    driver.switchTo().activeElement();
                    //String modaltext  = driver.findElement(By.xpath("/html/body/div[3]/div[1]/h3")).getText();
                    String modaltext  = driver.findElement(By.xpath("//h3[contains(text(),'Add User')]")).getText();
                    System.out.println("Page Modal text : "+ modaltext);
                    assertEquals("Add User",modaltext);

                    //fname
                    fName =userInfo.getfName();
                    System.out.println("Name :"+fName);
                    dataLoaded.add(fName);

            WebElement elem=null;

            /*
            * Load data to form
            * */
            elem = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
            elem.clear();
            elem.sendKeys(fName);

                    //lname
            elem = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
            elem.clear();
            elem .sendKeys(userInfo.getlName());

                    //uname
            elem = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
            elem.clear();
            elem.sendKeys(userInfo.getuName());
                    //password
            elem =  driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
            elem.clear();
            elem.sendKeys(userInfo.getuPass());

                    //Customer type
                    if(userInfo.getCustomerType().equals("Company AAA"))
                    {
                        System.out.println("AAA :"+userInfo.getCustomerType());


                        elem =   driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input"));
                        elem.click();
                    }else{
                        System.out.println("BBB :"+userInfo.getCustomerType());

                        elem = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input"));
                        elem.click();
                    }

                    //role
                    Select gender = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select")));
                    gender.selectByVisibleText(userInfo.getRole());
                    //email
                    elem = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input"));elem.clear();
                    elem.sendKeys(userInfo.getEmail());
                            //cellphone
                    elem =     driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input"));elem.clear();
                    elem.sendKeys(userInfo.getCell());

                              //save btn
                    elem =       driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]"));
                    elem.click();


                     driver.switchTo().defaultContent();


                    }


}

    public void ensure_that_your_users_are_added_to_the_list() {


    //verify the user entered are all in the  table
        System.out.println("Data Count :"+dataLoaded.size());
        for(int i = 0; i < dataLoaded.size(); i++)
        {
            System.out.println("iteration NO :"+i);
            String getName  =    driver.findElement(By.xpath("/html/body/table/tbody/tr["+(i+1)+"]/td[1]")).getText();
            System.out.println("Name Found  :"+getName);
            assertEquals(dataLoaded.contains(getName),true);
        }

        driver.close();




    }
}
