package automationcheck;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoMultipleSelect {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//locate the drop down list
		//Select class represents the drop downlist
		Select multiSelect = new Select(driver.findElement(By.id("multiple-select-example")));
		
		List<WebElement> options = multiSelect.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		
		multiSelect.selectByVisibleText("Orange");
		multiSelect.selectByVisibleText("Peach");
		System.out.println("---------------Selected options---------------- ");
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for (WebElement webElement : selectedOptions) {
			System.out.println(webElement.getText());
		}
		
		multiSelect.deselectAll();
	}
}
