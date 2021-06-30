package automationcheck;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) {
		// create object of chrome driver class
		//we will implement methods from WebDriver interface so that it can automate the web browser
		
		//once the dependency is specified in pom.xml this statement is not required
		//System.setProperty("webdriver.chrome.driver", "D:\\Training Material\\SDET- Java\\ChromeDriver\\chromedriver.exe");
		
		//instead following statement to be used
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// load theh webpage
		driver.get("http://google.com");
		
		//get title of the page
		System.out.println("Title: " +  driver.getTitle());
		
		//url of the page
		System.out.println("Url : " + driver.getCurrentUrl());		
		
		//navigate to other url
		driver.navigate().to("http://yahoo.com");
		
		//navigate back
		driver.navigate().back();
		
		//close the browser
		driver.close();
		
	}
}
