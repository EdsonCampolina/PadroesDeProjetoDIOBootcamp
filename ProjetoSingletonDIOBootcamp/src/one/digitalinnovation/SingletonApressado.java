package one.digitalinnovation;

public class SingletonApressado {
	private static SingletonApressado instancia = new SingletonApressado();

	private SingletonApressado() {

	}

	public static SingletonApressado getInstancia() {
		return instancia;
	}
}
