package es.deusto.spq.jdo;

import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.util.ArrayList;

@PersistenceCapable
public class Usuario {

    @PrimaryKey
    private String user;
    private String pass;
    private String email;
    private String dir;

    @Persistent(mappedBy = "user", dependentElement = "true")
    private ArrayList<Pedido> pedidos;

    public Usuario() {
        super();
    }

    public Usuario(String us, String pass) {
        super();
        this.user = us;
        this.pass = pass;
        this.email = null;
        this.dir = null;
        this.pedidos = null;
    }

    public Usuario(String us, String pass, String email, String dir) {
        super();
        this.user = us;
        this.pass = pass;
        this.email = email;
        this.dir = dir;
        this.pedidos = null;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
