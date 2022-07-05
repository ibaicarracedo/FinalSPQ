package es.deusto.spq.client;

import es.deusto.spq.client.Ventanas.VentanaLogin;
import es.deusto.spq.client.funcionalidad.Remote;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Remote("127.0.0.1", "3306");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
