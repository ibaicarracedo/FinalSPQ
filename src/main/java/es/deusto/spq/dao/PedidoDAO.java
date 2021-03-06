package es.deusto.spq.dao;

import es.deusto.spq.jdo.Pedido;
import es.deusto.spq.jdo.Pizza;

import javax.jdo.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO implements IDataAccessObject<Pedido>{

    private PersistenceManager pm = null;
    private PersistenceManagerFactory pmf=null;
    private static PedidoDAO instance;

    private PedidoDAO() {

        pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
        pm = pmf.getPersistenceManager();
    }


    public static PedidoDAO getInstance() {
        if (instance == null) {
            instance = new PedidoDAO();
        }
        return instance;
    }

    @Override
    public void delete(Pedido object) {
        Transaction tx = pm.currentTransaction();
        tx.begin();
        pm.deletePersistent(object);
        tx.commit();
        return;
    }

    @Override
    public Pedido find(String param) {
        return null;
    }

    @Override
    public List<Pedido> getAll() {
        Transaction tx = pm.currentTransaction();
        List<Pedido> lista = null;
        try {
            tx.begin();
            Query query = pm.newQuery("SELECT FROM " + Pedido.class.getName());
            System.out.println(query);
            lista = (List<Pedido>)query.execute();
            System.out.println(query.execute());
            tx.commit();
        } catch(Exception ex) {
            System.out.println("EXCEPCION AL OBTENER PEDIDOS : \n"+ ex.getMessage());
        }
        return lista;
    }

    @Override
    public void save(Pedido object) {
        Transaction tx = pm.currentTransaction();
        tx.begin();
        pm.makePersistent(object);
        tx.commit();
        return;
    }
}
