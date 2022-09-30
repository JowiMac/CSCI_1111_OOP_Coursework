package exercise10_7;

/* John Macdonald
 * Sept. 28, 2022
 * 
 * Implementation
 * for Exercise 10-7
 * 
 * I can increase the array to a crazy number so
 * it can run many times, but I'll leave it at 10.
 * 
 * This program would run forever if it was not
 * confined by the array, with simple modifications.
 */

import java.util.Scanner;
import java.util.Date;

public class TestAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] array = new int[10];
		
		int a = 0;
		
		for(int r = 0; r < 1;) {
			
		System.out.print("Enter a new ID number: ");
		array[a] = input.nextInt();
		
		for(int k = 0; k < 1;) {
		
		int x = 0;
		
		for(int c = 0; c < a + 1; c++) {
		
			if (array[a] == array[c]) {
			x++;	
			}
			
			if (x == 2) {
				System.out.println("\n\n\nPlease enter a different id number."
						+ "\n This one is already taken.\n\n");
				x = 0;
				a = a - 1;
				c = 10;
				k = 1;
			}
		}//for loop c end
		
		if(k == 1) {a++;}
		else {
		
		int newId = array[a];
		double balanceStart = 100.00;
		Account Account = new Account(array[r], balanceStart);
		
		//Identification
		Account.setId(newId);
		System.out.println("Your ID number is: " + Account.getId());
		System.out.println("This was created on " + Account.getDateCreated());
		System.out.printf("Your balance is $%6.2f \n\n", Account.getBalance());

		
		for(int j = 0; j < 4;) {
		
		double newBalance = balanceStart;
		
		if (j == 0) {
		System.out.print("Enter a 1 to check the balance,\n"
				+ "Enter a 2 to withdraw an ammount,\n"
				+ "Enter a 3 to deposit an ammount,\n"
				+ "Enter a 4 to return to the main menu\n"
				+ "\n  What would you like to do? ");
		j = input.nextInt();
		}
		
		if (j == 1) {
		//Balance
		System.out.printf("Your balance is $%6.2f \n\n", Account.getBalance());
		j = 0;
		}
		
		if (j == 2) {
		//Withdraw
		System.out.print("How much would you like to withdraw? ");
		double withdrawing = input.nextDouble();
		newBalance = Account.withdraw((Account.getBalance()), withdrawing);
		Account.setBalance(newBalance);
		j = 0;
		}
		
		if (j == 3) {
		//Deposit
		System.out.print("How much would you like to deposit? ");
		double depositing = input.nextDouble();
		newBalance = Account.deposit((Account.getBalance()), depositing);
		Account.setBalance(newBalance);
		j = 0;
		}
		
		if (j < 0) {
			System.out.println("Please enter a positive number and try again\n");
			j = 0;
		}
		
		
		
		}//for loop j end
		
		a++;
		k++;
		}//for loop k end
		
		}//conditional if else statement end
		System.out.println("\nThese Id's are already created.");
		for(int u = 0; u < a; u++) {
		System.out.print(array[u] + " ");
		}//for loop u end
		System.out.println("\n");
		}//for loop r end
		
	}//method main end
}//class TestAccount end
