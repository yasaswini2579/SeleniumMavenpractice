package com.SeleniumMavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdownhtmlcontrol {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Select dropdown = new Select(driver.findElement(By.id("course")));
		dropdown.selectByIndex(0);
		dropdown.selectByValue("js");
		dropdown.selectByVisibleText("Dot Net");
		//multi selection
		Select dropdownide = new Select(driver.findElement(By.id("ide")));
		dropdownide.selectByIndex(0);
		dropdownide.selectByValue("vs");
		dropdownide.selectByVisibleText("NetBeans");
		

	}

}
