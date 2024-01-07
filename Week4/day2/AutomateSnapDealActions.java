package week4.Assignments.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateSnapDealActions {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Go to "Men's Fashion".
		WebElement mf = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions a = new Actions(driver);
		a.moveToElement(mf).perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Go to "Sports Shoes"
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Get the count of sports shoes.
		String items = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Sports shoes " + items);

		Thread.sleep(4000);
		// Click on "Training Shoes".
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		
		Thread.sleep(4000);

		// Sort the products by "Low to High".
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-expand-arrow')]")).click();
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();

		
		Thread.sleep(4000);
		// Check if the displayed items are sorted correctly.

		String rs = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
		System.out.println("First one price " + rs);
		
		List<WebElement> PriceList = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		Thread.sleep(4000);

		// Select any price range ex:(500-700).
		
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("500");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("700");

		
		driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();

		Thread.sleep(4000);
	
		// Filter by any colour.
		driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		
		
		Thread.sleep(4000);

		// Verify all the applied filters.
		String blackshoe = driver.findElement(By.className("product-title")).getText();
		if (blackshoe.contains("Black")) {
			System.out.println("Colour Filter verified");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Mouse hover on the first resulting "Training Shoes".
		WebElement ts = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions s = new Actions(driver);
		s.moveToElement(ts).perform();

		// . Click the "Quick View" button.
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();

		// . Print the cost and the discount percentage.
		
		String cost = driver.findElement(By.className("payBlkBig")).getText();
		System.out.println("Cost :" + cost);
		String off = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("percent " + off);

		// Take a snapshot of the shoes.

		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/shoe.png");
		FileUtils.copyFile(source, dest);
		System.out.println("Screenshot Taken");
		
	
		// Close the main window.

		driver.close();

	}

}
