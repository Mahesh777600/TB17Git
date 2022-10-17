package WaitMethod;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selinium\\Alljar\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();

		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement element = w.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver wd) {
				WebElement msg = wd.findElement(By.xpath("//*[@id=\"demo\"]"));// locator path
				System.out.println("Fluent Wait");
				String message = msg.getText();
				System.out.println("Message is" + message);

				if (message.equalsIgnoreCase("Software Testing Material - DEMO PAGE")) { // message copy

					return msg;
				} else {
					return null;
				}

			}

		});
	}
}

/*
 * WebDriverWait w=new WebDriverWait(driver, 11);
 * w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
 * "//p[@id='demo']")));
 */
/*
 * String we= driver.findElement(By.xpath("//p[@id='demo']")).getText();
 * 
 * FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver)
 * .withTimeout(11,TimeUnit.SECONDS) .pollingEvery(2,TimeUnit.SECONDS)
 * .ignoring(NoSuchElementException.class);
 * 
 * System.out.println(we);
 */
