package Esercizio3;

public class Carrello {
	// Proprietà
	Cliente cliente;
	Articolo[] articoli;
	double totale;

	// Costruttore
	public Carrello(Cliente cliente, Articolo[] articoli, double totale) {
		this.cliente = cliente;
		this.articoli = articoli;
		this.totale = totale;
	}

	// Metodi
	public void aggiungiArticolo(Articolo articolo) {
		if (articoli == null) {
			articoli = new Articolo[1];
			articoli[0] = articolo;
		} else {
			Articolo[] nuovoArray = new Articolo[articoli.length + 1];
			System.arraycopy(articoli, 0, nuovoArray, 0, articoli.length);
			nuovoArray[articoli.length] = articolo;
			articoli = nuovoArray;
		}
	}

	public double calcolaTotale() {
		totale = 0;
		for (Articolo articolo : articoli) {
			totale += articolo.prezzo;
		}

		return totale;
	}
}
