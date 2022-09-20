package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {
   @Test
	public void facebook() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Akshay");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("PAlande");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("Sapirli@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Akshay@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Aks@0123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("birthday_day")).sendKeys("6");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Jun");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1994");
		Thread.sleep(2000);
		driver.findElements(By.name("sex")).get(1).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}
}
