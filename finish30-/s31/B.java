package s31;
import java.util.Arrays;
import java.util.List;

public class B {
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		List<String> list = Arrays.asList(str.split("@", -1));
		if (list.contains("")) {
			System.out.println("No solution");
			return;
		}
		for(int i = 1; i < list.size()-1; ++i){
			if(list.get(i).length() < 2){
				System.out.println("No solution");
				return;
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append(list.get(0));
		for(int i = 0; i < list.size()-1; ++i){
			String x = list.get(i);
			sb.append(x.substring(0, 1));
			sb.append(",");
			sb.append(x.substring(1));
		}
		sb.append("@"+list.get(list.size()-1));
		System.out.println(sb);
	}
}
