package Tests;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;

/**
 * Created by usman on 02/07/2019.
 */
public class Stud {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "ce11160bc84c142205");
    //    driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
    }

    @Test
    public void testUntitled() throws MalformedURLException {
     //   driver.findElement(By.xpath("//*[@id='iconview_imageView' and @width>0 and ./parent::*[@contentDescription='mobimatter']]")).click();
       // driver.findElement(By.xpath("//*[@id='iconview_imageView' and @width>0 and ./parent::*[@contentDescription='mobimatter']]")).click();
        dc.setCapability("appPackage","com.mobimatter");
        dc.setCapability("appActivity","com.mobimatter.MainActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
