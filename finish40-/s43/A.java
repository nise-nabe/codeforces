package s43;
import java.util.*;

public class A {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= n; ++i){
			list.add(i);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < n; ++i){
			Collections.rotate(list, -i);
			sb.append(list.get(0)+" ");
		}
		System.out.println(sb.toString().trim());
	}
}
