package com.facebook.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Software {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  WebDriver rv=new ChromeDriver();
		  Thread.sleep(3000);
		  rv.get("https://www.facebook.com/");
		      

	}

}
