import java.util.*;

public class no1912 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int []x=new int[n];
		int []b=new int[n];
		for(int i=0; i<n; i++) {
			x[i]=input.nextInt();
		}
		b[0]=x[0];
		int max=x[0];
		
		for(int i=1; i<n; i++) {
			b[i]=Math.max(b[i-1]+x[i], x[i]);
			
			max = Math.max(max, b[i]);
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

	

}
