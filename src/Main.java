import javax.swing.*;
import java.awt.*;

//PROYECTO ALUMNO: CASTILLO URIEL
// Programación IV
// UNLaR - Sede Chamical

void main() {

    JFrame ventana = new JFrame("Programa en VS Code");
    ventana.setSize(350, 150);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);

    JPanel panel = new JPanel();

    JLabel etiqueta = new JLabel("Tu nombre:");
    JTextField cajaTexto = new JTextField(15);

    JLabel labelMensaje = new JLabel("Deja tu mensaje");
    JTextField cajaMensaje= new JTextField(15);

    JTextArea areaMensajes = new JTextArea();

    JButton boton = new JButton("Saludar");
    JButton botonAgregarMensaje= new JButton("Agrega un mensaje");


    boton.addActionListener(e -> {
        String texto = cajaTexto.getText();
        JOptionPane.showMessageDialog(ventana, "¡Hola, " + texto + "!");
    });

    botonAgregarMensaje.addActionListener(e->{
        String mensaje=cajaMensaje.getText();
        areaMensajes.append(
                "Mensaje: " + mensaje + "\n"
        );
    });

    panel.add(etiqueta);
    panel.add(cajaTexto);
    panel.add(boton);
    panel.add(labelMensaje);
    panel.add(cajaMensaje);
    panel.add(areaMensajes);
    panel.add(botonAgregarMensaje);


    ventana.add(panel);
    ventana.setVisible(true);



}
