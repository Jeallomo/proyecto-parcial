package JuegoAjedrez;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz {
	//Arreglos
	protected char[][] fichasNegras = new char[8][8];
	protected char[][] fichasBlancas = new char[8][8];
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
				botonesCasillas[i][j].setBounds(j*60, i*60, 60, 60);
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
	
	public void inicializarTablero() {
		int i;
		int j;
		
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				this.fichasBlancas[i][j] = ' ';
				this.fichasNegras[i][j] = ' ';
			}
		}
		
		this.fichasNegras[0][0] = 'T';
		this.fichasNegras[0][1] = 'C';
		this.fichasNegras[0][2] = 'A';
		this.fichasNegras[0][3] = 'Q';
		this.fichasNegras[0][4] = 'K';
		this.fichasNegras[0][5] = 'A';
		this.fichasNegras[0][6] = 'C';
		this.fichasNegras[0][7] = 'T';
		
		for(i=0;i<8;i++) {
			this.fichasNegras[1][i] = 'P';
		}
		
		this.fichasBlancas[7][0] = 'T';
		this.fichasBlancas[7][1] = 'C';
		this.fichasBlancas[7][2] = 'A';
		this.fichasBlancas[7][3] = 'Q';
		this.fichasBlancas[7][4] = 'K';
		this.fichasBlancas[7][5] = 'A';
		this.fichasBlancas[7][6] = 'C';
		this.fichasBlancas[7][7] = 'T';

		for(i=0;i<8;i++) {
			this.fichasBlancas[6][i] = 'P';
		}
		
		actualizarFichas();
	}
	
	public void actualizarFichas() {
		int i;
		int j;
		
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				if(this.fichasBlancas[i][j] != ' ') {
					this.botonesCasillas[i][j].setText(String.valueOf(this.fichasBlancas[i][j]));
				} else if(this.fichasNegras[i][j] != ' ') {
					this.botonesCasillas[i][j].setText(String.valueOf(this.fichasNegras[i][j]));
				}
			}
		}
	}
}
