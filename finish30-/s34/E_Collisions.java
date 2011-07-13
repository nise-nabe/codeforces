package s34;
import java.util.*;

public class E_Collisions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), T = s.nextInt();
		List<double[]> m = new ArrayList<double[]>();
		for (int i = 0; i < n; ++i) {
			double[] d = new double[4];
			d[0] = i;
			for (int j = 1; j < 4; ++j) {
				d[j] = s.nextInt();
			}
			m.add(d);
		}
		Collections.sort(m, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				return Double.compare(o1[1], o2[1]);
			}
		});
		for (double t=0; Double.compare(t,T)<0;) {
			List<Double>q=new ArrayList<Double>();
			q.add(T-t);
			for (int i = 0; i < n - 1; ++i) {
				double[]x=m.get(i),y=m.get(i+1);
				if(x[2]-y[2]>0&&Math.abs(x[1]-y[1])>1e-5){
					q.add((y[1]-x[1])/(x[2]-y[2]));
				}
			}
			Collections.sort(q);
			double t1=q.get(0);
			for(double[] d : m){
				d[1] += d[2] * t1;
			}
			for(int  i = 0; i < m.size()-1; ++i){
				double[] x=m.get(i),y=m.get(i+1);
				double xv=x[2], yv=y[2];
				if(Math.abs(x[1]-y[1])<1e-5){
					xv = v(x[2],x[3],y[2],y[3]);
					yv = v(y[2],y[3],x[2],x[3]);
				}
				x[2] = xv;
				y[2] = yv;
				
			}
			t += t1;
		}
		Collections.sort(m, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				return Double.compare(o1[0], o2[0]);
			}
		});
		for(double[]d:m){
			System.out.println(d[1]);
		}
	}
	
	static private double v(double xv, double xm, double yv, double ym){
		return ((xm-ym)*xv+2*ym*yv)/(xm+ym);
	}
}
