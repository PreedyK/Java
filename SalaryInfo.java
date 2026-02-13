package Java_PreedyK;

import java.util.Scanner;

class HRSection {
	String employee_name;
	int employee_id;
	double gross_salary;
	double net_salary;
	
	HRSection(String employee_name, int employee_id, double gross_salary){
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.gross_salary = gross_salary;
	}
	
	private void salcalculation() { 
		double fed_tax = gross_salary * 0.10;
		double state_tax = gross_salary * 0.05;
		double local_tax = gross_salary * 0.02;
		net_salary = gross_salary - (fed_tax + state_tax + local_tax);
	}
	
	public void displaySal() { 
		salcalculation();
		System.out.println("Employee Name: " + employee_name);
		System.out.println("Employee ID: " + employee_id);
		System.out.println("Gross Salary: " + gross_salary);
		System.out.println("Net Salary: " + net_salary);
	}

	

}


public class SalaryInfo { 
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Employee Name: ");
	String employee_name = input.nextLine();
	
	System.out.print("Enter Employee ID: ");
	int employee_id = input.nextInt();
	
	System.out.print("Enter Gross Salary: ");
	double gross_salary = input.nextDouble();
	
	HRSection emp1 = new HRSection(employee_name, employee_id, gross_salary);
	
	emp1.displaySal();
	
	input.close();
	}
}
