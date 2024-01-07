package week4.Assignments.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Page is unavailable
		
		
	}

}
