package dave.divisors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class LeggiFile {
	
	private ArrayList<String> righeLette=new ArrayList<String>();
	private Deque<Integer> numeriLetti=new ArrayDeque<Integer>();
	
	public void memorizzaDatiFile(String nomeFile) throws IOException {
		FileReader file=new FileReader(nomeFile);
		BufferedReader lettore=new BufferedReader(file);
		String rigaLetta="";
		while(rigaLetta!=null) {
			rigaLetta=lettore.readLine();
			righeLette.add(rigaLetta);
		}
		righeLette.remove(righeLette.size()-1);//tolgo il null
	}
	
	public void leggiNumeri() {
		for(int i=0;i<righeLette.size();i++) {
			String riga=righeLette.get(i);
			for(int j=0;j<riga.length();j++) {
				String numero="";
				while(j<riga.length() && (riga.charAt(j)>='0' && riga.charAt(j)<='9')) {
					numero+=riga.charAt(j);
					j++;
				}
				if(!numero.equals(""))
					numeriLetti.add(Integer.parseInt(numero));
			}
		}
	}
	
	public ArrayDeque<Divisore> getDatiProblema(){
		ArrayDeque<Divisore> dati=new ArrayDeque<Divisore>();
		numeriLetti.pop();
		while(!numeriLetti.isEmpty()) {
			int inizio=numeriLetti.pop();
			int fine=numeriLetti.pop();
			int numeroA=numeriLetti.pop();
			int numeroB=numeriLetti.pop();
			dati.add(new Divisore(inizio,fine,numeroA,numeroB));
		}
		return dati;
	}
	

}
