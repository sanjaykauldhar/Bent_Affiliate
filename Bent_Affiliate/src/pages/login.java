package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class login{

		private static WebElement element = null;

		public static WebElement email(WebDriver driver){

		element = driver.findElement(By.id("email"));

		return element;

}
		public static WebElement password(WebDriver driver){

			element = driver.findElement(By.id("password"));

			return element;

	}
		public static WebElement login_button(WebDriver driver){

			element = driver.findElement(By.tagName("button"));

			return element;

	}		
		public static WebElement register_now(WebDriver driver){

			element = driver.findElement(By.partialLinkText("Register Now!"));

			return element;

	}
		public static WebElement forgot_password(WebDriver driver){

			element = driver.findElement(By.linkText("Forgot password ?"));

			return element;

	}
}