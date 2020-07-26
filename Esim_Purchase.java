package Tests;

import Setup.Setup_2;
import com.sun.javafx.css.StyleCacheEntry;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static io.appium.java_client.android.AndroidKeyCode.KEYCODE_AT;

/**
 * Created by DELL on 20/11/2019.
 */
public class Esim_Purchase {
    public static String str1;
    public static String str2;
    public static String str3;
    public static String str6;
    public static String str8;
    public static String str10;
    public static String str30;
    public static boolean Esim_Purchase() throws InterruptedException, AWTException {
        try {
            Setup_2.driver.findElement(By.xpath("//*[@text='mm-dev']")).click();
            Thread.sleep(13000);

            Setup_2.driver.findElement(By.xpath("//*[@text='Travel eSIMs']")).click();
            Thread.sleep(3000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Show offers']")).click();
            Thread.sleep(8000);
         /*   org.openqa.selenium.Dimension dimensions10 = Setup_2.driver.manage().window().getSize();
            int Startpoint10 = (int) (dimensions10.getHeight() * 0.5);
            int scrollEnd10 = (int) (dimensions10.getHeight() * 0.25);
            Setup_2.driver.swipe(0, Startpoint10, 0, scrollEnd10, 2000);*/
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Europe 1 GB']")).click();
            Thread.sleep(8000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Add to cart']")).click();
            Thread.sleep(30000);
            Setup_2.driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.widget.EditText'])[1]")).click();
            Setup_2.driver.pressKeyCode(29);
            Setup_2.driver.pressKeyCode(40);
            Setup_2.driver.pressKeyCode(37);
            Setup_2.driver.pressKeyCode(100);
            //   Setup_2.driver.findElement(By.xpath("//*[@id='icon' and ./parent::*[./parent::*[@id='key_pos_ime_action']] and ./preceding-sibling::*[@class='android.widget.ImageView']]")).click();
            Thread.sleep(2000);
          /*  Setup_2.driver.findElement(By.xpath("//*[@class='android.view.ViewGroup' and @width>0 and @height>0 and ./*[@text='--'] and ./*[@text='Data-only SIM. Supports all major VoIP and messaging apps for voice and video calls']]")).setValue("Ali");
           // Setup_2.driver.findElement(By.xpath("//*[@class='android.view.ViewGroup' and @width>0 and ./*[@text='--'] and ./*[@text='Data-only SIM. Supports all major VoIP and messaging apps for voice and video calls']]")).sendKeys("Usman");
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='host' and ./parent::*[./parent::*[@id='key_pos_1_0']]]]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='host' and ./parent::*[./parent::*[@id='key_pos_1_8']]]]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_0_7']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='icon' and ./parent::*[./parent::*[@id='key_pos_ime_action']] and ./preceding-sibling::*[@class='android.widget.ImageView']]")).click();*/
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.widget.EditText'])[2]")).click();
            Thread.sleep(2000);
          /*  Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_0_6']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_1_1']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_2_7']]")).click();

            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='host' and ./parent::*[./parent::*[@id='key_pos_1_0']]]]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_2_6']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_bottom_symbol_1']]")).click();

            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_1_4']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='host' and ./parent::*[./parent::*[@id='key_pos_1_8']]]]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_0_8']]")).click();

            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_0_1']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_1_3']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_0_7']]")).click();

            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_1_1']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_1_5']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='host' and ./parent::*[./parent::*[@id='key_pos_1_8']]]]")).click();

            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='host' and ./parent::*[./parent::*[@id='key_pos_1_0']]]]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_2_5']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_1_1']]")).click();

            Setup_2.driver.findElement(By.xpath("//*[@id='label_bottom']")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_2_3']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_0_8']]")).click();

            Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_2_7']]")).click();
            Setup_2.driver.findElement(By.xpath("//*[@id='icon' and ./parent::*[./parent::*[@id='key_pos_ime_action']] and ./preceding-sibling::*[@class='android.widget.ImageView']]")).click();
*/
            Setup_2.driver.pressKeyCode(49);
            Setup_2.driver.pressKeyCode(47);
            Setup_2.driver.pressKeyCode(41);
            Setup_2.driver.pressKeyCode(29);
            Setup_2.driver.pressKeyCode(42);

            Setup_2.driver.pressKeyCode(KEYCODE_AT);
            // Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_switch_to_symbol']]")).click();
            // Thread.sleep(2000);
            // Setup_2.driver.findElement(By.xpath("//*[@id='label' and ./parent::*[@id='key_pos_1_0']]")).click();


            Setup_2.driver.pressKeyCode(35);
            Setup_2.driver.pressKeyCode(40);
            Setup_2.driver.pressKeyCode(43);
            Setup_2.driver.pressKeyCode(51);
            Setup_2.driver.pressKeyCode(34);
            Setup_2.driver.pressKeyCode(37);
            Setup_2.driver.pressKeyCode(47);
            Setup_2.driver.pressKeyCode(36);
            Setup_2.driver.pressKeyCode(40);
            Setup_2.driver.pressKeyCode(29);
            Setup_2.driver.pressKeyCode(30);
            Setup_2.driver.pressKeyCode(47);
            Setup_2.driver.pressKeyCode(56);
            Setup_2.driver.pressKeyCode(31);
            Setup_2.driver.pressKeyCode(43);
            Setup_2.driver.pressKeyCode(41);

            Setup_2.driver.pressKeyCode(100);
            Thread.sleep(10000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Proceed']")).click();
            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Confirm']")).click();
            Thread.sleep(10000);
            Setup_2.driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@text and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']])[1]")).click();
            Thread.sleep(2000);
            //Setup_2.driver.findElement(By.xpath("//*[@text='Pay with a credit/debit card']")).click();
            Thread.sleep(20000);
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
            Thread.sleep(4000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Submit' and @class='android.widget.Button']")).click();
            Thread.sleep(25000);

            String str4=Setup_2.driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./preceding-sibling::*[@class='android.view.ViewGroup'] and ./parent::*[./preceding-sibling::*[./*[@class='android.view.ViewGroup']]]]]/*[@class='android.view.ViewGroup'])[2]/*[@text and @class='android.widget.TextView' and @height>0])[4]")).getText().toString();
            String str5=Setup_2.driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./preceding-sibling::*[@class='android.view.ViewGroup'] and ./parent::*[./preceding-sibling::*[./*[@class='android.view.ViewGroup']]]]]/*[@class='android.view.ViewGroup'])[2]/*[@text and @class='android.widget.TextView' and @height>0])[8]")).getText().toString();
            org.openqa.selenium.Dimension dimensions2 = Setup_2.driver.manage().window().getSize();
            System.out.println(str4);
            System.out.println(str5);
            int Startpoint2 = (int) (dimensions2.getHeight() * 0.50);
            int scrollEnd2 = (int) (dimensions2.getHeight() * 0.25);
            Setup_2.driver.swipe(0, Startpoint2, 0, scrollEnd2, 2000);


            org.openqa.selenium.Dimension dimensions3 = Setup_2.driver.manage().window().getSize();
            int Startpoint3 = (int) (dimensions3.getHeight() * 0.50);
            int scrollEnd3 = (int) (dimensions3.getHeight() * 0.25);
            Setup_2.driver.swipe(0, Startpoint3, 0, scrollEnd3, 2000);


            org.openqa.selenium.Dimension dimensions4 = Setup_2.driver.manage().window().getSize();
            int Startpoint4 = (int) (dimensions4.getHeight() * 0.50);
            int scrollEnd4 = (int) (dimensions4.getHeight() * 0.25);
            Setup_2.driver.swipe(0, Startpoint4, 0, scrollEnd4, 2000);

            org.openqa.selenium.Dimension dimensions5 = Setup_2.driver.manage().window().getSize();
            int Startpoint5 = (int) (dimensions5.getHeight() * 0.50);
            int scrollEnd5 = (int) (dimensions5.getHeight() * 0.25);
            Setup_2.driver.swipe(0, Startpoint5, 0, scrollEnd5, 2000);

            Thread.sleep(2000);
            Setup_2.driver.findElement(By.xpath("//*[@text='Browse more products']")).click();
            Thread.sleep(2000);



            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:sqlserver://52.136.193.199;database=MobiMatterOrderStaging", "ahmedjalal", "mymobimattersuperawesomepassword123#");
            Statement st = conn.createStatement();
            //  String Sql = "select * from [Order] where Id=(select MAX(Id) from [Order])";
            String Sql = "select * from [Order] where Id="+str4;
            ResultSet rs = st.executeQuery(Sql);



            while (rs.next()) {
                System.out.println(rs.getString("ItemId"));
                str1=rs.getString("ItemId");
            }
            rs = st.executeQuery(Sql);
            while (rs.next()) {
                System.out.println(rs.getString("UserName"));
                str2=rs.getString("UserName");
            }
            rs = st.executeQuery(Sql);
            while (rs.next()) {
                System.out.println(rs.getString("Email"));
                str3=rs.getString("Email");
            }

            rs = st.executeQuery(Sql);
            while (rs.next()) {
                System.out.println(rs.getString("Status"));
                str30=rs.getString("Status");
            }

            String Sql2 = "select * from [Payment] where OrderId="+str4;
            rs = st.executeQuery(Sql2);

            while (rs.next()) {
                System.out.println(rs.getString("Amount"));
                str8=rs.getString("Amount");
                String str7[]=str5.split(" ");
                if(str7[1].contains("."))
                {
                    str6=str7[1];
                }
                else
                {
                    str6=str7[1]+".00";
                }
            }
            rs = st.executeQuery(Sql2);
            while (rs.next()) {
                System.out.println(rs.getString("Status"));
                str10=rs.getString("Status");
            }
            //   String str20[]=str10.split("\\n");
            //     System.out.println(str20[1]);
            System.out.println("Hello"+str8);
            System.out.println("Hello"+str6);
            System.out.println("Hello"+str4);

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection conn20 = DriverManager.getConnection("jdbc:sqlserver://52.136.193.199;database=MobiMatterProductInventoryStaging", "ahmedjalal", "mymobimattersuperawesomepassword123#");
            Statement st20 = conn20.createStatement();
            System.out.println("Hello"+str4);
            //  String Sql = "select * from [Order] where Id=(select MAX(Id) from [Order])";
            String Sql20 = "select * from [Inventory] where ReserverId="+str4;


String str220=null;

            ResultSet rs20 = st20.executeQuery(Sql20);
            while (rs20.next()) {
                System.out.println(rs20.getString("State"));
                str220=rs20.getString("State");
            }



            System.out.println(str220);
            String str330=null;

            rs20 = st20.executeQuery(Sql20);

            while (rs20.next()) {
                System.out.println(str220);
                System.out.println(rs20.getString("ProductId"));
                str330=rs20.getString("ProductId");
            }

            String Sql40 = "select * from [Product] where Id="+str330;
            ResultSet rs40 = st20.executeQuery(Sql40);

            String str440=null;

            rs40 = st20.executeQuery(Sql40);
            while (rs40.next()) {
                System.out.println(rs40.getString("Tittle"));
                str440=rs40.getString("Tittle");
            }



            if(str1!=""&&str2.equalsIgnoreCase("ali")&&str3.equalsIgnoreCase("usman@glowfishlabs.com")&&str8.equalsIgnoreCase(str6)&&str10.contains("CAPTURE")&&str30.equalsIgnoreCase("COMPLETED")&&str220.equalsIgnoreCase("SOLD")&&str440.equalsIgnoreCase("Europe 1 GB")) {
                return true;
            }
            else
            {
                return false;
            }
            }
    catch(Exception e)
    {
    return false;
    }
    }
    }