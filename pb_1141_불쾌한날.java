package com.ssafy.search;

import java.util.Scanner;

public class Main_1141_불쾌한날 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int height[] = new int[n];
		for(int i=0;i<n;i++) {
			height[i] = sc.nextInt();
		}
		
		long tot = 0l;
		for(int i=0;i<n;i++) {
			int cnt = 0;
			for(int j=i+1;j<n;j++) {
				if(height[i] > height[j]) cnt++;
				else break;
			}
			tot += cnt;
		}
		System.out.println(tot);
	}

}
