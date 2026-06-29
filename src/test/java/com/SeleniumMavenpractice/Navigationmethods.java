package com.SeleniumMavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethods {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement text = driver.findElement(By.id("APjFqb"));
	text.sendKeys("HYR Tutorials");
	Thread.sleep(3000);
	text.submit();
	Thread.sleep(3000);
	driver.navigate().to("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("Yashu");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().forward();
	String CurrentURL = driver.getCurrentUrl();
	if(CurrentURL == null) {
		System.out.println("page is not available");
	}
	else {
		System.out.println(driver.getTitle());
	}
	driver.navigate().back();
		

	}

}
