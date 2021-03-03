import java.util.*;
import java.io.*;

public class no10026 {
	static int n, result, result1;
	static char array[][];
	static boolean visited[][];
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.nextLine();
		array = new char[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			String s = input.nextLine();
			for (int j = 0; j < n; j++) {
				array[i][j] = s.charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == false) {
					result++;
					char temp = array[i][j];
					DFS(i, j, temp);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] == 'G') {
					array[i][j] = 'R';
				}
			}
		}
		checkvisit();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == false) {
					result1++;
					char temp = array[i][j];
					DFS(i, j, temp);
				}
			}
		}
		System.out.print(result + " " + result1);

	}
	

	private static void checkvisit() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				visited[i][j]=false;
			}
		}
		// TODO Auto-generated method stub

	}

	private static void DFS(int x, int y, char temp) {
		visited[x][y]=true;
		for(int i=0; i<4; i++) {
			int rx = x+dx[i];
			int ry = y+dy[i];
			  if(rx<0||ry<0||ry>=n||rx>=n) {
	                continue;
	            }if(visited[rx][ry]==true) {
	                continue;
	            }if(array[rx][ry]!=temp) {
	                continue;
	            }if(array[rx][ry]==temp&&visited[rx][ry]==false) {
	                visited[rx][ry]=true;
	                DFS(rx,ry,temp);
	            }
	        }
	        return;
		// TODO Auto-generated method stub

	}

}
