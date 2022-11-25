package edu.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
/**
 * Clase que implementa la interfaz PedidoServicio
 * @author garfe
 *
 */
public class PedidoServicioImpl implements PedidoServicio{
	
	private DataSource datasource;

	public void insertarPedido(Pedido pedido) {
		System.out.println("[INFORMACIÓN-PedidoServicioImpl-insertarPedido] Se accede a insertarPedido");
		
		String consulta = "INSERT INTO \"dlk_web_pedidos\".\"ped_tbh_pedidos\" (md_uuid,md_date,id,cod_pedido)"
				+ "VALUES('uuid1','16/11/2022 19:41:00',1,'pedido1')";
		
		try {
			Connection conexion = datasource.getConnection();
			PreparedStatement declaracionSentencia = conexion.prepareStatement(consulta);
			declaracionSentencia.execute();
			System.out.println("[INFORMACIÓN-PedidoServicioImpl-insertarPedido] Finaliza insertarPedido");
		} catch (SQLException e) {
			System.out.println("[ERROR-PedidoServicioImpl-insertarPedido] Error al crear la conexión:" + e);
		}
		
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public DataSource getDatasource() {
		return datasource;
	}

}
