package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifHomePagePF {

	WebDriver driver;

	public ReddifHomePagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='srchword']")
	WebElement searchBox;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/form[1]/input[1]")
	WebElement searchButton;

	public WebElement searchBox() {
		return searchBox;
	}

	public WebElement searchButton() {
		return searchButton;
	}
}
