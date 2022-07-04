package es.deusto.spq.jdo;

import javax.jdo.annotations.PersistenceCapable;
import java.util.ArrayList;

@PersistenceCapable
public class Pedido {

    private Usuario user;
    private ArrayList<Pizza> pizzas;

    public Pedido(Usuario user, ArrayList<Pizza> pizzas) {
        this.user = user;
        this.pizzas = pizzas;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
