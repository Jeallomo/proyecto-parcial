package JuegoAjedrez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener  {

	private Interfaz interfaz;

    public Controlador(Interfaz interfaceGrafica) {
        this.interfaz = interfaceGrafica;
    }

	@Override
	public void actionPerformed(ActionEvent click) {
		
		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
		       if(click.getSource() == interfaz.botonesCasillas[i][j]) {
		    	   JOptionPane.showMessageDialog(null, String.valueOf(i)+String.valueOf(j));
		       }
			}
		}
	}
	
}
