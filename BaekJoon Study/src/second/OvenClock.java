package second;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class OvenClock {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			m = m + a;
			if(m > 59) {
				h = h + m/60;
				if(h > 23) {
					h = h - 24;
				}
				m = m % 60;
			}
			bw.write(h + " " + m + "\n");
		}
		
		bw.close();
	}

}
