package eve.eavesdropping;

public class ProvaDropping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropping drop=new Dropping(30,10,10);
		drop.aggiungiByte();
		drop.arrivo();
		System.out.println("Arrivo con massimo : "+drop.getMassimiByte());

	}

}
