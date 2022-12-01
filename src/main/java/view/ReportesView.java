package view;

import java.util.List;

import controller.ReportesController;
import vo.ProyectoBancoVo;

public class ReportesView {
	
	private ReportesController reportesController;
	
	public ReportesView() {
		this.reportesController = new ReportesController();
	}
	
	private String repitaCaracter(Character caracter, Integer veces) {
		String respuesta = "";
		for (int i = 0; i < veces; i++) {
			respuesta += caracter;
		}
		return respuesta;
	}
	public void proyectosFinanciadosPorBanco(String banco) {
		System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
				+ repitaCaracter('=', 37));
		if (banco != null && !banco.isBlank()) {
			System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
					"ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
			System.out.println(repitaCaracter('-', 105));
			List<ProyectoBancoVo>proyectosPorBanco= reportesController.proyectosBanco(banco);
			proyectosPorBanco.forEach(row -> System.out.println(row.toString()));
			
			// TODO Imprimir en pantalla la información del proyecto
		}
	}
	public void totalAdeudadoPorProyectosSuperioresALimite(Double limiteInferior) {
		System.out.println(repitaCaracter('=', 1) + " TOTAL DEUDAS POR PROYECTO "
				+ repitaCaracter('=', 1));
		if (limiteInferior != null) {
			System.out.println(String.format("%3s %15s", "ID", "VALOR "));
			System.out.println(repitaCaracter('-', 29));
			// TODO Imprimir en pantalla la información del total adeudado
			reportesController.deudasProyecto(limiteInferior).forEach(row -> System.out.println(row.toString()));
		}
	}
	public void lideresQueMasGastan() {
		System.out.println(repitaCaracter('=', 6) + " 10 LIDERES MAS COMPRADORES "
				+ repitaCaracter('=', 7));
		System.out.println(String.format("%-25s %15s", "LIDER", "VALOR "));
		System.out.println(repitaCaracter('-', 41));
		// TODO Imprimir en pantalla la información de los líderes
		reportesController.comprasDeLider().forEach(row -> System.out.println(row.toString()));
	}
	
	public static void main (String args[]) {
		ReportesView rv= new ReportesView();
		System.out.println("Ejercicio 1");
		rv.proyectosFinanciadosPorBanco("conavi");
		System.out.println("Ejercicio 2");
		Double valor = (double) 50000;
		rv.totalAdeudadoPorProyectosSuperioresALimite(valor);
		System.out.println("Ejercicio 3");
		rv.lideresQueMasGastan();
	}
}
