import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String address = "http://archives.nd.edu/cgi-bin/wordz.pl?keyword=";
		Definitions definitions = new Definitions();
		while(true) {
			System.out.print("Enter words (\"exit\" to quit program): ");
			input = scan.nextLine();
			if (input.equals("exit")) {
				break;
			}
			for(String word:input.split(" ")) {
				address+="+"+word;
			}
			System.out.println(definitions.getDefinitions(address));
		}
		scan.close();
	}
}
