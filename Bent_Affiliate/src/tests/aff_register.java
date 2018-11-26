package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import pages.login;
import pages.register;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aff_register {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testaff_register() throws Exception {
    
	  driver.get("http://app.bentchair.com/affiliate/login");
    
	  driver.manage().window().maximize();
	  
	  Thread.sleep(1000);
	  
	  login.register_now(driver).click();
	  
	  Thread.sleep(1000);
	  
	  register.first_name(driver).sendKeys("Sanjay");
	  
	  register.last_name(driver).sendKeys("Kauldhar");
	  
	  register.email(driver).sendKeys("sanjaykauldhar@yahoo.com");
	  
	  register.contact(driver).sendKeys("9899385455");
	  
	  register.password(driver).sendKeys("1234567890");
	  
	  register.confirm_password(driver).sendKeys("1234567890");
	  
	  Select profession = new Select(register.profession(driver));
	  
	  profession.selectByValue("5");
	  
	  Thread.sleep(2000);
	  
	  register.register_button(driver).submit();
	  
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
