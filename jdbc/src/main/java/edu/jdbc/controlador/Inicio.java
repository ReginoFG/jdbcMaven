package edu.jdbc.controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jdbc.dao.PedidoServicioImpl;

/**
 * Controlador de inicio
 * @author garfe
 *
 */
public class Inicio {

	public static void main(String[] args) {
		ApplicationContext contextoApp = new ClassPathXmlApplicationContext("contexto.xml");
		PedidoServicioImpl psi = (PedidoServicioImpl) contextoApp.getBean("pedidoDao");
		psi.insertarPedido(null);
	}

}
