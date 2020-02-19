package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pb_1036_36진수 {
static String strArr[];
static int intArr[];
static int temArr[];
static int k, size, tot, n, sum;
static char alpha;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		strArr = new String[n];		//문자열을 저장할 배열
		intArr = new int[36];		//빈도를 저장할 배열
		for(int i=0;i<n;i++) strArr[i] = br.readLine();
		k = Integer.parseInt(br.readLine());
		temArr = new int[k];	//재귀돌릴 값들 저장할 배열
		for(int i=0;i<n;i++) {
			size = strArr[i].length();
			for(int j=0;j<size;j++) {
				alpha = strArr[i].charAt(j);
				if(alpha >= '0' && alpha <= '9') intArr[alpha-48]++;
				else if(alpha >= 'A' && alpha <= 'Z') intArr[alpha-55]++;
			}
		}
		searchMax(0, 0);
		String a = "";
		while(tot != 0) {
			int tem = tot%36;
			if(tem>=0 && tem <=9) a = tem + a;
			else a = (char)((char)tem+(char)55) + a;
			System.out.println(a);
			tot/=36;
		}
		System.out.println(a);
	}
	//예제답 5,130,299
	
	/*
	 * 
	 * if(alpha >= '0' && alpha <= '9') intArr[alpha-48]++;
	   else if(alpha >= 'A' && alpha <= 'Z') intArr[alpha-55]++;
	 * ‬
	 */
	static void searchMax(int cnt, int start) {
		if(cnt == k) {
			sum = 0;
			for(int i=0;i<n;i++) {
				size = strArr[i].length();
				for(int j=0;j<size;j++) {
					alpha = strArr[i].charAt(j);
					if(alpha >= '0' && alpha <= '9') {
						for(int l=0;l<k;l++) {
							if(temArr[l] == alpha-48) {
								intArr[alpha-48]--;
								intArr[35]++;
								break;
							}
						}
					}
					else {
						for(int l=0;l<k;l++) {
							if(temArr[l] == alpha-55) {
								intArr[alpha-55]--;
								intArr[35]++;
								break;
							}
						}
					}
				}
			}
			
			for(int i=0;i<36;i++) {
				sum += i*intArr[i];
			}
			tot = Integer.max(tot,  sum);
			return;
		}
		for(int i=start;i<36;i++) {
			if(intArr[i] != 0) {
				temArr[cnt] = i;
				searchMax(cnt+1, i+1);
			}
		}
	}

}
/*
boolArr
0~9 : 0~9,   10~35 : A~Z

*/