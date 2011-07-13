package s75;
import java.util.*;
import java.math.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger n = s.nextBigInteger(2);
		int c = 0;
		while(n.compareTo(BigInteger.ONE) > 0){
			if(n.testBit(1)){
				n.add(BigInteger.ONE);
			}else{
				n = n.shiftRight(1);
			}
			++c;
		}
		System.out.println(c);
	}
}
