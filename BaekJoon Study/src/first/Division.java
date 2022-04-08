package first;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		double x;
        double y;
        
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextDouble();
        y = sc.nextDouble();
        
        if(x > 0 || y < 10) {
             System.out.println(x/y);   
        }
	}

}
