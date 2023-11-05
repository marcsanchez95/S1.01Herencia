package n1ex02;

public class Cotxe {
	private static final String MARCA = "Ferrari";;
	private static String model = "Huracan";
	private final int POTENCIA = 500;


	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}

	public static void frenar(Cotxe cotxe) {
		System.out.println("El vehicle esta frenant.");

	}

	public void accelerar() {
		System.out.println("El vehicle esta accelerant.");

	}

}
