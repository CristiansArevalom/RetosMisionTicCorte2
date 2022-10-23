package model;

public class Profesional extends Balon {
	private String color;

	public Profesional(int velocidad, int tamaño, String serial, String tipo,String color) {
		super(velocidad, tamaño, serial, tipo);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+"color:" + color;
	}
	
	
	

}
