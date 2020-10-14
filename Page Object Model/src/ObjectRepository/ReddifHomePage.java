package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifHomePage {

	WebDriver driver;

	public ReddifHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.cssSelector("input[id='srchword']");
	By searchButton = By.xpath("//body/div[3]/div[2]/div[1]/form[1]/input[1]");

	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}

	public WebElement searchButton() {
		return driver.findElement(searchButton);
	}
}
