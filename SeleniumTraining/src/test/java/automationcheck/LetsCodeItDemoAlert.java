package automationcheck;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoAlert {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.name("enter-name")).sendKeys("Nisha");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		// check if the contents of textbox & are present in alert text
		
		//click on ok in alert box
		alert.accept();
	}
}
