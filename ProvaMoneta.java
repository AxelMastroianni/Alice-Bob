package carol.coins;

public class ProvaMoneta {
	
	public static void main(String args[]) {
	
		Moneta moneta=new Moneta(101);
		moneta.combinazione(moneta.getValoreMoneta(), 0);
		System.out.println("Posso fare "+moneta.numeroCombinazioni()+" combinazioni");
	}
	

}
