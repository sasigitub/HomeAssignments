package week4.Assignments.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateNykaaActions {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Mouseover on "Brands" and search for "L'Oreal Paris".
		// Click on "L'Oreal Paris".

		WebElement Brd = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions Brdmouse = new Actions(driver);
		Brdmouse.moveToElement(Brd).perform();
		driver.findElement(By.linkText("L")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		System.out.println("Clicked Loreal Paris");

		// unable to proceed as nykaa page is blocked F
		// Check if the title contains "L'Oreal Paris".
		// Click on "Sort By" and select "Customer Top Rated".
		// Click on "Category" and select "Hair" -> "Haircare" -> "Shampoo".
		// Click on "Concern" -> "Color Protection".
		// Check if the filter is applied with "Shampoo".
		// Click on "L'Oreal Paris Colour Protect Shampoo".
		// Go to the new window and select the size as "180 ml".
		// Print the MRP of the product.
		// Click on "ADD to BAG".
		// Go to the Shopping Bag.
		// Print the Grand Total amount.
		// Click "Proceed".
		// Click on "Continue as Guest".
		// Check if the Grand Total is the same as in step 14.
		// Close all windows.

	}

}
