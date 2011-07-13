package s34;
import java.util.*;

public class D2_RoadMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(),r1=s.nextInt(),r2=s.nextInt();
		int[]p=new int[n+1];
		p[r1]=r1;
		for(int i=1;i<=n;++i){
			if(i!=r1){
				p[i]=s.nextInt();
			}
		}
		for(int now=r2,parent=r2;parent!=r1;){
			int tmp = p[now];
			p[now] = parent;
			parent = now;
			now = tmp;
		}
		StringBuffer sb = new StringBuffer();
		for(int i=1;i<=n;++i){
			if(i!=r2){
				sb.append(p[i]);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}
//9 8
//9 7
//2 4
//2 9
//1 3
//5 9
//8 9
//6 8
//1 2
//1 3
//0 8
//1 6
//1 7
//0 2
//1 9
//0 2
//1 9 
//[0, 1, 1, 1, 2, 9, 8, 9, 9, 2]
