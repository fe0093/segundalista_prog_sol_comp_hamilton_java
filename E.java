package Segunda_lista_de_exercicios;

import javax.swing.JOptionPane;

public class E {

	// Entra com os valores com JOPPANE e multiplica através de um For

	public static void main(String[] args) {

		// variables
		int natural = 1;
		int multiplicador = 1;

		natural = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu número natural aqui: "));
		for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println(natural + "x" + multiplicador + "=" + natural * multiplicador);
		}

	}
}
