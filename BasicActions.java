package jUnit;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {

	 WebDriver driver;
	 String baseUrl;
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationTest\\Mozilladriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		System.out.println("Clicked on Login");
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("tabhib@gmail.com");
		System.out.println("ID sent");
		driver.findElement(By.id("user_password")).sendKeys("rukawa11");
		System.out.println("Password sent");
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-hg btn-block login-button']")).click();
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	}



}
