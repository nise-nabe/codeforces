package s49;
public class C {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt(), i  = 1;
		StringBuilder sb = new StringBuilder();
		for (; i < n;) {
			sb.append(i++);
			sb.append(" ");
			sb.append(n--);
			sb.append(" ");
		}
		if(i == n){
			sb.append(i);
		}
		System.out.println(sb.toString().trim());
	}
}
