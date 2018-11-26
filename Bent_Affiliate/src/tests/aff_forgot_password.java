package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import pages.forgot_password;
import pages.login;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class aff_forgot_password{
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testaff_forgot_password() throws Exception {
    
	  driver.get("http://app.bentchair.com/affiliate/login");
    
	  driver.manage().window().maximize();
	  
	  Thread.sleep(1000);
	  
	  login.forgot_password(driver).click();
	  
	  Thread.sleep(2000);
	  
	  forgot_password.email_select(driver).click();
	  
	  forgot_password.email(driver).sendKeys("sanjaykauldhar@yahoo.com");
	  
	  forgot_password.send_password_reset_link(driver).submit();
	  
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
