package Java_PreedyK;
import java.util.Scanner;

public class string_variable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a kind of realtive: ");
		String relative = input.nextLine();
		
		System.out.print("Enter a kind of food: ");
		String food = input.nextLine(); 
		
		System.out.print("Enter an adjective: ");
		String adj = input.nextLine();
		
		System.out.print("Enter a time period: ");
		String time = input.nextLine(); 
		
		System.out.print("My " + relative + " says that eating " + food + " will make me more " + adj + ", so now I eat it every " + time);

	}

}
