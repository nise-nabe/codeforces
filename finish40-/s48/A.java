package s48;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Amulet> set = new HashSet<Amulet>();
		int result = 0;
		for (int n = s.nextInt(); n-- > 0;) {
			s.nextLine();
			String x = s.nextLine(),y = s.nextLine();
			Amulet a = new Amulet(x + y.charAt(1) + y.charAt(0));
			boolean b = true;
			for(Amulet am : set){
				if(a.equals(am)){
					b = false;
				}
			}
			if(b){
				set.add(a);
				++result;
			}
		}
		System.out.println(result);
	}

	static class Amulet {
		String str;
		
		public Amulet(String str) {
			this.str = str;
		}
		
		@Override
		public boolean equals(Object obj) {
			Amulet other = (Amulet) obj;
			for(int i = 0; i < str.length(); ++i){
				if(other.str.equals(str.substring(i)+str.substring(0,i))){
					return true;
				}
			}
			return false;
		}

	}
}
