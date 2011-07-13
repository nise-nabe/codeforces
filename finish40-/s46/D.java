package s46;
import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r1 = 0, r2 = 0;
		char[] a = s.next().toCharArray();
		for(int i = 0; i < n;++i){
			if(a[i]-'0'!=i%2){
				++r1;
			}
			if(a[i]-'0'!=1-i%2){
				++r2;
			}
		}
		System.out.println(Math.min(r1,r2));
	}
}
