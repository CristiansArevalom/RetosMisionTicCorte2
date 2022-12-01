package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ComprasDeLiderDao;
import dao.DeudasPorProyectoDao;
import dao.ProyectoBancoDao;
import vo.ComprasDeLiderVo;
import vo.DeudasPorProyectoVo;
import vo.ProyectoBancoVo;

public class ReportesController {
	
	private ProyectoBancoDao proyectoBancoDao;
	private ComprasDeLiderDao comprasDeLiderDao;
	private DeudasPorProyectoDao deudasPorProyectoDao;
	
	public ReportesController(){
	
	this.comprasDeLiderDao = new ComprasDeLiderDao();
	this.deudasPorProyectoDao=new DeudasPorProyectoDao();
	}
	
	public List<ProyectoBancoVo> proyectosBanco(String nombreBanco) {
		this.proyectoBancoDao=new ProyectoBancoDao();
		List<ProyectoBancoVo> proyectosPorBanco= new ArrayList<>();
		try {
			proyectosPorBanco=proyectoBancoDao.obtenerProyectoPorBanco(nombreBanco);
		}catch(Exception ex){
			ex.getStackTrace();
		}
		return proyectosPorBanco;
	
	}
	
	public List <DeudasPorProyectoVo> deudasProyecto(double Limit){
		List <DeudasPorProyectoVo> deudasProyecto = new ArrayList<>();
		this.deudasPorProyectoDao  =  new DeudasPorProyectoDao();
		try {
			deudasProyecto =  deudasPorProyectoDao.deudasPorProyectoSuperiorAlLimite(Limit);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deudasProyecto;
		
	}
	public List<ComprasDeLiderVo> comprasDeLider ( ){
		List<ComprasDeLiderVo> comprasDeLider =  new ArrayList<ComprasDeLiderVo>();
		this.comprasDeLiderDao = new ComprasDeLiderDao();
		try {
			comprasDeLider = comprasDeLiderDao.comprasLider();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comprasDeLider;
	}

	
}

