import java.util.*;

public class Main{
        public static void main(String[]args){
                Scanner s = new Scanner(System.in);
                int r = (((s.nextInt() + 1) / 2) - 1) * 3;
                int g = Math.max(r, 1 + (((s.nextInt() + 1) / 2) - 1) * 3);
                int b = Math.max(g, 2 + (((s.nextInt() + 1) / 2) - 1) * 3);
                System.out.println(30 + b);


        }
}
