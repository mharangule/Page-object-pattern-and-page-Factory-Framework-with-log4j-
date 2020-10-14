package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLoginPage {

	WebDriver driver;

	public ReddifLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.cssSelector("input[id='login1']");
	By password = By.cssSelector("input[id='password']");
	By loginButton = By.cssSelector("input[type='submit']");
	By errorMessage = By.cssSelector("div[id='div_login_error'] b");
	By linkText= By.linkText("rediff.com");

	public WebElement userName() {
		return driver.findElement(userName);
	}

	public WebElement passowrd() {
		return driver.findElement(password);
	}

	public WebElement loginButton() {
		return driver.findElement(loginButton);
	}

	public WebElement errorMessage() {
		return driver.findElement(errorMessage);
	}
	public WebElement linkText() {
		return driver.findElement(linkText);
	}
}
