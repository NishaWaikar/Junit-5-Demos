package automationcheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoConfirm {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.findElement(By.name("enter-name")).sendKeys("Nisha");
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert confirm = driver.switchTo().alert();
		String confirmText = confirm.getText();
		System.out.println(confirmText);
		
		// check if the contents of textbox & are present in confirm text
		
		//click on ok in confirm box
		confirm.accept();
		
		driver.findElement(By.name("enter-name")).sendKeys("Nisha");
		driver.findElement(By.id("confirmbtn")).click();
		
		confirm = driver.switchTo().alert();
		confirmText = confirm.getText();
		System.out.println(confirmText);
		
		//click on cancel of confirm box
		confirm.dismiss();
	}
}
