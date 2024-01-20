package week5.Assignments.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends DefaultBaseClass {
	@Test
	public void CreateLeadAssign() {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("as");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("108");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}

	}

}
