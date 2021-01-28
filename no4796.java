package study;
import java.util.*;
import java.io.*;

public class no4796 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int L=0; //5
		int P=0; //8
		int V=0; //20
		int num=1;
		int result=0;
		while(true) {
			L=input.nextInt();
			P=input.nextInt();
			V=input.nextInt();
			if(L==0 && P==0 && V==0) {
				break;
			}
			else {
				int www = V/P; //2
				System.out.println("Case "+num+": "+(www*L+V%P));
				num++;
			}
		}
		// TODO Auto-generated method stub

	}

}
