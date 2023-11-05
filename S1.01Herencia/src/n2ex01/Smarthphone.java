package n2ex01;

public class Smarthphone extends Telefon implements Camara,Rellotge {
	
	
	public Smarthphone(String marca, String model) {
		super(marca, model);
	}

	public void alarma() {
		System.out.println("Esta sonant l'alarma");
		
	}

	public void fotografiar() {
		System.out.println("S' esta fent una foto");
		
	}
		
}

