package menjacnica.interfejs;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String punNaziv, int dan, int mesec, int godina, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) throws Exception;
	public void obrisiKurs(String punNaziv,int dan, int mesec, int godina);
	public double nadjiKurs(String punNaziv,int dan,int mesec,int godina);
}
