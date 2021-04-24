package cyclosPages;

import actionsLib.UserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    public static WebElement userid= UserActions.driver.findElement(By.xpath("//input[@autocomplete='username']"));
    public static WebElement password= UserActions.driver.findElement(By.xpath("//input[@autocomplete='password']"));
    public static WebElement submit_btn= UserActions.driver.findElement(By.xpath("//span[text()='Submit']"));


    /*
    @FindBy(xpath="//input[@autocomplete='username']")
    WebElement userid;
    @FindBy(xpath="//input[@autocomplete='password']")
    WebElement password;
    @FindBy(xpath="//span[text()='Submit']")
    WebElement submit_btn;
    */
    /*
    public LoginPage(WebDriver driver){
        this.driver = driver;

        //PageFactory.initElements(driver, this);

    }

    public void cyclosLogin()
    {
        try {

            driver.get("https://demo.cyclos.org/ui/login");
            Thread.sleep(6000);
            //WebDriverWait wait = new WebDriverWait(driver,15);
            //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@autocomplete='username']"))));
            //userid.sendKeys("demo");
            //password.sendKeys("1234");
            //submit_btn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    */

}
