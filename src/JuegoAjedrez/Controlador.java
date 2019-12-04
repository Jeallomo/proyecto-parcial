package JuegoAjedrez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener  {

	private Interfaz interfaz;
	private Validacion validacion;

    public Controlador(Interfaz interfaceGrafica) {
        this.interfaz = interfaceGrafica;
    }
    
    public Controlador(Interfaz interfaz,JButton boton, int tipoFicha) {
        this.validacion = new Validacion(boton, tipoFicha);
        this.interfaz = interfaz;
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
		
		 if(click.getSource() == validacion.getBoton()) {
	    	   JOptionPane.showMessageDialog(null, validacion.getTipoFicha());
	     }
		
	}
	
	
	
}
