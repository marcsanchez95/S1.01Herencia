package n1ex01;

public abstract class Instrument {
	protected String nom;
	protected float preu;

	
	public Instrument(String nom, float preu) {
		super();
		this.nom = nom;
		this.preu = preu;

	}

	public abstract void tocar();
	
}


