package week3Assignments.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] a =  {1, 2, 3, 4, 10, 6, 8} ;
		
		List<Integer> b = new ArrayList<Integer>();
		
		for (Integer i : a) {
			b.add(i);
		}
		
	    Collections.sort(b);
	   
	    int lastOneIndex = b.size()-1;
	    int largest = b.get(lastOneIndex); // find the largest one
	  
	    
        for (int i = 1; i <largest; i++) {
      
        	if (b.contains(i)) {
        		
        	}else {
        		System.out.println("Missing : "+i);
        	}
			
		}	   
	   

		
	}

}
