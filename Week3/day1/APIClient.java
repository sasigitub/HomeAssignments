package week3Assignments.day1;

public class APIClient {
	
	
	public void sendRequest(String endpoint) {
		System.out.println("End point " + endpoint);
	}
	

	public void sendRequest(String endpoint,String requestBody, boolean requestStatus) {
		
		System.out.println("End point :" + endpoint);
		System.out.println("Request :" + requestBody);
		System.out.println("Status :" + requestStatus);
		
	}
	

	public static void main(String[] args) {
		
		APIClient a = new APIClient();
		
	 System.out.println("Google");
		
		a.sendRequest("https://www.googleapis.com/youtube/v3/videos");
		
		System.out.println("Twitter");
		
		a.sendRequest("https://api.twitter.com/2/tweets/search/stream", "Twitter Request", true);
		
		

	}

}
