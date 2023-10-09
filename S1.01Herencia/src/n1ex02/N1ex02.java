package n1ex02;

public class N1ex02 {

	public static void main(String[] args) {
		
		Cotxe cotxe2 = new Cotxe(450,"Montenegreo");
		Cotxe cotxe = new Cotxe(500,"Huracan");		
		
		System.out.println(cotxe);
		System.out.println(cotxe2);
		
		Cotxe.frenar();
		cotxe.accelerar();
		
		System.out.println(Cotxe.getMarca()+" "+Cotxe.getModel());
	
	
		
	}

}
