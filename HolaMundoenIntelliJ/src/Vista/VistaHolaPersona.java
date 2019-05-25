package Vista;

import javax.swing.*;

import Presentador.IHolaPersona;
import Presentador.PresentadorHolaPersona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaHolaPersona extends  JFrame implements IHolaPersona {
    private JPanel panel1;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDni;
    private JButton agregarButton;
    private PresentadorHolaPersona presentador;
    public VistaHolaPersona(){
        super("Ejemplo de Ventana con Swing");
        presentador = new PresentadorHolaPersona(this);
        setContentPane(panel1);
        setSize(300,300);
        setVisible(true);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                presentador.agregarPersona(txtNombre.getText(),txtApellido.getText(),Integer.parseInt(txtDni.getText()));
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void saludarPersona(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje);
    }

}
