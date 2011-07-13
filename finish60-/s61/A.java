package s61;
import java.util.*;
import java.math.*;
import static java.math.BigInteger.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger i = s.nextBigInteger();
		String r = "BigInteger";
		if (i.compareTo(valueOf(Byte.MAX_VALUE)) <= 0) {
			r = "byte";
		} else if (i.compareTo(valueOf(Short.MAX_VALUE)) <= 0) {
			r = "short";
		} else if (i.compareTo(valueOf(Integer.MAX_VALUE)) <= 0) {
			r = "int";
		} else if (i.compareTo(valueOf(Long.MAX_VALUE)) <= 0) {
			r = "long";
		}
		System.out.println(r);
	}
}
