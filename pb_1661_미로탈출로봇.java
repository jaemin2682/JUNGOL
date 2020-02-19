package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class pb_1661_미로탈출로봇 {
static int Y, X, sy, sx, ey, ex, cnt, y, x, ny, nx;
static int[] dy = {0, 0, 1, -1};
static int[] dx = {1, -1, 0, 0};

private static int[][] arr;
private static boolean[][] visited;
private static String str;
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
		visited =  new boolean[Y][X];
		for(int i=0;i<Y;i++) {
			str = br.readLine();
			for(int j=0;j<X;j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		bfs();
		
		System.out.println(cnt);
	}
	private static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {sy, sx});
		visited[sy][sx] = true;
		while(!q.isEmpty()) {
			int size = q.size();
			cnt++;
			for(int i=0;i<size;i++) {
				y = q.peek()[0];
				x = q.poll()[1];
				for(int j=0;j<4;j++) {
					ny = y + dy[j];
					nx = x + dx[j];
					if(ny>=0 && ny<Y && nx>=0 && nx<X && !visited[ny][nx] && arr[ny][nx] == 0) {
						if(ny == ey && nx == ex) return;
						q.add(new int[] {ny, nx});
						visited[ny][nx] = true;
					}
				}
			}
		}
		
	}

}
