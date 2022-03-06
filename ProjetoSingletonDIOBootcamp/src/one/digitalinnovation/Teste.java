package one.digitalinnovation;

public class Teste {

	public static void main(String[] args) {
		SingletonSimples simples = SingletonSimples.getInstancia();
		System.out.println(simples);
		simples = SingletonSimples.getInstancia();
		System.out.println(simples);

		SingletonApressado apressado = SingletonApressado.getInstancia();
		System.out.println(apressado);
		apressado = SingletonApressado.getInstancia();
		System.out.println(apressado);

		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
	}

}
