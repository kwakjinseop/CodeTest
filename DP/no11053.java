import java.util.*;

public class no11053 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		for(int i=0; i<n; i++) {
			array[i]=input.nextInt();
		}
		int d[] = new int[n];
		d[0]=1;
		for(int i=1; i<n; i++) {
			d[i]=1;
			for(int j=0	; j<i; j++) {
				if(array[j]<array[i] && d[i]<=d[j]) {
					d[i]=d[j]+1;
				}
			}
		}
		int max=0;
		for(int i:d) {
			max=Math.max(max, i);
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
