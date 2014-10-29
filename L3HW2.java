package day3;

import java.util.Arrays;

public class L3HW2 {

	public static void main(String[] args) {
		
		int[] src = {3, 4};
		int srcPos = 0;
		int[] dest = {1, 2, -1, -1, 5};
		int destPos = 2;
		int length = 2;
		
		//copyArray(src, srcPos, dest, destPos, length);
		
		System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.println(Arrays.toString(dest));
	}
	
	static void copyArray(int[] src, int srcPos, int[] dest, int destPos, int length){
		int[] tmp = new int[5];
//		tmp = src[srcPos];
//		dest = src[destPos];
		System.out.println(Arrays.toString(dest));
	}

}
