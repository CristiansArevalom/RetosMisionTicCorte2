package model;

public class Balon {
	
	private String serial;
	private String tipo;
	private int velocidad;
	private int tamaño;
	
	public Balon(int velocidad, int tamaño,String serial,String tipo) {
		this.serial=serial;
		this.tipo=tipo;
		this.velocidad=velocidad;
		this.tamaño=tamaño;
	}

	@Override
	public String toString() {
		return "\t"+"Balon "+this.tipo+" - "+"Serial: "+this.serial+"\n"+
				"\t"+"velocidad:"+velocidad+"\n"+
				"\t"+"tamaño:"+tamaño+"\n";
				
	}
	

	
	
	}
