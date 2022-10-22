package model;

public  class Computadores {
	
	private static final int PESO_BASE=5;
	private static final char CONSUMO_W_BASE='F';
	private static final double PRECIO_BASE=100;

	private int peso;
	private char consumoW;
	private double precioBase;
	
	public Computadores() {
		this.peso=PESO_BASE;
		this.consumoW=CONSUMO_W_BASE;
		this.precioBase=PRECIO_BASE;
	}
	
	public Computadores (double precioBase,int peso) {
		this.precioBase=precioBase;
		this.peso = peso;
		this.consumoW=CONSUMO_W_BASE;
	}
	
	
	public Computadores(double precioBase,int peso, char consumoW) {
		this.precioBase=precioBase;
		this.peso = peso;
		this.consumoW = consumoW;
	}
	public double calcularConsumoW() {
		double adicionW=0;
		char consumo=this.getConsumoW();
		switch(consumo) {
		case'A':
			adicionW=100;
			break;
		case'B':
			adicionW=80;
			break;
		case'C':
			adicionW=60;
			break;
		case'D':
			adicionW=50;
			break;
		case'E':
			adicionW=30;
			break;
		case'F':
			adicionW=10;
			break;
		}		
		return adicionW;
	}
	public double calcularPrecio() {
		double adicionW=calcularConsumoW();
		double adicionPeso=0; //viene de calcularConsumo
		double peso =this.getPeso(); 
		if(peso>=0 && peso<19) {
			adicionPeso=10;
		}else if(peso>=20 && peso<49)  {
			adicionPeso=50;
		}else if(peso>=50 && peso<=79) {
			adicionPeso=80;
		}else {
			adicionPeso=100;
		}
		return this.getPrecioBase()+(adicionPeso+adicionW);
		
	}
	
	
	
	public int getPESO_BASE() {
		return PESO_BASE;
	}

	public char getCONSUMO_W_BASE() {
		return CONSUMO_W_BASE;
	}

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public char getConsumoW() {
		return consumoW;
	}
	public void setConsumoW(char consumoW) {
		this.consumoW = consumoW;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


}
