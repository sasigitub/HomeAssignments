package week5.Assignments.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class FindContacts extends DefaultBaseClass {
	@Test
	public void FindLeadAssign() throws InterruptedException {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gokul");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text found");
		} else {
			System.out.println("Text not found");
		}

	}

}
