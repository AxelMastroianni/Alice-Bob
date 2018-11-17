package carol.coins;
import java.util.*;
public class Moneta {
	
	public static int[] monete=new int[] {1,2,5,10,20,50,100,200};
	private ArrayList<Integer> combinazioni;
	private int valoreMoneta=0;
	
	public Moneta(int valoreMoneta) {
		this.valoreMoneta=valoreMoneta;
		combinazioni=new ArrayList<Integer>();
	}
	
	public void combinazione(int valore, int moneta) {
		for(int i=0;valore>=monete[i] || i>monete.length || valore==0;i++) {
			if(i==0) {
				combinazioni.add(1);
				if(moneta==monete[1] || valore==0)
					return;
			}
			else {
				int quoziente=valore/monete[i];
				for(int j=1;j<=quoziente;j++) {
					int nuovoNumero=valore-monete[i]*j;
					combinazione(nuovoNumero,monete[i]);
				}
			}
		}
	}
	
	public int numeroCombinazioni() {
		return combinazioni.size();
	}
	
	public int getValoreMoneta() {
		return valoreMoneta;
	}

}
