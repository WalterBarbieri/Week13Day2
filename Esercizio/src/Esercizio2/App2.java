package Esercizio2;

public class App2 {

	public static void main(String[] args) {
		Sim sim1 = new Sim("3331122444");
		Sim sim2 = new Sim("3335566777");
		Chiamata chiamata1 = new Chiamata("3339988777", 4);
		Chiamata chiamata2 = new Chiamata("3336655444", 2);
		Chiamata chiamata3 = new Chiamata("3339988777", 15);
		Chiamata chiamata4 = new Chiamata("3339876543", 7);
		Chiamata chiamata5 = new Chiamata("3336655444", 11);
		sim1.aggiungiChiamata(chiamata1);
		sim1.aggiungiChiamata(chiamata2);
		sim1.aggiungiChiamata(chiamata3);
		sim1.aggiungiChiamata(chiamata4);
		sim1.aggiungiChiamata(chiamata5);
		sim1.aggiungiChiamata(chiamata2);
		sim2.aggiungiChiamata(chiamata1);
		sim2.aggiungiChiamata(chiamata2);
		sim2.aggiungiChiamata(chiamata3);
		sim2.aggiungiChiamata(chiamata4);
		sim2.aggiungiChiamata(chiamata5);
		sim1.aggiungiCredito(10);
		sim2.aggiungiCredito(20);
		sim1.stampaSim();
		sim2.stampaSim();

	}

}
