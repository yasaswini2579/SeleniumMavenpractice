package com.SeleniumMavenpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshotpractice {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//FILE
//	File src =	driver.getScreenshotAs(OutputType.FILE);
//	File dest = new File("./Screenshotttt/google.png");
//	FileUtils.copyFile(src, dest);
//	driver.close();
		
		//Bytes
//	byte[] src =	driver.getScreenshotAs(OutputType.BYTES);
//	FileOutputStream fos = new FileOutputStream("./Screenshotttt/google.png");
//	fos.write(src);
//	driver.close();
     //Base64
	String basescreenshot =	driver.getScreenshotAs(OutputType.BASE64);
	byte[] src = Base64.getDecoder().decode(basescreenshot);
	FileOutputStream dest = new FileOutputStream("./Screenshotttt/google1.jpg");
	dest.write(src);
	driver.close();
	}

}
