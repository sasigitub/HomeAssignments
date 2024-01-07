package week4.Assignments.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrameAndAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Switch to the frame
		driver.switchTo().frame("iframeResult");
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Click OK/Cancel in the alert that appears
		Alert a = driver.switchTo().alert();
		a.sendKeys("Sasi");
		a.accept();

		// Confirm the action is performed correctly by verifying the text displayed
		String message = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if (message.contains("Sasi")) {
			System.out.println("Text seen in frame :" + message);
			System.out.println("Alert and Frames Handled Sucessfully");
		}

	}

}
