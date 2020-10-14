package TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.ReddifHomePagePF;
import ObjectRepository.ReddifLoginPagePF;

public class LoginApplication {
	private static Logger log=LogManager.getLogger(LoginApplication.class.getName());
	@Test
	public void loginApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Window Maximized");
		log.debug("Now hitting REeddifmail server");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		log.info("Landed on reddif login page");

		ReddifLoginPagePF rd = new ReddifLoginPagePF(driver);
		ReddifHomePagePF hp = new ReddifHomePagePF(driver);
		rd.userName().sendKeys("mahesh");
		log.info("UserName entered");
		rd.passowrd().sendKeys("pasword");
		log.info("PassWord entered");
		rd.linkText().click();
		log.info("clicked on Home link");
		hp.searchBox().sendKeys("Mobiles");
		log.info("Entered some of the text in Searchbox ");
		hp.searchButton().click();
		log.info("clicked on searchButton");
	}

}
