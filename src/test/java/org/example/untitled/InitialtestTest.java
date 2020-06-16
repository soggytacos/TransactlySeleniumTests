package org.example.untitled;
import org.testng.annotations.*;
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class InitialtestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void initialtest() {
    driver.get("http://local.transactlyapp.com:3000/login");
    driver.manage().window().setSize(new Dimension(886, 964));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("alissa@transactly.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Password2!");
    driver.findElement(By.id("login-button")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-new-transaction")));
    }
    driver.findElement(By.id("add-new-transaction")).click();
    driver.findElement(By.id("yes-tc")).click();
    driver.findElement(By.id("seller-party")).click();
    driver.findElement(By.id("no-luc")).click();
    driver.findElement(By.id("lc-tc-order")).click();
    driver.findElement(By.id("address_line_1")).click();
    driver.findElement(By.id("address_line_1")).sendKeys("12345 Happy Test Street");
    driver.findElement(By.id("city")).sendKeys("St. Louis");
    driver.findElement(By.id("state")).click();
    driver.findElement(By.xpath("//li[@id=\'state-option-27\']/span")).click();
    driver.findElement(By.id("zip")).sendKeys("12345");
    driver.findElement(By.id("listing_effective_date")).sendKeys("06/05/2020");
//    driver.findElement(By.xpath("//span[contains(text(),\'OK\')]")).click();
    driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[1]//button[1]")).click();
    driver.findElement(By.xpath("//span[contains(text(),\'OK\')]")).click();
    driver.findElement(By.id("price")).sendKeys("123456");
    driver.findElement(By.xpath("//form[@id=\'new_transaction\']//span[@class=\'MuiButton-label\'][contains(text(),\'Next\')]")).click();

    driver.findElement(By.xpath("//input[@type=\'file\']")).sendKeys("/Users/colman/Desktop/PhpStorm_ReferenceCard.pdf");
    driver.findElement(By.id("next-document-upload")).click();
    driver.findElement(By.id("email")).sendKeys("clayton@transactly.com");

  }
}
