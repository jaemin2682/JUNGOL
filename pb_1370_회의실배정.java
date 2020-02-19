package com.ssafy.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1370_회의실배정_오재민 {

	private static int N, cnt;
	private static ArrayList<int[]> list = new ArrayList<>();
	private static ArrayList<Integer> ans = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		Collections.sort(list, new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {
			if(o1[2] == o2[2]) return o1[1] - o2[1];
			return o1[2] - o2[2];
		}});
		
		int etime = 0;
		for(int i=0;i<N;i++) {
			if(etime <= list.get(i)[1]) {
				cnt++;
				etime = list.get(i)[2];
				ans.add(list.get(i)[0]);
			}
		}
		
		System.out.println(cnt);
		for(int a : ans) System.out.print(a + " ");
	}

}
/*

*/