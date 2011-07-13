package s39;
import java.util.*;
class B_Repainting{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()-1,m=s.nextInt()-1,x=2*(s.nextInt()-1);
		System.out.println((n-=x)<0||(m-=x)<0?0:n+m<1?1:n+m);
	}
}