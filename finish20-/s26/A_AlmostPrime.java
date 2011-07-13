package s26;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class A_AlmostPrime {
	public static void main(String[] args) throws Exception {
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		int n = new Scanner(System.in).nextInt();
		int c = 0;
		for(int i = 1; i <= n; ++i){
			Set<Integer> divs = new HashSet<Integer>();
			for(int d : propdiv(i)){
				Set<Integer> dl = list.get(d-1);
				if(dl.size()>0){
					divs.addAll(dl);
				}else{
					divs.add(d);
				}
			}
			list.add(divs);
			if(divs.size()==2){
				++c;
			}
		}
		System.out.println(c);
		
	}
	
	static Set<Integer> propdiv(int n) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 2, j = n; i < j; i++) {
			if (n % i == 0) {
				set.add(i);
				set.add(j = n / i);
			}
		}
		return set;
	}
}
