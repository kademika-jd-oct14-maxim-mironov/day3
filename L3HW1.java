package day3;

import java.util.Arrays;

public class L3HW1 {

	public static void main(String[] args) {

		double[] array = {211.1, 5.8, 8.3, 12, 3.9};
		double number = 3.9;
		
		System.out.println(findElement(array, number));
		
		
	}
	
	static int findElement(double[] numbers, double el){

		for (double x : numbers){
			if (x == el){
				return (int)x;	
			}
			}
		return -1;
	}

}