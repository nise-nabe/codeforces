package s14;
import java.awt.Point;
import java.util.*;

public class C_FourSegments {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Point, Set<Point>> corners = new HashMap<Point, Set<Point>>();
		for (int n = 4; n-- > 0;) {
			Point p1 = new Point(scan.nextInt(), scan.nextInt());
			Point p2 = new Point(scan.nextInt(), scan.nextInt());

			if(!corners.containsKey(p1))
				corners.put(p1, new HashSet<Point>());
			corners.get(p1).add(p2);
			if(!corners.containsKey(p2))
				corners.put(p2, new HashSet<Point>());
			corners.get(p2).add(p1);
		}

		if (corners.keySet().size() != 4) {
			System.out.println("NO"); return;
		}
		for(Point p : corners.keySet()){
			List<Point> lines = new ArrayList<Point>(corners.get(p));
			if(lines.size()!=2){
				System.out.println("NO"); return;	
			}
			Point p1 = lines.get(0), p2 = lines.get(1);
			if(!((p.x==p1.x&&p.y==p2.y)||(p.y==p1.y&&p.x==p2.x))){
				System.out.println("NO"); return;	
			}
		}
		System.out.println("YES");
	}
}
