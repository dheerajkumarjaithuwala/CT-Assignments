package stringtasks;

public class SpecifiedSequenceOfCharValues {

	public static void main(String[] args) {

		String str1 = "welcome to carrertuner";
		String str2 = "to";
		System.out.println("Original String: " + str1);
		System.out.println("Specified sequence of char values: " + str2);
		System.out.println(str1.contains(str2));
	}
}