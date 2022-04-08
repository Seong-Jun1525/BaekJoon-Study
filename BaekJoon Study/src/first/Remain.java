package first;

import java.util.Scanner;

public class Remain {

	public static void main(String[] args) {
		int x;
        int y;
        int z;
        
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        if(x >= 2 || z <= 10000) {
            System.out.println((x+y)%z);
            System.out.println(((x%z)+(y%z))%z);
            System.out.println((x*y)%z);
            System.out.println(((x%z)*(y%z))%z);   
        }
	}

}
