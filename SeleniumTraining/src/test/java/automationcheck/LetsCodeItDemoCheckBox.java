package automationcheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoCheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");

		//maximize the window
		driver.manage().window().maximize();

		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// select checkbox BMW & select
		driver.findElement(By.id("bmwcheck")).click();
		System.out.println(driver.findElement(By.id("bmwcheck")).isSelected());

		// locate checkbox using customized path by cssselector
		// syntax for cssselector is tagname[attributename='value']
		driver.findElement(By.cssSelector("input[name='cars'][type='checkbox'")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='cars'][type='checkbox'")).isSelected());
		
		int checkboxes = driver.findElements(By.xpath("//input[@name='cars'][@type='checkbox']")).size();
		System.out.println(checkboxes);
		
		//click the third radio button
		driver.findElements(By.xpath("//input[@name='cars'][@type='checkbox']")).get(2).click();
	}
}
