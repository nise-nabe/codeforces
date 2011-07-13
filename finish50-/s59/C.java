package s59;
import java.util.*;

public class C {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < 10; ++i) {
			String line = "" + i;
			for (int j = 1; j < 10; ++j) {
				if (line.contains("" + j)) {
					continue;
				}
				String line2 = line + j;
				for (int k = 1; k < 10; ++k) {
					if (line2.contains("" + k)) {
						continue;
					}
					String line3 = line2 + k;
					for (int l = 1; l < 10; ++l) {
						if (line3.contains("" + l)) {
							continue;
						}
						list.add(line3 + l);
					}
				}
			}
		}

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (; n-- > 0;) {
			String g = s.next();
			int b = s.nextInt(), c = s.nextInt();
			List<String> tmp = new ArrayList<String>();
			for(String line : list){
				
			}
		}
	}
}
