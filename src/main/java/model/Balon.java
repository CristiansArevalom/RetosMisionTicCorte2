package model;

public class Balon {
	
	private String serial;
	private String tipo;
	private int velocidad;
	private int tama�o;
	
	public Balon(int velocidad, int tama�o,String serial,String tipo) {
		this.serial=serial;
		this.tipo=tipo;
		this.velocidad=velocidad;
		this.tama�o=tama�o;
	}

	@Override
	public String toString() {
		return "\t"+"Balon "+this.tipo+" - "+"Serial: "+this.serial+"\n"+
				"\t"+"velocidad:"+velocidad+"\n"+
				"\t"+"tama�o:"+tama�o+"\n";
				
	}
	

	
	
	}
