package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAll {
WebDriver driver;
	@BeforeSuite
	public void openChrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@BeforeTest
	public void openURL()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		
	}
	@Test
	public void login() throws InterruptedException
	{
		
		Assert.assertEquals("https://demowebshop.tricentis.com",driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("mahesh.77@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("mahesh77");
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		//Thread.sleep(3000);
		String tital=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(tital,"Demo Web");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		sa.assertAll();
	}
	
}
