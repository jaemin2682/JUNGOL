package com.ssafy.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_1141_불쾌한날_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long tot = 0;
		int num;
		Stack<Integer> s = new Stack<>();
		s.push(Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			while (s.peek() <= num)
				s.pop();
			s.push(num);
			tot += s.size() - 2;
		}

		System.out.println(tot);
	}
}
/*
 * 5 2 4 2 6 1
 * 
 * 1 6
 * 
 * 2 2 3 1 2 1 1 2 0 1
 * 
 * 
 */