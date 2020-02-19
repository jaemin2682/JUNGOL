package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class pb_1863_종교 {
static int n, m, num1, num2;
static int parent[];

	public static void makeSet(int v) {
		parent[v] = v;
	}
	/** 특정 노드의 root를 찾아 반환하는 기능
	 */
	public static int findSet(int v) {
		if(parent[v] == v) {	//root인지 검사
			return v;			//root이므로 반환
		}
		parent[v] = findSet(parent[v]);	// -> path compression	
		return findSet(parent[v]);		//값의 부모에 대해 재귀적으로 루트를 찾음
	}
	/** 두 그래프 또는 노드를 병합하는 기능
	 * 
	 */
	public static void union(int u, int v) {
		parent[findSet(u)] = findSet(v);		//v의 루트값을 u의 루트값에 넣기 때문에 u를 v에다 합침
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		parent = new int[n+1];
		for(int i=1;i<=n;i++) makeSet(i);	//다 루트로 초기화
		for(int i=0;i<m;i++) {			
			st = new StringTokenizer(br.readLine(), " ");
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			union(num1, num2);				//num1을 num2에 합침
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=1;i<=n;i++) {
			parent[i] = findSet(parent[i]);
			map.put(parent[i], 0);
		}
		System.out.println(map.size());
		
	}
	
}

