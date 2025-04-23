package br.dev.vinicius.tabuada.model;

public class Tabuada {
	private static final int Tamanho = 0;
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	public double getMultiplicando() {
		return multiplicando;
	}
	public void setminimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}
	public double getminimoMultiplicador() {
		return minimoMultiplicador;
	}
    public void setMaximoMultiplicador(double MaximoMultiplicador) {
   
    }
    public double getMaximoMultiplicador() {
    	return maximoMultiplicador;
    } 
    public String[] mostrarTabuada() {
        
    	int indice = 0;
    	String[] Tabuada = new String[Tamanho];
		while (minimoMultiplicador < maximoMultiplicador) {
    		double produto = multiplicando = minimoMultiplicador;
    		System.out.println(multiplicando + " X " + minimoMultiplicador );
    		
    		Tabuada[indice] = multiplicando + "X" + minimoMultiplicador + "=" + produto;
    		
    		minimoMultiplicador++; // operador de incremento
    		indice++;
    	}
    	
    	return Tabuada;
    }
}

