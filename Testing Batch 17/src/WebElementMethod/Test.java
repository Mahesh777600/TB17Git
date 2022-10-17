package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
System.out.println("Hi, Selenium");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selinium/index.html");
		
		driver.findElement(By.xpath("//*[@id=\"uid\"]")).sendKeys("AAA");
		
		WebElement we=driver.findElement(By.xpath("//*[@id=\"headerlogin\"]/div[1]/label[1]"));
		String value=we.getText();
		System.out.println(value);
		
		WebElement we1=driver.findElement(By.id("uid"));
		System.out.println(we1.getAttribute("value"));
		
		WebElement we2=driver.findElement(By.xpath("//*[@id=\"browser\"]"));
		System.out.println(we2.getAttribute("value"));
	}
}
