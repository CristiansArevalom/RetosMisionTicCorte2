package model;

public class PrecioTotal {
	
	
	private double totalComputadores;
	private double totalComputadoresMesa;
	private double totalComputadoresPortatiles;
	private Computadores [] listaComputadores;
	
	
	public PrecioTotal (Computadores [] listaComputadores) { //rELACIÓN DE AGREGACION CON COMPUTADORES
		this.totalComputadores = 0;
		this.totalComputadoresMesa=0;
		this.totalComputadoresPortatiles=0;
		this.listaComputadores=listaComputadores;
				
	}
	public void mostrarTotales() {
		// Código
		double tempTotalComputadores=0;
		double tempTotalComputadoresMesa=0;
		double tempTotalComputadoresPortatiles=0;
		//comMesa y compPort es instancia de computadores, se deja solo if para que vaya consolidando el totalcomputadores
		for (Computadores comp: getListaComputadores()) {
			if(comp instanceof ComputadoresPortatiles) {
				tempTotalComputadoresPortatiles+=comp.calcularPrecio();
			}if(comp instanceof ComputadoresMesa) {
				tempTotalComputadoresMesa+=comp.calcularPrecio();
			}if (comp instanceof Computadores) { 
				tempTotalComputadores+=comp.calcularPrecio();
			}
			
		}
		//enviado datos a setters
		this.setTotalComputadores(tempTotalComputadores);
		this.setTotalComputadoresMesa(tempTotalComputadoresMesa);
		this.setTotalComputadoresPortatiles(tempTotalComputadoresPortatiles);
		
		// Mostramos los resultados
		System.out.println("La suma del precio de los computadores es de " + getTotalComputadores());
		System.out.println("La suma del precio de los computadores de mesa es de " +
				getTotalComputadoresMesa());
		System.out.print("La suma del precio de los computadores portátiles es de " +
				getTotalComputadoresPortatiles());
	}
	
	
	public double getTotalComputadores() {
		return totalComputadores;
	}
	public void setTotalComputadores(double totalComputadores) {
		this.totalComputadores = totalComputadores;
	}
	public double getTotalComputadoresMesa() {
		return totalComputadoresMesa;
	}
	public void setTotalComputadoresMesa(double totalComputadoresMesa) {
		this.totalComputadoresMesa = totalComputadoresMesa;
	}
	public double getTotalComputadoresPortatiles() {
		return totalComputadoresPortatiles;
	}
	public void setTotalComputadoresPortatiles(double totalComputadoresPortatiles) {
		this.totalComputadoresPortatiles = totalComputadoresPortatiles;
	}
	public Computadores[] getListaComputadores() {
		return listaComputadores;
	}
	public static void main(String[] args) {

		Computadores computadores[] = new Computadores[4];
		computadores[0] = new Computadores(60.0, 10, 'D');
		computadores[1] = new ComputadoresMesa(300.0, 40, 'Z', 40);
		computadores[2] = new ComputadoresPortatiles(50.0, 10, 'A', 70, false);
		computadores[3] = new Computadores(50.0, 10);
		PrecioTotal solucion1 = new PrecioTotal(computadores);
		solucion1.mostrarTotales();
		System.out.println();
	}

}
