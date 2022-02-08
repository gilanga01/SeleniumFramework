package seleniumFramework;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsertest {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+projectPath);
		
       System.setProperty("Webdriver.gecko.driver", projectPath+"/geckodriver");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.safaricom.co.ke/");
        driver.quit();
        driver.close();
      
      
}
	}
