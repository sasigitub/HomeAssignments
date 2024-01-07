package week3Assignments.day1;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		
		System.out.println("Perform Common Tasks- Login Page");
	}
	
	public static void main(String[] args) {
		
		LoginPage l = new LoginPage();
		BasePage b = new BasePage();
		
		l.findElement();
		l.performCommonTasks();
		l.clickElement();
		
		b.findElement();
		b.performCommonTasks();
		b.clickElement();
		
	}

}
