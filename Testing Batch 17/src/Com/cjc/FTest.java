package Com.cjc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hi, Selenium");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		System.out.println("chrome start");
		
		driver.get("https://www.flipkart.com/");
		
		String tital=driver.getTitle();
		
		System.out.println(tital);
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		String source= driver.getPageSource();
		//System.out.println(source);
		Thread.sleep(300);
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a")).click();
		driver.manage().window().maximize();
		
	//	driver.get("https://www.amazon.in/");
	//	driver.switchTo().window(url);
		
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie);
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.close();
		driver.quit();
	}

}
