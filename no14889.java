import java.util.*;
import java.io.*;

public class no14889 {
	static int n;
	static boolean visited[] = new boolean[n];
	static int team[][] = new int[n][n];
	static int Min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		team = new int[n][n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				team[i][j] = input.nextInt();
			}
		}

		find(0, 0);
		System.out.println(Min);
		// TODO Auto-generated method stub

	}

	private static void find(int xx, int yy) {
		if (yy == n / 2) {

			compare();
			return;

		}
		for (int i = xx; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				find(i + 1, yy + 1);
				visited[i] = false;
			}
		}
		// TODO Auto-generated method stub

	}

	private static void compare() {
		int startteam= 0;
		int linkteam = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (visited[i] == true && visited[j] == true) {
					startteam += team[i][j];
					startteam += team[j][i];
				} else if (visited[i] == false && visited[j] == false) {
					linkteam += team[i][j];
					linkteam += team[j][i];
				}
			}
		}
		int val = Math.abs(startteam - linkteam);

		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		
		}
		Min = Math.min(val, Min);
		// TODO Auto-generated method stub

	}

}
