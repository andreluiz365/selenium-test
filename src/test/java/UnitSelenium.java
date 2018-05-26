import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitSelenium {
	
	private static ChromeDriver driver;
	
	@BeforeClass
	public static void before() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		driver.get("https://google.com");
		WebElement q = driver.findElement(By.name("q"));
		assertNotNull(q);
	}
	
	@Test
	public void test2() {
		driver.get("https://google.com");
		WebElement q = driver.findElement(By.name("q"));
		assertNotNull(q);
		
		q.sendKeys("School of net");
		q.submit();
		
		assertNotNull(driver.findElement(By.id("hdtb-msb")));
	}
	
	@AfterClass 
	public static void after() {
		driver.close();
	}
}
