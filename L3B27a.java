package day3;

import java.util.Arrays;

public class L3B27a {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 5, 6, 7 };
		int[] data2 = { 3, 2, 1, 3, 5, 6 };

		union(data, data2);

	}

	static int[] union(int[] data1, int[] data2) {
		int[] result = new int[data1.length + data2.length];
		System.out.println(Arrays.toString(result));

		System.arraycopy(data1, 0, result, 0, data1.length);
		System.arraycopy(data2, 0, result, data1.length, data2.length);
		System.out.println(Arrays.toString(result));

		// int i = 0;
		// for (; i < data.length; i++) {
		// result[i] = data[i];
		// System.out.println(Arrays.toString(result));
		// }
		//
		// for (int k = 0; k < data2.length; k++){
		// result[i++] = data2[k];
		// System.out.println(Arrays.toString(result));
		// }

		return result;
	}

}
