package automationcheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoRadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//locate radio button BMW & select		
		driver.findElement(By.id("bmwradio")).click();
		
		
		//locate radio button by customized path - xpath
		// syntax for xpath expression is //tagname[@attributename='value']
		driver.findElement(By.xpath("//input[@value='benz']")).click();
		
		// handle radio buttons dynamically
		// find out how many radio buttons are in the group
		int radioButtons = driver.findElements(By.xpath("//input[@name='cars'][@type='radio']")).size();
		System.out.println(radioButtons);
		
		//click the third radio button
		driver.findElements(By.xpath("//input[@name='cars'][@type='radio']")).get(2).click();
	}
}















