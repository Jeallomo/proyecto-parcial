package JuegoAjedrez;

public class Jugador {
	private String nombre;
	private int turno; 	//Esto posiblemente se elimine
						// 1 o 2
	
	Jugador(String nombre, int turno){
		this.nombre = nombre;
		this.turno = turno;
	}
	
	//retorna true si es el turno de este jugador
	public boolean esTurno(int turno) {
		if((this.turno + turno)%2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}
}
