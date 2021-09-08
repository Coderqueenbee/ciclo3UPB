package JFrameCalculadora;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class PanelDatos extends JPanel {

    private JLabel lblnumero1;
    private JLabel lblnumero2;
    private JTextField txtNumero1;
    private JTextField txtNumero2;

    public PanelDatos() {

        //DEBO INCLUIR LA  DISTRIBUCION DE LOS ELEMENTOS DEL PANEL
        //DENTRO DEL CONSTRUCTOR
        setLayout(new BorderLayout()); // LAYOUT POR DEFECTO
        //TITULO DEL BORDER
        setBorder(new CompoundBorder(new EmptyBorder(0,0,5,0),
                new TitledBorder("Datos")));


        //Etiquetas de datos
        //ASIGNAR VALORES A LOS ATRIBUTOS
        lblnumero1=new JLabel("Numero 1: ");// INSTANCIAMIENTO DEL LBLNUMERO1 CON NEW
        lblnumero2=new JLabel("Numero 2: ");
        //Campos de texto donde se consignan los datos
        txtNumero1= new JTextField(10); //TAMAÑO DEL ESPACIO DE TEXTO, 10 ESPACIOS
        //Los datos se alienan a la derecha
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        //Texto de ayuda
        txtNumero1.setToolTipText("Escribe el primer numero");
        txtNumero2= new JTextField(10);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setToolTipText("Escribe el segundo numero");

        //DEFINICION DEL PANEL

        JPanel panelDatos = new JPanel();
        //A continuacion se dice como se va a distribuir el JPanel
        //Hago el gridLayout de 2 filas por 2 columnas para distribuir el JPanel
        // y alli se ponen los 4 campos los dos label de los textos y las dos
        //casillas de texto del numero 1 y 2
        GridLayout gl = new GridLayout(2,2);
        //Le voy a decir que al panelDatos va  a usar ese GridLayout
        panelDatos.setLayout(gl);
        //le agrego al panel del datos los componentes que ya se definieron en orden
        panelDatos.add(lblnumero1);
        panelDatos.add(txtNumero1);
        panelDatos.add(lblnumero2);
        panelDatos.add(txtNumero2);

        // espacios en blanco de la seccion de datos para que la informacion
        //no me quede distanciada -> es por estetica
        JLabel espacioVacio1 = new JLabel("");
        JLabel espacioVacio2 = new JLabel("");
        espacioVacio1.setPreferredSize(new Dimension(120,0));
        espacioVacio2.setPreferredSize(new Dimension(120,0));

        //UBICACION DE LOS CONTROLES EN EL BORDE

        add(espacioVacio1, BorderLayout.EAST);
        add(panelDatos, BorderLayout.CENTER);
        add(espacioVacio1, BorderLayout.WEST);

    }



}
