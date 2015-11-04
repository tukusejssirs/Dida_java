import java.util.Random;


public class PoleCislic {
	int[] policko = new int[1];
	
	public PoleCislic(int n) {
		policko = new int[n];
	}
	
	public int[] Napln()
	{
		for (int i=0; i<policko.length; i++)
		{
			Random nahodne = new Random();
			policko[i] = nahodne.nextInt(50); 
		}
		return policko;
	}
	
	public void Utried()
	{
		for (int j=1; j<policko.length-1; j++)	
		{
			for (int i=0; i<policko.length-1; i++)
			{
				if(policko[i]>policko[i+1]) 
				{
					int pomocna=policko[i];
					policko[i]=policko[i+1];
					policko[i+1]=pomocna;
				}
			}
		}
	}
	
	public void Vypis()
	{
		for (int i=0; i<policko.length; i++)
			System.out.println(policko[i]+' ');
	}
}
