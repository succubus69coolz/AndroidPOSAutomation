package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dhimas Adiyasa Wirawan on 11/29/2015.
 */
public class AppGatePage extends BasePage{
    By signInButton = By.id(app_package_name+"goToSignIn");

    public AppGatePage(WebDriver driver) {
        super(driver);
    }

    public AppGatePage accessLogin(){
        waitForVisibilityOf(signInButton);
        driver.findElement(signInButton).click();

        return new AppGatePage(driver);
    }
}
