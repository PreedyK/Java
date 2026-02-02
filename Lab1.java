package Java_PreedyK;
import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the line to be reversed: "); 
		String text = input.nextLine();
		
		System.out.print("Enter the character to be counted for occurences: ");
		char user_char = input.next().charAt(0);
		int i;
		int num = 0;
		String rev_string = "";
		
		for (i = 0; i < text.length(); i++) {
			rev_string = rev_string + text.charAt(text.length() -1 - i);
			if (text.charAt(i) == user_char) { 
				num++;
			}
		}
		
		System.out.println("The reversed line is: " + rev_string);
		System.out.print("The no. of occurences of '" + user_char + "' is " + num);

	}

}
