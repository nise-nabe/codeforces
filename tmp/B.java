import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner s = new Scanner(System.in);
                int n = s.nextInt(), m = s.nextInt();
                char[][] cs = new char[n][];
                boolean[][] b = new boolean[n][m];
                for(int i = 0; i < n; ++i){
                        cs[i] = s.next().toCharArray();
                }
                for(int i = 0; i < n; ++i){
                        for(int j = 0; j < m; ++j){
                                for(int k = 0; k < n; ++k){
                                        if(i != k && cs[i][j] == cs[k][j]){
                                                b[i][j] = b[k][j] = true;
                                        }
                                }
                                for(int k = 0; k < m; ++k){
                                        if(j != k && cs[i][j] == cs[i][k]){
                                                b[i][j] = b[i][k] = true;
                                        }
                                }
                        }
                }
                for(int i = 0; i < n; ++i){
                        for(int j = 0; j < m; ++j){
                                if(!b[i][j]){
                                        System.out.print(cs[i][j]);
                                }
                        }
                }
                System.out.println();
        }
}
