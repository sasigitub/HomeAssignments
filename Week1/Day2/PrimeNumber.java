package week1Assignements.day2;

public class PrimeNumber {

	// To find whether a number is a Prime number or not
	public static void main(String[] args) {

		int input = 2, r = 0;
		boolean flag = false;
		for (int i = 2; i < input / 2; i++) {
			r = input % i;
			if (r == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {

			System.out.println("Not a Prime");

		} else {

			System.out.println("Prime");
		}

	}
}
