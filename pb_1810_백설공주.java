package com.ssafy.combination;

import java.util.Scanner;

public class Main_1810_백설공주 {
	static int arr[] = new int[9];
	static int res[] = new int[7];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=0;t<9;t++) arr[t] = sc.nextInt();
		combination(0, 0, 0);
	}
	
	public static void combination(int cnt, int start, int sum) {
		if(cnt == 7) {
			if(sum == 100) for(int a : res) System.out.println(a);
			return;
		}
		if(sum >= 100) return;
		for(int i=start;i<9;i++) {
			res[cnt] = arr[i];
			combination(cnt+1, i+1, sum+arr[i]);
		}
	}

}
