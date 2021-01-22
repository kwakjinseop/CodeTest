package study;

import java.util.*;
import java.io.*;

public class no16967 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int W = input.nextInt();
		int X = input.nextInt();
		int Y = input.nextInt();
		int A[][] = new int[H][W];
		int B[][] = new int[H + X][W + Y];
		for (int i = 0; i < H + X; i++) {
			for (int j = 0; j < W + Y; j++) {
				B[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (B[i][j] != 0) {
					if(i-X>=0 && j-Y>=0) {
						A[i][j]=B[i][j]-A[i-X][j-Y];
					}
					else if (i-X<=0 || j-Y<=0){
						A[i][j]=B[i][j];
					}
					

				}
			}
		}
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
