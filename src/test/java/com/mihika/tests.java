package com.mihika;

import com.mihika.config.ConfigFactory;
import com.mihika.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tests {

    @Test

    public void testlogin()
    {
        System.out.println(ConfigFactory.getConfig().browser());
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.co.in");
        driver.quit();
    }

}
