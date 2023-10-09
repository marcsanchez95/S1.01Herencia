package n2ex01;

public class N2ex01 {

	public static void main(String[] args) {
		Smarthphone iphone = new Smarthphone();

		iphone.alarma();
		iphone.fotografiar();
		iphone.trucar(669541558);

		final int MEGAPIXELS = Camara.MEGAPIXELS;

		System.out.println(MEGAPIXELS + " Megapixels");
	}

}
