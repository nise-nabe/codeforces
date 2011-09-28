package s80;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		String[] sp = s.nextLine().split(" ");
		List<String> list = Arrays.asList("6", "7", "8", "9", "T", "J", "Q", "K", "A");
		if (sp[0].contains(x) && !sp[1].contains(x) || sp[0].contains(sp[1].substring(1)) && list.indexOf(sp[0].substring(0, 1)) > list.indexOf(sp[1].substring(0, 1))) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
