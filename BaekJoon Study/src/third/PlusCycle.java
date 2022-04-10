package third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusCycle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int temp = x;
		int n; // 새로운 수
		int i = 1; // 반복 횟수
		int lf, rt;
		if(x >= 0 && x <= 99) {
			while(true) {
				if(temp < 10) {
					lf = temp * 10;
					rt = temp;
				}
				else {
					lf = (temp%10*10);
					rt = (temp/10 + temp%10);
				}
				
				if(rt >= 10) {
					rt = rt%10;
				}
				
				n = lf + rt;
				
				if(x == n) {
					break;
				}
				temp = n;
				i++;
			}
			System.out.println(i);
		}
	}

}
