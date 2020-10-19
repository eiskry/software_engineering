package excercise;
import java.util.Scanner;
public class ShowUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("文字列を入力してください．");
	    Scanner scanner = new Scanner(System.in);
	    String line = scanner.nextLine();
	    for (int i = 0; i < line.length(); i++) {
	      char c = line.charAt(i);
	      System.out.println("'" + c + "'の文字コードは" + (int)c + "です．");
	    }
	}

}
