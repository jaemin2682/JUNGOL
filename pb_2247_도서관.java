package com.ssafy.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_2247_도서관_오재민 {

	private static int N;
	private static LinkedList<int[]> list = new LinkedList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});		
		}
		Collections.sort(list, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return o1[1] - o2[1];
				return o1[0] - o2[0];				//들어온 시간 오름차순으로 정렬
			}
		});
		
		int in = 0, out = 0, remS=0, remE=0;
		for(int i=0;i<N;i++) {				// 겹치는 구간 만날 때는 IN을 계속 갱신, 겹치지 않는 구간 만날 때는 OUT을 갱신
			if(list.get(i)[0] <= remE) {	// S가 전의 E보다 작거나 같으면(합쳐짐)
				if(remE < list.get(i)[1]) remE = list.get(i)[1];	//전의 E보다 지금의 E가 더 크면, 전의 E에 지금의 E를 저장한다.
				if(in < remE - remS) in = remE - remS;				//머물렀던 시간 갱신
			}
			else {							// S가 전의 E보다 크면(합쳐지지 않음)
				if(out < list.get(i)[0] - remE) {					//S - 전의 E(머물지 않았던 시간) 갱신
					out = list.get(i)[0] - remE;
				}
				remS = list.get(i)[0];		//전의 S 갱신
				remE = list.get(i)[1];		//전의 E 갱신
			}
		}
		
		System.out.println(in + " " + out);
		
	}

}
/*
하나씩 체크하기엔 범위가 너무 넓다.
만 개의 숫자인데  범위가 Integer.
*/