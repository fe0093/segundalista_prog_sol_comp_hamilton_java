package Segunda_lista_de_exercicios;

import javax.swing.JOptionPane;

public class B {

	public static void main(String[] args) {

		double valoresnaturais = 0;
		int totaldevaloresnaturaisinseridos = 0;
		int valornaturalatual;
		double mediaaritmetica;

		do {

			valornaturalatual = Integer.parseInt(JOptionPane.showInputDialog("Insira seu valor natural aqui"));
			valoresnaturais = valoresnaturais + valornaturalatual;
			totaldevaloresnaturaisinseridos++;
		} while (valornaturalatual != 0);

		mediaaritmetica = valoresnaturais / totaldevaloresnaturaisinseridos;

		JOptionPane.showInputDialog(null, "valores naturais são " + valoresnaturais);
		JOptionPane.showInputDialog(null, "total de valores naturais inseridos é " + totaldevaloresnaturaisinseridos);
		JOptionPane.showInputDialog(null, "A Média Aritmética é: " + mediaaritmetica);

	}
}