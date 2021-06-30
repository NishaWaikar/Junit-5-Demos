package automationcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeItDemoLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//locate & click home link		
		driver.findElement(By.linkText("HOME")).click();
		
		//navigate back to previous page
		driver.navigate().back();
		
		//locate & click All Courses link
		driver.findElement(By.partialLinkText("ALL")).click();
		
		//navigate back to previous page
		driver.navigate().back();
		
	}
}
