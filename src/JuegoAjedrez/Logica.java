package JuegoAjedrez;

import javax.swing.JButton;

public class Logica {


	Interfaz interfaz = new Interfaz(); //ESTO ESTA MAAAAAL
	
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
