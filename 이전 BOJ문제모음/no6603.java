import java.util.*;
import java.io.*;

public class no6603 {
	static int N;
	static int x[];
	static boolean result[];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			N = input.nextInt();

			if (N == 0) {
				break;
			}
			x = new int[N];
			result = new boolean[N];
			for (int i = 0; i < N; i++) {
				x[i] = input.nextInt();
			}

			DFS(0, 0);
			System.out.println();

		}
	}

	private static void DFS(int start, int depth) {
		if (depth == 6) {
			for (int i = 0; i < N; i++) {
				if (result[i]) {
					System.out.print(x[i] + " ");
				}
			}
			System.out.println();
		}

		for (int i = start; i < N; i++) {
			result[i] = true;
			DFS(i + 1, depth + 1);
			// 출력하고 돌아올땐 다시 사용해야 하므로 false로
			result[i] = false;
		}

	}

}
