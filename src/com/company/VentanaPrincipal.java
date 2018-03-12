package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JLabel campo;
    private JTextField texto;
    private JButton boton;
    private Visor v1;
    private String textoVisor;

    public VentanaPrincipal() {
        super("Ventana Principal");
        setLayout(null);

        setSize(350, 350);
        campo = new JLabel("Entrada");
        texto = new JTextField(50);
        boton = new JButton("Aceptar");

        campo.setBounds(60, 100, 80, 25);
        texto.setBounds(150, 100, 100, 25);
        boton.setBounds(125, 150, 90, 30);

        add(campo);
        add(texto);
        add(boton);

        v1 = new Visor(this);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoVisor = texto.getText().toString();
                v1.cambiarTexto(textoVisor);
                v1.setVisible(true);
                setVisible(false);
            }
        });
    }
}
