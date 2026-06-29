package com.SeleniumMavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handletextboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
       WebElement firstname = driver.findElement(By.id("firstName"));
       if(firstname.isDisplayed()) {
    	   if(firstname.isEnabled()) {
    		   firstname.sendKeys("Yasaswini");
    	   }
    	   else {
    		   System.err.print("field is not enabled");
    	   }
       }
       driver.findElement(By.id("lastName")).sendKeys("Munaganuri");
       Thread.sleep(3000);
       driver.quit();
	}

}
