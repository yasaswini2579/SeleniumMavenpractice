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
//	File dest = new File("./Screenshotttt/imb6.png");
//	FileUtils.copyFile(src, dest);
//	System.out.println("Screen shot saved successfully");
//	driver.close();
		//Byte
	byte[] bytearr =	driver.getScreenshotAs(OutputType.BYTES);
	FileOutputStream fos = new FileOutputStream("./Screenshotttt/imggg.png");
	fos.write(bytearr);
	System.out.println("Screen shot saved successfully");
	driver.close();
	//Base64
//	String basearr =	driver.getScreenshotAs(OutputType.BASE64);
//	byte[] dest = Base64.getDecoder().decode(basearr);
//	FileOutputStream fos = new FileOutputStream("./Screenshotttt/imb6.png");
//	fos.write(dest);
//	fos.close();
//	System.out.println("Screen shot saved successfully");
//	driver.close();
	}

}
