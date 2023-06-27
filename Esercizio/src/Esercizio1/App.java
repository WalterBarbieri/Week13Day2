package Esercizio1;

public class App {

	public static void main(String[] args) {
		Rettangolo ret1 = new Rettangolo(10, 20);
		Rettangolo ret2 =  new Rettangolo(15, 30);
		
		stampaPerimetro(ret1);
		stampaPerimetro(ret2);
		stampaArea(ret1);
		stampaArea(ret2);
 
	}
	
	private static void stampaPerimetro(Rettangolo ret) {
		System.out.println("Perimetro: " + ret.perimetro());
	}
	private static void stampaArea(Rettangolo ret) {
		System.out.println("Area: " +ret.area());
	}

}
