import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMC {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.meu-imc.com/");
		
		driver.findElement(By.id("quest1")).sendKeys("174");
		driver.findElement(By.id("quest2")).sendKeys("72");
		driver.findElement(By.id("quest3")).sendKeys("22");
//		driver.findElement(By.id("quest4"))
		driver.findElement(By.className("form-imc__row__input-submit")).submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("imc_result-label")));
		
		System.out.println(driver.findElement(By.className("imc_result-label")).getText());
	}
}
