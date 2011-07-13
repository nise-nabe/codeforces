package s29;
import java.util.*;
public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[]a=new double[5];
		for(int i=0;i<5;++i){
			a[i]=s.nextInt();
		}
		double t=Math.ceil(a[1]/a[2]);
		System.out.println((t%(a[3]+a[4]+1)<a[3]+1)?a[0]/a[2]:t+(a[0]-a[1])/a[2]);
	}
}
