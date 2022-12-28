/*Convert the second occurrence of ‘ l ’ into  capital from “bvrit college”.*/
package stringtasks;

public class SecondOccurrenceOfL {

	public static void main(String[] args) {
		String str = "bvrit college";
		System.out.println("Statement before Change : \n" + str);
		System.out.println("Statement after Change : \n" + str.replace("ll", "lL"));
	}

}