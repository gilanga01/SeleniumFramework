package test;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import //org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class elements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.gecko.driver","/Users/glanga01/eclipse-workspace/eclipse/Learningjava/seleniumFramework/drivers/geckodriver/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
		//Thread.sleep(4000);
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element :options) {
			System.out.println(element.getText());
		}
		driver.close();
		driver.quit();
	}

}
