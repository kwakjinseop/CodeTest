package BOJ;
import java.util.*;
import java.io.*;

public class no2293 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		String x = br .readLine();
		StringTokenizer st = new StringTokenizer(x, " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int X[]=new int[N+1];
		int coin[] = new int[M+1];
		coin[0]=1;
		
		for(int i=1; i<N+1; i++) {
			X[i]=Integer.parseInt(br.readLine());
			for(int j=X[i]; j<=M; j++) {
				coin[j]+=coin[j-X[i]];
			}
		}
		
		System.out.println(coin[M]);
		

	}

}
