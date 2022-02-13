package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {
System.setProperty("Webdriver.gecko.driver","/Users/glanga01/eclipse-workspace/eclipse/Learningjava/seleniumFramework/drivers/geckodriver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		//Explicit wait
		WebDriverWait  wait = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: Never Stop Learning ...")));
		myLink.click();
		
		  // Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("automation step by step" +Keys.ENTER);
		
		
		//fluent wait
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			     .withTimeout(Duration.ofSeconds(10))
	             .pollingEvery(Duration.ofSeconds(1))
	             .ignoring(org.openqa.selenium.NoSuchContextException.class);
	fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath(null)));

				  
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);
		//driver.close();
		driver.quit();
	}

}
