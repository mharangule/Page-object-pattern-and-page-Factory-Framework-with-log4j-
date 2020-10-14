package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifLoginPagePF {

	WebDriver driver;

	public ReddifLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login1']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;

	@FindBy(linkText = "rediff.com")
	WebElement linkText;

	public WebElement userName() {
		return userName;
	}

	public WebElement passowrd() {
		return password;
	}

	public WebElement loginButton() {
		return loginButton;
	}

	public WebElement linkText() {
		return linkText;
	}
}
