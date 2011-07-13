package s25;
import java.util.Scanner;

/**
 * 
 * Roads in Berland 
 * http://codeforces.com/contest/25/problem/C
 * 
 * ＜問題＞
 * 街をノード，各街への最短経路の長さのテーブルが与えられて
 * 最短の経路が更新されてゆくので
 * 各最短経路更新毎における最短経路の長さの総和を求めよ．
 * 
 * ＜方針＞
 * 任意の２点のノードの最短距離を計算しなおすので
 * ワーシャルフロイドかなと思って実装．
 * 最短経路の長さの総和がintだと型溢れするらしく，
 * longにするまで38でWA．
 * 
 * 
 * 実はワーシャルフロイドでもなくてもいいらしい．
 * 
 *  
 * @author nise_nabe
 *
 */
public class C_RoadsInBerland {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 2-300
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		StringBuffer result = new StringBuffer();
		for (int k = scan.nextInt(); k-- > 0;) { // 1-300
			int x = scan.nextInt() - 1, y = scan.nextInt() - 1, z = scan
					.nextInt();
			a[x][y] = a[y][x] = Math.min(a[x][y],z);
			for(int t:new int[]{x,y}){
				for (int i = 0; i < n-1; i++) {
					for (int j = i+1; j < n; j++) {
						if(a[i][j] > a[i][t]+a[t][j]){
							a[i][j] = a[j][i] = a[i][t]+a[t][j];
						}
					}
				}
			}
			long sum = 0;
			for (int i = 0; i < n-1; i++) {
				for (int j = i+1; j < n; j++) {
					sum += a[i][j];
				}
			}
			result.append(sum);
			result.append(" ");
		}
		System.out.println(result.replace(result.length()-1, result.length(), ""));
	}

}
