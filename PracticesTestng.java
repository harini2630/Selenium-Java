package test01;
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class PracticesTestng {

	    @Test
	    public void positiveLoginTest() {

	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://practicetestautomation.com/practice-test-login/");

	        driver.findElement(By.id("username")).sendKeys("student");
	        driver.findElement(By.id("password")).sendKeys("Password123");
	        driver.findElement(By.id("submit")).click();

	        if (!driver.getCurrentUrl().contains("logged-in-successfully")) {
	            driver.quit();
	            throw new RuntimeException("URL verification failed");
	        }

	        String pageText = driver.findElement(By.tagName("body")).getText();
	        if (!(pageText.contains("Congratulations") || pageText.contains("successfully logged in"))) {
	            driver.quit();
	            throw new RuntimeException("Success message not found");
	        }

	        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
	        if (!logoutButton.isDisplayed()) {
	            driver.quit();
	            throw new RuntimeException("Logout button not displayed");
	        }

	        driver.quit();
	    }

	    @Test
	    public void negativeUsernameTest() {

	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://practicetestautomation.com/practice-test-login/");

	        driver.findElement(By.id("username")).sendKeys("incorrectUser");
	        driver.findElement(By.id("password")).sendKeys("Password123");
	        driver.findElement(By.id("submit")).click();

	        WebElement errorMessage = driver.findElement(By.id("error"));

	        if (!errorMessage.isDisplayed()) {
	            driver.quit();
	            throw new RuntimeException("Error message not displayed");
	        }

	        if (!errorMessage.getText().equals("Your username is invalid!")) {
	            driver.quit();
	            throw new RuntimeException("Incorrect error message for invalid username");
	        }

	        driver.quit();
	    }

	    @Test
	    public void negativePasswordTest() {

	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://practicetestautomation.com/practice-test-login/");

	        driver.findElement(By.id("username")).sendKeys("student");
	        driver.findElement(By.id("password")).sendKeys("incorrectPassword");
	        driver.findElement(By.id("submit")).click();

	        WebElement errorMessage = driver.findElement(By.id("error"));

	        if (!errorMessage.isDisplayed()) {
	            driver.quit();
	            throw new RuntimeException("Error message not displayed");
	        }

	        if (!errorMessage.getText().equals("Your password is invalid!")) {
	            driver.quit();
	            throw new RuntimeException("Incorrect error message for invalid password");
	        }

	        driver.quit();
	    }
	}



