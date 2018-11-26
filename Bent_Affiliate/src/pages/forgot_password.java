package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class forgot_password{

		private static WebElement element = null;

		public static WebElement email(WebDriver driver){

		element = driver.findElement(By.id("email"));

		return element;

}
		public static WebElement send_password_reset_link(WebDriver driver){

		element = driver.findElement(By.id("link"));

		return element;

}
		public static WebElement login(WebDriver driver){

		element = driver.findElement(By.linkText("Login"));

		return element;

}
		
		public static WebElement phone_select(WebDriver driver){

		element = driver.findElement(By.xpath("//label[text()='Phone No.']"));

		return element;

}
		public static WebElement email_select(WebDriver driver){

		element = driver.findElement(By.xpath("//label[text()='Email']"));

		return element;

}
		
}