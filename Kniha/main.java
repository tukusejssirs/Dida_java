import java.util.ArrayList;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knizka k1 = new Knizka("Rozpravka","Jozko",25);
		Knizka k2 = new Knizka("Basnicka", "Ferko",40);
		Knizka k3 = new Knizka("Ucebnica","Mudry ujo",94);
		Knizka[] Kniznica = new Knizka[10];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj stranu, na ktoru sa chces dostat");
		int x = sc.nextInt();
		if (x > k1.pocetStran) 
		{
			System.out.println("Kniha nema tolko stran!!!");
		}
		else
		{
			k1.chodNaStranu(x);
			System.out.println("Si na strane: "+k1.aktualnaStrana);
		}
		
		Kniznica[0] = k1;
		Kniznica[1] = k2;
		Kniznica[3] = k3;
		
		for (int i=0; i<10; i++)
		{
			if (Kniznica[i] == null)
			{
				System.out.println((i+1)+". kniha nie je v zozname.");
			}
			else
			System.out.println((i+1)+". kniha ma: "+Kniznica[i].pocetStran+" stran");
		}
	
	}

}
