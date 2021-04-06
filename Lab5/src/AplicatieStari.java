package Laborator_ISP_Stari;

import java.io.*; 

public class AplicatieStari {

	public static void main(String[] args) {
		AngajatTelefonie A1 = new AngajatTelefonie("Valentin");
		SesizareDefectiuneTelefonie s1 = new SesizareDefectiuneTelefonie(07534, TipDefectiuneTelefonie.apelareImposibila,true,A1);
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		int i=0;
		while (i!=1) {
		System.out.println("Introduceti comanda [a/d/r/i/o]: ");
		try {
		String comanda = new String (in.readLine());
		switch (comanda) {
		case "a": s1.amanare();
		break;
		case "d": s1.deschidere();
		break;
		case "r": s1.rezolvare();
		break;
		case "i": s1.inchidere();
		break;
		case "o": i =1;
		break;
		
		}
		}
		catch(Exception e) {
		e.printStackTrace();
		}
		s1.masinastaresesizaredefectiunetelefonie.salvareIstoricStari("Fisier.txt");

	}


}
}
