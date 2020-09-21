package Segunda_lista_de_exercicios;

public class D {

	// 1 for criando uma lista de 50 a 150
	// 2 for chamando para cada um dos valores da lista o método que transforma

	public static void main(String[] args) {

		// Variables
		double celsius;
		double fahrenheit;

		for (fahrenheit = 50; fahrenheit <= 150; fahrenheit++) {
			System.out.println("Os graus em Fahrenheit são: " + fahrenheit);
			celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
			System.out.println("Os graus em Celsius são: " + celsius);
		}
	}
}

/*
 * 2 passo -> fahrenhet 50 3º passo -> mostrar o equivalente em Celcius 4º passo
 * -> adicionar 1 a temperatura e começar de novo do 51 5 passo ->
 */