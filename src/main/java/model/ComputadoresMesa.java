package model;

public class ComputadoresMesa extends Computadores {
	private static final int ALMACENAMIENTO_BASE=50;
	private int almacenamiento;
	
	// Constructor
	public ComputadoresMesa() {
		super();
		this.almacenamiento=ALMACENAMIENTO_BASE;
	}
	
	// Constructor
	public ComputadoresMesa(Double precioBase, Integer peso) {
		super(precioBase,peso);
		this.almacenamiento=ALMACENAMIENTO_BASE;
	}
	
	// Constructor
	public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer
	almacenamiento) {
		super(precioBase,peso, consumoW);
		this.almacenamiento=almacenamiento;
	}
	
	
	public double calcularPrecio() {
		double adicion=super.calcularPrecio();
		if (this.getAlmacenamiento()>100) {
			adicion+=50;
		}
		return adicion;		
	}
		

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
}

