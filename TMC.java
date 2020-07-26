package Tests;

import Setup.Setup_2;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by DELL on 20/01/2020.
 */
public class TMC {
    public static String accessKey = "nzXykEprgJte3t6FJdx4";
    public static String userName = "usman122";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "iPhone 11 Pro Max");
        caps.setCapability("os_version", "13");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "My First Build");
        caps.setCapability("name", "Bstack-[Java] Sample Test");
        caps.setCapability("app", "bs://f8804659398f4770587d287427060ea779ce36f4");


        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);

      //  Thread.sleep(9000);
        driver.findElement(By.id("Allow")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Skip")).click();
        Thread.sleep(2000);
        driver.findElements(By.className("button")).get(30).click();
        Thread.sleep(2000);
        driver.findElements(By.className("button")).get(27).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Travel eSIMs & Roaming offers")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Show Offers")).click();
        Thread.sleep(2000);
        driver.findElements(By.className("button")).get(40).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Buy")).click();
         Thread.sleep(10000);
        driver.findElement(By.id("John Appleseed")).click();
        driver.findElement(By.id("John Appleseed")).sendKeys("Ali");
        driver.findElement(By.id("john@appleseed.com")).click();
        driver.findElement(By.id("john@appleseed.com")).sendKeys("usman@glowfishlabs.com");
        driver.hideKeyboard();
        driver.findElement(By.id("Proceed")).click();


        Thread.sleep(2000);
        driver.findElements(By.className("button")).get(10).click();
       // driver.findElement(By.id("Credit/Debit Card")).click();

      ////  driver.findElement(By.name("Continue as guest")).click();
//driver.findElement(By.xpath("//*[@text='mm-dev']")).click();
    /* Write your Custom code here */
        Thread.sleep(20000);

      driver.findElements(By.className("textbox")).get(30).click();
        Thread.sleep(20000);
        driver.quit();
    }
}