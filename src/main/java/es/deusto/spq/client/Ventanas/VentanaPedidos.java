package es.deusto.spq.client.Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
public class VentanaPedidos extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public VentanaPedidos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(0, 0, 434, 261);
        contentPane.add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("Consulta Ped", null, panel, null);
        panel.setLayout(null);

        JList list = new JList();
        list.setBounds(0, 190, 419, -192);
        panel.add(list);

        JButton btnNewButton_1 = new JButton("Actualizar");
        btnNewButton_1.setBounds(167, 199, 89, 23);
        panel.add(btnNewButton_1);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Crea Pedido", null, panel_1, null);
        panel_1.setLayout(null);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Mozarella");
        chckbxNewCheckBox.setBounds(21, 22, 97, 23);
        panel_1.add(chckbxNewCheckBox);

        JCheckBox chckbxTomate = new JCheckBox("Tomate");
        chckbxTomate.setBounds(21, 65, 97, 23);
        panel_1.add(chckbxTomate);

        JCheckBox chckbxCarne = new JCheckBox("Carne");
        chckbxCarne.setBounds(21, 112, 97, 23);
        panel_1.add(chckbxCarne);

        JCheckBox chckbxJamon = new JCheckBox("Jamon");
        chckbxJamon.setBounds(21, 156, 97, 23);
        panel_1.add(chckbxJamon);

        JCheckBox chckbxBacon = new JCheckBox("Bacon");
        chckbxBacon.setBounds(235, 22, 97, 23);
        panel_1.add(chckbxBacon);

        JCheckBox chckbxPimiento = new JCheckBox("Pimiento");
        chckbxPimiento.setBounds(235, 65, 97, 23);
        panel_1.add(chckbxPimiento);

        JCheckBox chckbxPollo = new JCheckBox("Pollo");
        chckbxPollo.setBounds(235, 112, 97, 23);
        panel_1.add(chckbxPollo);

        JButton btnNewButton = new JButton("Pedir");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pedido correcto. Por favor, revise los pedidos. ");
            }
        });
        btnNewButton.setBounds(147, 199, 89, 23);
        panel_1.add(btnNewButton);
    }
}