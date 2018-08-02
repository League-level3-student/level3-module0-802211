package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[] string = new String[8];
		
		
		
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void arrOfStrings(String[] s) {
		
	for(int i = 0; i<s.length; i++) {
		System.out.println("print all: \n" + s[i]);
	}	
		
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	void reverse(String[] s) {
		String[] rev = new String[s.length];
		for(int j = 0; j< s.length; j++) {
			rev[j] = s[s.length - 1];
		}
		System.out.println("reverse: \n" + rev);
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
		void everyOther(String[] s) {
			String[] evryOthr = new String[s.length/2];
			for(int k = 0; k<s.length; k++) {
				if(k%2 == 0) {
					evryOthr[k] = s[k];
				}
				else {
					
				}
			}	
		System.out.println("every other: \n" + evryOthr);
		
		}
		
		
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	 void random(String[] s) {
		 for(int l = 0; l<s.length; l++) {
			 //\\//\\//@.@\\||!*! START HERE !*!||//@.@\\//\\//\\
		 }
	 }
	
}
