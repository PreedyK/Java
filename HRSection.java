package Java_PreedyK;
import java.util.Scanner;

public class HRSection {
	String employee_name;
	int employee_id;
	double gross_salary;
	double net_salary;
	
	HRSection(String employee_name, int employee_id, double gross_salary, double net_salary){
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.gross_salary = gross_salary;
	}
	
	private void salcalculation() { 
		double fed_tax = gross_salary * 0.10;
		double state_tax = gross_salary * 0.05;
		double local_tax = gross_salary * 0.02;
	}
	
	public void displaySal(float fed_tax, float state_tax, float local_tax, float net_salary) { 
		System.out.println(this.net_salary);
	}

	

}


class SalaryInfo { 
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	HRSection sal1 = new HRSection();
	sal1.displaySal();
	}
}