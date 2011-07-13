package s60;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			list.add(s.nextInt());
		}
		List<Integer> r = new ArrayList<Integer>();
		int m = 1000;
		l:for (int i = 0; i < n; ++i) {
			int k = list.get(i);
			while (!check(k, m)) {
				if(m > 2011){
					break l;
				}
				++m;
			}
			r.add(m);
		}
		if(r.size() == n){
			for(int i : r){
				System.out.println(i);
			}
		}else{
			System.out.println("No solution");
		}
	}

	static boolean check(int k, int m) {
		if (k == m) {
			return true;
		}
		int c = 0;
		for (int i = 0; i < 4; ++i) {
			if (((int)(k / Math.pow(10,i) % 10)) != ((int)(m /Math.pow(10, i) % 10))) {
				++c;
			}
		}
		return c == 1;
	}

}
