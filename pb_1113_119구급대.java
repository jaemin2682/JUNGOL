package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class pb_1113_119구급대 {
static int road[][];
static boolean visited[][];
static int dy[] = {0,0,1,-1};
static int dx[] = {1,-1,0,0};
static int M, N, m, n;
static int tot;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		tot = Integer.MAX_VALUE;
		road = new int[M][N];
		visited = new boolean[M][N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st2.nextToken());
		n = Integer.parseInt(st2.nextToken());
		for(int i=0;i<M;i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				road[i][j] = Integer.parseInt(st3.nextToken());
			}
		}
		back(0, 0, 0, 0);
		visited[0][0] = true;
		System.out.println(tot-1);
	}
	
	static void back(int y, int x, int vec, int cnt) {
		if(y == m && x == n) {
			tot = Math.min(tot, cnt);
			return;
		}
		
		if(cnt > tot) return;
		
		for(int i=0;i<4;i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if(ny < M && ny >= 0 && nx < N && nx >= 0 && road[ny][nx] == 1 && !visited[ny][nx]) {
				visited[ny][nx] = true;
				if(vec != i) back(ny, nx, i, cnt+1);
				else back(ny, nx, i, cnt);
				visited[ny][nx] = false;
			}
		}
	}

	
}
