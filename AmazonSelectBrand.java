package test01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelectBrand {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bag");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		for(int i=0;i<5;i++) {
			
			List<WebElement> elements = driver.findElements(By.xpath("//div[@id='brandsRefinements']//li//span[@class='a-list-item']//a"));
			
			if (i >= elements.size()) break;


			elements.get(i).click();
			Thread.sleep(3000);
			
			int res = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']")).size();
			
			System.out.println("Brand "+(i+1)+"Result "+ res);
			
			
			
		}
		driver.quit();
				
				
	}

}
