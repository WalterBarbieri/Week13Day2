package Esercizio2;

public class Sim {

	// Proprietà
	String numero;
	double credito;
	Chiamata[] chiamate;
	int numChiamate;

	// Costruttore
	public Sim(String numero) {
		this.numero = numero;
		this.credito = 0;
		this.chiamate = new Chiamata[5];
		this.numChiamate = 0;
	}

	// Metodi
	public void stampaSim() {
		System.out.println("Dati Sim");
		System.out.println("Numero telefono: " + numero);
		System.out.println("Credito: " + credito);
		System.out.println("Ultime chiamate effettuate: ");
		for (int i = 0; i < numChiamate; i++) {
			System.out.println("Numero Chiamato: " + chiamate[i].numChiamato);
			System.out.println("Durata: " + chiamate[i].durata + " min");
		}
		System.out.println("");
	}

	public void aggiungiChiamata(Chiamata chiamata) {
		if (numChiamate < 5) {
			chiamate[numChiamate] = chiamata;
			numChiamate++;
		} else {
			for (int i = 0; i < 4; i++) {
				chiamate[i] = chiamate[i + 1];
			}
			chiamate[4] = chiamata;
		}
	}

	public void aggiungiCredito(double credito) {
		this.credito += credito;
	}
}
