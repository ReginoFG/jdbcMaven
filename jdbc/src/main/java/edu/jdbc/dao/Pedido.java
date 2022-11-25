package edu.jdbc.dao;

/**
 * DAO para la entidad ped_tbh_pedidos
 * @author garfe
 *
 */
public class Pedido {

	//ATRIBUTOS
	
	private int id;
	private String cod_pedido;
	
	//GETTERS & SETTERS
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCod_pedido() {
		return cod_pedido;
	}
	public void setCod_pedido(String cod_pedido) {
		this.cod_pedido = cod_pedido;
	}	
	
}
