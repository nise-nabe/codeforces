package s26;
import java.util.Arrays;
import java.util.Scanner;

public class C {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n, m;
		int[][] ss = new int[n=scan.nextInt()][m=scan.nextInt()];
		int a=scan.nextInt(), b=scan.nextInt(), c=scan.nextInt();
		for(int i = 0; i < n;++i){
			for(int j = 0; j < m;++j){
				
			}
		}
		if(Arrays.deepToString(ss).contains("0")){
			System.out.println("IMPOSSIBLE");
		}else{
			String[]x={"a","b","c"};
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < m; ++j) {
					System.out.print(x[ss[i][j]]);
				}
				System.out.println();
			}
		}
	}
	
}
