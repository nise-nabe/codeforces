package s11;

import java.util.Arrays;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		char[] lu = new char[]{'0','0','0','0','1','1','0','1', 0 };
		char[] ld = new char[]{'0','1', 0 ,'0','1','1','0','0','0'};
		char[] ru = new char[]{'0','0','0','1','1','0', 0 ,'1','0'};
		char[] rd = new char[]{ 0 ,'1','0','1','1','0','0','0','0'};
		char[] ude = new char[]{ 0 ,'0', 0 ,'1','1','1', 0 ,'0', 0 };
		char[] lre = new char[]{ 0 ,'1', 0 , '0' ,'1', '0' , 0 ,'1', 0 };
		char[] u = new char[]{'0','0','0','0','1','0','1','0','1'};
		char[] d = new char[]{'1','0','1','0','1','0','0','0','0'};
		char[] l = new char[]{'0','0','1','0','1','0','0','0','1'};
		char[] r = new char[]{'1','0','0','0','1','0','1','0','0'};
		char[] rdde = new char[]{'1','0','0','0','1','0','0','0','1'};
		char[] ldde = new char[]{'0','0','1','0','1','0','1','0','0'};
		Scanner scan = new Scanner(System.in);
		for(int t = scan.nextInt();t>0;t--){
			int n=scan.nextInt();
			int m=scan.nextInt();
			char[][] a = new char[n+2][m+2];
			scan.nextLine();
			Arrays.fill(a[0], '0');
			for(int i=0;i<n;i++){
				Arrays.fill(a[i+1], '0');
				char[] cs = scan.nextLine().toCharArray();
				for(int j=0;j<m;j++){
					a[i+1][j+1]=cs[j];
				}
			}
			Arrays.fill(a[n+1], '0');
			int count=0;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=m;j++){
					if(ch(a,i,j,lu)){
						int x,y;
						for(x=1;ch(a, i, j+x, ude)&&ch(a, i+x, j, lre);x++);
						for(y=1;ch(a, i+y, j+x, lre)&&ch(a, i+x, j+y, ude);y++);
						if(x==y&&ch(a, i+y, j, ld)&&ch(a, i, j+x, ru)&&ch(a,i+y,j+x,rd)){
							count++;
						}
					}
					if(ch(a, i, j,u)){
						int x,y;
						for(x=1;ch(a, i+x, j+x, rdde)&&ch(a, i+x, j-x, ldde);x++);
						for(y=1;ch(a, i+x+y, j+x-y, ldde)&&ch(a, i+x+y, j-x+y, rdde);y++);
						if(x==y&&ch(a, i+x, j+x, r)&&ch(a, i+x, j-x, l)&&ch(a, i+x+y, j, d)){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	private static boolean ch(char[][] a, int i, int j, char[] c) {
		return (a[i-1][j-1]	==c[0]||c[0]==0)&&(a[i-1][j]==c[1]||c[1]==0)&&(a[i-1][j+1]==c[2]||c[2]==0)&&
			(a[i][j-1]==c[3]||c[3]==0)&&a[i][j]	==c[4]&&(a[i][j+1]==c[5]||c[5]==0)&&
			(a[i+1][j-1]==c[6]||c[6]==0)&&(a[i+1][j]==c[7]||c[7]==0)&&(a[i+1][j+1]==c[8]||c[8]==0);
	}
}
