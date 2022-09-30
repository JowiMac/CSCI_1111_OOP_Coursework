package exercise10_3;

import java.util.Scanner;

public class TestMyInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value to test: ");
		int newValue = input.nextInt();
		
		MyInteger MyInteger = new MyInteger(newValue);
		
		System.out.println("\nThis is the getValue() method: " + MyInteger.getValue(newValue) + "\n");
		System.out.println("This is the isEven method: " + MyInteger.isEven(newValue));
		System.out.println("This is the isOdd method: " + MyInteger.isOdd(newValue));
		System.out.println("This is the isPrime method: " + MyInteger.isPrime(newValue) + "\n");

		System.out.println("This is the static isEvenn method: " + MyInteger.isEvenn(newValue));
		System.out.println("This is the static isOddd method: " + MyInteger.isOddd(newValue));
		System.out.println("This is the static isPrimee method: " + MyInteger.isPrimee(newValue) + "\n");
		
		System.out.println("This is the static isEven(MyInteger MyInteger) method: " + MyInteger.isEven(MyInteger));
		System.out.println("This is the static isOdd(MyInteger MyInteger) method: " + MyInteger.isOdd(MyInteger));
		System.out.println("This is the static isPrime(MyInteger MyInteger) method: " + MyInteger.isPrime(MyInteger) + "\n");
		
		System.out.println("This is the equals(int value) method: " + MyInteger.equals(newValue));
		System.out.println("This is the equals(MyInteger MyInteger) method: " + MyInteger.equals(MyInteger) + "\n");
		
		System.out.println("The numbers 1,2, and 3 are in the array");
		char a[] = {'1', '2', '3'};
		System.out.println("This is the parseInt(char[]) method: " + MyInteger.parseInt(a));

		System.out.print("\nEnter a String to convert into an integer: ");
		String s = input.next();
		System.out.println("This is the parseInts(String) method: " + MyInteger.parseInts(s));
	}//method main end

}//class TestMyInteger end
