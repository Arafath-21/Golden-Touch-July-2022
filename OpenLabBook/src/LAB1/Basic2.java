package LAB1;

import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value for i:...");
		int i = scan.nextInt();
		System.out.println("Enter value for j:...");
		int j = scan.nextInt();
		int multiply = i*j;
		System.out.println("The Multiplication of i and j is..:"+multiply);
	}
}
