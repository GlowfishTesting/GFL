package Tests;

import Setup.Setup_2;
import org.openqa.selenium.By;

import java.awt.*;

/**
 * Created by DELL on 17/12/2019.
 */
public class Live_Topup {
    public static boolean Live_Topup() throws InterruptedException, AWTException {
        try {

            Setup_2.driver.findElement(By.xpath("//*[@text='Recharge']")).click();
            Thread.sleep(5000);
            Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @width>0 and @height>0 and ./parent::*[@class='android.view.ViewGroup'] and ./preceding-sibling::*[@class='android.view.ViewGroup']]")).click();
            Thread.sleep(2000);

            Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./preceding-sibling::*[@class='android.widget.ImageView']]")).sendKeys("Indonesia");
            Thread.sleep(2000);

            Setup_2.driver.findElement(By.xpath("//*[@text='Indonesia' and @class='android.widget.TextView']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("8123456710");
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Proceed']")).click();
            Thread.sleep(6000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Choose Amount' and ./following-sibling::*[@class='android.widget.ImageView']]")).click();

            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='IDR 10000']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Proceed To Pay (AED 0.6)']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Credit/Debit Card']")).click();
            Thread.sleep(16000);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        }

}
