import java.util.*;
import java.io.*;

public class no11725 {
	static int n;
	static int[] result = new int[n+1];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		result= new int[n+1];
		ArrayList<Integer>[]tree = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			tree[i]= new ArrayList<Integer>();
		}
		for(int i=0; i<n-1; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			tree[a].add(b);
			tree[b].add(a);
		}
		
		dfs(tree, n,1,0);
		
		for(int j=2; j<=n; j++) {
			System.out.println(result[j]);
		}
		// TODO Auto-generated method stub

	}

	private static void dfs(ArrayList<Integer>[] tree, int n, int start, int root) {
		// TODO Auto-generated method stub
		result[start]=root;
		for(int item : tree[start]) {
			if(item != root	) {
				dfs(tree, n, item, start);
			}
			
		}
		
	}
}
