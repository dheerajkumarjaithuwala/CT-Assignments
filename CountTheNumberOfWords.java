package stringtasks;

public class CountTheNumberOfWords {

	public static void main(String[] args) {

		String str = "welcome to carrertuner";

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Count the number of words in a string : " + count);
	}
}