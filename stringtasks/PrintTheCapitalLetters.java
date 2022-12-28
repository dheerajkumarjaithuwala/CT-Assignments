package stringtasks;

public class PrintTheCapitalLetters {

	public static void main(String[] args) {

		String str = "Welcome To Carrertuner";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
	}
}