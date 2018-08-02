package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
			int x = 0;
			for(int i = 0; i < values.length; i++) {
				x = values[i] + x;
			}
		return x;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		double y = 0;		
		for(int j = 0; j < values.length; j++) {
			y = values[j] + y;
		}
		double z = y/values.length;
		
		
		return z;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
	boolean b = false;
		for(int k = 0; k < array.length; k++) {
			if(array[k] == value) {
				return true;
			}
		}
		return b;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		for(int h = 0; h < arr.length; h++) {
		if(arr[h] == value) {
			return h;
		}
		
		}
		return -1;
	}
}
