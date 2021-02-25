import java.util.*;
import java.io.*;

public class no1991 {
	static int n;
	static int x[][] = new int[n][2];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		x = new int[n][2];
		for (int i = 0; i < n; i++) {
			char a = input.next().charAt(0);
			char b = input.next().charAt(0);
			char c = input.next().charAt(0);
			x[a - 'A'][0] = b - 'A';
			x[a - 'A'][1] = c - 'A';
		}
		preorder(0);
		System.out.println();
		inorder(0);
		System.out.println();
		postorder(0);
		// TODO Auto-generated method stub

	}

	private static void inorder(int now) {
		if(now=='.'-'A') return;
	    inorder(x[now][0]);
	    System.out.print((char) (now + 'A'));
	    inorder(x[now][1]);
		// TODO Auto-generated method stub

	}

	private static void preorder(int now) {
		  if(now=='.'-'A') return;
		  System.out.print((char) (now + 'A'));
		    preorder(x[now][0]);
		    preorder(x[now][1]);
		// TODO Auto-generated method stub

	}

	private static void postorder(int now) {
		if(now=='.'-'A') return;
	    postorder(x[now][0]);
	    postorder(x[now][1]);
	    System.out.print((char)(now+'A'));
		// TODO Auto-generated method stub

	}

}
