package s42;
import java.util.*;
import java.util.Map.Entry;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Integer> points = new HashMap<String, Integer>();
		for (int t = s.nextInt(); t-- > 0;) {
			String team = s.next();
			Integer goals = points.get(team);
			if (goals == null) {
				goals = 0;
			}
			points.put(team, goals + 1);
		}
		int max = Collections.max(points.values());
		for(Entry<String, Integer> point : points.entrySet()){
			if(point.getValue().equals(max)){
				System.out.println(point.getKey());
				return;
			}
		}
		
	}
}
