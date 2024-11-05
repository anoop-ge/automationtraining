package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateByLinkTextEg {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\LocateByLinkTextEg.html");

		// wait the web page until loaded successfully.

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshot1, new File("screenshot1.png"));
		WebElement link1 = driver.findElement(By.linkText("Visit Example"));
		

		link1.click();

		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshot2, new File("screenshot2.png"));

		System.out.println("Title" + driver.getTitle());

		WebElement linkmoreinfo = driver.findElement(By.partialLinkText("information"));

		
		linkmoreinfo.click();

		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshot3, new File("screenshot3.png"));
		Thread.sleep(5000);

		System.out.println("Next page Title" + driver.getTitle());

		Thread.sleep(3000);

		driver.quit();
	}

}
