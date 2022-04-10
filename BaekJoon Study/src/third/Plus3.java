package third;

import java.util.Scanner;

public class Plus3 {

	public static void main(String[] args) {
		int testCase;
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		for(int i = 1; i <= testCase; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println(x+y);
		}
	}

}
