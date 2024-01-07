package week3Assignments.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	
public static void main(String[] args) {
	
	String[] str =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
	
	List<String> strList = new ArrayList<String>();
	
	for (String s : str) {
		
		strList.add(s);
	}

	Collections.sort(strList);
	
	for (int i = strList.size()-1; i >=0 ; i--) {
		
		System.out.println(strList.get(i));
		
	}
}

}
