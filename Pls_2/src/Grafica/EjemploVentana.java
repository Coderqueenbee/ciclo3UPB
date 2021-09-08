package Grafica;



        import java.awt.BorderLayout;
        import java.awt.Container;
        import java.awt.FlowLayout;
        import java.awt.GridLayout;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JPanel;
        import javax.swing.JTextField;

/**
 *
 * @author Carlos Beltrán
 */
public class EjemploVentana extends JFrame{

    public EjemploVentana() {
        super("Nueva Ventana");
        setSize(400,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Construimos el Panel de Fecha
       JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        // Panel de Datos
        JPanel panelDatos = new JPanel();
      GridLayout gl = new GridLayout(3,2,5,5);
        panelDatos.setLayout(gl);
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("DNI:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha de Nacimiento:"));
        panelDatos.add(panelFecha);

       // Panel de Botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Cancelar"));

        Container cp = getContentPane();
        cp.add(panelDatos,BorderLayout.CENTER);
        cp.add(panelBotones,BorderLayout.SOUTH);
     /*   GridLayout gl = new GridLayout(4,3);
       gl.setHgap(5);
        gl.setVgap(5);
        cp.setLayout(gl);
        for (int i = 1;i <= 9;i++){
            cp.add(new JButton(String.valueOf(i)));
        }
        cp.add(new JButton("*"));
        cp.add(new JButton("0"));
       cp.add(new JButton("#"));
        cp.setLayout(new FlowLayout());
        // Definir los atributos
        JLabel etiqueta = new JLabel("Nombre");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        cp.add(etiqueta);
       cp.add(texto);
       cp.add(boton);*/

    }



    public static void main(String[] args) {
        EjemploVentana v = new EjemploVentana();
        v.setVisible(true);
    }

}
