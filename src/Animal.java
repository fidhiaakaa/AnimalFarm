import java.util.*;

public class Animal {
	private static Scanner nama;
	public Animal() {
		nama = new Scanner(System.in);
	}
	public static HashSet<String> getInput() {
		System.out.print(">>  ");
		String inputLine = nama.nextLine().trim().toLowerCase();
		String[] wordArray = inputLine.split(" ");
		HashSet<String> words = new HashSet<String>();
		for(String word : wordArray) {
			words.add(word);
		}
		return words;
	}
}
