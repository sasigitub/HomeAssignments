package week3Assignments.day2;


public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		int count = 1;
		String result = "";
		char ich ;

		for (int i = 0; i < ch.length; i++) {

			ich = ch[i];
			if (count % 2 == 1) {
				ich = Character.toUpperCase(ch[i]);
			}
			count++;
			result = result + ich;
		}

		System.out.println("Result of ChangeOddindex is  " + result);
	}
}
