package first;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		int x;
        int y;
        
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x >= 1 || y <= 10000) {
             System.out.println(x+y);
            System.out.println(x-y);
            System.out.println(x*y);
            System.out.println(x/y);
            System.out.println(x%y);   
        }
	}

}
