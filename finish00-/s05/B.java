package s05;
import java.util.*;

public class B {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int max = 0;
		for (Scanner s = new Scanner(System.in); s.hasNextLine();) {
			String line = s.nextLine();
			list.add(line);
			max = Math.max(max, line.length());
		}
		StringBuilder sb = new StringBuilder();
		sb.append(f("*", max+2));
		sb.append("\n");
		int f = 0;
		for(String line : list){
			sb.append("*");
			int b = max - line.length(), x = b / 2;
			if(b % 2 > 0){
				x += f;
				f = 1 - f;
			}
			sb.append(f(" ", x));
			sb.append(line);
			sb.append(f(" ", b - x));
			sb.append("*\n");
		}
		sb.append(f("*", max+2));
		System.out.println(sb.toString());
		
	}
	static String f(String src, int c){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < c; ++i){
			sb.append(src);
		}
		return sb.toString();
	}
}
