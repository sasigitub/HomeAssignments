package week3Assignments.day2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceAjio {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.tagName("input")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();

		driver.findElement(By.xpath("(//label[contains(@class,'genderfilter')])[2]")).click();

		Thread.sleep(2000);
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);

		// Print the count of the items found.
		String itemsFound = driver.findElement(By.xpath("//div[contains(@aria-label,'Items Found')]")).getText();

		System.out.println(itemsFound);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='brands']")).click();

		driver.findElement(By.id("verticalsizegroupformat-brand")).click();

		// Get the list of brand of the products displayed in the page and print the
		// list.
		Set<WebElement> unique = new HashSet<WebElement>();

		List<WebElement> modalList = driver.findElements(By.xpath("//label[contains(@for,'modal')]"));
		
		System.out.println("Brands list is :");
		for (WebElement m : modalList) {
			boolean add = unique.add(m);
			if(add) {
				System.out.println(m.getText());				
			}
		}
		
		//close Brands Window
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		
		// Get the list of names of the bags and print it
		
		List<WebElement> bagsList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		System.out.println("Bags list is :");

		for (WebElement b : bagsList) {
			
			System.out.println(b.getText());
		}
		
		
	}
}
