import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i=0; i<T; i++) {
			int N=input.nextInt();
			int result=Integer.MIN_VALUE;
			int x[] = new int[N];
			int allsum[] = new int[N]; //각 배열요소의 전체 합 값을 담은 변수
			for(int j=0; j<N; j++) {
				x[j]=input.nextInt();// 입력값 입력
			}
			for(int j=0; j<N; j++) {
				for(int k=j; k<N; k++) {
					allsum[j]+=x[k];
				}
			}
			for(int t=0; t<N; t++) {
				for(int q=t; q<N; q++) {
					if(q+1<N) {
						int a1=allsum[t]-allsum[q+1];
						if(a1>result) {
							result=a1;
						}
					}
					else if(allsum[t]>result){
						result=allsum[t];
					}
				}
				
			}
			System.out.println(result);
		}
		// TODO Auto-generated method stub

	}

}