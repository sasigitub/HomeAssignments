package week2Assignments.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Click on the button with the text ‘Click and Confirm title.’
		
		 driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		 
		// Verify that the title of the page is ‘dashboard.’
		String TitlePage =  driver.getTitle();
		System.out.println(TitlePage);
		if(TitlePage=="Dashboard"){
				System.out.println(TitlePage);
		}
		driver.navigate().to("https://leafground.com/button.xhtml");
		
		// Check if the button with the text ‘Confirm if the button is disabled’ is
		// disabled.
		
		boolean flag = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled() ;
		System.out.println(flag);
		if (flag) {
			System.out.println("Confirm button is enabled");
		} else {
            System.out.println("Confirm button is disabled");  
		}
		
		// Find and print the position of the button with the text ‘Submit.’
		WebElement ele = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")) ;
		System.out.println(ele.getLocation());
		
		
		// Find and print the background color of the button with the text ‘Find the
		// Save button color.’
		
		WebElement colourEle = driver.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-left ui-icon')])[2]"));
		colourEle.getCssValue("background-colour");
		
		
		// Find and print the height and width of the button with the text ‘Find the
		// height and width of this button.’
		WebElement WidHeightEle = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		
		System.out.println("Size "+ WidHeightEle.getSize());
		
		// Close the browser window.
		
		driver.close() ;

	}

}
