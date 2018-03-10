package menjacnica;

import java.util.LinkedList;

import menjacnica.valuta.Valuta;

public class Menjacnica {
	String nazivMenjacnice;
	LinkedList<Valuta> valute = new LinkedList<>();

	public String getNazivMenjacnice() {
		return nazivMenjacnice;
	}

	public void setNazivMenjacnice(String nazivMenjacnice) throws Exception {
		if (nazivMenjacnice == null || nazivMenjacnice.length() < 1)
			throw new Exception("Naziv ne moze biti null ili prazan string");
		else
			this.nazivMenjacnice = nazivMenjacnice;
	}

	public String toString() {
		return "Menjacnica: " + nazivMenjacnice + ", valute:\n " + valute;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nazivMenjacnice == null) ? 0 : nazivMenjacnice.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (nazivMenjacnice == null) {
			if (other.nazivMenjacnice != null)
				return false;
		} else if (!nazivMenjacnice.equals(other.nazivMenjacnice))
			return false;
		return true;
	}

}
