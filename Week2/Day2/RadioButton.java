package week2Assignments.day2;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();

		// Click on a radio button, then click on the same radio button again to verify
		// that
		// it becomes ‘unselected’.
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).click();

		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).click();

		boolean flag = driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).isSelected();
		System.out.println(flag);
		if (flag == false) {
			System.out.println("Radio button is unselected now");
		}

		// Identify the radio button that is initially selected by default.

		List<WebElement> radioButtonlist = driver.findElements(By.xpath("(//div[@class='card'])[3]//td/div//input"));
		int pos = 0;
		for (WebElement webElr : radioButtonlist) {
			pos++;
			if (webElr.isSelected()) {
				System.out.println("Radio button is selected by default on position" + pos);
				break;
			}

		}

		// Check and select the age group (21-40 Years) if not already selected.
		boolean flag2 = false;
		int pos1 = 0;

		List<WebElement> radioButtonlist2 = driver
				.findElements(By.xpath(("(//div[@class='card'])[4]/div/div/div/div//input")));
		for (WebElement webElr1 : radioButtonlist2) {
			pos1++;
			if (webElr1.isSelected()) {
				flag2 = true;
				System.out.println("Age Group is selected by default on pos" + pos1);
				break;
			}

		}
		if (flag2 == false) {

			System.out.println("Age Group  is not selected by default");
			driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-blank']")).click();
		}

	}

}
