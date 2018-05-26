import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal");
		
		WebElement searchInput = driver.findElement(By.id("searchInput"));
		searchInput.sendKeys("dbz");
		searchInput.submit();
		
		WebElement h1 = driver.findElement(By.id("firstHeading"));
		
		if (h1.getText().contains("Dragon Ball")) {
			System.out.println(h1.getText());
			driver.close();
		} else {
			System.out.println("Failed");
		}
	}
}
