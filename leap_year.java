package Java_PreedyK;
import java.util.Scanner;
public class leap_year {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0){
					System.out.println("The year is a leap year (it has 366 days).");
				} else {
					System.out.println("The year is not a leap year (it has 365 days).");
				}
			} else {
				System.out.print("This year is a leap year (it has 366 days).");
			}
		} else {
			System.out.print("This year is not a leap year (it has 365 days)");
		}

	}

}
