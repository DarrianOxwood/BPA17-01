package lab5;

class quantity implements Runnable {
	public Candle[] Candles;
	
	 public void run() {
			int max = Candles[0].Height;
		    int quantity = 1;
		    for(int i = 1; i < Candles.length; i ++)
		    {
		    	if(max < Candles[i].Height)
		    	{
		    		quantity = 1;
		    		max = Candles[i].Height;
		    	}
		    	else
		    		if(max == Candles[i].Height)
		    			quantity++;
		    }
		    System.out.println("Количество самых высоких свечей: " + quantity);
		}
	 
	 

	    public void Candles(Candle[] Candles){
	    	this.Candles = Candles; 
	    }

}
