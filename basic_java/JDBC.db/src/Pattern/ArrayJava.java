package Pattern;

import java.util.Scanner;

public class ArrayJava {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] input = getInput(4); // {1,2,3,4}
		
		int sumOfArray = getArraySum(input);
		
		System.out.println("\n");
		
		System.out.println("The sum of array is " + sumOfArray);
		
		System.out.println("\n");
		
		input = getArraySort(input);
		
		for(int a : input) {
			System.out.println(a);
		}
		
	} 
	
	public static int[] getInput(int num) {
		
		int[] array = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Enter your " + i + " number");
			array[i] = scanner.nextInt();
		}
		
		 return array;
	}
	
	public static int getArraySum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
	public static int[] getArraySort(int[] array) {
		
		boolean isTrue = true;
		
		while(isTrue) {
			
			isTrue = false;
			
			int temp = 0;
			
			for(int i = 0; i < array.length -1; i++) {
			    
				if(array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					
					isTrue = true;
					
				}
				
			}
			
		}
		
		return array;
		
	}
	
	
}
