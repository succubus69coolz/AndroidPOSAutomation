package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Dhimas Adiyasa Wirawan on 11/29/2015.
 */
public class LoginPage extends BasePage{
    By userEmail = By.id(app_package_name+"email");
    By userPass = By.id(app_package_name+"password");
    By LoginButton = By.id(app_package_name+"signInButton");
    By Title = By.id(app_package_name+"title");
    By Content = By.id(app_package_name+"content");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage invalidLogin(){
        // Sign In Screen
        waitForVisibilityOf(userEmail);
        driver.findElement(userEmail).sendKeys("dhimas23staging@mailinator.co.id");
        driver.findElement(userPass).sendKeys("123456");
        driver.findElement(LoginButton).click();
        waitForVisibilityOf(Title);
        String ErrTitle = driver.findElement(Title).getText();
        String ErrContent = driver.findElement(Content).getText();
        Assert.assertEquals(ErrTitle,"Error");// Check Error Title
        Assert.assertEquals(ErrContent,"Unable to get response from the server");// Check Error Content

        return new LoginPage(driver);
    }


}
