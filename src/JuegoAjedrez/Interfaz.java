package JuegoAjedrez;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz {
	//Arreglos
	protected JButton[][] botonesCasillas= new JButton[8][8];
	
	//Componentes Graficos
	private JFrame ventana;
	private JPanel tablero;
	
	Interfaz(){
		int i,j;
		
		ventana = new JFrame();
		ventana.setTitle("Ajedrez");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tablero = new JPanel();
		tablero.setPreferredSize(new Dimension(470,470));
		tablero.setLayout(null);
		
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				botonesCasillas[i][j] = new JButton();
				botonesCasillas[i][j].setBounds(i*60, j*60, 60, 60);
				botonesCasillas[i][j].setEnabled(false);
				botonesCasillas[i][j].addActionListener(new Controlador(this));
				
				if((i+j)%2 == 0) {
					botonesCasillas[i][j].setBackground(new Color(255,255,255));
				} else {
					botonesCasillas[i][j].setBackground(new Color(0,0,0));
				}
				
				tablero.add(botonesCasillas[i][j]);	
			}
		}
		
		ventana.getContentPane().add(tablero);
		ventana.pack();
		ventana.setResizable(false);
	}
	
	public void mostrar() {
		ventana.setVisible(true);
	}	
}
