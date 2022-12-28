package flowcontrols;

import java.util.Scanner;

public class ProductInformation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Product id : \n");
		int pid = in.nextInt();
		System.out.println("Enter Product name : \n");
		String pname = in.next();
		System.out.println("Enter Product price : \n");
		int pprice = in.nextInt();
		System.out.println("Enter Quantity : \n");
		String quantity = in.next();
		System.out.println("Enter Category : \n");
		String category = in.next();
		System.out.println("Enter Brand : \n");
		String brand = in.next();
		System.out.println("Product id :\n" + pid);
		System.out.println("Product name :\n" + pname);
		System.out.println("Product price :\n" + pprice);
		System.out.println("Quantity :\n" + quantity);
		System.out.println("Category :\n" + category);
		System.out.println("Brand :\n" + brand);
	}
}