package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import pages.login;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class aff_login {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testaff_login() throws Exception {
    
	  driver.get("http://app.bentchair.com/affiliate/login");
    
	  driver.manage().window().maximize();
	  
	  login.email(driver).sendKeys("sanjaykauldhar@yahoo.com");
	  
	  login.password(driver).sendKeys("1234567890");
	  
	  login.login_button(driver).submit();
	  
	  //Test CMD
	  
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
