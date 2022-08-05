package pack;
public class UsePackage {
	public static void main(String[] args){
		 Package PACK1 = new Package(10, 'A');
		 Package PACK2 = new Package(12, 'M');
		 Package PACK3 = new Package(6, 'T');
		 
		 System.out.println("Package A");
		 PACK1.display();
		 System.out.println();
		 
		 System.out.println("Package M");
		 PACK2.display();
		 System.out.println();
		 
		 System.out.println("Package T");
		 PACK3.display();
		 System.out.println();
		 
		 Package INPACK1 = new InsuredPackage (10, 'A');
		 Package INPACK2 = new InsuredPackage (16, 'T');
		 Package INPACK3 = new InsuredPackage (19, 'M');
		 
		 System.out.println("Insured Package A");
		 INPACK1.display();
		 System.out.println();
		 
		 System.out.println("Insured Package T");
		 INPACK2.display();
		 System.out.println();
		 
		 System.out.println("Insured Package M");
		 INPACK3.display();
		 System.out.println();
	}
}
