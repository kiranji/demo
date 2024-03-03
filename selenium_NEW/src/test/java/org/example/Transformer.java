package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Transformer {

    WebDriver driver;
    @Test()
    public void properties(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();

    }


    }

