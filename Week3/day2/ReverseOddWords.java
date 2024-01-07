package week3Assignments.day2;

public class ReverseOddWords {

	// Build a logic to reverse the even position words (output: I ma a erawtfos
	// tester)

	public String reverse(String str) {

		char ch[] = str.toCharArray();
		String a = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			a = a + ch[i];

		}
		return a;
	}

	public static void main(String[] args) {

		String b, Result = "";
		int count = 1;
		ReverseOddWords r = new ReverseOddWords();
		String test = "I am a software tester";
		String StrArray[] = test.split(" ");

		for (String string : StrArray) {
			if (count % 2 == 0) {
				b = r.reverse(string);
				Result = Result + " " + b;
			}else {
				Result = Result + " " + string ;
			}
			count++;
		}

		System.out.println(Result);
	}

}
