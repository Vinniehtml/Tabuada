package br.dev.vinicius.tabuada.gui;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listTabuada;

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}

	public void criarTelaTabuada() {

		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
	
		//Vamos criar os componentes da tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando..");
		
		tela.getContentPane().add(labelMultiplicando);
		labelMultiplicando.setBounds(20, 20, 100, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(100, 28, 50, 50);
		
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mín. multiplicador:");
		labelMinMultiplicador.setBounds(20, 55, 150, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");	
		buttonCalcular.setBounds(20, , 0, 0);
		
		// Obtemos o painel de conteúdo e adicionamos o labelMultiplicando nesse
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		
		//Essa linha deve ser a última linha desse método
		tela.setVisible(true);

	}

}
