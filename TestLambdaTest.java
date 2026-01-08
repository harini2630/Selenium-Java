package testCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLambdaTest {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ecommerce-playground.lambdatest.io/");
        driver.manage().window().maximize();

        driver.findElement(By.name("search")).sendKeys("iphone", Keys.ENTER);
        
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='price']"));
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i).getText());
        }

        System.out.println("Count of the phones : " + prices.size());
        String title = driver.getTitle();
        if (title.toLowerCase().contains("iphone")) {
            System.out.println("Title is verified");
        }
        String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("https://ecommerce-playground.lambdatest.io/")) {
			System.out.println("URL is verified ");
		}
        
        driver.close();
    }
}
