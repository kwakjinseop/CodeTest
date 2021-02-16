import java.util.*;
import java.io.*;

public class no1057 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		int count = 0;
		while(a!=b) {
			a=a/2+a%2;
			b=b/2+b%2;
			count++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
