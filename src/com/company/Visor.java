package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Visor extends JDialog {
    private VentanaPrincipal v1;
    private JPanel panel;
    private JLabel textoMostrado;

    public Visor(VentanaPrincipal ventana) {
        setTitle("Visor");
        setSize(400, 400);
        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.BLACK);
        add(panel);
        v1 = ventana;
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.setVisible(true);
            }
        });
    }

    public void cambiarTexto(String texto) {
        /*textoMostrado = new JLabel(convertidorHTML(texto));*/
        textoMostrado = new JLabel(texto);
        textoMostrado.setForeground(Color.WHITE);
        textoMostrado.setFont(new Font("Candara", Font.BOLD, 50));
        panel.add(textoMostrado, BorderLayout.CENTER);
    }

    /*private String convertidorHTML(String texto) {
        if (texto.length() < 8) {
            return "<html>" + texto + "</html>";
        } else {
            String texto1 = texto.substring(0, 8);
            String texto2 = texto.substring(8);
            String resultadoEnHTML = "<html>" + texto1 + "<br>" + texto2 + "</html>";
            return resultadoEnHTML;
        }
    }*/
}
