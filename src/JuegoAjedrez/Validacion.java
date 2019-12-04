package JuegoAjedrez;

import javax.swing.JButton;

public class Validacion {
	
	private JButton boton;
	private int tipoFicha;
	
	Validacion(JButton boton, int tipoFicha){
		this.boton = boton;
		this.tipoFicha = tipoFicha;
	}
	
	public JButton getBoton() {
		return this.boton;
	}
	
	public int getTipoFicha() {
		return this.tipoFicha;
	}

}
