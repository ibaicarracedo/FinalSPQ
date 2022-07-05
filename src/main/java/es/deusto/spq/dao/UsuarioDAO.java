package es.deusto.spq.dao;

import es.deusto.spq.jdo.Pedido;
import es.deusto.spq.jdo.Pizza;
import es.deusto.spq.jdo.Usuario;

import javax.jdo.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements IDataAccessObject<Usuario>{


    private PersistenceManager pm = null;
    private PersistenceManagerFactory pmf=null;
    private static UsuarioDAO instance;

    private UsuarioDAO() {
        pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
        pm = pmf.getPersistenceManager();
    }


    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    @Override
    public void delete(Usuario object) {
        Transaction tx = pm.currentTransaction();
        tx.begin();
        pm.deletePersistent(object);
        tx.commit();
        return;
    }

    @Override
    public Usuario find(String param) {
        Transaction tx = pm.currentTransaction();
        Usuario u = null;
        try {
            tx.begin();
            Query query = pm.newQuery("SELECT FROM " + Usuario.class.getName() + " WHERE user == '" + param + "'");
            System.out.println(query);
            u = (Usuario)query.execute();
            System.out.println(query.execute());
            tx.commit();
        } catch(Exception ex) {

        }
        return u;
    }


    public Usuario findUs(String user, String pass) {

        Transaction tx = pm.currentTransaction();
        Usuario u = null;
        try {
            tx.begin();
            Query query = pm.newQuery("SELECT FROM " + Usuario.class.getName() + " WHERE user == '" + user + "' AND WHERE pass == '" + pass + "'");
            System.out.println(query);
            u = (Usuario)query.execute();
            System.out.println(query.execute());
            tx.commit();
        } catch(Exception ex) {

        }
        return u;

    }

    @Override
    public List<Usuario> getAll() {
        Transaction tx = pm.currentTransaction();
        List<Usuario> lista = null;
        try {
            tx.begin();
            Query query = pm.newQuery("SELECT FROM " + Usuario.class.getName());
            System.out.println(query);
            lista = (List<Usuario>)query.execute();
            System.out.println(query.execute());
            tx.commit();
        } catch(Exception ex) {
            System.out.println("EXCEPCION AL OBTENER USUARIOS : \n"+ ex.getMessage());
        }
        return lista;
    }

    @Override
    public void save(Usuario object) {
        Transaction tx = pm.currentTransaction();
        tx.begin();
        pm.makePersistent(object);
        tx.commit();
        return;
    }
}
