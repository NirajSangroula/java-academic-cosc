package experimentns;

public class Exceptions {

	public static void main(String[] args){
		try {
			System.out.println("No way");
			throw new RuntimeException();
			
		}
		finally {
			System.out.println("Finally");
		}
	}

}
