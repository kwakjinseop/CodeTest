import java.util.*;
import java.io.*;

public class no10971 {
	static int x[][];
	static int n;
	static boolean visited[];
	static int min = Integer.MAX_VALUE;


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 n = input.nextInt();
		x = new int[n][n];
		visited = new boolean[n];
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				x[i][j]=input.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			DFS(i,i,0,0);
		}
		System.out.println(min);
		// TODO Auto-generated method stub

	}

	private static void DFS(int start, int i, int cnt, int sum) {
		if(cnt==n && start==i) {
			min = Math.min(min, sum);
			return ;
		}
		for(int j=0; j<n; j++) {
			if(x[i][j]==0) {
				continue;
			}
			if(!visited[i]&&x[i][j]>0) {
				visited[i]=true;
				sum+=x[i][j];
				DFS(start, j, cnt+1, sum);
				visited[i]=false;
				sum-=x[i][j];
			}
		}
		
		// TODO Auto-generated method stub
		
	}

}
