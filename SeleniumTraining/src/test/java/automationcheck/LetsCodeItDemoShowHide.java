package automationcheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoShowHide {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.findElement(By.id("hide-textbox")).click();
		boolean isTextBoxDisplayed = driver.findElement(By.id("displayed-text")).isDisplayed();
		if(isTextBoxDisplayed == true)
			System.out.println("Text Box displayed in DOM");
		else
			System.out.println("Text Box not displayed in DOM");
		
	}
}
