package second;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Dice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int dice1 = Integer.parseInt(st.nextToken());
		int dice2 = Integer.parseInt(st.nextToken());
		int dice3 = Integer.parseInt(st.nextToken());
		
		int n; // 가장 큰 눈
		int money;
		
		if((dice1+dice2+dice3) <= 18) {
			if(dice1 == dice2 && dice2 == dice3) {
				money = 10000 + dice1 * 1000;
			}
			else if((dice1 == dice2 && dice2 != dice3) || (dice1 == dice3 && dice1 != dice2)) {
				money = 1000 + dice1 * 100;
			}
			else if((dice1 != dice2 && dice2 == dice3)) {
				money = 1000 + dice2 * 100;
			}
			else {
				if(dice1 > dice2) {
					if(dice1 > dice3) {
						n = dice1;
					}
					else {
						n = dice3;
					}
				}
				else {
					if(dice2 > dice3) {
						n = dice2;
					}
					else {
						n = dice3;
					}
				}
				money = n * 100;
			}
			
			bw.write(money + "\n");
			bw.close();
		}
	}
}
