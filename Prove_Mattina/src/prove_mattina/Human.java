package prove_mattina;

public class Human {
	//Lista Proprietà
	String name;
	String surname;
	int age;
	
	//Lista Costruttori
	public Human(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Human(String name) {
		this.name = name;
	}
	
	//Lista Metodi
	void sayHello() {
		System.out.println("Ciao sono " + this.name + " " + this.surname);
	}
	
	//attributi e metodi static -> possiamo accedere a metodi e attributi static senza creare un oggetto.
	
	static void staticMethod() {
		System.out.println("Ciao sono un metodo statico");
	}
	
	//Sovrascrivere metodi nativi

	@Override
	public boolean equals(Object obj) {
		
		Human s = (Human) obj;
		if(this.name == s.name && this.surname == s.surname) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	
	
}
