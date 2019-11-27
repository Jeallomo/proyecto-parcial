package JuegoAjedrez;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz {
	//Arreglos
	
	//protected char[][] fichasNegras = new char[8][8];
	//protected char[][] fichasBlancas = new char[8][8];
	protected JButton[][] botonesCasillas= new JButton[8][8];
	
	//Componentes Graficos
	
	private JFrame ventana;
	private JPanel tablero;
	
	//Fichas
	
	private JButton[] torresNegras = new JButton[2];
	private JButton[] alfilesNegros = new JButton[2];
	private JButton[] caballosNegros = new JButton[2];
	private JButton[] peonesNegros = new JButton[8];
	private JButton reyNegro;
	private JButton reinaNegra;
	
	private JButton[] torresBlancas = new JButton[2];
	private JButton[] alfilesBlancos = new JButton[2];
	private JButton[] caballosBlancos = new JButton[2];
	private JButton[] peonesBlancos = new JButton[8];
	private JButton reyBlanco;
	private JButton reinaBlanca;
	
	//Variables
	
	int ladoCasilla = 60;
	int ladoFicha = 40;
	
	
	Interfaz(){
		int i,j;
		
		ventana = new JFrame();
		ventana.setTitle("Ajedrez");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tablero = new JPanel();
		tablero.setPreferredSize(new Dimension(700,600));
		tablero.setLayout(null);
		
		iniciarFichas();
		
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				botonesCasillas[i][j] = new JButton();
				botonesCasillas[i][j].setBounds(30+j*ladoCasilla,100+i*ladoCasilla, ladoCasilla, ladoCasilla);
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
	
	public void iniciarFichas() {
		
		//torres
		
		torresBlancas[0] = new JButton();
		torresBlancas[0].setBounds(40,110,ladoFicha,ladoFicha);
		torresBlancas[0].setContentAreaFilled(false);
		torresBlancas[0].setIcon(new ImageIcon(getClass().getResource("/img/torreB.png")));
		tablero.add(torresBlancas[0]);
		
		torresBlancas[1] = new JButton();
		torresBlancas[1].setBounds(40+7*ladoCasilla,110,ladoFicha,ladoFicha);
		torresBlancas[1].setContentAreaFilled(false);
		torresBlancas[1].setIcon(new ImageIcon(getClass().getResource("/img/torreB.png")));
		tablero.add(torresBlancas[1]);
		
		torresNegras[0] = new JButton();
		torresNegras[0].setBounds(40,110+7*ladoCasilla,ladoFicha,ladoFicha);
		torresNegras[0].setContentAreaFilled(false);
		torresNegras[0].setIcon(new ImageIcon(getClass().getResource("/img/torreN.png")));
		tablero.add(torresNegras[0]);
		
		torresNegras[1] = new JButton();
		torresNegras[1].setBounds(40+7*ladoCasilla,110+7*ladoCasilla,ladoFicha,ladoFicha);
		torresNegras[1].setContentAreaFilled(false);
		torresNegras[1].setIcon(new ImageIcon(getClass().getResource("/img/torreN.png")));
		tablero.add(torresNegras[1]);
		
		//caballos
		
		caballosBlancos[0] = new JButton();
		caballosBlancos[0].setBounds(ladoCasilla+40,110,ladoFicha,ladoFicha);
		caballosBlancos[0].setContentAreaFilled(false);
		caballosBlancos[0].setIcon(new ImageIcon(getClass().getResource("/img/caballoB.png")));
		tablero.add(caballosBlancos[0]);
		
		caballosBlancos[1] = new JButton();
		caballosBlancos[1].setBounds(40+6*ladoCasilla,110,ladoFicha,ladoFicha);
		caballosBlancos[1].setContentAreaFilled(false);
		caballosBlancos[1].setIcon(new ImageIcon(getClass().getResource("/img/caballoB.png")));
		tablero.add(caballosBlancos[1]);
		
		caballosNegros[0] = new JButton();
		caballosNegros[0].setBounds(ladoCasilla+40,110+7*ladoCasilla,ladoFicha,ladoFicha);
		caballosNegros[0].setContentAreaFilled(false);
		caballosNegros[0].setIcon(new ImageIcon(getClass().getResource("/img/caballoN.png")));
		tablero.add(caballosNegros[0]);
		
		caballosNegros[1] = new JButton();
		caballosNegros[1].setBounds(40+6*ladoCasilla,110+7*ladoCasilla,ladoFicha,ladoFicha);
		caballosNegros[1].setContentAreaFilled(false);
		caballosNegros[1].setIcon(new ImageIcon(getClass().getResource("/img/caballoN.png")));
		tablero.add(caballosNegros[1]);
		
		//alfiles
		
		alfilesBlancos[0] = new JButton();
		alfilesBlancos[0].setBounds(2*ladoCasilla+40,110,ladoFicha,ladoFicha);
		alfilesBlancos[0].setContentAreaFilled(false);
		alfilesBlancos[0].setIcon(new ImageIcon(getClass().getResource("/img/alfilB.png")));
		tablero.add(alfilesBlancos[0]);
		
		alfilesBlancos[1] = new JButton();
		alfilesBlancos[1].setBounds(40+5*ladoCasilla,110,ladoFicha,ladoFicha);
		alfilesBlancos[1].setContentAreaFilled(false);
		alfilesBlancos[1].setIcon(new ImageIcon(getClass().getResource("/img/alfilB.png")));
		tablero.add(alfilesBlancos[1]);
		
		alfilesNegros[0] = new JButton();
		alfilesNegros[0].setBounds(2*ladoCasilla+40,110+7*ladoCasilla,ladoFicha,ladoFicha);
		alfilesNegros[0].setContentAreaFilled(false);
		alfilesNegros[0].setIcon(new ImageIcon(getClass().getResource("/img/alfilN.png")));
		tablero.add(alfilesNegros[0]);
		
		alfilesNegros[1] = new JButton();
		alfilesNegros[1].setBounds(40+5*ladoCasilla,110+7*ladoCasilla,ladoFicha,ladoFicha);
		alfilesNegros[1].setContentAreaFilled(false);
		alfilesNegros[1].setIcon(new ImageIcon(getClass().getResource("/img/alfilN.png")));
		tablero.add(alfilesNegros[1]);
		
		//peones
		
		for(int i = 0;i < 8;i++) {
			
			peonesBlancos[i] = new JButton();
			peonesBlancos[i].setBounds(40+i*ladoCasilla,110+ladoCasilla,ladoFicha,ladoFicha);
			peonesBlancos[i].setContentAreaFilled(false);
			peonesBlancos[i].setIcon(new ImageIcon(getClass().getResource("/img/peonB.png")));
			tablero.add(peonesBlancos[i]);
			
			peonesNegros[i] = new JButton();
			peonesNegros[i].setBounds(40+i*ladoCasilla,110+6*ladoCasilla,ladoFicha,ladoFicha);
			peonesNegros[i].setContentAreaFilled(false);
			peonesNegros[i].setIcon(new ImageIcon(getClass().getResource("/img/peonN.png")));
			tablero.add(peonesNegros[i]);
		}
		
		//reyes y reinas
		
		reyBlanco = new JButton();
		reyBlanco.setBounds(40+4*ladoCasilla,110,ladoFicha,ladoFicha);
		reyBlanco.setContentAreaFilled(false);
		reyBlanco.setIcon(new ImageIcon(getClass().getResource("/img/reyB.png")));
		tablero.add(reyBlanco);
		
		reyNegro = new JButton();
		reyNegro.setBounds(40+4*ladoCasilla,110+7*ladoCasilla,ladoFicha,ladoFicha);
		reyNegro.setContentAreaFilled(false);
		reyNegro.setIcon(new ImageIcon(getClass().getResource("/img/reyN.png")));
		tablero.add(reyNegro);
		
        reinaBlanca = new JButton();
        reinaBlanca.setBounds(40+3*ladoCasilla,110,ladoFicha,ladoFicha);
        reinaBlanca.setContentAreaFilled(false);
		reinaBlanca.setIcon(new ImageIcon(getClass().getResource("/img/reinaB.png")));
		tablero.add(reinaBlanca);
		
		reinaNegra = new JButton();
		reinaNegra.setBounds(40+3*ladoCasilla,110+7*ladoCasilla,ladoFicha,ladoFicha);
		reinaNegra.setContentAreaFilled(false);
		reinaNegra.setIcon(new ImageIcon(getClass().getResource("/img/reinaN.png")));
		tablero.add(reinaNegra);
		
	}
}
