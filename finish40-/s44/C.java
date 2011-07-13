package s44;
import java.util.*;

public class C {
	public static void main(String[] args) {
		for (Scanner s = new Scanner(System.in); s.hasNext();) {
			list.add(s.next());
		}
		f();
		System.out.print(result.isEmpty() ? "Impossible\n" : result);
	}

	static List<String> list = new ArrayList<String>();
	static boolean[] b = new boolean[6];
	static int c = 0;
	static String[] a = new String[6];
	static String result = "";

	static void use(int i, int j) {
		a[i] = list.get(j);
		b[j] = true;
		++c;
		f();
		a[i] = null;
		b[j] = false;
		--c;
	}

	static void f() {
		for (int i = 0; i < 6; ++i) {
			if (!b[i]) {
				if (a[0] == null) {
					use(0, i);
				} else if (a[1] == null) {
					if (a[0].charAt(0) == list.get(i).charAt(0)) {
						use(1, i);
					}
				}else if(a[2] == null){
					if (a[1].length() < list.get(i).length() && a[0].charAt(a[0].length()-1) == list.get(i).charAt(0)) {
						use(2, i);
					}
				}else if(a[3] == null){
					if (a[0].length() < list.get(i).length() && a[1].charAt(a[1].length()-1) == list.get(i).charAt(0)) {
						use(3, i);
					}
				}else if(a[4] == null){
					if (a[3].charAt(a[3].length()-1) == list.get(i).charAt(0)) {
						use(4, i);
					}
				}else if(a[5] == null){
					if (a[2].charAt(a[2].length()-1) == list.get(i).charAt(0)) {
						use(5, i);
					}
				}
			}
		}
		if(c == 6 && a[4].charAt(a[4].length()-1) == a[5].charAt(a[5].length()-1) && a[3].charAt(a[0].length()-1) == a[2].charAt(a[1].length()-1)){
			int w = a[3].length(), h = a[2].length();
			char[][] cs = new char[h][w];
			for(char[]cc : cs){
				Arrays.fill(cc, '.');
			}
			for(int i = 0; i < a[0].length();++i){
				cs[0][i]=a[0].charAt(i);
			}
			for(int i = 0; i < a[1].length();++i){
				cs[i][0]=a[1].charAt(i);
			}
			for(int i = 0; i < a[2].length();++i){
				cs[i][a[0].length()-1]=a[2].charAt(i);
			}
			for(int i = 0; i < a[3].length();++i){
				cs[a[1].length()-1][i]=a[3].charAt(i);
			}
			for(int i = 0; i < a[4].length();++i){
				cs[i+h-a[4].length()][w-1]=a[4].charAt(i);
			}
			for(int i = 0; i < a[5].length();++i){
				cs[h-1][i+w-a[5].length()]=a[5].charAt(i);
			}
			String r = "";
			for(char[]cc : cs){
				r += new String(cc)+"\n";
			}
			if(result.isEmpty() || r.compareTo(result)<0){
				result = r;
			}
		}
	}
}
