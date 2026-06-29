package com.SeleniumMavenpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandleScreenshot {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		
	//FILE	
//	File src =	driver.getScreenshotAs(OutputType.FILE);
//	File dest = new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumMavenpractice\\Screenshotttt\\img1.jpg");
//	FileUtils.copyFile(src, dest);
//	driver.close();
//	System.out.println("Screen shot saved successfully");
	//Bytes
//	 byte[] Src = driver.getScreenshotAs(OutputType.BYTES);
//	 FileOutputStream fox = new FileOutputStream("./Screenshotttt/img2.png");
//	 fox.write(Src);
//	 driver.close();
//		System.out.println("Screen shot saved successfully");
	//Base 64
	String base64 = 	driver.getScreenshotAs(OutputType.BASE64);
	byte[] src = Base64.getDecoder().decode(base64);
	FileOutputStream fos = new FileOutputStream("./Screenshotttt/img3.jpg");
	fos.write(src);
	
		
		
	


	}

	
		
	}


