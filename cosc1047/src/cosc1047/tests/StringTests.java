package cosc1047.tests;

import java.math.BigInteger;
import java.util.*;

public class StringTests {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s = s.useDelimiter("[-_]");
		String ss = s.next();
		System.out.println(ss.replace(s.next(), s.next()));
		StringBuilder stb = new StringBuilder("theremyboyquick");
		stb.append(34).append(true);
		stb.deleteCharAt(stb.lastIndexOf("quic"));
		stb.delete(stb.lastIndexOf("uic"), stb.length());
		stb.insert(stb.indexOf("my"), " priyashi mayalu is ").reverse();
		stb.deleteCharAt(0);
		stb.setCharAt(0, 'F');
		System.out.println(stb);
		stb.trimToSize();
		System.out.println("Capacity, length" + stb.capacity() + " " + stb.length());
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[]{4, 4, 54, 546}));
		for(Object i: al.toArray()){
			System.out.println((Integer)i);
		}
	}

	public static BigInteger factorial(int n){
		BigInteger i = BigInteger.ONE;
		for(int j = 1; j <= n; j++)
			i = i.multiply(new BigInteger(String.valueOf(j)));
		return i;
	}
}