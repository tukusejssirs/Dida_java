import java.util.Scanner;


public class Zlomok {
	/*public int citatel;
	public int menovatel;*/
	
	public static void main (String[] args) {

	// trieda Zlomok ma jeden konstruktor
  //  public Zlomok(int cit1, int men1, int cit2, int men2) {
     /*   citatel = cit1;
        menovatel = men1;
        citatel = cit2;
        menovatel = men2; */
        
        System.out.println("Zadaj zlomky, ktore chces scitat v tvare x/y. " +
        		"Najprv zadaj prvy zlomok, potvrd ho enterom a zadaj druhy");
    	Scanner sc = new Scanner(System.in);
    	int cit1 = sc.nextInt();
    	sc.useDelimiter("/");
    	int men1 = sc.nextInt();
    	sc.close();
    	int cit2 = sc.nextInt();
    	sc.useDelimiter("/");
    	int men2 = sc.nextInt();
    	sc.close();
    	
        System.out.println("Zadal si zlomky"+cit1+"/"+men1+" a "+cit2+"/"+men2);
    	}
        
   // public Zlomok Scitaj(Zlomok zlomok1, Zlomok zlomok2) {
    	Zlomok vysledok;
    	int citvysl = ((cit1 * men2) + (cit2 * men1));
    	int menvysl = (men1*men2);
    	//citvysl = ((cit1 * men2) + (cit2 * men1));
    	//menvysl = (men1*men2);
    	return vysledok;
   // }
	
  /*  public Zlomok Skrat(Zlomok vysledok) {
    	return skrateny;
    }
*/

}
}
