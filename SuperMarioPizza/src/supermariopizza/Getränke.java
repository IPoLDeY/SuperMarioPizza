package supermariopizza;

public class Getr�nke extends Bestellung{
	float menge;
	
	Getr�nke(String name, int preis, float menge) {
		super(name, preis);
		this.menge = menge;
	}

}
