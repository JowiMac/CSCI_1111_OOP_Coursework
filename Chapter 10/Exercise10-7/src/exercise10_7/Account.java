package exercise10_7;

/* John Macdonald
 * Sept. 28, 2022
 * 
 * Implementation
 * for Exercise 10-7
 */

import java.util.Date;

public class Account {

//Data Fields
private int id = 0;
private double balance = 0;
private double annualInterestRate = 0;
private long dateCreated = System.currentTimeMillis();



//constructors

Account(){}

Account(int newId, double newBalance){
	id = newId;
	balance = newBalance;
}

//get methods dont normally receive numbers.....

//methods

int getId() {
	return id;
}

int setId(int newId) {
	id = newId;
	return newId;
}

double getBalance() {
	return balance;
}

double setBalance(double newBalance) {
	balance = newBalance;
	return balance;
}

Date getDateCreated() {
	java.util.Date date = new java.util.Date();
	return date;
}

double withdraw(double balance, double withdrawing) {
	balance = balance - withdrawing;
	return balance;
}

double deposit(double balance, double depositing) {
	balance = balance + depositing;
	return balance;
}

}//class Account end