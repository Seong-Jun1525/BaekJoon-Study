package first;

import java.util.Scanner;

public class Multiply_2 {

	public static void main(String[] args) {
		int x;
        int y;
        int y1;
        int y2;
        int y3;
    
        Scanner sc = new Scanner(System.in);
    
        x = sc.nextInt();
        y = sc.nextInt();
    
        y1 = y / 100;
        y2 = (y % 100) / 10;
        y3 = ((y % 100) % 10);
    
        System.out.println(x * y3);
        System.out.println(x * y2);
        System.out.println(x * y1);   
        System.out.println(x*y3 + x*y2*10 + x*y1*100);
	}

}
