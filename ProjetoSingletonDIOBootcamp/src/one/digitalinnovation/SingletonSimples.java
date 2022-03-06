package one.digitalinnovation;

public class SingletonSimples {

	
	private static SingletonSimples instancia;
	
	private SingletonSimples() {
		
	}
	
	public static SingletonSimples getInstancia() {
		if(instancia == null) {
			instancia = new SingletonSimples();
		}
		return instancia;
	}
}
