package week3Assignments.day1;

 public interface DatabaseConnection {
	 
	 public abstract void connect();
	 public abstract void disconnect();
	 
	 public abstract void executeUpdate();
	  
}
