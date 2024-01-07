package week3Assignments.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SecondLargest {

	
	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		List<Integer> b = new ArrayList<Integer>();
		
		for (int i : a) {
			
			b.add(i);
		}
         Collections.sort(b);
         int indexSize = b.size() - 2 ;
         
         System.out.println(b);
    
         
         System.out.println("Second Largest no " + b.get(indexSize));
	}

    
}
