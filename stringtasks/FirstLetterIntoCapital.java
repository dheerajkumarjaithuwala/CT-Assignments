package stringtasks;

public class FirstLetterIntoCapital {
	public static void main(String[] args) {

		String s = "java standard edition";

		String firstLetter = s.substring(0, 1);
		String remainingLetters = s.substring(1, s.length());

		firstLetter = firstLetter.toUpperCase();

		s = firstLetter + remainingLetters;
		System.out.println("Name: " + s);

	}
}