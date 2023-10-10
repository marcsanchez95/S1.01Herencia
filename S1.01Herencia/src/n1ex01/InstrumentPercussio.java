package n1ex01;

public class InstrumentPercussio extends Instrument {
	
	public InstrumentPercussio(String nom, float preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Esta sonant un instrument de percussio.");
		
	}
	static{
        System.out.println("S'ha carregat un bloc estatic de instrument de PERCUSSIO al ser mencionat en el main.");
  }

	@Override
	public String toString() {
		return "InstrumentPercussio ====> Nom: " + nom + ", preu: " + preu +" Euros";
	}

}



