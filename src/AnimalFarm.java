import java.util.*;

public class AnimalFarm {
	private Bot respon;
	
	public AnimalFarm() {
		new Animal();
		respon = new Bot();
	}
	
	public void start() {
		boolean finished = false;
		
		printWelcome();
		while(!finished) {
			HashSet<String> input = Animal.getInput();
			if(input.contains("Keluar")) {
				finished = true;
			}
			else {
				String response = respon.generateResponse(input);
				System.out.println(response);
			}
		}
		printGoodbye();
	}
	
	private void printWelcome() {
		System.out.println("Selamat datang di AnimalFarm!");
		System.out.println("Manakah yang termasuk hewan ternak?");
		System.out.println("1. Sapi");
		System.out.println("2. Ayam");
		System.out.println("3. Kucing");
		System.out.println("Ketik nama hewannya ya!");
		System.out.println("Ketik 'Keluar' untuk keluar dari sistem.");
	}
	
	private void printGoodbye() {
		System.out.println("Sampai jumpa!");
	}
	
}
