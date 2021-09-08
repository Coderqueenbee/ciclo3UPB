package JFrameCalculadora;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelCalculos extends JPanel implements ActionListener {

    // constantes para gestionar el evento de los botones

    //evento. A los eventos de los botones se les
    //asocia un nombre por medio del cual se van a poder identificar más
    //adelante. El nombre es una cadena de caracteres y es muy conveniente
    //definir dicha cadena como una constante. Para el caso de estudio, los
    //nombres de los eventos se asocian de la siguiente manera con  botones:
    private final static String SUMAR= "SUMAR";
    private final static String RESTAR= "RESTAR";
    private final static String MULTIPLICAR= "MULTIPLICAR";
    private final static String DIVIDIR= "DIVIDIR";
    private final static String LIMPIAR= "LIMPIAR";
    private final static String SALIR= "SALIR";


    private JTextField txtSumar;
    private JButton btnSumar;
    private JTextField txtRestar;
    private JButton btnRestar;
    private JTextField txtMultiplicar;
    private JButton btnMultiplicar;
    private JTextField txtDividir;

    private JButton btnDivision;
    private JButton btnLimpiar;
    private JButton btnSalir;

    //Clase del aplicativo
    private Calculadora calculadora;

    public PanelCalculos() {

        setLayout (new BorderLayout()); // LAYOUT POR DEFECTO
        //TITULO DEL BORDER
        setBorder(new CompoundBorder(new EmptyBorder(0,0,5,0),
                new TitledBorder("Calculos")));

        //DEFINIR CARACTERISTICAS DE LOS COMPONENTES

        btnSumar = new JButton();
        btnSumar.setText("SUMAR");
        btnSumar.setActionCommand(SUMAR); // CON SUMAR SE ACTIVA ESTE BOTON
        btnSumar.addActionListener(this);

        btnRestar = new JButton();
        btnRestar.setText("RESTAR");
        btnSumar.setActionCommand(RESTAR); // CON RESTAR SE ACTIVA ESTE BOTON
        btnSumar.addActionListener(this);


        btnMultiplicar = new JButton();
        btnMultiplicar.setText("MULTIPLICAR");
        btnSumar.setActionCommand(MULTIPLICAR); // CON MULTIPLICAR SE ACTIVA ESTE BOTON


        btnDivision = new JButton();
        btnDivision.setText("DIVIDIR");
        btnSumar.setActionCommand(DIVIDIR); // CON DIVIDIR SE ACTIVA ESTE BOTON


        btnLimpiar = new JButton();
        btnLimpiar.setText("LIMPIAR");
        btnSumar.setActionCommand(LIMPIAR); // CON LIMPIAR SE ACTIVA ESTE BOTON


        btnSalir = new JButton();
        btnSalir.setText("SALIR");
        btnSumar.setActionCommand(SALIR); // CON SALIR SE ACTIVA ESTE BOTON


        txtSumar = new JTextField(10);
        txtSumar.setHorizontalAlignment(SwingConstants.RIGHT);
        // NO DEBE SER EDITABLE PORQUE AHI SE PONEN RESULTADOS QUE NO DEBEN
        //SER CAMBIADOS
        txtSumar.setEditable(false);
        txtSumar.setForeground(Color.BLUE);

        txtRestar = new JTextField(10);
        txtRestar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRestar.setEditable(false);
        txtRestar.setForeground(Color.BLUE);

        txtMultiplicar = new JTextField(10);
        txtMultiplicar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMultiplicar.setEditable(false);
        txtMultiplicar.setForeground(Color.BLUE);

        txtDividir = new JTextField(10);
        txtDividir.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDividir.setEditable(false);
        txtDividir.setForeground(Color.BLUE);


        //se hace JPanel con un gridlayout de 3 x4 filas xcolumnas
        JPanel panelCalculos= new JPanel(new GridLayout(3,4));
        //la primera fila se llena con los 4 botones
        //segunda fila casillas de texto con resultados
        //tercera fila los botones de limpiar y salir como no hay 4 para llenar
        //se dimensiona uno con mas o menos el tamaño de un boton vacio y luego pongo
        //los otros botones

        JLabel espacioVacio1= new JLabel("");
        espacioVacio1.setPreferredSize(new Dimension(10,0));

        add(panelCalculos, BorderLayout.CENTER);

        // se va llenando de izquierda a derecha y de arriba y a abajo
        //la primera fila se llena con los 4 botones
        panelCalculos.add(btnSumar);
        panelCalculos.add(btnRestar);
        panelCalculos.add(btnMultiplicar);
        panelCalculos.add(btnDivision);

        //segunda fila casillas de texto con resultados

        panelCalculos.add(txtSumar);
        panelCalculos.add(txtRestar);
        panelCalculos.add(txtMultiplicar);
        panelCalculos.add(txtDividir);

        //tercera fila los botones de limpiar y salir como no hay 4 para llenar
        //se dimensiona uno con mas o menos el tamaño de un boton vacio y luego pongo
        //los otros botones
        panelCalculos.add(espacioVacio1);
        panelCalculos.add(btnLimpiar);
        panelCalculos.add(btnSalir);


   }

    @Override
    public void actionPerformed(ActionEvent pEvento) {

        // VARIABLE STRING QUE RECIBE EL EVENTO
        String command = pEvento.getActionCommand();
        if (command.equals(SUMAR)){

        }
        if (command.equals(RESTAR)){

        }
        if (command.equals(DIVIDIR)){

        }
        if (command.equals(MULTIPLICAR)){

        }
        if (command.equals(LIMPIAR)){

        }
        if (command.equals(SALIR)){

        }


        // Y CON GET ACTION COMMAND TRAE LA VARIABLE
    }
}





