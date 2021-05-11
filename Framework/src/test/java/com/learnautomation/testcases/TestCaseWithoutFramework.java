package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {

	
	
	@Test
    public void test1()
{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("raghukomar@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Raghu1608@95");
		
		driver.findElement(By.xpath("//butt0n[@id='loginbutton']")).click();
		
		driver.quit();
}
}
