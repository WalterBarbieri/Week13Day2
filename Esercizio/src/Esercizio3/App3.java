package Esercizio3;

public class App3 {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("0001", "Campo Santo", "campo@santo.rip", "01/01/0000");

		Articolo[] articoli = new Articolo[4];
		articoli[0] = new Articolo("A001", "Croce", 15, 3);
		articoli[1] = new Articolo("A002", "Chiodi", 2, 9);
		articoli[2] = new Articolo("A003", "Funi", 3, 6);
		articoli[3] = new Articolo("A004", "Pianta di Rovi", 10, 4);

		Carrello carrello1 = new Carrello(cliente1, articoli, 0);
		carrello1.aggiungiArticolo(new Articolo("A005", "Tante Preghiere", 1, 15));

		double totale = carrello1.calcolaTotale();

		System.out.println("User: " + carrello1.cliente.nomeCognome + " UserId: " + carrello1.cliente.codiceCliente);
		for (int i = 0; i < articoli.length; i++) {
			System.out.println(
					"Articolo n" + i + ": " + articoli[i].descrizioneArticolo + " " + articoli[i].prezzo + "€");
		}
		System.out.println("Totale: " + totale);

	}

}
