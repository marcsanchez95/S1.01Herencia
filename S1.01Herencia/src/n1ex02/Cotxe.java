package n1ex02;

public class Cotxe {
	public static final String MARCA = "Ferrari";;
	private static String model;
	private final int POTENCIA;

	public Cotxe(int POTENCIA, String model) {
		this.POTENCIA = POTENCIA;
		Cotxe.model = model;

	}

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

	public static void frenar() {
		System.out.println("El vehicle esta frenant.");

	}

	public void accelerar() {
		System.out.println("El vehicle esta accelerant.");

	}

	@Override
	public String toString() {
		return "Cotxe [POTENCIA=" + POTENCIA + "]";
	}

}
