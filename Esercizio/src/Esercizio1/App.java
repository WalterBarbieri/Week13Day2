package Esercizio1;

public class App {

	public static void main(String[] args) {

		Rettangolo ret = new Rettangolo();
		Rettangolo ret1 = new Rettangolo(10, 20);
		Rettangolo ret2 = new Rettangolo(15, 30);

		ret.stampaRettangolo(ret1);
		ret.stampaRettangolo(ret2);
		ret.stampaDueRettangoli(ret1, ret2);

	}

}
