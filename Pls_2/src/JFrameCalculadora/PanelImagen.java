package JFrameCalculadora;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;



public class PanelImagen extends JPanel {


    //constructor vacio
    public PanelImagen()  {

        JLabel imagen= new JLabel();
        //Para insertar imagen se hará a traves de un icono, pero a la vez entre el icono hacemos el label
        ImageIcon icono= new ImageIcon("C:\\Users\\fredy\\IdeaProjects\\Pls_2\\src\\JFrameCalculadora\\Data\\LogoAzul.png");

        imagen = new JLabel("");
        imagen.setIcon(icono);
        add(imagen);

    }
}
