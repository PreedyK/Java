package Java_PreedyK;
import java.util.Scanner;
public class Student {
	String name;
	int regNo;
	float mark1, mark2, mark3, mark4;
	float total;
	float average;
	char grade;

	public void calcResults() {
		total = mark1 + mark2 + mark3 + mark4;
		average = total/4;
		
		if (average >= 90)
			grade = 'A';
		else if (average >= 80)
			grade = 'B';
		else if (average >= 70)
			grade = 'C';
		else if (average >= 60)
			grade = 'D';
		else
			grade = 'F';
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Reg No: " + regNo);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		System.out.println("Grade: " + grade);
		
	}


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
}
	
}


	
