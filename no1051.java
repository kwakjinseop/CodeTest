import java.util.*;
import java.io.*;

public class no1051 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int square[][] = new int[a][b];
		int min = Math.min(a, b);
		
		for(int i=0; i<a; i++) {
			String kk = input.next();
			for(int j=0; j<b; j++) {
				square[i][j]=kk.charAt(j)-'0';
			}
		}
		int x=0;
		int max=0;
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				for(int k=0; k<min; k++) {
					int qu = i+k;
					int qw = j+k;
					if(qu<a && qw<b) {
						int first=square[i][j];
						int second=square[i][j+k];
						int third=square[i+k][j];
						int fourth=square[i+k][j+k];
						if(first==second&&first==third&&first==fourth) {
							x=(k+1)*(k+1);
							max=Math.max(max, x);
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
