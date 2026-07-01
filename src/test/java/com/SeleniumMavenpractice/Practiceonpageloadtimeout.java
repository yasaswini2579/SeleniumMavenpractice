package com.SeleniumMavenpractice;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceonpageloadtimeout {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 Instant starttime = Instant.now();
		driver.get("https://www.hyrtutorials.com/");
		 Instant endtime = Instant.now();
		 System.out.println(Duration.between(starttime, endtime));
		 driver.close();
	}

}
