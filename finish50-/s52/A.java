package s52;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> a = Arrays.asList("ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM",
				"SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE" );
		int count = 0;
		for(int n = s.nextInt();n-->0;){
			String next = s.next();
			if((next.matches("\\d+") && new Integer(next) < 18) || a.contains(next)){
				++count;
			}
		}
		System.out.println(count);
		
	}
}
