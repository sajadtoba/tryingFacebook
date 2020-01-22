package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver =null;


    @BeforeMethod
    @Parameters({"url"})
    public void setUp() {
        System.setProperty("WebDriver.chrome",
                "/Users/sajadakbar/Documents/develop/SeleniumJuly2019/saFrameWork/Generic/src/main/java/driver/chromedriver");
        this.driver= new ChromeDriver();
        this.driver.manage().window().fullscreen();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }



    @AfterMethod
    public  void cleanUp(){

    }


}
