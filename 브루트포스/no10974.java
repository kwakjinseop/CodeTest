import java.util.*;
import java.io.*;

public class no10974 {
	static int result[];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x[] = new int[n];
		result = new int[n];
		boolean visited [] = new boolean[n];
		for(int i=0; i<n; i++) {
			visited[i]=true;
			DFS(x, visited, n, i, 0);
			visited[i]=false;
		}
		// TODO Auto-generated method stub

	}

	private static void DFS(int[] x, boolean[] visited, int n, int started, int depth) {
		result[depth]=started+1;
		if(depth==n-1) {
			for(int i=0; i<n; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return ;
		}
		for(int i=0; i<n; i++) {
			if(visited[i]) {
				continue;
			}
			visited[i]=true;
			DFS(x, visited, n, i, depth+1);
			visited[i]=false;
		}	
	}
}
