package com.SeleniumMavenpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//Single Browser
	String	Parentaddress=driver.getWindowHandle();
	System.out.println("The parent browser address is"+ Parentaddress);
	System.out.println("The parent browser title is" + driver.getTitle());
	driver.findElement(By.id("newWindowBtn")).click();
	Set <String> Alladress = driver.getWindowHandles();
	 for (String windowhandles : Alladress) {
		 if(!windowhandles.equals(Parentaddress)) {
			 driver.switchTo().window(windowhandles);
			 System.out.println("We are switching to child browser");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("firstName")).sendKeys("yashuuu");
			 driver.close();
		 }
		 else {
			 System.out.println("This is parent browser not child");
		 }
		
	}
	 driver.switchTo().window(Parentaddress);
	 driver.findElement(By.id("name")).sendKeys("This is the parent browser we cam back");
	 //Single tab
	 String parenttabadd = driver.getWindowHandle();
	 System.out.println("parent tab adress is"+parenttabadd);
	 System.out.println("parent tab title is"+ driver.getTitle());
	 driver.findElement(By.id("newTabBtn")).click();
	Set <String> alltabaddress = driver.getWindowHandles();
	for (String allwindowhandles : alltabaddress) {
		if(!allwindowhandles.equals(parenttabadd)) {
			 driver.switchTo().window(allwindowhandles);
			 System.out.println("We are switching to child browser");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("alertBox")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			driver.close();
		}
	} 
	driver.switchTo().window(parenttabadd);
	driver.findElement(By.id("name")).sendKeys("This is the parent browser we cam back");
	 
	 

	}

}
