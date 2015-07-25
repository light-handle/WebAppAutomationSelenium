package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminAppLoginPage {
    private WebDriver driver = null;

    public AdminAppLoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By USERNAME_FIELD_ID = By.id("UserName");
    By PASSWORD_FIELD_ID = By.id("Password");
    By LOGINBUTTON_FIELD_ID = By.cssSelector(".btn-block");

    public void OpenAdminApp(String Url)
    {
       // driver.get(Url);
        driver.navigate().to(Url);
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }

    public void SetUserName(String userName)
    {
        System.out.println("UserName " + USERNAME_FIELD_ID);
        driver.findElement(USERNAME_FIELD_ID).sendKeys(userName);
    }

    public void SetPassword(String password)
    {
        driver.findElement(PASSWORD_FIELD_ID).sendKeys(password);
    }
    public void Login()
    {
        driver.findElement(LOGINBUTTON_FIELD_ID).click();
    }
}
