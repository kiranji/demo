package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class Transformer {

    WebDriver driver;
    @Test()
    public void properties() throws MalformedURLException {
//        driver=new FirefoxDriver();  //http://localhost:4444/grid/console http://100.27.27.68:4444/
        URL url=new URL("http://100.27.27.68:4444/");



        DesiredCapabilities cap=new DesiredCapabilities();

        cap.setBrowserName("chrome");

        RemoteWebDriver driver=new RemoteWebDriver(url, cap);
//        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("PRINTING PAGE TITLE");
        System.out.println(driver.getTitle());
        driver.quit();

    }


    }

