package s18;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A_Triangle {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		List<Point> list = new ArrayList<Point>();
		for(int i = 0; i < 3;++i){
			list.add(new Point(scan.nextInt(), scan.nextInt()));
		}
		if(f(list)){
			System.out.println("RIGHT");
			return ;
		}
		for(int i = 0; i < 3; ++i){
			Collections.rotate(list, 1);
			if(g(list)){
				System.out.println("ALMOST");
				return;
			}
		}
		System.out.println("NEITHER");
	}
	static boolean f(List<Point> list){
		int[]dist = new int[3];
		dist[0] = (int) list.get(0).distanceSq(list.get(1));
		dist[1] = (int) list.get(1).distanceSq(list.get(2));
		dist[2] = (int) list.get(2).distanceSq(list.get(0));
		Arrays.sort(dist);
		for(int d : dist){
			if(d==0){
				return false;
			}
		}
		return dist[2] == dist[0] + dist[1];
	}
	static boolean g(List<Point> list){
		Point point = list.get(0);
		point.translate(1, 0);
		if(f(list))
			return true;
		point.translate(-2, 0);
		if(f(list))
			return true;
		point.translate(1, 1);
		if(f(list))
			return true;
		point.translate(0, -2);
		if(f(list))
			return true;
		point.translate(0, 1);
		return false;
	}
}
