package cosc1047.lab2;

public class Split {

	public static void main(String[] args) {
		String string = "Python,Java,C?C#,C++?Cobol";
		String[] languages = string.split("[,?]");
		for(String language: languages){
			System.out.println(language);
		}
	}

}
