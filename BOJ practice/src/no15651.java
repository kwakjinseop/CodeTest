import java.util.*;

public class no15651 {
	static int n, m;
	static int result[];
	static StringBuilder sb = new StringBuilder(); 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		result=new int[m];
		
		dfs(0);
		System.out.println(sb);
		
		// TODO Auto-generated method stub

	}

	private static void dfs(int depth) {
		if(depth==m) {
			for(int i=0; i<m; i++) {
				sb.append(result[i]+" ");
			}
			sb.append('\n');
			return ;
		}
		for(int i=1; i<=n; i++) {
			result[depth]=i;
			dfs(depth+1);
		}
		// TODO Auto-generated method stub
		
	}

}
