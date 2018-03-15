package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta> valute = new LinkedList<>();

	public void dodajKurs(String punNaziv, int dan, int mesec, int godina, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) throws Exception {
		Valuta v = new Valuta();
		v.setPunNaziv(punNaziv);
		v.setDatum(new GregorianCalendar(godina,mesec,dan));
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		v.setKupovniKurs(kupovniKurs);

}

	public void obrisiKurs(String punNaziv, int dan, int mesec, int godina) {
		GregorianCalendar datum = new GregorianCalendar(godina,mesec,dan);
		Valuta v =new Valuta();
		try {
			v.setPunNaziv(punNaziv);
			v.setDatum(datum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).equals(v)) {
				valute.remove(i);
				break;
			}
		}
	

	}
	public double nadjiKurs(String punNaziv, int dan, int mesec, int godina) {
		Valuta v =new Valuta();
		try {
			v.setPunNaziv(punNaziv);
			v.setDatum(new GregorianCalendar(godina,mesec,dan));
		} catch (Exception e) {
		}
		for (int i = 0; i < valute.size(); i++) {
			if(valute.contains(v)) {
				return valute.get(i).getSrednjiKurs();
			}
		}
		return 0;
	}


}
