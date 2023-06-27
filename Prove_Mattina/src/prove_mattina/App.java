package prove_mattina;

public class App {
	public static void main(String[] args) {
		Human aldo = new Human("Aldo", "Baglio");
		aldo.sayHello();
		
		Human giovanni = new Human("Giovanni", "Storti");
		giovanni.sayHello();
		
		Human.staticMethod();
		
		int x = 2;
		double y = 2.0;
		if (x == y) {
			System.out.println("I numeri sono uguali");
		}
		//Comparazione tra oggetti
		
		Human walter = new Human("Walter", "Barbieri");
		Human walter2 = new Human("Walter", "Barbieri");
		Human walter3 = walter;
		//Gli oggetti sono diversi indipendentemente dai valori, occupano due slot di memoria diversi
		if(walter == walter2) {
			System.out.println("Gli studenti sono uguali");
		} else {
			System.out.println("Gli studenti sono diversi");
		}
		//Gli oggetti sono uguali in quanto occupano lo stesso slot di memoria
		if(walter == walter3) {
			System.out.println("Gli studenti sono uguali");
		} else {
			System.out.println("Gli studenti sono diversi");
		}
		
		//Le strighe hanno un comportamento peculiare in quanto sono classi ma hanno un comportamento primitivo
		
		String s1 = "Ciao";
		String s2 = "Ciao";
		String s3 = new String("Ciao");
		//Possiamo comparare due stringhe semplicemente in quanto occuperanno lo stesso slot di memoria
		if(s1 == s2) {
			System.out.println("Le stringhe sono uguali");
		} else {
			System.out.println("Le stringhe sono diverse");
		}
		//Non possiamo comparare nel caso che la stringa venga definita con il costruttore new in quanto occuperà un altro slot di memoria
		if(s1 == s3) {
			System.out.println("Le stringhe sono uguali");
		} else {
			System.out.println("Le stringhe sono diverse");
		}
		//Usare il metodo equals per comparare stringhe!
		if(s1.equals(s3)) {
			System.out.println("Le stringhe sono uguali");
		} else {
			System.out.println("Le stringhe sono diverse");
		}
		
		//Metodo toString customizzato
		//Qua richiamiamo il metodo toString esplicitamente
		Human marta = new Human("Marta", "Bellina");
		System.out.println(marta.toString());
		//Il metodo toString verrà implicitamente richiamato da Java se non specificato per poter stampare una stringa partendo da un oggetto
		Human marta2 = new Human("Marta", "Bellina");
		System.out.println(marta2);
		
	}
}
