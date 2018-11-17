package eve.eavesdropping;

import java.util.ArrayList;
import java.util.Collections;

public class Dropping {
	
	private int byteSorgente=0;
	private int byteTrasporto=0;
	private int numeroPassi=0;
	ArrayList<Integer> canali=new ArrayList<Integer>();
	
	public Dropping(int byteSorgente, int byteTrasporto, int numeroPassi) {
		this.byteSorgente=byteSorgente;
		this.byteTrasporto=byteTrasporto;
		this.numeroPassi=numeroPassi;
	}
	
	public void aggiungiByte() {
		int quoziente=byteSorgente/byteTrasporto;
		int resto=byteSorgente%byteTrasporto;
		for(int i=0;i<=numeroPassi;i++) {
			int byteNelCanale=(byteTrasporto-i)*quoziente+resto(resto,i);
			canali.add(byteNelCanale);
		}
	}
	
	public void arrivo() {
		for(int i=0;i<canali.size();i++) {
			int nuovoQuoziente=canali.get(i)/byteTrasporto;
			int avanzati=(canali.get(i)-(numeroPassi-i))*nuovoQuoziente(nuovoQuoziente);
			canali.set(i, avanzati);
		}
	}
	
	private int resto(int resto, int arrivo) {
		if(resto>arrivo)
			return resto;
		return 0;
	}
	
	private int nuovoQuoziente(int nuovoQuoziente) {
		if(nuovoQuoziente>0)
			return nuovoQuoziente;
		return 1;
	}
	
	public int getMassimiByte() {
		return Collections.max(canali);
	}

}
