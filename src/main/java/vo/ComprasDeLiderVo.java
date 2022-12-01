package vo;
/*VO VALUE OBJECT, Clase con propiedades, getters y seters que 
 * agrupa prpoedades de 
 * los datos que la capa de visualización necesita mostrar.*/

public class ComprasDeLiderVo {
	private String lider;
	private double valor;
	
	public ComprasDeLiderVo (String lider,double valor) {
		this.lider=lider;
		this.valor=valor;
	}
	
	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return this.lider + "\t" + this.valor;
	}
	

	
	


	
	
	
}
