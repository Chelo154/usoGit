package principal;


import Vista.VistaHolaPersona;

import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        //JOptionPane.showMessageDialog(null,"Hola Mundo :D ");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VistaHolaPersona ventana  = new VistaHolaPersona();
            }
        });

    }
}
