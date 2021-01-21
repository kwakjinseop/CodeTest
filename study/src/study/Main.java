package study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
   
   static int X,Y,Z;
   static Queue<Batch> que = new LinkedList<Batch>();
   static boolean[][][] visited;
   static int day = 0;
   static int Box[][][];
   static boolean flag=true;
   
   public static class Batch {
      int x;
      int y;
      int z;

      Batch(int x, int y, int z) {
         {
            this.x = x;
            this.y = y;
            this.z = z;
         }
      }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Y = input.nextInt();
      X = input.nextInt();
      Z = input.nextInt();
      Box = new int[Z][X][Y];
      visited = new boolean[Z][X][Y];

      for (int i = 0; i < Z; i++) {
         for (int j = 0; j < X; j++) {
            for (int y = 0; y < Y; y++) {
               Box[i][j][y] = input.nextInt();

               if (Box[i][j][y] == 1) {
                  que.add(new Batch(j, y, i));
               }
            }
         }
      }
      
      while (true) {
         bfs(que);
         if (!flag) {
            break;
         }
         day++;
      }
      check();
   }
   private static void bfs(Queue<Batch> que) {
      int A1[] = { -1, 1, 0, 0, 0, 0 };
      int B1[] = { 0, 0, 1, -1, 0, 0 };
      int C1[] = { 0, 0, 0, 0, 1, -1 };

      int size = que.size();

      for (int i = 0; i < size; i++) {
         Batch d = que.poll();
         int x1 = d.x;
         int y1 = d.y;
         int z1 = d.z;

         for (int j = 0; j < 6; j++) {
            int x2 = x1 + A1[j];
            int y2 = y1 + B1[j];
            int z2 = z1 + C1[j];
            if (z2 >= 0 && z2 < Z && x2 >= 0 && x2 < X && y2 >= 0 && y2 < Y && Box[z2][x2][y2] == 0) {
               Box[z2][x2][y2] = 1;
               que.add(new Batch(x2, y2, z2));
            }
         }
      }
      if (que.size() == 0) {
         flag = false;
         return;
      }
   }
   public static void check() {
      for (int i = 0; i < Z; i++) {
         for (int j = 0; j < X;j++) {
            for (int y = 0; y < Y; y++) {
               if (Box[i][j][y] == 0) {
                  System.out.println("-1");
                  return;
               }
            }
         }
      }
      
      System.out.println(day);
     

   }
}
      // TODO Auto-generated method stub



}