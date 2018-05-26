import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		WebElement q = driver.findElement(By.name("q"));
		
		if (q != null) {
			q.sendKeys("School of net");
			q.submit();
		}
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}
}
