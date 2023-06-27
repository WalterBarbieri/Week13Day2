package Esercizio1;

public class Rettangolo {
	
	//Proprietà
	double altezza;
	double larghezza;
	
	//Costruttore
	public Rettangolo(double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	//Metodi
	
	public double perimetro() {
		return (this.altezza + this.larghezza) *2;
	}
	public double area() {
		return this.altezza * this.larghezza;
	}
}
