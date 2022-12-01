package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.ConnectionDB;
import vo.DeudasPorProyectoVo;
public class DeudasPorProyectoDao {
	private Connection conn=null;
	
	public List <DeudasPorProyectoVo> deudasPorProyectoSuperiorAlLimite(Double  limite) throws SQLException{
		List <DeudasPorProyectoVo> deudasTotales=new ArrayList<>();
		double limit = limite;
		
		if(conn==null) {
			conn = ConnectionDB.getConnection();
		}
		String sql="select c.id_proyecto,SUM(c.cantidad*(m.precio_unidad)) AS VALOR "
				+ "from Compra c "
				+ "inner join MaterialConstruccion m "
				+ "on c.id_materialconstruccion = m.id_materialconstruccion "
				+ "where upper(c.pagado) = 'NO' "
				+ "group by c.id_proyecto "
				+ "HAVING VALOR > (?)"
				+ "order by VALOR DESC;";
		
		
		PreparedStatement pst =  conn.prepareStatement(sql);
		pst.setDouble(1, limit);
		ResultSet resultSet = pst.executeQuery();
		while(resultSet.next()) {
			DeudasPorProyectoVo deudasPorProyecto = new DeudasPorProyectoVo(resultSet.getInt(1),resultSet.getDouble(2));
			deudasTotales.add(deudasPorProyecto);
		}
		//conn.close();
		
		return deudasTotales;
		
		
		
	}
}
