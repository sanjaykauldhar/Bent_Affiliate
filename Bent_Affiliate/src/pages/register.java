package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class register{

		private static WebElement element = null;

		public static WebElement first_name(WebDriver driver){

		element = driver.findElement(By.id("name"));

		return element;

}
		public static WebElement last_name(WebDriver driver){

			element = driver.findElement(By.id("last_name"));

			return element;

	}
		public static WebElement email(WebDriver driver){

			element = driver.findElement(By.id("email"));

			return element;

	}
		public static WebElement contact(WebDriver driver){

			element = driver.findElement(By.id("contact"));

			return element;

	}
		public static WebElement password(WebDriver driver){

			element = driver.findElement(By.id("password"));

			return element;

	}
		public static WebElement confirm_password(WebDriver driver){

			element = driver.findElement(By.id("password-confirm"));

			return element;

	}
		public static WebElement profession(WebDriver driver){

			element = driver.findElement(By.name("arch_type"));

			return element;

	}
		public static WebElement register_button(WebDriver driver){

			element = driver.findElement(By.tagName("button"));

			return element;

	}
		public static WebElement login_button_register(WebDriver driver){

			element = driver.findElement(By.className("xh-highlight"));

			return element;

	}
}