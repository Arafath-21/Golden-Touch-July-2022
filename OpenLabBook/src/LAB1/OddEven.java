package LAB1;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to Check Even or Odd ");
        int a = scan.nextInt();
        System.out.println((a%2 == 0)?"The Given Number is Even":"The Given Number is odd"
        );
	}

}