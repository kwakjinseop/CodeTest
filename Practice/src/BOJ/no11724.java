package BOJ;

import java.util.*;
import java.io.*;

public class no11724 {
	static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		String aa = br.readLine();
		StringTokenizer st = new StringTokenizer(aa, " ");
		N = Integer.parseInt(st.nextToken()); //정점의 개수
		M = Integer.parseInt(st.nextToken());
		int count=0;
		boolean visited[] = new boolean[N+1];
		
		ArrayList<Integer>[] aaa = new ArrayList[N+1];
		for(int i=0; i<aaa.length; i++	) {
			aaa[i]= new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			String xp = br.readLine();
			StringTokenizer st1 = new StringTokenizer(xp, " ");
			int a1 = Integer.parseInt(st1.nextToken());
			int a2 = Integer.parseInt(st1.nextToken());
			aaa[a1].add(a2);
			aaa[a2].add(a1);
		}
		
		for(int i=0; i<aaa.length; i++) {
			Collections.sort(aaa[i]);
		}
	
		
		dfs(aaa, visited, 0);
		count++;
		for(int i=0; i<visited.length; i++) {
			if(!visited[i]) {
				dfs(aaa, visited, i);
				count++;
			}
		}
		System.out.println(count-1);
		

	}

	private static void dfs(ArrayList<Integer>[] aaa, boolean[] visited, int now) {
		visited[now]=true;
		
		for(int nxt: aaa[now]) {
			if(!visited[nxt]) {
				dfs(aaa, visited, nxt);
			}
		}
		
		
		// TODO Auto-generated method stub
		
	}

}
