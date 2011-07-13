package s76;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean[][] a = new boolean[5][5];
		for (int i=0;i<n;++i) {
			int u=s.nextInt()-1,v=s.nextInt()-1;
			a[u][v]=a[v][u]=true;
		}
		for(int i=0;i<5;++i){
			for(int j=i+1;j<5;++j){
				for(int k=j+1;k<5;++k){
					if((a[i][j]&&a[j][k]&&a[k][i])||(!a[i][j]&&!a[j][k]&&!a[k][i])){
						System.out.println("WIN");
						return;
					}
				}
			}
		}
		System.out.println("FAIL");
	}
}
