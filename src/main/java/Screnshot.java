import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screnshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement q = driver.findElement(By.name("q"));
		q.sendKeys("School of net");
		
		File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileSrc, new File("C:/Users/leonan/Downloads/java/SeleniumTest/img.png"));
	}
}
