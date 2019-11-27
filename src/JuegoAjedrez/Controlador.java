package JuegoAjedrez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener  {

	private Interfaz interfaz;

    public Controlador(Interfaz interfaceGrafica) {
        this.interfaz = interfaceGrafica;
    }

	@Override
	public void actionPerformed(ActionEvent click) {
		if(click.getSource() == interfaz.botonesCasillas[0][0]) {
			interfaz.botonesCasillas[0][0].setVisible(false);
		}
	}
	
}
