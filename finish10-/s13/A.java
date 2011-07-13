package s13;
import java.math.BigInteger;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int s = 0;
		for(int r=2;r<n;++r)for(int t=n;t>0;s+=t%r,t/=r);
		int d = BigInteger.valueOf(s).gcd(BigInteger.valueOf(n-=2)).intValue();
		System.out.println(s/d+"/"+ n/d);
	}
}
