package week3Assignments.day2;

import java.util.HashSet;

import java.util.Set;



public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String Name = "sasirekha";
		char ch[] = Name.toCharArray();

		Set<Character> unique = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {

			unique.add(ch[i]);

		}

		
		String Result = "" ;
		for (Character c : unique) {
			
			Result = Result+c ;
						
		}
		
		System.out.println("Result name :" +Result);
	}
	
	

}
