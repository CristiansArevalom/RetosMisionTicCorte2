package model;

public class Novato extends Balon {
	private String resistenciaMaxima;

	public Novato(int tamaño,int velocidad, String serial, String tipo,String resistenciaMaxima) {
		super(velocidad, tamaño, serial, tipo);
		this.resistenciaMaxima=resistenciaMaxima;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+"Resistencia máxima:" + resistenciaMaxima;
	}


}
