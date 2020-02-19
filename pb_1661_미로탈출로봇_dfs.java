package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class pb_1661_미로탈출로봇_dfs {
static int Y, X, sy, sx, ey, ex;
static int[] dy = {0, 0, 1, -1};
static int[] dx = {1, -1, 0, 0};

private static int[][] arr;
private static boolean[][] visited;
private static String str;
private static int[][] dp;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		sx = Integer.parseInt(st.nextToken())-1;
		sy = Integer.parseInt(st.nextToken())-1;
		ex = Integer.parseInt(st.nextToken())-1;
		ey = Integer.parseInt(st.nextToken())-1;
		arr = new int[Y][X];
		dp = new int[Y][X];
		visited =  new boolean[Y][X];
		for(int i=0;i<Y;i++) {
			str = br.readLine();
			for(int j=0;j<X;j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		dp[sy][sx] = 1;
		dfs(sy, sx);
		System.out.println(dp[ey][ex]-1);
	}
	
	static void dfs(int y, int x) {
		//base_case
		if(y == ey && x == ex) {
			return;
		}
		for(int i=0;i<4;i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if(ny>=0 && ny<Y && nx>=0 && nx<X && !visited[ny][nx] && arr[ny][nx] == 0) {
				if(dp[ny][nx]==0 || dp[ny][nx]> dp[y][x]+1) {
					dp[ny][nx] = dp[y][x]+1;
					dfs(ny, nx);
				}
			}
		}
		
	}

}
