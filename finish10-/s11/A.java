package s11;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] a =new int[n];
		a[0]=scan.nextInt();
		int c=0;
		for(int i=1;i<n;i++){
			a[i]=scan.nextInt();
			if(a[i-1]>=a[i]){
				int cnt=(a[i-1]-a[i])/d+1;
				a[i]+=cnt*d;
				c+=cnt;
			}
		}
		System.out.println(c);
	}
}
