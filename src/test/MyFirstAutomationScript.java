package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationScript {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://adactinhotelapp.com");
	driver.findElement(By.id("username")).sendKeys("riteshmalve1");
	driver.findElement(By.id("password")).sendKeys("rr25111971");
	driver.findElement(By.id("login")).click();
	String actualTitle = driver.getTitle();
	if(actualTitle.equalsIgnoreCase("Adactin.com - Search Hotel"))
	{
		System.out.println("test case passed");
	}
	

	}

}
