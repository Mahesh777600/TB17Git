package Com.cjc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MCTRegister {

	public static void main(String[] args) {
		System.out.println("Hi, welcome");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*
		 * driver.get("https://demo.guru99.com/test/newtours/register.php");
		 * 
		 * driver.findElement(By.name("firstName")).sendKeys("Mahesh"); WebElement
		 * ln=driver.findElement(By.name("lastName")); ln.sendKeys("Pimpre");
		 */
		driver.get("file:///D:/Selinium/index.html");
		
		WebElement br =driver.findElement(By.id("browser"));
		Select s=new Select(br);
		s.selectByIndex(2);
	}
}
