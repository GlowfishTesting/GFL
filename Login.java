package Tests;

import Setup.Setup_2;
import org.openqa.selenium.By;

import java.awt.*;

/**
 * Created by DELL on 19/11/2019.
 */
public class Login {
    public static boolean Test_Drive_Zoho_Verification() throws InterruptedException, AWTException {
        try{
            Setup_2.driver.findElement(By.xpath("//*[@text='mm-dev']")).click();
            Thread.sleep(15000);
            Setup_2.driver.findElement(By.linkText("Profile")).click();
            Thread.sleep(7000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Sign in with Facebook']")).click();
            Thread.sleep(7000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Continue as Glowfish']")).click();
        //   Setup_2.dv.findElement(By.xpath("//*[@name='__CONFIRM__']")).click();
            Thread.sleep(7000);


            Thread.sleep(8000);
           /* Setup_2.driver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys("glowfishtesting@gmail.com");
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@id='m_login_password']")).sendKeys("123456&*(");
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Log In']")).click();
            Thread.sleep(5000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Continue']")).click();
            Thread.sleep(10000);*/
            Setup_2.driver.findElement(By.xpath("//*[@text='Home']")).click();
            Thread.sleep(25000);
            return true;
        }
catch (Exception e)
{
return false;
}
    }
    }
