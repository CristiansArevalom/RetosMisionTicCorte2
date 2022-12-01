package vo;

public class ProyectoBancoVo {
	private int id_proyecto;
	private String constructora;
	private String ciudad;
	private String clasificacion;
	private int estrato;
	private String lider;
	
	
	public ProyectoBancoVo(int id_proyecto,String constructora,String ciudad, String clasificacion, int estrato,String lider) {
		this.id_proyecto=id_proyecto;
		this.constructora=constructora;
		this.ciudad=ciudad;
		this.clasificacion= clasificacion;
		this.estrato= estrato;
		this.lider=lider;
	}
	public int getId_proyecto() {
		return id_proyecto;
	}

	public String getConstructora() {
		return constructora;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public int getEstrato() {
		return estrato;
	}

	public String getLider() {
		return lider;
	}
	@Override
	public String toString() {
		return String.format("%3d %-25s %-20s %-15s %7d %-30s", id_proyecto, constructora, ciudad,
				clasificacion, estrato, lider);
	}

}
