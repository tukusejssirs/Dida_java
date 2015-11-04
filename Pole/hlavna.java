import java.util.Scanner;


public class hlavna {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Toto je program, ktory vytvori pole velkosti podla Vaseho vyberu, naplni ho nahodnymi hodnotami a nasledne ho zoradi a vypise");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj velkost pola");
		int n = sc.nextInt(); //velkost pola
		PoleCislic pole = new PoleCislic(n);
		
		pole.Napln();
		System.out.println("Tu hla je pole :)");
		pole.Vypis();
		pole.Utried();
		System.out.println("Tu hla je utriedene pole :)");
		pole.Vypis();
		
		//Diduska.Sikuliak(); preto som tam mala random 50 :D, ahaaa
	}

}
