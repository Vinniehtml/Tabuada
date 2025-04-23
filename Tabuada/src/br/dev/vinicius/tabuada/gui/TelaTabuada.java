package br.dev.vinicius.tabuada.gui;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.vinicius.tabuada.model.Tabuada;

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
	    tela.setResizable(false);
		
		//Vamos criar os componentes da tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando..");
		
		tela.getContentPane().add(labelMultiplicando);
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);
		
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mín. multiplicador:");
		labelMinMultiplicador.setBounds(20, 55, 150, 30);
		
		
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Max.Multiplicdor");
		labelMaxMultiplicador.setBounds(20, 90, 150, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setText(null);
		textMaxMultiplicador.setBounds(170,100, 40, 30);
		
		// botôes da tela
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");	
		buttonCalcular.setBounds(20, 140, 100, 40);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(20, 205, 210, 20);
		
		//Criar um objeto scroll
		
		listTabuada = new JList();
		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 140, 210, 200);
		
		// Obtemos o painel de conteúdo e adicionamos o labelMultiplicando nele
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(textMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(textMaxMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(scrollTabuada);
		
		//Adiciomnar events de eventos aos botôes
		buttonCalcular.addActionListener(new ActionListener() {
			
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			System.out.println("Multiplicando " + textMultiplicando.getText());
			System.out.println("Min " + textMinMultiplicador);
			System.out.println("Max " + textMaxMultiplicador);
			
			});
		
		buttonLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				textMultiplicando.setText(null);
				textMinMultiplicador.setText(null);
				textMinMultiplicador.setText(null);
				
				listTabuada.setListData(new String[10]);
				
				textMultiplicando.requestFocus();
				
			}
			
		
		
		//Essa linha deve ser a última linha desse método
		tela.setVisible(true);

	}

}
