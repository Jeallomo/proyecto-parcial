package Modelo;

import javax.swing.JFrame;

public class Interfaz {
	private JFrame ventana;
	
	Interfaz(){
		ventana = new JFrame();
		ventana.setBounds(15, 15, 600, 600);
		ventana.setTitle("Ajedrez");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
	}
	
	public void mostrar() {
		ventana.setVisible(true);
	}	
}
