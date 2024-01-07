package week1Assignements.day2;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 7, 6, 8 };
		int b = 0;
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			b = i + 1; // Start from 1
			if (b == a[i]) {  //compare array and range
				continue;
			} else {
				System.out.println("First missing Element is " + b);
				break;
			}

		}

	}

}
