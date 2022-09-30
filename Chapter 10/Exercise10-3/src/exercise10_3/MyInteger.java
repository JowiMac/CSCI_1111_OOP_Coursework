//John Macdonald, Sept. 27, 2022
//Implementation for Exercise 10-3

package exercise10_3;

public class MyInteger {
	
	//Data Fields
	int value = 0;
	
	//Constructor
	MyInteger(int newValue){}

	
	//Methods
	int getValue(int newValue){
		value = newValue;
		return value;
	}
	
	boolean isEven(int value){
		if (value % 2 == 0) 
			return true;	
		else
			return false;
	}
	
	boolean isOdd(int value){
		if (value % 2 == 1) 
			return true;	
		else
			return false;
	}
	
	boolean isPrime(int value){
		if (value % 3 >= 1 || value == 2 || value == 3) 
			return true;	
		else
			return false;
	}
	
	static boolean isEvenn(int value){
		if (value % 2 == 0) 
			return true;	
		else
			return false;
	}
	
	static boolean isOddd(int value){
		if (value % 2 == 1) 
			return true;	
		else
			return false;
	}
	
	static boolean isPrimee(int value){
		if (value % 3 >= 1 || value == 2 || value == 3) 
			return true;	
		else
			return false;
	}

	static boolean isEven(MyInteger MyInteger){
		if (MyInteger.value % 2 == 0) 
			return true;	
		else
			return false;
	}
	
	static boolean isOdd(MyInteger MyInteger){
		if (MyInteger.value % 2 == 1) 
			return true;	
		else
			return false;
	}
	
	static boolean isPrime(MyInteger MyInteger){
		if (MyInteger.value % 3 >= 1 || MyInteger.value == 2 || MyInteger.value == 3) 
			return true;	
		else
			return false;
	}
	
	boolean equals(int value){
		if(value == value)
			return true;
		else
			return false;	
	}
	
	boolean equals(MyInteger MyInteger){
		if(MyInteger.value == value)
			return true;
		else
			return false;
	}
	
	static int parseInt(char a[]){
		int j = 0;
		for(int i = 0; i < 3; i++) {
			int c = Integer.valueOf(a[i]);
			j = c + j;
		}
		return j;	
	}
	
	static int parseInts(String s){
		int t = 0;
		for(int o = 0; o < s.length(); o++)
		t = Integer.valueOf(s.charAt(o)) + t;
		return t;
	}
	
}//Class MyInteger end
