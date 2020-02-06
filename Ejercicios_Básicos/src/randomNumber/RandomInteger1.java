package randomNumber;

import java.util.ArrayList;

public class RandomInteger1 {
	
	private static ArrayList<Integer> n = new ArrayList<Integer>();
	
	public static void getNumbers() {
		for (int i = 0; i<=20; i++) {
			n.add((int)(Math.random()*10+1));
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		RandomInteger1.getNumbers();

	}

}
