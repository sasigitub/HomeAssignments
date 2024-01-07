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

public class AutomateAmazonAction {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Search for "oneplus 9 pro".
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Get the price of the first product.
		String price  = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("First Product Price :" + price);
		driver.findElement(By.xpath("(//i[contains(@class,'star')])[1]")).click();
		
		
		// Print the number of customer ratings for the first displayed product.
		WebElement mouseEle = driver.findElement(By.xpath("(//i[contains(@class,'star')])[1]"));
		Actions m = new Actions(driver);
	   // Point location = mouseEle.getLocation();
	   // int x = location.getX();
	  //  int y = location.getY(); 
	    m.scrollToElement(mouseEle);	
	   
		WebElement rating = driver.findElement(By.xpath("//span[contains(text(),'global ratings')]"));		  
		System.out.println("Customer Rating for the product :" + rating.getText());
		
		// Click the first text link of the first image.

		WebElement element = driver.findElement(By.xpath("//img[@class='s-image']"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		element.click();
		
		//move to new window
		Set<String> hdl=driver.getWindowHandles();	
		List<String> hdlList=new ArrayList<String>(hdl);
		driver.switchTo().window(hdlList.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Take a screenshot of the product displayed.
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/amz.png");
		FileUtils.copyFile(source,dest);
		System.out.println("Screenshot Taken");
		
		// Click the 'Add to Cart' button.
		driver.findElement(By.id("add-to-cart-button")).click();
		
		// Get the cart subtotal and verify if it is correct.
		String cartSubtotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		if (price.contains(cartSubtotal)) {
			System.out.println("Price Verified :"+ price);
		}
		// Close the browser.
		driver.close();


	}

}
