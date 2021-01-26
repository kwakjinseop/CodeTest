import java.util.*;
import java.io.*;

public class no15486 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int t1[] = new int[N + 2];
		int p1[] = new int[N + 2];
		for (int i = 1; i <= N; i++) {
			String x = br.readLine();
			StringTokenizer st = new StringTokenizer(x, " ");
			t1[i] = Integer.parseInt(st.nextToken());
			p1[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int[] hap = new int[N + 2];
		for (int i = 1; i <= N + 1; i++) {
			if (max < hap[i]) {
				max = hap[i];
			}
			int day = i + t1[i];
			if (day < N + 2) {
				hap[day] = Math.max(hap[day], max + p1[i]);
			}
		}
		System.out.println(max);

		// TODO Auto-generated method stub

	}

}
