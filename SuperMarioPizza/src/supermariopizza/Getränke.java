package supermariopizza;

public class Getr�nke extends Bestellung{
	double menge;
	
	Getr�nke(String name, double preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}

}
