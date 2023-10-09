package n2ex01;

public class Smarthphone extends Telefon implements Camara,Rellotge {
	
	public void alarma() {
		System.out.println("Esta sonant l'alarma");
		
	}

	public void fotografiar() {
		System.out.println("S' esta fent una foto");
		
	}
	
public void trucar(int numero) {
	System.out.println("S'esta trucant al numero "+numero);
	
}
	
}

