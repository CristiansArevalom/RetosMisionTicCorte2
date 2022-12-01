package vo;

public class DeudasPorProyectoVo {
	private int id;
	private double valor;
	
	public DeudasPorProyectoVo(int id, double valor) {
		this.id=id;
		this.valor=valor;
		
	}
	
	@Override
	public String toString() {
		
		
		return this.id+"\t"+this.valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}
	
}
