package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class pb_1462_보물섬_오재민 {

	private static int H, W, y, x, ny, nx, cnt, ans;
	private static int dy[] = {0, 0, 1, -1};
	private static int dx[] = {1, -1, 0, 0};
	
	private static String str;
	private static char[][] map;
	private static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		map = new char[H][W];
		visited = new boolean[H][W];
		for(int i=0;i<H;i++) {
			str = br.readLine();
			for(int j=0;j<W;j++) map[i][j] = str.charAt(j);
		}
		
		bfs();
		//System.out.println(sy + " " + sx + " " + ey + " " + ex);
		System.out.println(ans-1);
	}

	private static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(map[i][j] == 'L') {
					for(int k=0;k<H;k++) Arrays.fill(visited[k], false);
					q.clear();
					cnt = 0;
					q.add(new int[] {i, j});
					visited[i][j] = true;
					while(!q.isEmpty()) {
						int size = q.size();
						cnt++;
						for(int a=0;a<size;a++) {
							y = q.peek()[0];
							x = q.poll()[1];
							for(int k=0;k<4;k++) {
								ny = y + dy[k];
								nx = x + dx[k];
								if(ny>=0 && ny<H && nx>=0 && nx<W && !visited[ny][nx] && map[ny][nx]=='L') {
									q.add(new int[] {ny, nx});
									visited[ny][nx] = true;
									}
								}
							}
						}
					}
					if(ans < cnt) ans = cnt;
			}
		}
	}

}
/*
모든 맵을 돌면서 'L'인 곳에 대해 bfs를 진행한다.
각 bfs에서 이동 회수가 최대가 되는 두 지점을 찾는다.


*/
