package actionsLib;

import cyclosPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserActions {

    public static WebDriver driver;


    public static WebDriver getWebDriver(String curBrowser){

        if(curBrowser.equalsIgnoreCase("CHROME")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(curBrowser.equalsIgnoreCase("FIREFOX")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        return driver;

    }

    public static void SETTEXT(WebElement curElement, String curData) {
        try{

            curElement.sendKeys(curData);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void OPENURL(String data){
        UserActions.driver.get(data);
    }

}
