package Segunda_lista_de_exercicios;

import javax.swing.JOptionPane;

public class C {

	public static void main(String[] args) {

		int limiteSuperior;
		int resultado = 1;
		int multiplicador = 1;
		int multiplicadorAnterior = 0;

		limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número Natural aqui: "));
		while (resultado <= limiteSuperior) {
			multiplicadorAnterior = multiplicador;
			multiplicador++;
			resultado = multiplicador * multiplicador;
		}

		JOptionPane.showMessageDialog(null,"O Número natural que mais se aproxima da raiz quadrada mencionada é: " + multiplicadorAnterior);
	}
}

/*
 * limiteSuperior = 10 Passo 1 ->> multiplicador = 1 Resultado = 1*1 = 1 Passo 2
 * ->> multiplicador = 2 resultado = 2*2 = 4 Passo 3 ->> multiplicador = 3
 * resultado = 3*3 = 9 Passo 4 ->> multiplicador = 4 resultado = 4*4 = 16
 */