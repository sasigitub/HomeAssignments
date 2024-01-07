package week1Assignements.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// To find Fibonacci Series for a given range
	
		System.out.println("Fibonacci series up to 8");
		
		int firstNum = 0 ,secNum = 1 , sum = 0 ;//initialize 3 int variables
		
		System.out.println(firstNum);// Print first number

		for (int range = 1; range < 10; range++) {// Iterate from 1 to the range
			
			sum = firstNum + secNum ; //add first and second number assign to sum
			firstNum = secNum ; //Assign second number to the first number
			secNum = sum ; //Assign sum to the second number	
			
			System.out.println(sum);//print sum
			
		}

	}

}
