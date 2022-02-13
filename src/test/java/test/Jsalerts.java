package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jsalerts {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.gecko.driver", "/Users/glanga01/eclipse-workspace/eclipse/Learningjava/seleniumFramework/drivers/geckodriver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		/* JavaScript Alert
      
        JavaScript Prompt
        */
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='content']//ul//button[.='Click for JS Alert']")).click(); // click on the button
		Thread.sleep(2000);
		
		//JS alert
		Alert alert = driver.switchTo().alert(); // switching to the JS alert
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept(); // accepting the alert
		if(driver.getPageSource().contains("You successfully clicked an alert"))
			System.out.println("You successfully clicked an alert");
		    System.out.println("=====================");
		    
		    
		   // JavaScript Confirmation
		    driver.findElement(By.xpath("//div[@id='content']//ul//button[.='Click for JS Confirm']")).click(); // click on the button
		    Alert alert1 = driver.switchTo().alert(); // switching to the JS alert
			System.out.println(alert1.getText());
			Thread.sleep(2000);
			alert.dismiss();
			if(driver.getPageSource().contains("You clicked: Cancel"))
				System.out.println("You clicked: Cancel");
			    System.out.println("=====================");
		    
		
	
		//JS prompt
		driver.findElement(By.xpath("//div[@id='content']//ul//button[.='Click for JS Prompt']")).click(); // click on the button
	    Alert alert2 = driver.switchTo().alert(); // switching to the JS promt
		System.out.println(alert2.getText());
		alert.sendKeys("Automation Step by Step");
		Thread.sleep(2000);
		alert.accept();
		
		
		driver.close();
		driver.quit();
		

		
		
	}

}
