package com.testInterviewPractice.tests;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllSelenium {

	@Test
	public void AllLocatorsPractice()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		//ID locator 
		driver.findElement(By.id("user-name")).sendKeys("Test Automation");
		
		//Name locator
		//driver.findElement(By.name("first name"));
		
		//tagName locator
		List<WebElement> tagName = driver.findElements(By.tagName("input"));
		System.out.println(tagName.size());
		for(WebElement tag : tagName) {
			System.out.println(tag.getTagName());
		}
		
		//linkText
		//driver.findElement(By.linkText(""));
		
		//partialLinkText
		//driver.findElement(By.partialLinkText(""));
		
		//CSS Selector
		driver.findElement(By.cssSelector("#password")).sendKeys("Password");
		
		//Xpath locator
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		
		
		
		
		
		
	}
}
