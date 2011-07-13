package s57;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> strs = new ArrayList<String>();
		for (int i = 0; i < 3; ++i) {
			strs.add(s.next().toLowerCase().replaceAll("[^a-z]", ""));
		}
		Collections.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});
		for (int n = s.nextInt(); n-- > 0;) {
			String line = s.next().toLowerCase().replaceAll("[^a-z]", "");
			boolean b = true;
			List<String> tmp = new ArrayList<String>(strs);
			while (b) {
				b = false;
				for (int i = 0; i < tmp.size(); ++i) {
					if (line.startsWith(tmp.get(i))) {
						line = line.replaceFirst(tmp.get(i), "");
						tmp.remove(tmp.get(i));
						b = true;
						break;
					}
				}
			}
			System.out.println(line.length() < 1 && tmp.size() < 1? "ACC" : "WA");
		}

	}
}
