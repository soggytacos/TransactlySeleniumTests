package org.example.untitled;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGoogle {

    public static void main(String[] args) {
// TODO Auto-generated method stub

//setting the driver executable
//        System.setProperty("webdriver.chrome.driver", "/Users/colman/JUnitTestDemo/selenium-java-3.141.59/client-combined-3.141.59-sources.jar!/org/openqa/selenium/chrome/ChromeDriver.java");

//Initiating your chromedriver
        WebDriver driver=new ChromeDriver();

//Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
        driver.manage().window().maximize();

//open browser with desried URL
        driver.get("http://local.transactlyapp.com:3000/admin/login");

//closing the browser
        driver.close();

    }

}
