package week3Assignments.day1;

public class ConcreateClass implements DatabaseConnection{



	public void connect() {
		
		System.out.println("DataBase Connected");
		
	}

	public void disconnect() {
		
		System.out.println("DataBase disconnected");
		// TODO Auto-generated method stub
		
	}

	public void executeUpdate() {
		
		System.out.println("Execute the Update");
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreateClass c = new ConcreateClass();
		c.connect();
		c.executeUpdate();
		c.disconnect();

	}
}
