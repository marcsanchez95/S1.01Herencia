package n1ex01;

import java.util.ArrayList;

public class N1ex01 {

	public static void main(String[] args) {
		ArrayList<Instrument> instruments = new ArrayList<Instrument>();
		             
		InstrumentCorda guitarra = new InstrumentCorda("Guitarra", 669.98f);
		instruments.add(guitarra);
		guitarra.tocar();

		InstrumentPercussio bateria = new InstrumentPercussio("Bateria", 995.54f);
		instruments.add(bateria);
		bateria.tocar();

		InstrumentVent flauta = new InstrumentVent("Flauta", 500.65f);
		instruments.add(flauta);
		flauta.tocar();

		System.out.println(flauta);
		System.out.println(instruments);
		
										
		/*
		InstrumentPercussio algunInstrument = null;

		for (int i = 0; i < instruments.size(); i++) {
			if (instruments.get(i) instanceof InstrumentCorda) {
				System.out.println("Aquest es un instrument de Corda:");
				System.out.println(instruments.get(i));
			}
		}
		for (int j = 0; j < instruments.size(); j++) {
			if (instruments.get(j) instanceof InstrumentVent) {
				System.out.println("Aquest es un instrument de vent:");
				System.out.println(instruments.get(j));
			}

		}
		for (int k = 0; k < instruments.size(); k++) {
			if (instruments.get(k) instanceof InstrumentPercussio) {
				System.out.println("Aquest es un instrument de Percussio:");
				System.out.println(instruments.get(k));

			}
		}
		for (Instrument instrument : instruments) {
			if (instrument instanceof InstrumentPercussio) {
				algunInstrument = (InstrumentPercussio) instrument;
			}

		}
		System.out.println(algunInstrument);*/
	}

}
