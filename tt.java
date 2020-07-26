package Tests;

import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tt {


    @Test
    public void testUntitled() throws InterruptedException, ClassNotFoundException, SQLException {
      //  driver.findElement(By.xpath("//*[@text='mm-dev']")).click();
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        java.sql.Connection conn = DriverManager.getConnection("jdbc:sqlserver://52.136.193.199;database=MobiMatterOrderStaging","ahmedjalal","mymobimattersuperawesomepassword123#");
        Statement st = conn.createStatement();
        String Sql = "select * from [Order] where Id='445'";
        ResultSet rs = st.executeQuery(Sql);
        while (rs.next()) {
            System.out.println(rs.getString("ProviderName"));
        }
    }


}