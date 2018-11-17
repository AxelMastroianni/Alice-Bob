package dave.divisors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ContaDivisori {

	public static void main(String[] args) throws IOException {
		File file=new File("ContaDivisori.txt");
		if(file.exists()) {
			FileOutputStream outputNuovoFile=new FileOutputStream(file,true);
			PrintWriter scrittore=new PrintWriter(outputNuovoFile);
			LeggiFile reader=new LeggiFile();
			reader.memorizzaDatiFile("./src/input_8.1.D.txt");
			reader.leggiNumeri();
			ArrayDeque<Divisore> dati=reader.getDatiProblema();
			while(!dati.isEmpty()) {
				Divisore inEsame=dati.pop();
				scrittore.println(inEsame.contaDivisori());
			}
			scrittore.close();
		}
		else if(file.createNewFile()) {
			PrintWriter scrittore=new PrintWriter(file);
			scrittore.close();
			main(args);
		}
	}

}
