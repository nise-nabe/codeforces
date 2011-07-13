package STC.s3;
import java.text.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("MMMMMMMMM", Locale.US);
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(format.parse(s.next()));
		c.add(Calendar.MONTH, s.nextInt());
		System.out.println(format.format(c.getTime()));
	}
}
