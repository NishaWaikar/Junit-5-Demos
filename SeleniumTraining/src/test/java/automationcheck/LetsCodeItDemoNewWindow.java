package automationcheck;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoNewWindow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		//locate the button to click & click
		driver.findElement(By.id("openwindow")).click();
		
		//if following statement is executed, the support 
		//driver.findElement(By.xpath("//a[@href='/support']")).click();
		
		Set<String> childWindows = driver.getWindowHandles();
		for (String childWindow : childWindows) {
			driver.switchTo().window(childWindow);
		}
		
		driver.findElement(By.xpath("//a[@href='/support']")).click();
		
		driver.findElement(By.id("name")).sendKeys("Nisha");
		driver.close();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[@href='/courses']")).click();
	}
}
