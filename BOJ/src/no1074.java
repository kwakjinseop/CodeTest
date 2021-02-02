import java.util.*;
import java.io.*;

public class no1074 {
	static int n, r, c;
	static double nx, ny, nn, np;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		f(0, 0, Math.pow(2, n), 0);

		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

	private static Object f(int y, int x, double n, int p) {
		if(n==1) {
			System.out.println(p);
		}
		int ny;
		int nx;
		int nn;
		int np;
		if (r >= y && r <= y + n / 2 - 1 && c >= x && c <= x + n / 2 - 1) {
			ny = y;
			nx = x;
			nn = (int) (n / 2);
			np = p;
		} else if (r >= y && r <= y + n / 2 - 1 && c >= x + n / 2 && c <= x + n - 1) {
			ny = y;
			nx = (int) (y + n / 2);
			nn = (int) (n / 2);
			np = (int) (p + (n / 2) * (n / 2));
		} else if (r >= y + n / 2 && r <= y + n - 1 && c >= x && c <= x + n / 2 - 1) {
			ny = (int) (y + n / 2);
			nx = x;
			nn = (int) (n / 2);
			np = (int) (p + (n / 2) * (n / 2) * 2);
		} else {
			ny = (int) (y + n / 2);
			nx = (int) (x + n / 2);
			nn = (int) (n / 2);
			np = (int) (p + (n / 2) * (n / 2) * 3);
		}
		return f(ny, nx, nn, np);
		// TODO Auto-generated method stub

	}

}
