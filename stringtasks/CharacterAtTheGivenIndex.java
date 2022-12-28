package stringtasks;

public class CharacterAtTheGivenIndex {

	public static void main(String[] args) {

		String str = "String Tasks";
		System.out.println("Original String = " + str);
		// Get the character at positions 0 and 11.
		int index1 = str.charAt(0);
		int index2 = str.charAt(11);
		System.out.println("The character at position 0 is " + (char) index1);
		System.out.println("The character at position 11 is " + (char) index2);
	}
}