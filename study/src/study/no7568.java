package study;
import java.util.*;
import java.io.*;

public class no7568 {
	static int N;

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 N = Integer.parseInt(br.readLine());
		int arr[][]=new int[N][2];
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			arr[i][0]=Integer.parseInt(str[0]);
			arr[i][1]=Integer.parseInt(str[1]);
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int rank=1;
			
			for(int j=0; j<N; j++) {
				if(i==j) {
					continue;
				}
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		System.out.println(sb);
	}

	
}
