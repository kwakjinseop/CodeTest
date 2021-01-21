import java.util. *;
import java.io. *;

public class no1874 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int A = input.nextInt();
        int start = 0;
        String kk[] = new String[A];
        while (A-- > 0) {
            int x = input.nextInt();

            if (x > start) {
                for (int i = start + 1; i <= x; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');


                }
                start=x;
            }

            else if (stack.peek() != x ){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');


        }
        System.out.println(sb);

    }
}