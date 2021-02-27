import java.util.*;

public class no9663 {
	static int N;
	static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			int array[] = new int[N+1];
			array[1]=i;
			dfs(array,1);
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

	private static void dfs(int[] array, int row) {
		if(row==N) {
			count++;
		}
		else {
			for(int i=1; i<=N; i++) {
				array[row+1]=i;
				if(possible(array, row+1)) {
					dfs(array, row+1);
				}
			}
		}
		
	}
	private static boolean possible(int []array, int row) {
		for(int i=1; i < row; i++) {
          
            if(array[i] == array[row]) return false;
            
            if(Math.abs(i - row) == Math.abs(array[i] - array[row])) return false;
        }
        return true;
	}

}
