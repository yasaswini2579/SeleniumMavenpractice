package com.SeleniumMavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Text 1");
		// switch to frame1
//		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
//		driver.switchTo().frame(frame1);
//		Select dropdown = new Select(driver.findElement(By.id("course")));
//		dropdown.selectByVisibleText("Java");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("name")).sendKeys("Text 1");
		//Switch to main webpages to more than one frames and switch between the frames
//		driver.switchTo().frame("frm2");
//		driver.findElement(By.id("firstName")).sendKeys("Yashu");
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame("frm1");
//		Select dropdown = new Select(driver.findElement(By.id("course")));
//     	dropdown.selectByVisibleText("Java");
//     	driver.switchTo().defaultContent();
//    	driver.findElement(By.id("name")).clear();
//    	driver.findElement(By.id("name")).sendKeys("Text 2");
    	//Nested frames
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("Frame 3Text 1");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		Select dropdown = new Select(driver.findElement(By.id("course")));
		Thread.sleep(5000);
		dropdown.selectByVisibleText("Python");
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("Frame 3Text 2");
		Thread.sleep(5000);
		driver.switchTo().frame("frm2");
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Yashu");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
    	driver.findElement(By.id("name")).clear();
    	Thread.sleep(5000);
    	driver.findElement(By.id("name")).sendKeys("Text 2");
    	//driver.close();
		
		}

}
