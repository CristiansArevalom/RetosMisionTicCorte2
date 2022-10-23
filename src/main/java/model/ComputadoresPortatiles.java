package model;

public class ComputadoresPortatiles extends Computadores {
	
	private static final int PULGADAS_BASE=20;
	private int pulgadas;
	private boolean camaraITG;
	
	public ComputadoresPortatiles() {
		super();
		this.pulgadas=PULGADAS_BASE;
		this.camaraITG=false;
		
	}
	
	public ComputadoresPortatiles (double precioBase,int peso) {
		super(precioBase,peso);
		this.pulgadas=PULGADAS_BASE;
		this.camaraITG=false;
	}
	
	public ComputadoresPortatiles(double precioBase,int peso, char consumoW) {
		super(precioBase,peso,consumoW);
		this.pulgadas=PULGADAS_BASE;
		this.camaraITG=false;
		
	}
	
	public ComputadoresPortatiles(double precioBase,int peso, char consumoW,int pulgadas,boolean camaraITG) {
		super(precioBase,peso,consumoW);
		this.pulgadas=pulgadas;
		this.camaraITG=camaraITG;
		
	}

	
	public double calcularPrecio() {
		double precioConAdiciones=super.calcularPrecio();
		double adicion=0;
		if(this.getPulgadas()>40 ) {
			adicion+=super.getPrecioBase()*0.3;
		}
		if(this.isCamaraITG()) {
			adicion+=50;
		}
		
		return precioConAdiciones+adicion;
		
	}
	public int getPULGADAS_BASE() {
		return PULGADAS_BASE;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isCamaraITG() {
		return camaraITG;
	}

	public void setCamaraITG(boolean camaraITG) {
		this.camaraITG = camaraITG;
	}
}
