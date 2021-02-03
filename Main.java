import java.util.*;
import java.io.*;

/**
 * Main
 */
public class Main {
    static int N,M;
    static boolean x[] = new boolean[10];

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int M = input.nextInt();
    x=new boolean[10];
    for(int i=0; i<M; i++){
        int a = input.nextInt();
        x[a]=true;
    }
    int result = Math.abs(N-100);

    for(int i=0; i<1000000; i++){
        int compare =  i;
        int len = possible(compare);

        if(len>0){
            int press = Math.abs(compare-N);
            if(result>len+press){
                result = len+press;
            }
        }
    }
    System.out.println(result);

}

private static int possible(int compare) {
    if(compare==0){
        if(x[0]){
            return 0;
        }
        else{
            return 1;
        } 
    }
    int len=0;
    while(compare>0){
        if(x[compare%10]){
            return 0;
        }
        len+=1;
        compare/=10;
    }

	return len;
}