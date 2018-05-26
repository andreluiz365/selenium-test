import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().getCookies());
		
		driver.get("https://google.com");
	}
}
