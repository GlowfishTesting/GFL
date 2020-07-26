package Tests;

import Setup.Setup_2;
import org.openqa.selenium.By;

import java.awt.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by DELL on 01/04/2020.
 */
public class Tokenized_Topup {


    public static String str1;
    public static String str2;
    public static String str3;
    public static String str6;
    public static String str8;
    public static String number;
    public static boolean Topup() throws InterruptedException, AWTException, ClassNotFoundException, SQLException {
        try {
            Setup_2.driver.findElement(By.xpath("//*[@text='Recharge']")).click();
            Thread.sleep(5000);
        /*    Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @width>0 and @height>0 and ./parent::*[@class='android.view.ViewGroup'] and ./preceding-sibling::*[@class='android.view.ViewGroup']]")).click();
            Thread.sleep(2000);

            Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./preceding-sibling::*[@class='android.widget.ImageView']]")).sendKeys("Indonesia");
            Thread.sleep(2000);

            Setup_2.driver.findElement(By.xpath("//*[@text='Indonesia' and @class='android.widget.TextView']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("8123456710");*/
        Setup_2.driver.findElement(By.xpath("//*[@text='+971551305099']")).click();

            Thread.sleep(1000);
         //   Setup_2.driver.findElement(By.xpath("//*[@text='Proceed']")).click();
            Thread.sleep(9000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Choose amount' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]")).click();

            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='AED 5']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Proceed to pay (AED 6)']")).click();
            Thread.sleep(2000);
            /*Setup_2.driver.findElement(By.xpath("//*[@text='New Credit/Debit Card']")).click();
            Thread.sleep(16000);
            Setup_2.driver.findElement(By.xpath("//*[@id='cardNumber']")).sendKeys("5123456789012346");
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@text='MM']")).click();
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@text='05']")).click();
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@text='YY']")).click();
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@text='21']")).click();
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@id='cardHolderName']")).sendKeys("Ahmed");
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@id='csc']")).sendKeys("000");
            Thread.sleep(1000);
            Setup_2.driver.findElement(By.xpath("//*[@text='3 digits on back of your card']")).click();
            Thread.sleep(2000);
            org.openqa.selenium.Dimension dimensions = Setup_2.driver.manage().window().getSize();
            int Startpoint = (int) (dimensions.getHeight() * 0.5);
            int scrollEnd = (int) (dimensions.getHeight() * 0.25);
            Setup_2.driver.swipe(0, Startpoint, 0, scrollEnd, 2000);
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Pay now']")).click();
            Thread.sleep(5000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Submit' and @class='android.widget.Button']")).click();
            Thread.sleep(19000);*/
            Setup_2.driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./preceding-sibling::*[@class='android.view.ViewGroup'] and ./parent::*[./preceding-sibling::*[./*[@class='android.view.ViewGroup'] and ./*[./*[@text='Payment method']]]]]]/*/*/*[@text='2346'])[1]")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("000");
            Setup_2.driver.findElement(By.xpath("//*[@text='Pay']")).click();

            Thread.sleep(21000);
            //Setup_2.driver.findElement(By.xpath("//*[@text='Manage']")).click();
            Thread.sleep(2000);
            //  Setup_2.driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @width>0 and @height>0 and ./parent::*[./parent::*[@contentDescription='Back, back' and ./parent::*[./parent::*[./following-sibling::*[./*[@text='Pay']]]]]]]")).click();
            Thread.sleep(2000);
            String str4=Setup_2.driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./preceding-sibling::*[@class='android.view.ViewGroup'] and ./parent::*[./parent::*[@class='android.view.ViewGroup'] and ./preceding-sibling::*[./*[@class='android.view.ViewGroup']]]]]/*[@class='android.view.ViewGroup'])[2]/*[@text and @class='android.widget.TextView' and @height>0])[3]")).getText().toString();
            String str5=Setup_2.driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup'])[2]/*[@text])[8]")).getText().toString();
            Setup_2.driver.findElement(By.xpath("//*[@text='Browse more products']")).click();
            Thread.sleep(2000);

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:sqlserver://52.136.193.199;database=MobiMatterOrderStaging", "ahmedjalal", "mymobimattersuperawesomepassword123#");
            Statement st = conn.createStatement();
            String Sql = "select * from [Order] where Id="+str4;
            ResultSet rs = st.executeQuery(Sql);



            while (rs.next()) {
                System.out.println(rs.getString("Number"));
                number=rs.getString("Number");
            }

            String Sql2 = "select * from [Payment] where OrderId="+str4;
            rs = st.executeQuery(Sql2);

            while (rs.next()) {
                System.out.println(rs.getString("Amount"));
                str8=rs.getString("Amount");
                String str7[]=str5.split(" ");
                if(str7[1].contains("."))
                {
                    str6=str7[1]+"0";
                }
                else
                {
                    str6=str7[1]+".00";
                }
            }
            System.out.println(str6);
            System.out.println(str8);

            if(number.equalsIgnoreCase("+971551305099")&&str6.equalsIgnoreCase(str8)) {
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }
}
