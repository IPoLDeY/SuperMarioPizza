package supermariopizza;

/**Getr�nke
 * Klasse f�r Getr�nke im speziellen.
 * @param String name, double preis, double menge
 * @author Yannik
 *
 */
public class Getr�nke extends Bestellung{
	double menge;
	
	Getr�nke(String name, double preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}

}
