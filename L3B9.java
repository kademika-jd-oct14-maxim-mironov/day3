package day3;

import java.util.Arrays;

public class L3B9 {

	public static void main(String[] args) {

		int[] data = {1, 10, 5, 7, 6};	
		printArray(data);
		System.out.println(Arrays.toString(data));
		
	}
	
	static void printArray(int[] data){
		for (int x : data){
		System.out.println(x);
		}	
	}
}
