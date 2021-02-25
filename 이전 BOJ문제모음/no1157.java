package study;

import java.util. *;
import java.io. *;

public class no1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        String a = input.nextLine().toUpperCase();
        char result = 0;
        int max=0;
        int x[] = new int[990];
        for(int i=0; i<a.length(); i++) {
        	x[a.charAt(i)-65]++;
        	if(max<x[a.charAt(i)-65]) {
        		max=x[a.charAt(i)-65];
        		result=a.charAt(i);
        	}
        	else if(max==x[a.charAt(i)-65]) {
        		result='?';
        	}
        }
        System.out.println(result);

    }

}
