import java.util.*;
import java.io.*;

public class no2668 {
	static int n, array[];
	static boolean visited[];
	static int last;
	static ArrayList<Integer> aaa;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		array = new int[n+1];
		visited= new boolean[n+1];
		aaa= new ArrayList<Integer>();
		for(int i=1; i<=n; i++) {
			array[i]=input.nextInt();
		}
		for(int i=1; i<=n; i++) {
			visited[i]=true;
			last = i;
			DFS(i);
			visited[i]=false;
		}
		Collections.sort(aaa);
		System.out.println(aaa.size());
		for(int i:aaa) {
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

	private static void DFS(int i) {
		if(!visited[array[i]]) {
			visited[array[i]]=true;
			DFS(array[i]);
			visited[array[i]]=false;
		}
		if(array[i]==last) {
			aaa.add(last);
		}
		// TODO Auto-generated method stub
		
	}

}
