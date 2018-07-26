package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] s = {"one", "two", "three", "four", "five"};
		//2. print the third element in the array
			System.out.println(s[2]);
		//3. set the third element to a different value
			s[2] = "different value";
		//4. print the third element again
			System.out.println(s[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i< s.length; i++) {
			s[i] = "a string of your choice";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int j = 0; j< s.length; j++) {
			System.out.println(s[j]);
		}
		//7. make an array of 50 integers
			Integer[] iNt = new Integer[50];
		//8. use a for loop to make every value of the integer array a random number
			for (int k = 0; k < iNt.length; k++) {
				iNt[k] = new Random().nextInt();
			}
		//9. without printing the entire array, print only the smallest number on the array	
			int smallest = iNt[0];
			for (int l = 0; l < iNt.length - 1; l++) {
					
				 if(smallest > iNt[l + 1 ]) {
					smallest = iNt[l +1];
				}
				
			}
	System.out.println("smallest number: " + smallest);
			
			
			
		//10 print the entire array to see if step 8 was correct
			for (int m = 0; m < iNt.length; m++) {
				System.out.println(iNt[m]);
			}
		//11. print the largest number in the array.
			int largest = iNt[0];
			for (int l = 0; l < iNt.length - 1; l++) {
					
				 if(largest < iNt[l + 1 ]) {
					largest = iNt[l +1];
				}
				
			}
	System.out.println("largest number: " + largest);
		//12. print only the last element in the array
		System.out.println("last element in the array: " + iNt[iNt.length-1]);
	}
}
