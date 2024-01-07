package week2Assignements.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		// enter username

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// enter password crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click Login Button

		driver.findElement(By.className("decorativeSubmit")).click();

		// click crmsfa link

		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();

		// Click on Accounts Button

		driver.findElement(By.xpath("//a[(text()='Accounts')]")).click();

		// Click on Create Account

		driver.findElement(By.xpath("//a[(text()='Create Account')]")).click();

		// Enter AccountName Field Using Xpath Locator value as Debit Limited Account

		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account Sasi");

		// Enter DEscriptiion as "Selenium Automation Tester"

		driver.findElement(By.xpath("//span[text()='Description']/following::textarea[1]"))
				.sendKeys("Selenium Automation Tester");

		// Enter LocalName Field Using Xpath Locator

		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Selenium");

		// Enter SiteName Field Using Xpath Locator

		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Chennai");

		// Enter value for AnnualRevenue Field using Xpath Locator but class as
		// Attribute

		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("200000");

		// Select Industry as ComputerSoftware

		driver.findElement(By.xpath("//span[text()='Industry']/following::option[4]")).click();

		// Select OwnerShip as S-Corporation using SelectByVisibletext

		WebElement OwnerOpt = driver.findElement(By.xpath("//span[text()='Ownership']/following::select"));

		Select osel = new Select(OwnerOpt);
		osel.selectByVisibleText("S-Corporation");

		// Select Source as Employee using SelectByValue
		WebElement Sourlist = driver.findElement(By.xpath("//span[text()='Source']/following::select"));

		Select ssel = new Select(Sourlist);
		ssel.selectByValue("LEAD_EMPLOYEE");

		// Select Marketing Campaign as eCommerce Site Internal Campaign using
		// SelectbyIndex
		WebElement MarkCamo = driver.findElement(By.xpath("//span[text()='Marketing Campaign']/following::select"));

		Select msel = new Select(MarkCamo);
		msel.selectByIndex(6);

		// Select State/Province as Texas using SelectByValue
		WebElement Statelist = driver.findElement(By.xpath("//span[text()='State/Province']/following::select"));

		Select csel = new Select(Statelist);
		csel.selectByValue("TX");

		// Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}
