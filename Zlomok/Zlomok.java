package uloha;

public class Zlomok {
	
	public int citatel;
	public int menovatel;
	
	public Zlomok(int cit, int men) 
	{
		citatel = cit;
		menovatel = men;
	}
	
    public Zlomok Scitaj(Zlomok zlomok2) 
	{
    	int citvysl = ((citatel * zlomok2.menovatel) + (zlomok2.citatel * menovatel));
    	int menvysl = (menovatel*zlomok2.menovatel);
    	Zlomok vysledok = new Zlomok(citvysl, menvysl);
    	return vysledok;
	}
    
    public Zlomok Skrat ()
    {
    	int nsd = 1;
    	float cit;
    	float men;
    	
    	if (citatel < menovatel)
    		{
    		for (int i=1; i<citatel+1; i++)
    			{
    			if ((citatel % i == 0) & (menovatel % i == 0))
    				nsd = i;
    			}
    		cit = ((float)citatel) / nsd;
    		men = ((float)menovatel) / nsd;
    		System.out.println("Skrateny zlomok je: "+cit+"/"+men);
    		}
    	else
	      {
    		for (int i=1; i<menovatel+1; i++)
    			{
    			if ((citatel % i == 0) & (menovatel % i == 0))
    				nsd = i;
    			}
    		cit = ((float)citatel) / nsd;
    		men = ((float)menovatel) / nsd;
    		System.out.println("Skrateny zlomok je: "+cit+"/"+men);
	    }
    	return new Zlomok((int)cit, (int)men);
    
}
