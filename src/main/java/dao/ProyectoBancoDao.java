package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.ProyectoBancoVo;

public class ProyectoBancoDao {
	private Connection conn=null;


	public List<ProyectoBancoVo> obtenerProyectoPorBanco(String banco) throws SQLException {
		String inputBanco=banco;
		List<ProyectoBancoVo> proyectosPorBanco= new ArrayList<>();
		if(conn==null) {
			conn =utils.ConnectionDB.getConnection();
		}
		String sqlStatement="select p.ID_Proyecto as id, p.Constructora ,p.Ciudad,p.Clasificacion ,t.Estrato,l.Nombre ||' '||l.Primer_Apellido as Lider\r\n"
				+ "from Proyecto p \r\n"
				+ "inner join Tipo t on p.ID_Tipo =t.ID_Tipo\r\n"
				+ "inner join Lider l on p.ID_Lider = l.ID_Lider \r\n"
				+ "where upper(p.Banco_Vinculado)=upper(?)\r\n"
				+ "order by p.Fecha_Inicio desc;";

		PreparedStatement pStatement = conn.prepareStatement(sqlStatement);
		pStatement.setString(1, inputBanco);

		ResultSet result= pStatement.executeQuery();
		while(result.next()) {
			ProyectoBancoVo proyectoBanco = new ProyectoBancoVo(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),result.getInt(5), result.getString(6));
			proyectosPorBanco.add(proyectoBanco);
			//	Comppra ProyectoBancoVo = new ProyectoBancoVo();
		}



return proyectosPorBanco;


}

}
