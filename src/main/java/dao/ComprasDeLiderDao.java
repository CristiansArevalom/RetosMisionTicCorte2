package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.ConnectionDB;
import vo.ComprasDeLiderVo;
public class ComprasDeLiderDao {
	
		private Connection conn=null;
	
		public List <ComprasDeLiderVo> comprasLider () throws SQLException{
			List <ComprasDeLiderVo> comprasLideres = new ArrayList<>();
			
			if(conn==null) {
				conn =  ConnectionDB.getConnection();
			}
			String sql = "select l.nombre ||\" \"|| l.Primer_Apellido ||\" \"||l.Segundo_Apellido as Lider ,SUM(c.Cantidad *mc.Precio_Unidad) as valor from lider l\r\n"
					+ "inner join Proyecto p on p.ID_Lider =l.ID_Lider\r\n"
					+ "inner join Compra c on c.ID_Proyecto = p.ID_Proyecto \r\n"
					+ "inner join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion \r\n"
					+ "GROUP by Lider\r\n"
					+ "order BY valor desc\r\n"
					+ "limit 10";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()) {
				ComprasDeLiderVo comprasDeLider =  new ComprasDeLiderVo(resultSet.getString(1),resultSet.getDouble(2));
				comprasLideres.add(comprasDeLider);
			}			
			return comprasLideres;
		}
	
	}
