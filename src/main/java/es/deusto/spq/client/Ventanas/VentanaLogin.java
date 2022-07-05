package es.deusto.spq.client.Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JButton btnNewButton;
    private JTextField txtUsuario;
    private JPasswordField passwordField;
    private JTextField txtEmail;
    private JTextField txtPass;
    private JTextField txtUsuario_1;
    private JTextField txtDireccion;


    /**
     * Create the frame.
     */
    public VentanaLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 328, 251);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(0, 0, 312, 212);
        contentPane.add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("Login", null, panel, null);
        panel.setLayout(null);

        txtUsuario = new JTextField();
        txtUsuario.setText("Usuario");
        txtUsuario.setBounds(96, 36, 86, 20);
        panel.add(txtUsuario);
        txtUsuario.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(96, 67, 86, 20);
        panel.add(passwordField);

        JButton btnNewButton_1 = new JButton("Login");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                VentanaPedidos p = new VentanaPedidos();
                p.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(93, 107, 89, 23);
        panel.add(btnNewButton_1);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Registro", null, panel_1, null);
        panel_1.setLayout(null);

        txtEmail = new JTextField();
        txtEmail.setText("Email");
        txtEmail.setBounds(67, 22, 136, 20);
        panel_1.add(txtEmail);
        txtEmail.setColumns(10);

        txtPass = new JTextField();
        txtPass.setText("Pass");
        txtPass.setColumns(10);
        txtPass.setBounds(92, 53, 86, 20);
        panel_1.add(txtPass);

        txtUsuario_1 = new JTextField();
        txtUsuario_1.setText("Usuario");
        txtUsuario_1.setColumns(10);
        txtUsuario_1.setBounds(92, 84, 86, 20);
        panel_1.add(txtUsuario_1);

        txtDireccion = new JTextField();
        txtDireccion.setText("Direccion");
        txtDireccion.setColumns(10);
        txtDireccion.setBounds(92, 115, 86, 20);
        panel_1.add(txtDireccion);

        JButton btnNewButton_2 = new JButton("Registro");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Registro correcto. ");
            }
        });
        btnNewButton_2.setBounds(89, 146, 89, 23);
        panel_1.add(btnNewButton_2);





    }
}