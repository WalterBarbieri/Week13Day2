package Esercizio1;

public class Rettangolo {

	// Proprietà
	double altezza;
	double larghezza;

	// Costruttore
	public Rettangolo(double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	public Rettangolo() {
	};

	// Metodi

	public double perimetro(Rettangolo ret) {
		return (ret.altezza + ret.larghezza) * 2;
	}

	public double area(Rettangolo ret) {
		return ret.altezza * ret.larghezza;
	}

	public void stampaRettangolo(Rettangolo ret) {
		System.out.println("Perimetro: " + perimetro(ret));
		System.out.println("Area: " + area(ret));

	}

	public void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
		System.out.println("Perimetro rettangolo 1: " + perimetro(ret1));
		System.out.println("Area rettangolo 1: " + area(ret1));
		System.out.println("Perimetro rettangolo 2: " + perimetro(ret2));
		System.out.println("Area rettangolo 2: " + area(ret2));
		System.out.println("Perimetro totale: " + (perimetro(ret1) + perimetro(ret2)));
		System.out.println("Area totale: " + (area(ret1) + area(ret2)));
	}
}
