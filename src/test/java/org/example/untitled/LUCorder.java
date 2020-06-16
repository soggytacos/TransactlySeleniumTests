package org.example.untitled;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LUCorder {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLUCorder() throws Exception {
        driver.get("http://local.transactlyapp.com:3000/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("clayton@transactly.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Password2!");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-new-transaction")).click();
        driver.findElement(By.id("yes-tc")).click();
        driver.findElement(By.id("seller-party")).click();
        driver.findElement(By.id("yes-luc")).click();
        driver.findElement(By.id("address_line_1")).sendKeys("1 Listing Under Contract Order");
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("St. Louis");
        driver.findElement(By.id("zip")).clear();
        driver.findElement(By.id("zip")).sendKeys("12345");
        driver.findElement(By.xpath("//div[@name='state']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li/span")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("//button[3]/span")).click();
        driver.findElement(By.id("listing-details")).click();
        assertTrue(isElementPresent(By.id("back-upload-documents")));
        driver.findElement(By.id("next-upload-documents")).click();
        driver.findElement(By.id("offer_amt")).clear();
        driver.findElement(By.id("offer_amt")).sendKeys("100");
        driver.findElement(By.id("earnest_money")).clear();
        driver.findElement(By.id("earnest_money")).sendKeys("70");
        driver.findElement(By.id("closing_costs")).clear();
        driver.findElement(By.id("closing_costs")).sendKeys("91");
        driver.findElement(By.id("notes")).clear();
        driver.findElement(By.id("notes")).sendKeys("Esse eos ab veniam");
        driver.findElement(By.id("other")).click();
        driver.findElement(By.id("conventional")).click();
        driver.findElement(By.id("fha")).click();
        driver.findElement(By.id("va")).click();
        driver.findElement(By.id("cash")).click();
        driver.findElement(By.id("next-contract-details")).click();
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("/Users/colman/Desktop/PhpStorm_ReferenceCard.pdf");
        driver.findElement(By.id("next-contract-documents")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
        driver.findElement(By.xpath("//button[3]/span")).click();
        driver.findElement(By.xpath("//div[@name='Key Date']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='new_key_date-option-0']")).click();
        driver.findElement(By.id("new_key_date_value")).clear();
        driver.findElement(By.id("new_key_date_value")).sendKeys("12/30/2020");
        driver.findElement(By.id("add-key-date")).click();
        driver.findElement(By.xpath("//div[@name='Key Date']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='new_key_date-option-0']")).click();
        driver.findElement(By.id("new_key_date_value")).clear();
        driver.findElement(By.id("new_key_date_value")).sendKeys("12/30/2020");
        driver.findElement(By.id("add-key-date")).click();
        driver.findElement(By.xpath("//div[@name='Key Date']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='new_key_date-option-0']")).click();
        driver.findElement(By.id("new_key_date_value")).clear();
        driver.findElement(By.id("new_key_date_value")).sendKeys("12/30/2020");
        driver.findElement(By.id("add-key-date")).click();
        driver.findElement(By.xpath("//div[@name='Key Date']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='new_key_date-option-0']")).click();
        driver.findElement(By.id("new_key_date_value")).clear();
        driver.findElement(By.id("new_key_date_value")).sendKeys("12/30/2020");
        driver.findElement(By.id("add-key-date")).click();
        driver.findElement(By.xpath("//div[@name='Key Date']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='new_key_date-option-0']")).click();
        driver.findElement(By.id("new_key_date_value")).clear();
        driver.findElement(By.id("new_key_date_value")).sendKeys("12/30/2020");
        driver.findElement(By.id("add-key-date")).click();
        driver.findElement(By.xpath("//div[@name='Key Date']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='new_key_date-option-0']")).click();
        driver.findElement(By.id("new_key_date_value")).clear();
        driver.findElement(By.id("new_key_date_value")).sendKeys("12/30/2020");
        driver.findElement(By.id("add-key-date")).click();
        driver.findElement(By.xpath("//div[@name='Key Date']//*[@class='MuiSvgIcon-root']")).click();
        driver.findElement(By.xpath("//li[@id='new_key_date-option-0']")).click();
        driver.findElement(By.id("new_key_date_value")).clear();
        driver.findElement(By.id("new_key_date_value")).sendKeys("12/30/2020");
        driver.findElement(By.id("add-key-date")).click();
        driver.findElement(By.id("next-key-dates")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("kerri@transactly.com");
        driver.findElement(By.id("role")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Buyer Agent')]")).click();
        if (!driver.findElement(By.id("invited")).isSelected()) {
            driver.findElement(By.id("invited")).click();
        };
        driver.findElement(By.id("add-team-member")).click();
        driver.findElement(By.id("next-team")).click();
    }

    @After
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

