package Segunda_lista_de_exercicios;

public class D {

	// 1 for criando uma lista de 50 a 150
	// 2 for chamando para cada um dos valores da lista o m�todo que transforma

	public static void main(String[] args) {

		// Variables
		double celsius;
		double fahrenheit;

		for (fahrenheit = 50; fahrenheit <= 150; fahrenheit++) {
			System.out.println("Os graus em Fahrenheit s�o: " + fahrenheit);
			celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
			System.out.println("Os graus em Celsius s�o: " + celsius);
		}
	}
}

/*
 * 2 passo -> fahrenhet 50 3� passo -> mostrar o equivalente em Celcius 4� passo
 * -> adicionar 1 a temperatura e come�ar de novo do 51 5 passo ->
 */