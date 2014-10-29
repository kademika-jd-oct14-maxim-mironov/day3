package day3;

public class L3HW5 {

	public static void main(String[] args) {

		printArray(new String[][] {
				{"Oleg", "Kotov"},
				{""},
				{"Irina", "Larina", "36"},
		});

	}
	
	static void printArray(String[][] data) {
		for (String[] cell : data) {
			for (String s : cell) {
				if (s != null){
					System.out.println(s + " ");
				}
			}
			System.out.println();
		}
	}

}
