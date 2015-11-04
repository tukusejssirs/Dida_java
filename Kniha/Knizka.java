import java.util.Scanner;



public class Knizka {
	public String nazov;
	public String menoAutora;
	public int pocetStran;
	public int aktualnaStrana = 1;
	
	
	public Knizka(String s1, String s2, int i) {
		// TODO Auto-generated constructor stub
		nazov = s1;
		menoAutora = s2;
		pocetStran = i;
	}
	public void chodNaStranu(int x)
		{
		
		//aktualnaStrana = 1;
		aktualnaStrana = x;
		}
	
	public void zobrazStranu()
		{
		System.out.println("Si na strane :"+aktualnaStrana);
		}
	
	

}
