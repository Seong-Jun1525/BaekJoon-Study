package second;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		int x;
        int y;
        
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x > y) {
            System.out.println(">");
        }
        if(x < y) {
            System.out.println("<");
        }
        if(x == y) {
            System.out.println("==");
        }
	}

}
