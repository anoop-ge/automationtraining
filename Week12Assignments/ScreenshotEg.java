package com.selenium;

import java.time.Duration;

import java.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotEg {

public static void main (String[] args) throws IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	

	driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\ScreenShotEg.html");

	// wait the web page until loaded successfully.


	File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	FileHandler.copy(Screenshot, new File("screenshot.jp"));
	


}    
}