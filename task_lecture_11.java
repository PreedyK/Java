package Java_PreedyK;
import java.util.Scanner;
import java.util.ArrayList;

public class task_lecture_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> cart = new ArrayList<>();
		
		while (true) { 
			System.out.println("1. Add Product Price");
			System.out.println("2. Remove Product");
			System.out.println("3. View Cart");
			System.out.println("4. Calculate Total");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = Integer.parseInt(input.nextLine());
			
			switch (choice) {
			case 1: 
				System.out.print("Enter product price: ");
				double price = Double.parseDouble(input.nextLine());
				cart.add(price);
				System.out.println("Product addded.");
				break;
				
			case 2:
				if (cart.isEmpty()) { 
					System.out.println("Cart is empty.");
				} else { 
					System.out.print("Enter index to remove (startng from 0): ");
					int index = Integer.parseInt(input.nextLine());
					
					if (index >= 0 && index < cart.size()) { 
						cart.remove(index);
						System.out.println("Product removed.");
					} else { 
						System.out.println("Invalid Index.");
					}
				}
				break;
				
			case 3: 
				if (cart.isEmpty()) { 
					System.out.println("Cart is empty.");
				} else {
					System.out.println("Product prices in Cart:");
						for (int i = 0; i < cart.size(); i++) { 
							System.out.println("Index" + i + ": $" + cart.get(i));
						}
				}
				break;
				

			case 4: 
				double total = 0; 
				for (Double p : cart) { 
					total += p;
				}
				System.out.println("Total Price: $" + total);
				break;
				
			case 5: 
				System.out.println("Exiting program...");
				input.close();
				return;
			
			default: 
				System.out.println("Invalid choice.");
				
			}
		}
		
	}

}
