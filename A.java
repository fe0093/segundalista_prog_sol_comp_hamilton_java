package Segunda_lista_de_exercicios;

import javax.swing.JOptionPane;

public class A {

	public static void main(String[] args) {

		// variables
		int numeroinserido;
		int totaldevalores = 0;
		double numerodevaloresinseridos;
		double media;

		// Entry

		numerodevaloresinseridos = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão?"));
		for (int cont = 1; cont <= numerodevaloresinseridos; cont++) {
			numeroinserido = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
			totaldevalores = totaldevalores + numeroinserido;
		}
		media = totaldevalores / numerodevaloresinseridos;
		JOptionPane.showInputDialog(null, "Média Final", +media);
	}
}
