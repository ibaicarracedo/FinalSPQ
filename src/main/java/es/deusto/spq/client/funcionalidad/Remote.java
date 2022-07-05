package es.deusto.spq.client.funcionalidad;

import es.deusto.spq.client.Ventanas.VentanaLogin;
import es.deusto.spq.jdo.Usuario;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class Remote {

    private String user;
    private Client client;
    private WebTarget webTarget;

    public Remote(String hostname, String port) {
        client = ClientBuilder.newClient();
        webTarget = client.target(String.format("http://%s:%s/rest/server", hostname, port));
        VentanaLogin v = new VentanaLogin();
        v.setVisible(true);
    }

    public void registerUser(String login, String password, String mail, String direccion) {
        WebTarget registerUserWebTarget = webTarget.path("registrarUsuario");
        Invocation.Builder invocationBuilder = registerUserWebTarget.request(MediaType.APPLICATION_JSON);

        Usuario u = new Usuario(login, password, mail, direccion);
        Response response = invocationBuilder.post(Entity.entity(u, MediaType.APPLICATION_JSON));
        if (response.getStatus() != Status.OK.getStatusCode()) {
            System.out.println("Error connecting with the server. Code: " + response.getStatus());
        } else {
            System.out.println("User correctly registered");
        }
    }

    //Post



}
