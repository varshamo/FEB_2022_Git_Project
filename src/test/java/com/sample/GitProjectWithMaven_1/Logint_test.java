package com.sample.GitProjectWithMaven_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logint_test {
	
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\seleium_Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	@Test
	public void doLogin() throws InterruptedException
	{
	System.out.println("Executing Login Test");
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("email")).sendKeys("arshamore990@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("abcd");
	driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void QuitDriver()
	{
	if (driver!=null)
	driver.close();
	}

	

}
