package model;

public class Novato extends Balon {
	private String resistenciaMaxima;

	public Novato(int tama�o,int velocidad, String serial, String tipo,String resistenciaMaxima) {
		super(velocidad, tama�o, serial, tipo);
		this.resistenciaMaxima=resistenciaMaxima;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+"Resistencia m�xima:" + resistenciaMaxima;
	}


}
