package third;

import java.util.Scanner;

public class NumberLessThanX {

	public static void main(String[] args) {
		int n, x;
		
		String a;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		
		String[] array = new String[n];
		
		for(int i = 0; i < n; i++) {
			a = sc.next();
			array[i] = a;
		}
		
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(array[i]) < x) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
