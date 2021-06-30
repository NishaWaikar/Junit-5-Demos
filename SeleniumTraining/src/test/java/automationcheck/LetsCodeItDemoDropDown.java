package automationcheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//locate the drop down list
		//Select class represents the drop downlist
		Select dropDown = new Select(driver.findElement(By.id("carselect")));
		
		// select by visible text
		dropDown.selectByVisibleText("Benz");
		
		// select by index
		dropDown.selectByIndex(0);
		
		// select by value
		dropDown.selectByValue("honda");
	}
}
