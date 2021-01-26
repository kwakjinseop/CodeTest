import java.util.*;
import java.io.*;

class Batch {
	int x;
	int y;

	Batch(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class no2468 {
	static int N;
	static int board[][] = new int[N][N];
	static int A1[] = new int[] { -1, 0, 1, 0 };
	static int B1[] = new int[] { 0, 1, 0, -1 };
	static Queue <Batch> que = new LinkedList<Batch>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		N = Integer.parseInt(x);
		board = new int[N][N];
		for (int i = 0; i < N; i++) {
			String xx = br.readLine();
			for (int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(xx, " ");
				board[i][j] = Integer.parseInt(st.nextToken());

			}
		}
		
	
		int result=0;
		for (int i = 0; i <= 100; i++) {
			int cnt=0;
			boolean visited[][] = new boolean[N][N];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (board[j][k] <= i) {
						visited[j][k] = true;
					}
				}
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (!visited[j][k]) {
						visited[j][k] = true;
						que.add(new Batch(j, k));
						while (!que.isEmpty()) {
							Batch now = que.peek();
							que.poll();
							for (int u = 0; u < 4; u++) {
								int nx = now.x + A1[u];
								int ny = now.y + B1[u];
								if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
									visited[nx][ny] = true;
									que.add(new Batch(nx, ny));
								}
							}
						}
						cnt++;
					}
					
				}
			}
			
			result=Math.max(result, cnt);
		}
		
		System.out.println(result);

	}

}
