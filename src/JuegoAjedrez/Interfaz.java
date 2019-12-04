package JuegoAjedrez;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Interfaz {
	//Arreglos
	
	protected JButton[] fichasNegras = new JButton[16];
	protected JButton[] fichasBlancas = new JButton[16];
	
	
	protected JButton[][] botonesCasillas= new JButton[8][8];
	protected JLabel[] coordenadasNumeros = new JLabel[8];
	protected JLabel[] coordenadasLetras = new JLabel[8];
	
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
		tablero.setPreferredSize(new Dimension(510,510));
		tablero.setLayout(null);
		
		titulo = new JPanel();
		titulo.setPreferredSize(new Dimension(810,100));
		titulo.setLayout(null);
		
		infoPartida = new JPanel();
		infoPartida.setPreferredSize(new Dimension(300,510));
		infoPartida.setLayout(null);
		
		
		// parametros iniciales
		iniciarFichas();
		arreglosFichas();
		
		for(i=0;i<8;i++) {
			
			//Coordenadas laterales
			coordenadasNumeros[i] = new JLabel(String.valueOf(i));
			coordenadasNumeros[i].setBounds(15, ladoCasilla*i + 20, 20, 20);
			coordenadasNumeros[i].setVerticalAlignment(SwingConstants.CENTER);
			coordenadasNumeros[i].setHorizontalAlignment(SwingConstants.CENTER);
			coordenadasNumeros[i].setForeground(Color.RED);
			tablero.add(coordenadasNumeros[i]);
			
			for(j=0;j<8;j++) {
				botonesCasillas[i][j] = new JButton();
				botonesCasillas[i][j].setBounds(40+j*ladoCasilla,i*ladoCasilla, ladoCasilla, ladoCasilla);
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
		
		//Coordenadas inferiores
		for(i=0; i<8; i++) {
			coordenadasLetras[i] = new JLabel(String.valueOf((char)(65+i)));
			coordenadasLetras[i].setBounds(60 + ladoCasilla*i, 5 + ladoCasilla*8, 20, 20);
			coordenadasLetras[i].setVerticalAlignment(SwingConstants.CENTER);
			coordenadasLetras[i].setHorizontalAlignment(SwingConstants.CENTER);
			coordenadasLetras[i].setForeground(Color.RED);
			tablero.add(coordenadasLetras[i]);
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
		torresBlancas[0].setBounds(50,10,ladoFicha,ladoFicha);
		torresBlancas[0].setContentAreaFilled(false);
		torresBlancas[0].setIcon(new ImageIcon(getClass().getResource("/img/torreB.png")));
		tablero.add(torresBlancas[0]);
		
		torresBlancas[1] = new JButton();
		torresBlancas[1].setBounds(50+7*ladoCasilla,10,ladoFicha,ladoFicha);
		torresBlancas[1].setContentAreaFilled(false);
		torresBlancas[1].setIcon(new ImageIcon(getClass().getResource("/img/torreB.png")));
		tablero.add(torresBlancas[1]);
		
		torresNegras[0] = new JButton();
		torresNegras[0].setBounds(50,10+7*ladoCasilla,ladoFicha,ladoFicha);
		torresNegras[0].setContentAreaFilled(false);
		torresNegras[0].setIcon(new ImageIcon(getClass().getResource("/img/torreN.png")));
		tablero.add(torresNegras[0]);
		
		torresNegras[1] = new JButton();
		torresNegras[1].setBounds(50+7*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		torresNegras[1].setContentAreaFilled(false);
		torresNegras[1].setIcon(new ImageIcon(getClass().getResource("/img/torreN.png")));
		tablero.add(torresNegras[1]);
		
		//caballos
		
		caballosBlancos[0] = new JButton();
		caballosBlancos[0].setBounds(ladoCasilla+50,10,ladoFicha,ladoFicha);
		caballosBlancos[0].setContentAreaFilled(false);
		caballosBlancos[0].setIcon(new ImageIcon(getClass().getResource("/img/caballoB.png")));
		tablero.add(caballosBlancos[0]);
		
		caballosBlancos[1] = new JButton();
		caballosBlancos[1].setBounds(50+6*ladoCasilla,10,ladoFicha,ladoFicha);
		caballosBlancos[1].setContentAreaFilled(false);
		caballosBlancos[1].setIcon(new ImageIcon(getClass().getResource("/img/caballoB.png")));
		tablero.add(caballosBlancos[1]);
		
		caballosNegros[0] = new JButton();
		caballosNegros[0].setBounds(ladoCasilla+50,10+7*ladoCasilla,ladoFicha,ladoFicha);
		caballosNegros[0].setContentAreaFilled(false);
		caballosNegros[0].setIcon(new ImageIcon(getClass().getResource("/img/caballoN.png")));                                                                                           
		tablero.add(caballosNegros[0]);
		
		caballosNegros[1] = new JButton();
		caballosNegros[1].setBounds(50+6*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		caballosNegros[1].setContentAreaFilled(false);
		caballosNegros[1].setIcon(new ImageIcon(getClass().getResource("/img/caballoN.png")));
		tablero.add(caballosNegros[1]);
		
		//alfiles
		
		alfilesBlancos[0] = new JButton();
		alfilesBlancos[0].setBounds(2*ladoCasilla+50,10,ladoFicha,ladoFicha);
		alfilesBlancos[0].setContentAreaFilled(false);
		alfilesBlancos[0].setIcon(new ImageIcon(getClass().getResource("/img/alfilB.png")));
		tablero.add(alfilesBlancos[0]);
		
		alfilesBlancos[1] = new JButton();
		alfilesBlancos[1].setBounds(50+5*ladoCasilla,10,ladoFicha,ladoFicha);
		alfilesBlancos[1].setContentAreaFilled(false);
		alfilesBlancos[1].setIcon(new ImageIcon(getClass().getResource("/img/alfilB.png")));
		tablero.add(alfilesBlancos[1]);
		
		alfilesNegros[0] = new JButton();
		alfilesNegros[0].setBounds(2*ladoCasilla+50,10+7*ladoCasilla,ladoFicha,ladoFicha);
		alfilesNegros[0].setContentAreaFilled(false);
		alfilesNegros[0].setIcon(new ImageIcon(getClass().getResource("/img/alfilN.png")));
		tablero.add(alfilesNegros[0]);
		
		alfilesNegros[1] = new JButton();
		alfilesNegros[1].setBounds(50+5*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		alfilesNegros[1].setContentAreaFilled(false);
		alfilesNegros[1].setIcon(new ImageIcon(getClass().getResource("/img/alfilN.png")));
		tablero.add(alfilesNegros[1]);
		
		//peones
		
		for(int i = 0;i < 8;i++) {
			
			peonesBlancos[i] = new JButton();
			peonesBlancos[i].setBounds(50+i*ladoCasilla,10+ladoCasilla,ladoFicha,ladoFicha);
			peonesBlancos[i].setContentAreaFilled(false);
			peonesBlancos[i].setIcon(new ImageIcon(getClass().getResource("/img/peonB.png")));
			tablero.add(peonesBlancos[i]);
			
			peonesNegros[i] = new JButton();
			peonesNegros[i].setBounds(50+i*ladoCasilla,10+6*ladoCasilla,ladoFicha,ladoFicha);
			peonesNegros[i].setContentAreaFilled(false);
			peonesNegros[i].setIcon(new ImageIcon(getClass().getResource("/img/peonN.png")));
			tablero.add(peonesNegros[i]);
		}
		
		//reyes y reinas
		
		reyBlanco = new JButton();
		reyBlanco.setBounds(50+4*ladoCasilla,10,ladoFicha,ladoFicha);
		reyBlanco.setContentAreaFilled(false);
		reyBlanco.setIcon(new ImageIcon(getClass().getResource("/img/reyB.png")));
		tablero.add(reyBlanco);
		
		reyNegro = new JButton();
		reyNegro.setBounds(50+4*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		reyNegro.setContentAreaFilled(false);
		reyNegro.setIcon(new ImageIcon(getClass().getResource("/img/reyN.png")));
		tablero.add(reyNegro);
		
        reinaBlanca = new JButton();
        reinaBlanca.setBounds(50+3*ladoCasilla,10,ladoFicha,ladoFicha);
        reinaBlanca.setContentAreaFilled(false);
		reinaBlanca.setIcon(new ImageIcon(getClass().getResource("/img/reinaB.png")));
		tablero.add(reinaBlanca);
		
		reinaNegra = new JButton();
		reinaNegra.setBounds(50+3*ladoCasilla,10+7*ladoCasilla,ladoFicha,ladoFicha);
		reinaNegra.setContentAreaFilled(false);
		reinaNegra.setIcon(new ImageIcon(getClass().getResource("/img/reinaN.png")));
		tablero.add(reinaNegra);
	}
	
	//ARREGLO DE FICHAS
	
	void arreglosFichas() {
		
		/* Tipos Ficha según número:
		 *  
		 *    1 = Peon
		 *    2 = Torre
		 *    3 = Alfil
		 *    4 = Caballo
		 *    5 = Reina
		 *    6 = Rey
		 * 
		 */
		
		for(int i = 0;i < 8;i++) {
			peonesBlancos[i].addActionListener(new Controlador(this,peonesBlancos[i],1));
			fichasBlancas[i] = peonesBlancos[i];
		}
		
		torresBlancas[0].addActionListener(new Controlador(this,torresBlancas[0],2));
		fichasBlancas[8] = torresBlancas[0];
		
		torresBlancas[1].addActionListener(new Controlador(this,torresBlancas[1],2));
		fichasBlancas[9] = torresBlancas[1];
		
		alfilesBlancos[0].addActionListener(new Controlador(this,alfilesBlancos[0],3));
		fichasBlancas[10] = alfilesBlancos[0];
		
		alfilesBlancos[1].addActionListener(new Controlador(this,alfilesBlancos[1],3));
		fichasBlancas[11] = alfilesBlancos[1];
		
		caballosBlancos[0].addActionListener(new Controlador(this,caballosBlancos[0],4));
		fichasBlancas[12] = caballosBlancos[0];
		
		caballosBlancos[1].addActionListener(new Controlador(this,caballosBlancos[1],4));
		fichasBlancas[13] = caballosBlancos[1];
		
		reinaBlanca.addActionListener(new Controlador(this,reinaBlanca,5));
		fichasBlancas[14] = reinaBlanca;
		
		reyBlanco.addActionListener(new Controlador(this,reyBlanco,6));
		fichasBlancas[15] = reyBlanco;
		
		for(int i = 0;i < 8;i++) {
			peonesNegros[i].addActionListener(new Controlador(this,peonesNegros[i],1));
			fichasNegras[i] = peonesNegros[i];
		}
		
		torresNegras[0].addActionListener(new Controlador(this,torresNegras[0],2));
		fichasNegras[8] = torresNegras[0];
		
		torresNegras[1].addActionListener(new Controlador(this,torresNegras[1],2));
		fichasNegras[9] = torresNegras[1];
		
		alfilesNegros[0].addActionListener(new Controlador(this,alfilesNegros[0],3));
		fichasNegras[10] = alfilesNegros[0];
		
		alfilesNegros[1].addActionListener(new Controlador(this,alfilesNegros[1],3));
		fichasNegras[11] = alfilesNegros[1];
		
		caballosNegros[0].addActionListener(new Controlador(this,caballosNegros[0],4));
		fichasNegras[12] = caballosNegros[0];
		
		caballosNegros[1].addActionListener(new Controlador(this,caballosNegros[1],4));
		fichasNegras[13] = caballosNegros[1];
		
		reinaNegra.addActionListener(new Controlador(this,reinaNegra,5));
		fichasNegras[14] = reinaNegra;
		
		reyNegro.addActionListener(new Controlador(this,reyNegro,6));
		fichasNegras[15] = reyNegro;
		
	}
}
