package JFrameCalculadora;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Container;

public class AppCalculadora extends JFrame {



    // AGREGO LOS ATRIBUTOS
private Calculadora calculadora;
private PanelCalculos panelCalculos;
private PanelImagen panelImagen;
private PanelDatos panelDatos;

    public AppCalculadora()  {
// CONSTRUCTOR vacio donde agrego las caracteristicas al JFRAME que acabo de DEFINIR COMO TITULO tamaño, como se va a cerrar el jframe,
        setTitle("Sistema de calculadora");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        calculadora= new Calculadora();

        // construir los paneles
        panelDatos= new PanelDatos();
        panelImagen= new PanelImagen();
        panelCalculos= new PanelCalculos();


        //organizar el panel principal
        //DISTRIBUIR PANELES EN EL CONTENEDEOR PRIMERO LO DEFINO

        Container cp= getContentPane(); // asi se construye
        cp.setLayout(new BorderLayout()); // le agrego el setlayout que sera borderlayout
        //con el contenedor agrego los elementos, y le agrego como distribuir elementos con el borderlayout identifica 5 areas de trabajo este oeste sur norte
        //borderlayout identifica 5 areas de trabajo este oeste sur norte ,le decimos que en la parte superiro agregue la imagen
        // en el centro el panel de datos y en la parte del sur el panel de calculos

        cp.add(panelImagen, BorderLayout.NORTH);
        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(panelCalculos, BorderLayout.SOUTH);

        //se locationRelative to null es para que lo centre en la mitad de la pantalla
        setLocationRelativeTo(null);
        // setRIZABLE false es para que no deje cambiar el tamanño de la ventana
        setResizable(false);

    }


    public static void main(String[] args) {

        try{

            // Unifica la interfaz para Mac y Windows
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            AppCalculadora interfaz= new AppCalculadora();
            interfaz.setVisible(true);
        } catch (Exception e){
            e.printStackTrace();
        }

    }





}
