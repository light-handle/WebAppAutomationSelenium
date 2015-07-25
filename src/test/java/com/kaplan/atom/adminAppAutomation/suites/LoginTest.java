package com.kaplan.atom.adminAppAutomation.suites;


import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AdminAppLoginPage;

import java.util.List;
import java.util.Set;

public class LoginTest {

    final String Url = "https://qa.atom.ktp.io/StudyPlanAdmin";

    AdminAppLoginPage loginPage = null;

    private static WebDriver driver = null;

    @BeforeClass(alwaysRun = true)
    public void setDriver()
    {
        driver = new FirefoxDriver();

        loginPage = new AdminAppLoginPage(driver);
    }

    @Test
    public void LoginInAdminApp()
    {
        loginPage.OpenAdminApp(Url);
        loginPage.SetUserName("abot");
        loginPage.SetPassword("8ufRAbRa");
        loginPage.Login();
    }

}
