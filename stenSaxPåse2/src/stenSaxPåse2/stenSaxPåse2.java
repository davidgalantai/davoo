package stenSaxPåse2;

import java.util.*;

public class stenSaxPåse2 {

	static final String STEN = "sten";
	static final String SAX = "sax";
	static final String PAPPER = "påse";

	static final int ROCK = 1;
	static final int SCISSOR = 2;
	static final int PAPER = 3;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("welcome to rock paper scissors: Press q to play with words or 1 to play with numbers");

		String chose = scan.next();

		if (chose.equals("q")) {
			spel();

		} else {

			spel2();

		}

	}

	public static void spel() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Spelare1: Välj Sten, Sax, eller Påse: ");
		String player1 = sc.next();
		System.out.println("Spelare 2: Välj Sten, sax, eller Påse: ");
		String player2 = sc.next();

		if (player1.equals(player2)) {
			System.out.print("Oavgjort");
		} else {
			switch (player1) {
			case STEN:
				if (player2.equals(SAX))
					System.out.print("Spelare 1 vinner med sten!");
				else
					System.out.print("Spelare 2 vinner med Påse!");
				break;
			case SAX:
				if (player2.equals(PAPPER))
					System.out.print("Spelare 1 vinner med sax!");
				else
					System.out.print("Spelare 2 vinner sten !");
				break;
			case PAPPER:
				if (player2.equals(STEN))
					System.out.print("Spelare 1 vinner med påse!");
				else
					System.out.print("Spelare 2 vinner med sax!");
				break;

			}

		}

	}

	public static void spel2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Spelare1: Välj (1) för Sten, (2) för Sax, eller (3) för Påse: ");
		int player1 = sc.nextInt();
		System.out.println("Spelare 2: Välj (1) för Sten, (2) för sax, eller (3) för Påse: ");
		int player2 = sc.nextInt();

		if (player1 == (player2)) {
			System.out.print("Oavgjort");
		} else {
			switch (player1) {
			case ROCK:
				if (player2 == (SCISSOR))
					System.out.print("Spelare 1 vinner med sten!");
				else
					System.out.print("Spelare 2 vinner med Påse!");
				break;
			case SCISSOR:
				if (player2 == (PAPER))
					System.out.print("Spelare 1 vinner med sax!");
				else
					System.out.print("Spelare 2 vinner sten !");
				break;
			case PAPER:
				if (player2 == (ROCK))
					System.out.print("Spelare 1 vinner med påse!");
				else
					System.out.print("Spelare 2 vinner med sax!");
				break;

			}

		}

	}
}
