package s45;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> t = Arrays.asList("rock", "scissors","paper");
		int[]a = new int[3];
		for(int i = 0; i < 3; ++i){
			a[i] = t.indexOf(s.next());
		}
		for(int i = 0; i < 3; ++i){
			if((a[i]+1)%3 == a[(i+1)%3] && a[(i+1)%3] == a[(i+2)%3]){
				System.out.println(new String[]{"F","M","S"}[i]);
				return;
			}
		}
		System.out.println("?");
	}
}
