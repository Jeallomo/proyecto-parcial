package JuegoAjedrez;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz {
	//Arreglos
	
	protected JButton[][] fichasNegras = new JButton[8][8];
	protected JButton[][] fichasBlancas = new JButton[8][8];
	protected JButton[][] botonesCasillas= new JButton[8][8];
	
	//Componentes Graficos
	
	private JFrame ventana;
	private JPanel tablero;
	private JPanel titulo;
	private JPanel infoPartida;
	
	//Fichas
	
	protected JButton[] torresNegras = new JButton[2];
	protected JButton[] alfilesNegros = new JButton[2];
	protected JButton[] caballosNegros = new JButton[2];
	protected JButton[] peonesNegros = new JButton[8];
	protected JButton reyNegro;
	protected JButton reinaNegra;
	
	protected JButton[] torresBlancas = new JButton[2];
	protected JButton[] alfilesBlancos = new JButton[2];
	protected JButton[] caballosBlancos = new JButton[2];
	protected JButton[] peonesBlancos = new JButton[8];
	protected JButton reyBlanco;
	protected JButton reinaBlanca;
	
	//Variables
	
	int ladoCasilla = 60;
	int ladoFicha = 40;
	
	
	Interfaz(){
		int i,j;
		
		ventana = new JFrame();
		ventana.setTitle("Ajedrez");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tablero = new JPanel();
		tablero.setPreferredSize(new Dimension(470,470));
		tablero.setLayout(null);
		
		titulo = new JPanel();
		titulo.setPreferredSize(new Dimension(770,100));
		titulo.setLayout(null);
		
		infoPartida = new JPanel();
		infoPartida.setPreferredSize(new Dimension(300,470));
		infoPartida.setLayout(null);
		
		iniciarFichas();
		
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				botonesCasillas[i][j] = new JButton();
				botonesCasillas[i][j].setBounds(j*ladoCasilla,i*ladoCasilla, ladoCasilla, ladoCasilla);
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
		
		ventana.getContentPane().add(tablero,BorderLayout.CENTER);
		ventana.getContentPane().add(titulo,BorderLayout.NORTH);
		ventana.getContentPane().add(infoPartida,BorderLayout.EAST);
		ventana.pack();
		ventana.setResizable(false);
	}
	
	public void mostrar() {
		ventana.setVisible(true);
	}
	
	public void iniciarFichas() {
		
		//torres
		
		torresBlancas[0] = new JButton();
		torresBlancas[0].setBounds(10,10,ladoFicha,ladoFicha);
		torresBlancas[0].setContentAreaFilled(false);
		torresBlancas[0].setIcon(new ImageIcon(getClass().getResource("/img/torreB.png")));
		torresBlancas[0].addActionListener(new Controlador(this));
		fichasBlancas[0][0] = torresBlancas[0];
		tablero.add(torresBlancas[0]);
		
		torresBlancas[1] = new JButton();
		torresBlancas[1].setBounds(10+7*ladoCasilla,10,ladoFicha,ladoFicha);
		torresBlancas[1].setContentAreaFilled(false);
		torresBlancas[1].setIcon(new ImageIcon(getClass().getResource("/img/torreB.png")));
		fichasBlancas[0][7] = torresBlancas[1];
		tablero.add(torresBlancas[1]);
		
		torresNegras[0] = new JButton();
		torresNegras[0].setBounds(10,10+7*ladoCasilla,ladoFicha,ladoFicha);
		torresNegras[0].setContentAreaFilled(false);
		torresNegras[0].setIcon(new ImageIcon(getClass().getResource("/img/torreN.png")));
		fichasNegras[7][0] = torresNegras[0];
		tablero.add(torresNegras[0]);
		
		torresNegras[1] = new JButton();
		torresNegras[1].setBounds(10+7*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		torresNegras[1].setContentAreaFilled(false);
		torresNegras[1].setIcon(new ImageIcon(getClass().getResource("/img/torreN.png")));
		fichasNegras[7][7] = torresNegras[1];
		tablero.add(torresNegras[1]);
		
		//caballos
		
		caballosBlancos[0] = new JButton();
		caballosBlancos[0].setBounds(ladoCasilla+10,10,ladoFicha,ladoFicha);
		caballosBlancos[0].setContentAreaFilled(false);
		caballosBlancos[0].setIcon(new ImageIcon(getClass().getResource("/img/caballoB.png")));
		fichasBlancas[0][1] = caballosBlancos[0];
		tablero.add(caballosBlancos[0]);
		
		caballosBlancos[1] = new JButton();
		caballosBlancos[1].setBounds(10+6*ladoCasilla,10,ladoFicha,ladoFicha);
		caballosBlancos[1].setContentAreaFilled(false);
		caballosBlancos[1].setIcon(new ImageIcon(getClass().getResource("/img/caballoB.png")));
		fichasBlancas[0][6] = caballosBlancos[1];
		tablero.add(caballosBlancos[1]);
		
		caballosNegros[0] = new JButton();
		caballosNegros[0].setBounds(ladoCasilla+10,10+7*ladoCasilla,ladoFicha,ladoFicha);
		caballosNegros[0].setContentAreaFilled(false);
		caballosNegros[0].setIcon(new ImageIcon(getClass().getResource("/img/caballoN.png")));
		fichasNegras[7][1] = caballosNegros[0];                                                                                                                                                
		tablero.add(caballosNegros[0]);
		
		caballosNegros[1] = new JButton();
		caballosNegros[1].setBounds(10+6*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		caballosNegros[1].setContentAreaFilled(false);
		caballosNegros[1].setIcon(new ImageIcon(getClass().getResource("/img/caballoN.png")));
		fichasNegras[7][6] = caballosNegros[1];
		tablero.add(caballosNegros[1]);
		
		//alfiles
		
		alfilesBlancos[0] = new JButton();
		alfilesBlancos[0].setBounds(2*ladoCasilla+10,10,ladoFicha,ladoFicha);
		alfilesBlancos[0].setContentAreaFilled(false);
		alfilesBlancos[0].setIcon(new ImageIcon(getClass().getResource("/img/alfilB.png")));
		fichasBlancas[0][2] = alfilesBlancos[0];
		tablero.add(alfilesBlancos[0]);
		
		alfilesBlancos[1] = new JButton();
		alfilesBlancos[1].setBounds(10+5*ladoCasilla,10,ladoFicha,ladoFicha);
		alfilesBlancos[1].setContentAreaFilled(false);
		alfilesBlancos[1].setIcon(new ImageIcon(getClass().getResource("/img/alfilB.png")));
		fichasBlancas[0][5] = alfilesBlancos[1];
		tablero.add(alfilesBlancos[1]);
		
		alfilesNegros[0] = new JButton();
		alfilesNegros[0].setBounds(2*ladoCasilla+10,10+7*ladoCasilla,ladoFicha,ladoFicha);
		alfilesNegros[0].setContentAreaFilled(false);
		alfilesNegros[0].setIcon(new ImageIcon(getClass().getResource("/img/alfilN.png")));
		fichasNegras[7][2] = alfilesNegros[0];
		tablero.add(alfilesNegros[0]);
		
		alfilesNegros[1] = new JButton();
		alfilesNegros[1].setBounds(10+5*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		alfilesNegros[1].setContentAreaFilled(false);
		alfilesNegros[1].setIcon(new ImageIcon(getClass().getResource("/img/alfilN.png")));
		fichasNegras[7][5] = alfilesNegros[1];
		tablero.add(alfilesNegros[1]);
		
		//peones
		
		for(int i = 0;i < 8;i++) {
			
			peonesBlancos[i] = new JButton();
			peonesBlancos[i].setBounds(10+i*ladoCasilla,10+ladoCasilla,ladoFicha,ladoFicha);
			peonesBlancos[i].setContentAreaFilled(false);
			peonesBlancos[i].setIcon(new ImageIcon(getClass().getResource("/img/peonB.png")));
			fichasBlancas[1][i] = peonesBlancos[i];
			tablero.add(peonesBlancos[i]);
			
			peonesNegros[i] = new JButton();
			peonesNegros[i].setBounds(10+i*ladoCasilla,10+6*ladoCasilla,ladoFicha,ladoFicha);
			peonesNegros[i].setContentAreaFilled(false);
			peonesNegros[i].setIcon(new ImageIcon(getClass().getResource("/img/peonN.png")));
			fichasNegras[1][i] = peonesNegros[i];
			tablero.add(peonesNegros[i]);
		}
		
		//reyes y reinas
		
		reyBlanco = new JButton();
		reyBlanco.setBounds(10+4*ladoCasilla,10,ladoFicha,ladoFicha);
		reyBlanco.setContentAreaFilled(false);
		reyBlanco.setIcon(new ImageIcon(getClass().getResource("/img/reyB.png")));
		fichasBlancas[0][4] = reyBlanco;
		tablero.add(reyBlanco);
		
		reyNegro = new JButton();
		reyNegro.setBounds(10+4*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		reyNegro.setContentAreaFilled(false);
		reyNegro.setIcon(new ImageIcon(getClass().getResource("/img/reyN.png")));
		fichasNegras[7][4] = reyNegro;
		tablero.add(reyNegro);
		
        reinaBlanca = new JButton();
        reinaBlanca.setBounds(10+3*ladoCasilla,10,ladoFicha,ladoFicha);
        reinaBlanca.setContentAreaFilled(false);
		reinaBlanca.setIcon(new ImageIcon(getClass().getResource("/img/reinaB.png")));
		fichasBlancas[0][3] = reinaBlanca;
		tablero.add(reinaBlanca);
		
		reinaNegra = new JButton();
		reinaNegra.setBounds(10+3*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		reinaNegra.setContentAreaFilled(false);
		reinaNegra.setIcon(new ImageIcon(getClass().getResource("/img/reinaN.png")));
		fichasNegras[7][3] = reinaNegra;
		tablero.add(reinaNegra);
	}
}
