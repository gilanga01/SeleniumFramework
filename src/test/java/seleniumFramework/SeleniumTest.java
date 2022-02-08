package seleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("2.36").setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.safaricom.co.ke/");
        driver.quit();
        driver.close();
	}

}
