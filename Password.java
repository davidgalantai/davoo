import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader =new Scanner(System.in); // jag skapar en scanner som heter reader.
		System.out.println("Please enter your password."); // programmet skriver ut "Please enter your password."
	
		String password = reader.nextLine(); // jag skapar en string variable som heter password. reader.nextline läser in lösenordet som användaren skriver in.
		
		String correct ="david" ; // jag skapar en string variable som heter correct, det är den rätta lösenordet.
		
		if (password.equals(correct)) { // jag skapar en if påstående som kollar om lösenordet är lika med correct variabels värde. Är den inte correct så kommer den gå vidare till else påstående.
		   System.out.println("Correct password!"); // programmet skriver ut att lösenordet är rätt.
		   }
		   
		 else {  //   om lösenordet är fel så hamnar det här i else                
			System.out.println("Wrong password!"); //  då skriver programmet ut att det är fel lösenord.
			
			System.out.println("you have 2 more attempts"); // programmet skriver ut att användaren har 2 försök kvar.
			
			 password = reader.nextLine(); // skapar en string variabel ksom heter password2 programmet läser in andra försöket på lösenordet.
			
			  if (password.equals(correct)) { // programmet kollar om lösenordet är lika med correct.
				   System.out.println("Correct password!");  // programmet skriver ut att lösenordet är rätt.
				   }
				   
				else {
					System.out.println("Wrong password!"); // skriver ut fel lösenord.
			        
					System.out.println("You have 1 more attempts!"); // skriver ut du har 1 försök kvar.
		
				
					password = reader.nextLine(); // skapar en string som heter password3 den läser in tredje försöket på lösenordet
					
					if (password.equals(correct)) { // om password3 är lika med correct.
						   System.out.println("Correct password!"); // skriver ut att lösenordet är rätt
						   }
						   
						else { // ananrs.
							System.out.println("Wrong password" + "\n" + "You have no more attempts"); // skriver ut att det är fel lösenord radbrytning du har inga fler försök.								
				
				}	

	}

}}}
