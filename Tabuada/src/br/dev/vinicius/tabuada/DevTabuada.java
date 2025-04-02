package br.dev.vinicius.tabuada;

import br.dev.vinicius.tabuada.model.Tabuada;

public class DevTabuada {

	public static void main(String[] args) {
		
	Tabuada t1 = new Tabuada();
    t1.setMultiplicando(8);
    t1.setminimoMultiplicador(4);
    t1.setMaximoMultiplicador(6);
    t1.mostrarTabuada();
    Tabuada t2 = new Tabuada();
    t2.setMultiplicando(459);
    t2.setminimoMultiplicador(687);
    t2.setMaximoMultiplicador(714);
    t2.mostrarTabuada();
	}
