package s29;
import java.util.*;
public class A_SpitProblem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[][]a=new int[n][];
		for(int i=0;i<n;++i){
			a[i]=new int[]{s.nextInt(),s.nextInt()};
		}
		Arrays.sort(a,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		for(int i=0;i<n;++i){
			for(int j=i+1;j<n;++j){
				if(a[i][0]+a[i][1]==a[j][0]&&a[j][0]+a[j][1]==a[i][0]){
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}
}
