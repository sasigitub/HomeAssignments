package week2Assignments.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxInteractions {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();

		// Click on the "Notification Checkbox."
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		
		
		// Verify that the expected message is displayed.
		String Text = driver.findElement(By.className("ui-growl-title")).getText();


		System.out.println(" Message displayed :" + Text);
		
	

		// Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();


		// Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();


		// Verify which tri-state option has been chosen.
		String stateHasBeen = driver.findElement(By.xpath("//span[text()='State has been changed.']")).getText();
		
		
		System.out.println(stateHasBeen);

		// Click on the "Toggle Switch."

		driver.findElement(By.className("ui-toggleswitch-slider")).click();

		// Verify that the expected message is displayed.
		String checked = driver.findElement(By.className("ui-growl-message")).getText();
		System.out.println(checked);

		// Verify if the Checkbox is disabled.
		
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isEnabled());
		
		// Close the web browser when done.
		driver.close();

	}

}
