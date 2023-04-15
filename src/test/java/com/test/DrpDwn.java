package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDwn {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		Thread.sleep(3000);

		
		WebElement dwn = driver.findElement(By.id("ide"));
		Select s = new Select(dwn);
	
		List<WebElement> options = s.getOptions();
		String s1 = options.toString();
		
		for (WebElement w : options) {
			s.selectByVisibleText(w.getText());
		}
		System.out.println("Selected successfully");
		
	}

}
