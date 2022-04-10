package third;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StarCount2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n >= 1 && n <= 100) {
			for(int i = 1; i <= n; i++) {
				for(int j = n; j >= 1; j--) {
					if(i < j) {
						bw.write(" ");
					}
					if(i >= j) {
						bw.write("*");
					}
				}
				bw.write("\n");
			}
		}
		
		bw.close();
	}

}
