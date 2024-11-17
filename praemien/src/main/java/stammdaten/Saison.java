package stammdaten;

import java.text.DateFormat;

public class Saison {

	public int saisonId;
	public int saisnonJahr;
	public DateFormat saisonVon;
	public DateFormat saisonBis;

	/**
	 * leerer Konstruktor f�r Saison
	 */
	public Saison() {

	}

	/**�
	 * Konstruktor f�r die Saison mit der Zuordnung zum Jahr, welches mit dem Datum von und Datum bis eingeschr�nkt wird.
	 * Die Saison endet f�r die Abrechnung jeweils am 31.10. somit beginnt die neue Saison f�r das folgende Jahr jeweils  am 1. November.
	 *
	 * @param saisonId
	 * @param saisonJahr
	 * @param saisonVon
	 * @param saisonBis
	 */
	public Saison(int saisonId, int saisonJahr, DateFormat saisonVon, DateFormat saisonBis) {
		this.saisonId = saisonId;
		this.saisnonJahr= saisonJahr;
		this.saisonVon = saisonVon;
		this.saisonBis = saisonVon;
	}

	public int getSaisonId() {
		return saisonId;
	}

	public void setSaisonId(int saisonId) {
		this.saisonId = saisonId;
	}

	public int getSaisnonJahr() {
		return saisnonJahr;
	}

	public void setSaisnonJahr(int saisnonJahr) {
		this.saisnonJahr = saisnonJahr;
	}

	public DateFormat getSaisonVon() {
		return saisonVon;
	}

	public void setSaisonVon(DateFormat saisonVon) {
		this.saisonVon = saisonVon;
	}

	public DateFormat getSaisonBis() {
		return saisonBis;
	}

	public void setSaisonBis(DateFormat saisonBis) {
		this.saisonBis = saisonBis;
	}

}
