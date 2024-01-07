package week1Assignements.day2;

public class Palindrome {
	// Check the given number is palindrome or not

	public static void main(String[] args) {

		int num = 34343, sum = 0, temp = 0, r = 0;
		temp = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (temp == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome");
		}

	}
}
