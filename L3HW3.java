package day3;

import java.util.Arrays;

public class L3HW3 {

	public static void main(String[] args) {

		
		System.out.println(inverse("Maxime"));
	}
	
	static String inverse(String str){
		String result = null;
		char[] chars = str.toCharArray();
		char ch;
		
		for (int i = 0; i < chars.length / 2; i++){
			ch = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length -1 -i] = ch;
			return new String(chars);
		}
		
		return result;
		
	}

}
