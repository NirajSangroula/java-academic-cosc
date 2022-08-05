package experimentns;

public class StringBuildersTries {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(true).append(43).append("Niraj");
		sb.replace(1, 4, "ist");
		sb.reverse().reverse();
		sb.insert(5, 90).delete(0, 8);
		System.out.println(sb);
		System.out.println(sb.substring(2));
		System.out.println(sb.substring(1, 4));
		System.out.println(sb.length());
		for(int i = 1; i <= 1000; i++)
			sb.append("-Kabu%"+i);
		System.out.println(sb);
		String[] l = sb.toString().split("[-%]");
		StringBuilder lo = new StringBuilder("");
		for(String s : l){
			System.out.println(s);
			lo.append(s);
		}
		String [] lov = lo.toString().split("[\\d]+");
		for(String s :lov){
			System.out.println(s);
			lo.append(s);
		}
		
	}

}
