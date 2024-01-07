package week3Assignments.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String Resulttext = "";
		
		Set <String> unique = new LinkedHashSet<String>();
		
		String strArray[] = text.split(" ");
		
		for (int i = 0; i < strArray.length; i++) {
			
			unique.add(strArray[i]) ;
		}
			
		for (String string : unique) {
			Resulttext = Resulttext + " " + string ;	
		}
		
		System.out.println(Resulttext);
		
		
	}
}
