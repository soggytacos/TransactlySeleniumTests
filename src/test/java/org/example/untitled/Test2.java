package org.example.untitled;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
//import org.junit.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase2() throws Exception {
        driver.get("http://local.transactlyapp.com:3000/login");
        try {
            assertEquals("Email", driver.findElement(By.id("email-label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(driver.findElement(By.xpath("//form[@id='loginForm']/button/span")).getText().matches("^Forgot Password[\\s\\S]$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Password2!");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("alissa@transactly.com");
        driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div/div[2]/div[2]/button[2]/span")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Yes, I want to use my TC')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Seller Party')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Listing & Transaction Coordination')]")).click();
        driver.findElement(By.id("address_line_1")).clear();
        driver.findElement(By.id("address_line_1")).sendKeys("1234 Happy Test Street");
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("St. Louis");
        driver.findElement(By.xpath("//div[@name='state']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='state-option-27']/span")).click();
        driver.findElement(By.id("zip")).clear();
        driver.findElement(By.id("zip")).sendKeys("12345");
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiExpansionPanel-root Mui-expanded MuiExpansionPanel-rounded MuiPaper-elevation1 MuiPaper-rounded']//div[5]//div[1]//div[1]//div[1]//button[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
        driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[1]//button[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
        driver.findElement(By.xpath("//input[@name='price']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@name='price']")).clear();
        driver.findElement(By.xpath("//input[@name='price']")).sendKeys("1234567");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
