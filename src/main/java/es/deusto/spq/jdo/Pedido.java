package es.deusto.spq.jdo;

import javax.jdo.annotations.PersistenceCapable;
import java.util.ArrayList;

@PersistenceCapable
public class Pedido {

    private Usuario user;
    private Pizza pizza;

    public Pedido(Usuario user, Pizza pizzas) {
        this.user = user;
        this.pizza = pizzas;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Pizza getPizzas() {
        return pizza;
    }

    public void setPizzas(Pizza pizzas) {
        this.pizza = pizzas;
    }
}
