package week1Day1Assignments;



public class Mobile {
	//Method 1
	
		void makeCall() {
			
			String mobileModel = "RealMe";
			float mobileWeight = 1.5f; 
			System.out.println("Mobile Name :" + mobileModel);
			System.out.println("Mobile Weight :" + mobileWeight +"g");
		}
		
		
		//Method 2
		
		void sendMsg( ) {
			 
			boolean isFullCharged = true ;
			int mobileCost = 10000;
			System.out.println("Is Mobile Fully Charged :" + isFullCharged );
			System.out.println("Mobile cost is :" + mobileCost);			
		}
		
		
		public static void main(String[] args) {
			
			System.out.println("This is my mobile ");
			Mobile no1 = new Mobile() ;
			no1.makeCall();
			no1.sendMsg();
				

		}


}
