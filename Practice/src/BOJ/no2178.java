package study;

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

public class no2178 {
	static int N, M, count;
	static int[][] x;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		M = input.nextInt();
		count = 0;
		x = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String xxx = input.next();
			for (int j = 0; j < M; j++) {
				char qwer = xxx.charAt(j);
				x[i][j] = qwer - '0';
			}
		}
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(x[N - 1][M - 1]);
		// TODO Auto-generated method stub

	}

	static public void bfs(int K, int L) {

		int A[] = { -1, 0, 1, 0 };
		int B[] = { 0, 1, 0, -1 };

		Queue<Batch> q = new LinkedList<Batch>();
		q.add(new Batch(K, L));
		while (!q.isEmpty()) {
			Batch d = q.poll();
			for (int i = 0; i < 4; i++) {
				int A1 = d.x + A[i];
				int B1 = d.y + B[i];

				if (A1 < 0 || B1 < 0 || A1 >= N || B1 >= M) {
					continue;
				}

				if (visited[A1][B1] || x[A1][B1] == 0) {
					continue;
				}

				q.add(new Batch(A1, B1));

				x[A1][B1] = x[d.x][d.y] + 1;
				visited[A1][B1] = true;
			}
		}
	}

}
