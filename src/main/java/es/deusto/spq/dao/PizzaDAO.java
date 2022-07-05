package es.deusto.spq.dao;

import es.deusto.spq.jdo.Pedido;
import es.deusto.spq.jdo.Pizza;

import javax.jdo.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaDAO implements IDataAccessObject<Pizza>
{

    private PersistenceManager pm = null;
    private PersistenceManagerFactory pmf=null;
    private static PizzaDAO instance;

    private PizzaDAO() {

        pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
        pm = pmf.getPersistenceManager();
    }


    public static PizzaDAO getInstance() {
        if (instance == null) {
            instance = new PizzaDAO();
        }
        return instance;
    }

    @Override
    public void delete(Pizza object) {
        Transaction tx = pm.currentTransaction();
        tx.begin();
        pm.deletePersistent(object);
        tx.commit();
        return;
    }

    @Override
    public Pizza find(String param) {
        return null;
    }

    @Override
    public List<Pizza> getAll() {
        Transaction tx = pm.currentTransaction();
        List<Pizza> lista = null;
        try {
            tx.begin();
            Query query = pm.newQuery("SELECT FROM " + Pizza.class.getName());
            System.out.println(query);
            lista = (List<Pizza>)query.execute();
            System.out.println(query.execute());
            tx.commit();
        } catch(Exception ex) {
            System.out.println("EXCEPCION AL OBTENER PIZZAS : \n"+ ex.getMessage());
        }
        return lista;

    }

    @Override
    public void save(Pizza object) {
        Transaction tx = pm.currentTransaction();
        tx.begin();
        pm.makePersistent(object);
        tx.commit();
        return;
    }
}
