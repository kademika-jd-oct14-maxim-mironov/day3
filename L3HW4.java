package day3;

public class L3HW4 {

	public static void main(String[] args) {
		
		System.out.println(factorial(10));

	}
	
	static long factorial(int num) {
		if (num <= 0){
		return 1;	
		}
		
		long result = num;
		for (int i = 1; i <= num; i++){
			result *= i;
		}
		
		return result;
		
	}

}
