package s58;
import java.util.*;

public class B {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt();
		String address = s.next();
		for (;n-->0;) {
			int r = 0;
			String padd = s.next();
			for(int j = 0; j < padd.length(); ++j){
				int min = padd.length();
				for(int i = 0; i < k; ++i){
					if(address.charAt(i) == padd.charAt(j)){
						min = Math.min(min, Math.abs(j - i));
					}
				}
				r += min;

			}
			System.out.println(r);
		}
	}
}
