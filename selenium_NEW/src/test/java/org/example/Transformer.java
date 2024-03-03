package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URL;

public class Transformer {

    WebDriver driver;
    @Test()
    public void properties(){
//        driver=new FirefoxDriver();
        URL url=new URL("http://localhost:4444/");



        DesiredCapabilities cap=new DesiredCapabilities();

        cap.setBrowserName("chrome");

        RemoteWebDriver driver=new RemoteWebDriver(url, cap);
        driver.get("https://www.google.com/");
        driver.quit();

    }


    }

