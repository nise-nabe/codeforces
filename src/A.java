import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < 10; ++i){
			map.put(s.nextLine(), i);
		}
		for(int i = 0; i < line.length(); i += 10){
			System.out.print(map.get(line.substring(i, i + 10)));
		}
		System.out.println();
	}
}
