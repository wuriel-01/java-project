import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;

//PROYECTO ALUMNO: CASTILLO URIEL

void main() {

    //COMPONENTES
    JFrame ventana = new JFrame("\uD83C\uDF93 GESTIÓN DE CURSOS");

    JPanel panelSuperior= new JPanel();
    JPanel panelInferior= new JPanel();

    JButton botonAgregarCurso= new JButton("agregar curso");

    JButton botonEliminar= new JButton("Eliminar");
    JButton botonBuscar= new JButton("Buscar");
    JButton botonLimpiar= new JButton("Limpiar");

    JLabel labelCursosAgregados= new JLabel("Cursos Agregados");

    JLabel labelNombre= new JLabel("Nombre");
    JTextField ingresarNombre= new JTextField(15);

    JLabel labelLenguaje= new JLabel("Lenguaje");
    JTextField ingresarLenguaje= new JTextField(15);

    JLabel labelDescripcion= new JLabel("Descripcion");
    JTextField ingresarDescripcion= new JTextField(15);

    JTextArea areaCursos = new JTextArea();


    //PANEL SUPERIOR
    panelSuperior.add(labelNombre);
    panelSuperior.add(ingresarNombre);

    panelSuperior.add(labelLenguaje);
    panelSuperior.add(ingresarLenguaje);

    panelSuperior.add(labelDescripcion);
    panelSuperior.add(ingresarDescripcion);

    panelSuperior.add(botonAgregarCurso);
    panelSuperior.setLayout(new GridLayout(4, 2));

    //PANEL INFERIOR
    panelInferior.add(labelCursosAgregados);
    panelInferior.add(areaCursos);
    panelInferior.add(botonEliminar);
    panelInferior.add(botonBuscar);
    panelInferior.add(botonLimpiar);
    panelInferior.setLayout(new FlowLayout());

    //FUNCIONALIDADES
    ArrayList<Curso> cursos = new ArrayList<>();
    botonAgregarCurso.addActionListener(e -> {

        String nombre = ingresarNombre.getText();
        String lenguaje = ingresarLenguaje.getText();
        String descripcion = ingresarDescripcion.getText();

        Curso nuevoCurso = new Curso(
                nombre,
                lenguaje,
                descripcion
        );

        cursos.add(nuevoCurso);

        areaCursos.append(
                "Nombre: " + nuevoCurso.getNombre() + "\n"
        );
    });



    //VENTANA
    ventana.setSize(500, 600);
    ventana.setLayout(new GridLayout(2, 1));

    ventana.add(panelSuperior);
    ventana.add(panelInferior);

    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);


}
