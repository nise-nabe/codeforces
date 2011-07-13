package s55;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), r = 0;
		List<Integer> as = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			int a = s.nextInt();
			if(a % 2 < 1){
				r += a;
			}else{
				as.add(a);
			}
		}
		Collections.sort(as, Collections.reverseOrder());
		if(as.size() > 0){
			for(int i = 0; i < as.size() - (1 - as.size() % 2); ++i){
				r += as.get(i);
			}
		}else{
			r = 0;
		}
		System.out.println(r);
	}
}
