package assignment2;

public class PyramidSeries {

	public static void main(String[] args) {
		int n = 8;
		for(int rowNo = 1; rowNo <= n; rowNo++) {
			int colLen = 2 * rowNo - 1;
			for(int s = n - rowNo; s >= 1; s--)
				System.out.print("\t");
			for(int colNo = 1; colNo <= colLen; colNo++) {
				int midColIndex = rowNo;
				if(colNo < midColIndex) {
					System.out.print((int)Math.pow(3, colNo - 1) + "\t");
				}
				else if(colNo == midColIndex) {
					System.out.print((int)Math.pow(3, colNo - 1) + "\t");
				}
				else {
					int p = colLen - colNo;
					System.out.print((int)Math.pow(3, p) + "\t");
				}
			}
			System.out.println("\n");
		}
	}

}
