package experimentns;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(Arrays.asList(new String[]{"Niraj", "Sangroula", "Akash", "Khatri"}));
		for(String s : al)
			System.out.println(s);
		String[] s = new String[al.size()];
		Collections.shuffle(al);
		al.toArray(s);
	
		for(String c : s)
			System.out.println(c);
		long v = Long.MAX_VALUE + 1;
		System.out.println(v);
	}
}

class A extends B {
	public A(int t) {
		System.out.println("A's constructor is invoked");
	}
	//IMprove the visibility... Easily
	public static boolean equalsp(Object a) {
		return false;
	}
}

class B {
	public B() {
		System.out.println("B's constructor is invoked");
	}

	
	public static boolean equalsp(Object b) {
		return false;
	}
}