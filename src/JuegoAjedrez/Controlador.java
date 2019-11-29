package JuegoAjedrez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
		
		//if(click.getSource() == interfaz.torresBlancas[0]) {
	    	  
	    //}
		
	}
	
	public int posicionFichaMatrizX(JButton ficha) {
		
		int posicionX = -1; //Para generar error
		
		for(int i = 0;i < 8;i++) {
			
			if(interfaz.botonesCasillas[i][0].getLocation().getX() - 10 == ficha.getLocation().getX())
				posicionX = i;
			
		}
		
		return posicionX;
		
	}
	
    public int posicionFichaMatrizY(JButton ficha) {
		
		int posicionY = -1; //Para generar error
		
		for(int i = 0;i < 8;i++) {
			
			if(interfaz.botonesCasillas[0][i].getLocation().getX() - 10 == ficha.getLocation().getX())
				posicionY = i;
			
		}
		
		return posicionY;
		
	}
	
}
