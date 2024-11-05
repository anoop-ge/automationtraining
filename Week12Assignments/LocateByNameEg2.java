package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocateByNameEg2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\LocateByNameEg2.html");

		// wait the web page until loaded successfully.

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// locater username only after it appears on web page.

		WebElement usernamefield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		usernamefield.sendKeys("myuser");

		// Enter Age

		WebElement agefield = driver.findElement(By.name("age"));

		agefield.sendKeys("32");

		// set the country
		
		WebElement email = driver.findElement(By.name("email"));

		email.sendKeys("test@test.com");

		WebElement countrydropdown = driver.findElement(By.name("country"));

		countrydropdown.sendKeys("Canada");

		// locate the submit button

		WebElement submitbtn = driver.findElement(By.id("submitButton"));

		submitbtn.submit();

		Thread.sleep(2000);
		//WebElement messagediv = driver.findElement(By.id("message"));
		
		WebElement messagediv=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		System.out.println(messagediv.getText());

		Thread.sleep(10000);

	}
}
