package week3Assignments.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		String Name = "PayPal India";
		Name = Name.replace(" ", "");

		char ch[] = Name.toCharArray();

		Set<Character> charSet  = new TreeSet<Character>();
		Set<Character> ducharSet  = new TreeSet<Character>();
		


		for (int i = 0; i < ch.length; i++) {
			boolean add = charSet.add(ch[i]);
			if(!add) {
				ducharSet.add(ch[i]);
				
			}
			
		     
		}

	 System.out.println("Character :"+charSet);
	 System.out.println("Duplicate Character set :"+ducharSet);
	}
	

}
