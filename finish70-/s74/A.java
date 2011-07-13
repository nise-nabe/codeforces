package s74;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] sp = s.nextLine().split(" ");
		List<String> list = Arrays.asList("C C# D D# E F F# G G# A B H".split(" "));
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				for (int k = 0; k < 3; ++k) {
					if (i != j && j != k && k != i) {
						if(list.get((list.indexOf(sp[i])+4)%list.size()).equals(sp[j]) && list.get((list.indexOf(sp[j])+3)%list.size()).equals(sp[k])){
							System.out.println("major");
							return;
						}
						if(list.get((list.indexOf(sp[i])+3)%list.size()).equals(sp[j]) && list.get((list.indexOf(sp[j])+4)%list.size()).equals(sp[k])){
							System.out.println("minor");
							return;
						}
					}
				}
			}
		}
		System.out.println("strange");
	}
}
