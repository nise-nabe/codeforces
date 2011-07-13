package s34;
import java.util.*;

public class A_Reconnaissance2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),min=Integer.MAX_VALUE,r1=0,r2=0;
		int[]a=new int[n];
		for(int i=0;i<n;++i){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;++i){
			if(min>Math.abs(a[i]-a[(i+1)%n])){
				min = Math.abs(a[i]-a[(i+1)%n]);
				r1=i+1;
				r2=1+(i+1)%n;
			}
		}
		System.out.println(r1+" "+r2);
	}
}
