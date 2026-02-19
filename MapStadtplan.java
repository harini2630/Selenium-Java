package test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapStadtplan {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mapz.com/map");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Draw')]")).click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("");
		email.submit();
		
		String retrieve = email.getAttribute("validationMessage");
		System.out.println(retrieve);
		
		driver.quit();
		
		
	}

}
