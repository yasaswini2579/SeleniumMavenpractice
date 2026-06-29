package com.SeleniumMavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//Alert BOX
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("alertBox")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.id("output")).getText());
	
	// Confirm BOX
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("confirmBox")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.id("output")).getText());
	Thread.sleep(3000);
	driver.findElement(By.id("confirmBox")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.id("output")).getText());
	
	//Prompt BOX
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("promptBox")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("Yasaswini");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.quit();
	
	
	}

}
