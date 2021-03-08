import java.util.*;
import java.io.*;

public class no1339 {
	static int n;
	static ArrayList<Character> alphabet = new ArrayList<>();
	static int val[];
	static int answer;
	static String a;
	static boolean visited[] = new boolean[10];
	static String words[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
			for (int j = 0; j < words[i].length(); j++) {
				if (!alphabet.contains(words[i].charAt(j))) {
					alphabet.add(words[i].charAt(j));
				}
			}
		}
		val = new int[alphabet.size()];

		dfs(0);
		System.out.println(answer);

		// TODO Auto-generated method stub

	}

	private static void dfs(int depth) {
		if (depth == alphabet.size()) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int num=0;
				for(int j=0; j<words[i].length(); j++) {
					num*=10;
					num+=val[alphabet.indexOf(words[i].charAt(j))];
				}
				sum+=num;
			}
			answer = Math.max(answer,sum);
			return;
		}
		
		for(int i=0; i<=9; i++) {
			if(visited[i]) {
				continue;
			}
			visited[i]=true;
			val[depth]=i;
			dfs(depth+1);
			val[depth]=0;
			visited[i]=false;
		}
		// TODO Auto-generated method stub

	}

}
