package s40;
public class C_EmailAddress {
	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).next();
		System.out.println(s.charAt(0)
				+ s.substring(1, s.length() - 1).replaceAll("dot", "\\.")
						.replaceFirst("at", "@") + s.charAt(s.length() - 1));
	}
}
