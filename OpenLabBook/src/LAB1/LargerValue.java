package LAB1;

public class LargerValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 8.9, b = 4.5, c = -3.5; 
		if( a >= b && a >= c) 
		System.out.println(a + " is the largest number."); 
		else if (b >= a && b >= c) 
		System.out.println(b + " is the largest number."); 
		else
		System.out.println(c + " is the largest number."); 
	}

}