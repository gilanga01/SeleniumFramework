package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class waits {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.gecko.driver","/Users/glanga01/eclipse-workspace/eclipse/Learningjava/seleniumFramework/drivers/geckodriver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		  // Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("automation step by step" +Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
