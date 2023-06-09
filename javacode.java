import java.util.Objects;
import java.util.Scanner;

public class javacode {
	public static void main(String[] args) {
		boolean code = true;
		while (code) {
			System.out.print("Are you happy?(please, write true, false or unknow: ");
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			if (Objects.equals(answer, "true")) {
				System.out.println("Ok");
				code = false;
			} else if (Objects.equals(answer, "false")) {
				System.out.println("Why you aren;t happy");
			code = false;
			} else if (Objects.equals(answer, "unknow")) {
				System.out.println("How you unknow you happy?");
			code = false;
			} else {
				System.out.println("please write true, false or unknow");
			}
		}
	}
}
