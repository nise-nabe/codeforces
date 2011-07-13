package s34;
import java.util.*;

public class C_PageNumbers {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		for (String str : new Scanner(System.in).nextLine().split(",")) {
			set.add(new Integer(str));
		}
		List<Integer> li = new ArrayList<Integer>(set);
		List<String> res = new ArrayList<String>();
		res.add("" + li.get(0));
		boolean chn = false;
		for (int i = 1; i < li.size(); ++i) {
			boolean b = li.get(i - 1) == li.get(i) - 1;
			if (b) {
				if (!chn) res.add("-");
				chn = true;
			} else {
				if (chn) res.add("" + li.get(i - 1));
				res.add("" + li.get(i));
				chn = false;
			}
		}
		if (chn) {
			res.add("" + li.get(li.size() - 1));
		}
		System.out.println(res.toString().replaceAll("[\\[\\] ]", "")
				.replaceAll(",-,", "-"));

	}
}
