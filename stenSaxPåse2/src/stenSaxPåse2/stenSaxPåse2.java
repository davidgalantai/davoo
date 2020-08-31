package stenSaxPåse2;

import java.util.*;

public class stenSaxPåse2 {

	public static void main(String[] args) {
		System.out.println("Spelare A: sten eller 1, sax eller 2, påse eller 3?"); //programmet skriver ut " "
		Scanner scan = new Scanner(System.in); //jag skapar en scanner som heter scan
		String input1 = scan.nextLine(); // jag skapar en sting variable som heter input1. A användaren ange värden.

		System.out.println("Spelare B: sten eller 1, sax eller 2, påse eller 3?"); // programmet skriver ut " "

		String input2 = scan.nextLine(); // jag skapar en sting variable som heter input2. B användaren ange värden.

		spel(input1, input2); // jag kallar på spel methoden
		
	}

	public static void spel(String a, String b) { // jag skapar en ny method som heter spel. methoden innehållder string variabeln a och b

		if (a.equals(b)) { // jag skapar en if påståande som kolla om a värden och b värden är samma.
			System.out.println("oavgjort!"); // programmet skriver ut oavgjort om a och b är samma.
		}

		if ((a.equals("sten") || b.equals("sten")) && (a.equals("påse") || b.equals("påse"))) { 
			System.out.println("Påse vinner!");
		} /*jag skapar en if som kollar om a är lika med sten eller b är lika med sten och om a är lika med påse eller b är lika med påse.
		    programmet skriver ut att påse vinner */
		if ((a.equals("sax") || b.equals("sax")) && (a.equals("påse") || b.equals("påse"))) {
			System.out.println("Sax vinner!");
		}	/*jag skapar en if som kollar om a är lika med sax eller b är lika med sax och om a är lika med påse eller b är lika med påse.
	    programmet skriver ut att sax vinner */
		if ((a.equals("sten") || b.equals("sten")) && (a.equals("sax") || b.equals("sax"))) {
			System.out.println("Sten vinner!");
		}   /*jag skapar en if som kollar om a är lika med sten eller b är lika med sten och om a är lika med sax eller b är lika med sax.
	    programmet skriver ut att sten vinner */

		if ((a.equals("1") || b.equals("1")) && (a.equals("3") || b.equals("3"))) {
			System.out.println("Påse vinner!");
		}	/*jag skapar en if som kollar om a är lika med 1 eller b är lika med 1 och om a är lika med 3 eller b är lika med 3.
	    programmet skriver ut att påse vinner */
		if ((a.equals("2") || b.equals("2")) && (a.equals("3") || b.equals("3"))) {
			System.out.println("Sax vinner!");
		}	/*jag skapar en if som kollar om a är lika med 2 eller b är lika med 2 och om a är lika med 3 eller b är lika med 3.
	    programmet skriver ut att sax vinner */
		if ((a.equals("1") || b.equals("1")) && (a.equals("2") || b.equals("2"))) {
			System.out.println("Sten vinner!");
			/*jag skapar en if som kollar om a är lika med 1 eller b är lika med 1 och om a är lika med 2 eller b är lika med 2.
		    programmet skriver ut att sten vinner */
		
			
		}
		
	}
}
