package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[] string = new String[7];
		string[0] = "zero";
		string[1] = "one";
		string[2] = "two";
		string[3] = "three";
		string[4] = "four";
		string[5] = "five";
		string[6] = "six";
		
		arrOfStrings(string);
		reverse(string);
		everyOther(string);
		random(string);
		
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void arrOfStrings(String[] s) {
		System.out.println("print all: \n");
	for(int i = 0; i<s.length; i++) {
		System.out.println( s[i] + "\n");
	}	
		
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	public static void reverse(String[] s) {
		//String[] rev = new String[s.length];
		String stri = "";
		for(int j = 1; j< s.length; j++) {
			//rev[j] = s[s.length -j];
			stri = stri + s[s.length - j] + "\n";
		}
		System.out.println("reverse: \n" + stri);
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOther(String[] s) {
			//String[] evryOthr = new String[s.length/2];
		String evryOthr = "";
			for(int k = 0; k<s.length; k++) {
				if(k%2 == 0) {
				//	evryOthr[k] = s[k];
				evryOthr = evryOthr + s[k] + "\n";
				}
				else {
					
				}
			}	
		System.out.println("every other: \n" + evryOthr);
		
		}

	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void random(String[] s) {
		// String[] rand = new String[s.length];
		

		System.out.println("random: \n");
		for(int l = 0; l <100; l++) {
			
			int z = new Random().nextInt(s.length);
			if(s[z].equals("")) {
				
			}
			else {
				System.out.println(s[z] + "\n");
				s[z] = "";
			}
			
		}
		
	
	 }
}
	

