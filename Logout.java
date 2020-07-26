package Tests;

import Setup.Setup_2;
import org.openqa.selenium.By;

import java.awt.*;

/**
 * Created by DELL on 20/11/2019.
 */
public class Logout {
    public static boolean Logout() throws InterruptedException, AWTException {
        try{
            Setup_2.driver.findElement(By.xpath("//*[@text='Profile']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Logout']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='YES']")).click();
            Thread.sleep(2000);
            return true;
        }
        catch (Exception e)
        {
        return false;
        }
    }
}
