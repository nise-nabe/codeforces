package s56;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		s.nextLine();
		BitSet b = new BitSet();
		b.set(0, n);
		for(;m-->0;){
			String line = s.nextLine();
			int i = new Integer(line.split(" ")[4]);
			BitSet a = new BitSet();
			if(line.contains("left")){
				a.set(0,i-1);
				b.and(a);
			}else if(i<n){
				a.set(i,n);
				b.and(a);
			}else{
				System.out.println(-1);
				return;
			}
		}
		System.out.println(b.cardinality()<1?-1:b.cardinality());
	}
}
