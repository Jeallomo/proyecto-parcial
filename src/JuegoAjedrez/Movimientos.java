package JuegoAjedrez;

import javax.swing.JButton;

public class Movimientos extends Interfaz{

	//MOVIMIENTOS
	
		void moverPeonBlanco(JButton peon) {
			//mueve el peon una casilla
			double X = peon.getLocation().getX();
			double Y = peon.getLocation().getY();
			peon.setLocation((int)X, (int)Y+ladoCasilla);
		}
		void moverPeonNegro(JButton peon) {
			//mueve el peon una casilla
			double X = peon.getLocation().getX();
			double Y = peon.getLocation().getY();
			peon.setLocation((int)X, (int)Y-ladoCasilla);
		}
		void matarPeonBlanco(JButton peon,int direccion) {//1 = izquierda ,, 2 = derecha
			double X = peon.getLocation().getX();
			double Y = peon.getLocation().getY();
			if(direccion == 1)
			peon.setLocation((int)X-ladoCasilla, (int)Y+ladoCasilla);
			else 
			peon.setLocation((int)X+ladoCasilla, (int)Y+ladoCasilla);	
		}
		void matarPeonNegro(JButton peon,int direccion) {//1 = izquierda ,, 2 = derecha
			double X = peon.getLocation().getX();
			double Y = peon.getLocation().getY();
			if(direccion == 1)
			peon.setLocation((int)X-ladoCasilla, (int)Y-ladoCasilla);
			else 
			peon.setLocation((int)X+ladoCasilla, (int)Y-ladoCasilla);	
		}
		void moverAlfil(JButton alfil,int direccion,int longitud) {
			/*direccion: 1 = izquierda-arriba
			 *           2 = derecha-arriba
			 *  1 2      3 = izquierda-abajo
			 *  3 4      4 = derecha-abajo
			 */
			double X = alfil.getLocation().getX();
			double Y = alfil.getLocation().getY();
			
			switch(direccion) {
			
			case 1:
				alfil.setLocation((int)X-longitud*ladoCasilla,(int)Y+longitud*ladoCasilla);
				break;
			case 2:
				alfil.setLocation((int)X+longitud*ladoCasilla,(int)Y+longitud*ladoCasilla);
				break;
			case 3:
				alfil.setLocation((int)X-longitud*ladoCasilla,(int)Y-longitud*ladoCasilla);
				break;
			case 4:
				alfil.setLocation((int)X+longitud*ladoCasilla,(int)Y-longitud*ladoCasilla);
				break;
			}
		}
		
		void moverTorre(JButton torre,int direccion,int longitud) {
			/*direccion: 1 = arriba
			 *     1     2 = derecha
			 *    4 2    3 = abajo
			 *     3     4 = izquierda
			 */
			double X = torre.getLocation().getX();
			double Y = torre.getLocation().getY();
			
			switch(direccion) {
			
			case 1:
				torre.setLocation((int)X,(int)Y+longitud*ladoCasilla);
				break;
			case 2:
				torre.setLocation((int)X+longitud*ladoCasilla,(int)Y);
				break;
			case 3:
				torre.setLocation((int)X,(int)Y-longitud*ladoCasilla);
				break;
			case 4:
				torre.setLocation((int)X-longitud*ladoCasilla,(int)Y);
				break;
			}
		}
		void moverRey (JButton rey,int direccion) {
			/*direccion: 
			 *    1 2 3   
			 *    4 R 6   R = POSICION DEL REY
			 *    7 8 9     
			 */
			double X = rey.getLocation().getX();
			double Y = rey.getLocation().getY();
			
			switch(direccion) {
			
			case 1:
				rey.setLocation((int)X-ladoCasilla,(int)Y+ladoCasilla);
				break;
			case 2:
				rey.setLocation((int)X,(int)Y+ladoCasilla);
				break;
			case 3:
				rey.setLocation((int)X+ladoCasilla,(int)Y+ladoCasilla);
				break;
			case 4:
				rey.setLocation((int)X-ladoCasilla,(int)Y);
				break;
			case 6:
				rey.setLocation((int)X+ladoCasilla,(int)Y);
				break;
			case 7:
				rey.setLocation((int)X-ladoCasilla,(int)Y-ladoCasilla);
				break;
			case 8:
				rey.setLocation((int)X,(int)Y-ladoCasilla);
				break;
			case 9:
				rey.setLocation((int)X+ladoCasilla,(int)Y-ladoCasilla);
				break;
		}
	}
		void moverReina (JButton reina,int direccion,int longitud) {
			/*direccion: 
			 *    1 2 3   
			 *    4 R 6   R = POSICION DEL REY
			 *    7 8 9     
			 */
			double X = reina.getLocation().getX();
			double Y = reina.getLocation().getY();
			
			switch(direccion) {
			
			case 1:
				reina.setLocation((int)X-longitud*ladoCasilla,(int)Y+longitud*ladoCasilla);
				break;
			case 2:
				reina.setLocation((int)X,(int)Y+longitud*ladoCasilla);
				break;
			case 3:
				reina.setLocation((int)X+longitud*ladoCasilla,(int)Y+longitud*ladoCasilla);
				break;
			case 4:
				reina.setLocation((int)X-longitud*ladoCasilla,(int)Y);
				break;
			case 6:
				reina.setLocation((int)X+longitud*ladoCasilla,(int)Y);
				break;
			case 7:
				reina.setLocation((int)X-longitud*ladoCasilla,(int)Y-longitud*ladoCasilla);
				break;
			case 8:
				reina.setLocation((int)X,(int)Y-longitud*ladoCasilla);
				break;
			case 9:
				reina.setLocation((int)X+longitud*ladoCasilla,(int)Y-longitud*ladoCasilla);
				break;
		}
	}
		
}
