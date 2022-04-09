package second;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		int h, m;
		
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			m = m - 45;
			if(m < 0) {
				h = h - 1;
				if(h < 0) {
					h = 24 + h;
				}
				m = 60 + m;
			}
			System.out.println(h + " " + m);
		}
	}

}
