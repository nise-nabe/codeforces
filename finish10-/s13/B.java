package s13;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (; n > 0; n--) {
			List<Line2D> lines = new ArrayList<Line2D>();
			for (int i = 0; i < 3; i++) {
				lines
						.add(new Line2D.Float(new Point(scan.nextInt(), scan
								.nextInt()), new Point(scan.nextInt(), scan
								.nextInt())));
			}
			l:for (int i = 0; i < 3; i++) {
				Line2D line = lines.get(0);
				for (int j = 1; j < 3; j++) {
					Line2D line2 = lines.get(j);
					if(line.contains(line2.getP1())||line.contains(line2.getP2())){
						Collections.swap(lines, j, 1);
						Point2D p, p2, p3;
						if(line.contains(line2.getP1())){
							p=line2.getP1();
							p2=line2.getP2();
						}else{
							p=line2.getP2();
							p2=line2.getP1();
						}
						p3=line.getP1().equals(p)?line.getP2():line.getP1();
						double a,b,c;
						a = p2.distance(p3);
						b = p.distance(p2);
						c = p.distance(p3);
						double cos = (b*b+c*c-a*a)/2*b*c;
						if(cos < 0){
							break;
						}
						Line2D line3 = lines.get(2);
						double[] lq1 = new double[]{};
						double[] lq2 = new double[]{};
						if(line3.intersectsLine(0,0,0,0)&&line3.intersectsLine(0,0,0,0)){
							
						}
					}
				}
				Collections.rotate(lines, 1);
			}
			
		}
		System.out.println("NO");
	}
	
}
