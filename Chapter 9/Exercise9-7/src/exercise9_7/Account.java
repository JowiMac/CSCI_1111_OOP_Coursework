package exercise9_7;

/* John Macdonald
 * Sept. 23, 2022
 * 
 * Implementation
 * for Exercise 9-7
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

Account(int newId, double newBalance, double newAnnualInterestRate){
	id = newId;
	balance = newBalance;
	annualInterestRate = setAnnualInterestRate(newAnnualInterestRate);
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

double getAnnualInterestRate() {
	return annualInterestRate;
}

double setAnnualInterestRate(double newAnnualInterestRate) {
	annualInterestRate = newAnnualInterestRate / 100;
	return annualInterestRate;
}

Date getDateCreated() {
	java.util.Date date = new java.util.Date();
	return date;
}

double getMonthlyInterestRate() {
	double monRate = annualInterestRate / 12;
	return monRate;
}

double getMonthlyInterest() {
	double totalInter = (getMonthlyInterestRate()) * balance;
	return totalInter;
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




