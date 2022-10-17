package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selinium/index.html");
		
		WebElement we= driver.findElement(By.xpath("//div[@class='container']/child :: select[@id='browser']"));
		Select s=new Select(we);
		s.selectByIndex(2);
	}
}
