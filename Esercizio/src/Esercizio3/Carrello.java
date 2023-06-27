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
	public void aggiugniArticolo(Articolo articolo) {
		if (articoli == null) {
			articoli = new Articolo[1];
			articoli[0] = articolo;
		} else {
			Articolo[] nuovoArray = new Articolo[articoli.length + 1];
		}
	}
}
