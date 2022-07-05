package es.deusto.spq.jdo;

import es.deusto.spq.dao.PedidoDAO;
import es.deusto.spq.dao.PizzaDAO;
import es.deusto.spq.dao.UsuarioDAO;

public class MainJDO {
// Datos de prueba
    public static void main(String[] args) {

        UsuarioDAO us = UsuarioDAO.getInstance();

        PedidoDAO p = PedidoDAO.getInstance();

        PizzaDAO pizzaDao = PizzaDAO.getInstance();


        Usuario u = new Usuario("Ibai", "1234");
        Pizza pizza1 = new Pizza();
        Pedido ped = new Pedido(u, pizza1);

        us.save(u);


    }

}
