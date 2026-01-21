package Java_PreedyK;
import java.util.Scanner;

public class swap_numbers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = scnr.nextInt();
		
		System.out.print("Enter the second number: ");
		int b = scnr.nextInt();
		
		int temp; 
		
		temp = a;
		a = b; 
		b= temp; 
		
		System.out.println("The first number is: " + a);
		System.out.println("The second number is: " + b); 
		
	}

}
