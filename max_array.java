package Java_PreedyK;
import java.util.Scanner;
public class max_array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of elements: ");
		int size = input.nextInt();
		
		int[] numbers = new int[size];
		
		for (int i = 0; i< size; i++) {
			System.out.print("Enter a value " + (i + 1) + ": ");
			numbers[i] = input.nextInt();
		}
		int max = numbers[0];
		
		for (int i = 1; i < size; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("Maximum value in the array is: " + max);

	}

}
