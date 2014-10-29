package day3;

import java.util.Arrays;
import java.util.Random;

public class L3B24 {

	public static void main(String[] args) {

		int[] dataK = randomArray(10000);
//		sort(dataK);
		Arrays.sort(dataK);
		
		System.out.println(Arrays.toString(dataK));

	}
	
	static int[] createArray(int dimension){
		int[] data = new int[dimension];
		int cValue = dimension;
		for (int i = 0; i < data.length; i++){
			data[i] = cValue--;
		}
		
	return data;	
	}
	
	static void swap(int[] data, int i, int k){
		int tmp;
		if (data[i] > data[k]){
			tmp = data[k];
			data[k] = data[i];
			data[i] = tmp;
		}
		
		}
	
	static void sort(int[] data){
		long time = System.currentTimeMillis();
		
		if (data != null){
			int activeLength = data.length -1;
			for (int i = 0; i < data.length -1; i++){
				for (int k = 0; k < activeLength; k++){
					swap(data, k, k + 1);		
				}
				activeLength--;
			}
		}
		System.out.println(System.currentTimeMillis() - time);
	}
	
	static int[] randomArray(int dimension){
		int[] data = new int[dimension];
		Random r = new Random();
		int cValue = dimension;
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(dimension);
			data[i] = cValue--;
		}
		return data;
	}
	

}
