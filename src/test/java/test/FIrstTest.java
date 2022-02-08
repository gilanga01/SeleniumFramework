package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FIrstTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.gecko.driver","/Users/glanga01/eclipse-workspace/eclipse/Learningjava/seleniumFramework/drivers/geckodriver/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.google.com");
		
		
		driver.get("https://www.google.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().setSize(new Dimension(800, 600));
		Dimension size = driver.manage().window().getSize();
		int width1 = size.getWidth();
		int height1 = size.getHeight();
		System.out.println(width1);
		System.out.println(height1);
		////driver.manage().window().minimize();
		///Thread.sleep(3000);
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();

		//Take screenshot
		File scrFile = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image.png"));
		//Take element screenshot
		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		File scrFile1 = (File) element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("./image1.png"));

		/*
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		driver.close();
		driver.quit();
		
		
		
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().window(originalWindow);

	}

}
