package LAB1;
import java.util.Scanner;
public class Floydtri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, number = 1, counter, j; 
		 //To get the user's input
		 Scanner input = new Scanner(System.in); 
		 System.out.println("Enter the number of rows for floyd's triangle:"); 
		 //Copying user input into an integer variable named rows
		rows = input.nextInt(); 
		 System.out.println("Floyd's triangle"); 
		 System.out.println("****************"); 
		 for ( counter = 1 ; counter <= rows ; counter++ ) 
		 { 
		 for ( j = 1 ; j <= counter ; j++ ) 
		 { 
		 System.out.print(number+" "); 
		 //Incrementing the number value
		 number++;
		 }
		 System.out.println();
		 }
	}

}