package uloha;

import java.util.Scanner;
import java.util.regex.*;

public class nieco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Zadaj zlomky, ktore chces scitat v tvare x/y. " +
        		"Najprv zadaj prvy zlomok, potvrd ho enterom a zadaj druhy.");
    	Scanner sc = new Scanner(System.in);
    	Pattern whitespace = sc.delimiter();
    	
    	//nacita prvy zlomok
    	sc.useDelimiter("/");
    	int cit1 = sc.nextInt();
    	String t1 = sc.findWithinHorizon(".",0);
    	sc.useDelimiter(whitespace);
    	int men1 = sc.nextInt();
    	sc.nextLine();
    	
    	//nacita druhy zlomok
    	sc.useDelimiter("/");
    	int cit2 = sc.nextInt();
    	t1 = sc.findWithinHorizon(".",0);
    	sc.useDelimiter(whitespace);
    	int men2 = sc.nextInt();
    	sc.nextLine();
    	
        System.out.println("Zadal si zlomky "+cit1+"/"+men1+" a "+cit2+"/"+men2);
        sc.close();
        
        Zlomok zlomok1 = new Zlomok(cit1, men1);
        Zlomok zlomok2 = new Zlomok(cit2, men2);
        
        Zlomok vysledok = zlomok1.Scitaj(zlomok2);
        System.out.println("Sucet zadanych zlomkov je: " + vysledok.citatel + "/" + vysledok.menovatel);
        
        Zlomok vysledok2 = vysledok.Skrat();
        System.out.println("Skrateny zlomok je: " + vysledok2.citatel + "/" + vysledok2.menovatel);

	}

}
