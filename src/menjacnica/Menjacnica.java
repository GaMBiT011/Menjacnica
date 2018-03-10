package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta> valute = new LinkedList<>();

	public void dodajKurs(String punNaziv, int dan, int mesec, int godina, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
	
		
	}

	public void obrisiKurs(String punNaziv, int dan, int mesec, int godina, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
	
		
	}


	public double nadjiKurs(String punNaziv, int dan, int mesec, int godina) {
		
		return 0;
	}


}
