package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AppGatePage;
import pages.LoginPage;

/**
 * Created by Dhimas Adiyasa Wirawan on 11/29/2015.
 */
public class AppiumSuiteTest extends AndroidConfig {
    @BeforeClass
    public void setUp() throws Exception{
        prepareAppiumAndroid();
    }

    @AfterClass
    public void tearDown() throws Exception{
        driver.quit();
    }

    @Test
    public void invalidLoginTest() throws InterruptedException{
        new AppGatePage(driver).accessLogin();
        new LoginPage(driver).invalidLogin();
    }
}
