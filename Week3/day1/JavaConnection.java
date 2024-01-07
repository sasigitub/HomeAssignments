package week3Assignments.day1;

public class JavaConnection extends MySqlConnection{

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("JAva Connected");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println(" Disonnected");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Query Executed");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection  j = new JavaConnection();
		System.out.println("JavaConnection loading");
		j.connect();
		j.executeQuery();
		j.executeUpdate();
		j.disconnect();
		
	}

}
