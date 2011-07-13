package s30;
import java.util.*;

public class A_Accounting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),n=s.nextInt();
		for(int i=0;i<1001;++i){
			if(a*Math.pow(i,n)==b){
				System.out.println(i);
				return;
			}else if(a*Math.pow(-i,n)==b){
				System.out.println(-i);
				return;
			}
		}
		System.out.println("No solution");
	}
}
