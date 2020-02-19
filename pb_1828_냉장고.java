package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class pb_1828_냉장고  {
	static int N, cnt = 1;
	static int temp[][];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 화학물질의 수 N
		temp = new int[N][2]; // 각 화학물질의 최저/최고 보관 온도 저장
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			temp[i][0] = Integer.parseInt(st.nextToken());
			temp[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(temp, new Comparator<int[]>() { // 최저보관온도 기준 오름차순 정렬
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		for(int i=0;i<N;i++) System.out.println(Arrays.toString(temp[i]));
		int minVal = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (minVal < temp[i][0]) { // 갱신해왔던 최소값보다 큰 최저 보관 온도를 만나면 cnt++
				cnt++;
				minVal = Integer.MAX_VALUE;
			}
			if (minVal > temp[i][1])
				minVal = temp[i][1]; // 최고 보관 온도의 최소값 갱신
		}
		System.out.println(cnt); // 출려크
	}
}