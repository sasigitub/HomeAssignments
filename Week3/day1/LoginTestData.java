package week3Assignments.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter username : TestUSer");
	}
	public void enterPassword() {
		
		System.out.println("Enter Password : ******");
		
	}
	
	public static void main(String[] args) {
		
		TestData t = new TestData();
		LoginTestData l = new LoginTestData();
		t.navigateToHomePage();
		
		t.enterCredentials("Rekha") ;
		l.enterUsername();
		l.enterPassword();
		
		
	}

}
