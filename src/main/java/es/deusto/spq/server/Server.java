package es.deusto.spq.server;

import es.deusto.spq.dao.PedidoDAO;
import es.deusto.spq.dao.PizzaDAO;
import es.deusto.spq.dao.UsuarioDAO;
import es.deusto.spq.jdo.Usuario;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.JDOHelper;
import javax.jdo.Transaction;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.HashMap;

@Path("/server")
@Produces(MediaType.APPLICATION_JSON)
public class Server {

    private String user;

    private PersistenceManager pm=null;
    private Transaction tx = null;

    private UsuarioDAO usuariodao = UsuarioDAO.getInstance();
    private PizzaDAO pizzadao = PizzaDAO.getInstance();
    private PedidoDAO pedidodao = PedidoDAO.getInstance();

    public Server() {
        PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
        this.pm = pmf.getPersistenceManager();
        this.tx = pm.currentTransaction();
    }





}
