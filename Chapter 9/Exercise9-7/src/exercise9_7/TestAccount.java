package exercise9_7;

/* John Macdonald
 * Sept. 23, 2022
 * 
 * Implementation
 * for Exercise 9-7 
 */

import java.util.Scanner;
import java.util.Date;

public class TestAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account Account = new Account();
		
		//Identification
		System.out.print("Create an Id number: ");
		int newId  = input.nextInt();
		Account.setId(newId);
		System.out.println("Your ID number is: " + Account.getId());
		System.out.println("This was created on " + Account.getDateCreated() + "\n");
		
		//Balance
		System.out.print("What is the starting balance? ");
		double newBalance = input.nextDouble();
		Account.setBalance(newBalance);
		System.out.printf("Your balance is $%6.2f \n\n", Account.getBalance());
		
		//Interest Rate
		System.out.print("What is the interest rate? ");
		double newAnnualInterestRate = input.nextDouble();
		Account.setAnnualInterestRate(newAnnualInterestRate);
		System.out.print("The interest rate is " + Account.getAnnualInterestRate() + "\n\n");
		
		//Withdraw
		System.out.print("How much would you like to withdraw? ");
		double withdrawing = input.nextDouble();
		newBalance = Account.withdraw((Account.getBalance()), withdrawing);
		Account.setBalance(newBalance);
		System.out.printf("Your balance is %6.2f \n\n", Account.getBalance());
		
		//Deposit
		System.out.print("How much would you like to deposit? ");
		double depositing = input.nextDouble();
		newBalance = Account.deposit((Account.getBalance()), depositing);
		Account.setBalance(newBalance);
		System.out.printf("Your balance is %6.2f \n\n", Account.getBalance());
		
		System.exit(0);		
		
	}//method main end
}//class TestAccount end
