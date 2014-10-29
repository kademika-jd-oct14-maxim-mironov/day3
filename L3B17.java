package day3;

import java.util.Arrays;

public class L3B17 {

	public static void main(String[] args) {
		
		int[] data = {5, 3, 2, 1, 6};
		swap(data);
		
		System.out.println(Arrays.toString(data));

		}
		
		static void swap(int[] data){
				int tmp;
				
				if (data != null){
					for (int i = 0; i < data.length -1; i++){
						if (data[i] > data[i + 1]){
						tmp = data[i];
						data[i] = data[i + 1];
						data[i + 1] = tmp;
						}
				}
				}
				}
}
