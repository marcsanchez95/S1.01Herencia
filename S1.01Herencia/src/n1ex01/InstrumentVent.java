package n1ex01;

public class InstrumentVent extends Instrument {
	
	public InstrumentVent(String nom, float preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Esta sonant un instrument de vent.");
		
	}

	@Override
	public String toString() {
		return "InstrumentVent ====> Nom: " + nom + ", preu: " + preu +" Euros";
	}

}


