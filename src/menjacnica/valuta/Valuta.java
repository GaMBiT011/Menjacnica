package menjacnica.valuta;

import java.util.GregorianCalendar;

public class Valuta {
	String punNaziv;
	String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;

	public String getPunNaziv() {
		return punNaziv;
	}

	public void setPunNaziv(String punNaziv) throws Exception {
		if (punNaziv == null || punNaziv.length() < 1)
			throw new Exception("Naziv ne moze biti null ili prazan string");
		else
			this.punNaziv = punNaziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) throws Exception {
		if (skraceniNaziv == null || skraceniNaziv.length() < 1)
			throw new Exception("Naziv ne moze biti null ili prazan string");
		else
			this.skraceniNaziv = skraceniNaziv;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) throws Exception {
		if (datum == null || datum.after(new GregorianCalendar()))
			throw new Exception("datum je null ili nije validan.");
		else
			this.datum = datum;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) throws Exception {
		if(prodajniKurs <=0)
			throw new Exception("Kurs nije dobro unet!");
		else
		this.prodajniKurs = prodajniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) throws Exception {
		if(srednjiKurs <=0)
			throw new Exception("Kurs nije dobro unet!");
		else
		this.srednjiKurs = srednjiKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) throws Exception {
		if(kupovniKurs <=0)
			throw new Exception("Kurs nije dobro unet!");
		else
		this.kupovniKurs = kupovniKurs;
	}

	public String toString() {
		return "Valuta:\t punNaziv: " + punNaziv + "\t skraceniNaziv: " + skraceniNaziv + "\n datum: " + datum
				+ "\n prodajniKurs: " + prodajniKurs + "\n srednjiKurs: " + srednjiKurs + "\n kupovniKurs: "
				+ kupovniKurs + "\n";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((punNaziv == null) ? 0 : punNaziv.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (punNaziv == null) {
			if (other.punNaziv != null)
				return false;
		} else if (!punNaziv.equals(other.punNaziv))
			return false;
		return true;
	}

}