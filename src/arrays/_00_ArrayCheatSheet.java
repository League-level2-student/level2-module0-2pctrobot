package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		Random rand = new Random();
		//1. make an array of 5 Strings
		String[] arr = { " This", " is", " an", " array", "." };
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2]=" array";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		arr[2]=" an";
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
		}
		//6. make an array of 50 integers
		int[] fiftyint = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < fiftyint.length; i++) {
			int number1 = rand.nextInt(fiftyint.length);
			fiftyint[i]=number1;
		}
		
	//8. without printing the entire array, print only the smallest number in the array
		int smallest = fiftyint[0];
		for (int i = 0; i < fiftyint.length; i++) {
			if (fiftyint[i]<smallest) {
				smallest = fiftyint[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < fiftyint.length; i++) {
			System.out.println(fiftyint[i]);
		}
		//10. print the largest number in the array.
		int biggest = fiftyint[0];
		for (int i = 0; i < fiftyint.length; i++) {
			if (fiftyint[i]>biggest) {
				biggest = fiftyint[i];
			}
		}
		System.out.println(biggest);
	}
}
