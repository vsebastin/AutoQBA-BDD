package cyclosSteps;

import actionsLib.UserActions;
import cyclosPages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cyclosSteps {


    @Before
    public void setup(){
        UserActions.driver = UserActions.getWebDriver("chrome");
    }
    @Given("user in the home page")
    public void user_in_the_home_page() {
        try {
            UserActions.OPENURL("https://demo.cyclos.org/ui/login");
            Thread.sleep(9000);
            UserActions.SETTEXT(LoginPage.userid, "demo");
            UserActions.SETTEXT(LoginPage.password, "1234");

            System.out.println("inside home page");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @When("I make payment to existing user")
    public void i_make_payment_to_existing_user() {
        System.out.println("inside payment page");
    }

    @Then("I verify the balance")
    public void i_verify_the_balance() {
        System.out.println("inside verification page");
    }

    @After
    public void teardown(){
        UserActions.driver.quit();
    }

}
