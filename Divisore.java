package dave.divisors;

public class Divisore {
	
	private int inizio=0;
	private int fine=0;
	private int numeroA=0;
	private int numeroB=0;
	
	public Divisore(int numeroA, int numeroB, int inizio, int fine) {
		this.numeroA=numeroA;
		this.numeroB=numeroB;
		this.inizio=inizio;
		this.fine=fine;
	}
	
	private boolean divisore(int dividendo, int divisore) {
		if(dividendo%divisore==0)
			return true;
		return false;
	}
	
	public int contaDivisori() {
		int contaDivisori=0;
		for(int i=inizio;i<=fine;i++) {
			boolean divisoreA=divisore(i,numeroA);
			boolean divisoreB=divisore(i,numeroB);
			if(divisoreA || divisoreB)
				contaDivisori++;
			else if(divisoreA && divisoreB)
				contaDivisori++;
		}
		return contaDivisori;
	}

}
