package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb_9613_GCD합 {
	static int n;
	static long tot;
	static int arr[];
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			tot = 0;
			arr = new int[n];
			for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					tot += gcd(arr[i], arr[j]);
				}
			}
			System.out.println(tot);
		}
	}


	public static int gcd(int a, int b) {
		if (a < b) {
			int temp = b;
			b = a;
			a = temp;
		}
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}