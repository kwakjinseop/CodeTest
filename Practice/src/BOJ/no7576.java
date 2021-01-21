package study;

import java.util.*;
import java.io.*;



public class no7576 {
	
	static class Place{
		int x;
		int y;
		int day;
		
		Place(int x, int y, int day){
			this.x=x;
			this.y=y;
			this.day=day;
		}
	}

	static int box[][];
	static int M, N;
	static boolean visited[][];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		M = input.nextInt();
		N = input.nextInt();
		box = new int[N][M];
	
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				box[i][j] = input.nextInt();
			}
		}

		bfs();

		// TODO Auto-generated method stub

	}

	private static void bfs() {
		int day = 0;
		Queue<Place> que = new LinkedList<Place>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 1) {
					que.offer(new Place(i,j,0));
				}
			}
		}

		int count = 0;
		int A[] = { 1, 0, 0, -1 };
		int B[] = { 0, 1, -1, 0 };

		while (!que.isEmpty()) {
			Place Place = que.poll();
			day=Place.day;
			for (int i = 0; i < 4; i++) {
				int xd = Place.x + A[i];
				int yd = Place.y + B[i];

				if (xd >= 0 && xd < N && yd >= 0 && yd < M) {
					if (box[xd][yd] == 0) {
						box[xd][yd] = 1;
						que.add(new Place(xd, yd, day+1));
					}
				}
			}
			
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) {
					count++;
				} else {
					continue;
				}
			}
		}
		if (count == 0) {
			System.out.println(day);
		}
		else {
			System.out.println("-1");
		}

	}

}
