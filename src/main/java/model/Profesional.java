package model;

public class Profesional extends Balon {
	private String color;

	public Profesional(int velocidad, int tama�o, String serial, String tipo,String color) {
		super(velocidad, tama�o, serial, tipo);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+"color:" + color;
	}
	
	
	

}
