package com.SeleniumMavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHTMLControls {

	public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	        //TEXTBOXES
	        driver.findElement(By.id("firstName")).sendKeys("Yashu");
	        Thread.sleep(3000);
	        //RADIO BUTTONS
	        driver.findElement(By.id("femalerb")).click();
	        Thread.sleep(3000);
	        //CHECKBOX
	        driver.findElement(By.id("englishchbx")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("hindichbx")).click();
	        WebElement elementCheckbox = driver.findElement(By.id("chinesechbx"));
	        if(elementCheckbox.isSelected()) {
	        	elementCheckbox.click();
	        }
	        else {
	        	System.out.println("Checkbox is not selected");
	        	elementCheckbox.click();
	        }
	        //BUTTONS
	        driver.findElement(By.id("registerbtn")).click();
	       System.out.println(driver.findElement(By.id("msg")).getText());
	       Thread.sleep(3000);
	       //Links
	       driver.findElement(By.linkText("Click here to navigate to the home page")).click();
           driver.quit();
	}

}
