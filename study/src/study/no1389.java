package codetest;

import java.util.*;
import java.io.*;

public class no1389 {
    static int N, M;
    static ArrayList<Integer>[] ar = new ArrayList[N + 1];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        StringTokenizer st = new StringTokenizer(x, " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ar = new ArrayList[N + 1];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            String relation = br.readLine();
            StringTokenizer st1 = new StringTokenizer(relation, " ");
            int A = Integer.parseInt(st1.nextToken());
            int B = Integer.parseInt(st1.nextToken());
            A -= 1;
            B -= 1;
            ar[A].add(B);
            ar[B].add(A);
        }

        int minkb = 99998;
        int answer = 0;

        for (int i = 0; i < N; i++) {
            Queue  <Integer> que = new LinkedList<Integer>();
            int cnt[] = new int[N];
            for(int k=0; k<cnt.length; k++){
                cnt[k]=-1;
            }
            que.offer(i);
            cnt[i] = 0;
            while (!que.isEmpty()) {
                int now = (int) que.peek();
                que.poll();
                for (int nxt : ar[now]) {
                    if (cnt[nxt] == -1) {
                        cnt[nxt] = cnt[now] + 1;
                        que.offer(nxt);
                    }
                }
            }
            int kb = 0;
            for (int j = 0; j < N; j++) {
                kb += cnt[j];
            }
            if (minkb > kb) {
                minkb = kb;
                answer = i + 1;
            }
            // TODO Auto-generated method stub

        }
        System.out.println(answer);

        // TODO Auto-generated method stub

    }

}