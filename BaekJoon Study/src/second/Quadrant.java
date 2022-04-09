package second;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x >= -1000 && x <= 1000 && y >= -1000 && y <= 1000 && x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println(1);
			}
			if(x < 0 && y > 0) {
				System.out.println(2);
			}
			if(x < 0 && y < 0) {
				System.out.println(3);
			}
			if(x > 0 && y < 0) {
				System.out.println(4);
			}
		}
	}

}
