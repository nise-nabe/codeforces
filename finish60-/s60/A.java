package s60;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		int c=s.nextInt(),d=s.nextInt();
		int e=s.nextInt(),f=s.nextInt();
		System.out.println((a<1&&b*d>0)||(c<1&&d>0)||a*c*e<b*d*f?"Ron":"Hermione");
	}
}
