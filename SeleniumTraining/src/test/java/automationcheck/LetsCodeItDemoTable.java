package automationcheck;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeItDemoTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("https://courses.letskodeit.com/practice");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		List<WebElement>  columns = driver.findElements(By.xpath(".//*[@id=\"product\"]/table/tbody/tr/th"));
        System.out.println("No of columns are : " +columns.size()); 
        //No.of rows 
        List<WebElement>  rows = driver.findElements(By.xpath(".//*[@id='product']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        
		
		String tableHeader = driver.findElement(By.xpath("//table[@id='product']/tbody/tr/th")).getText();
		System.out.println(tableHeader);
		
		String tableData1 = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[2]/td")).getText();
		System.out.println(tableData1);
		
		String tableData2 = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[2]/td[2]")).getText();
		System.out.println(tableData2);
	}
}
