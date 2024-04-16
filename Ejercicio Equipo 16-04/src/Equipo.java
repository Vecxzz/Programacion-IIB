import java.util.Iterator;
import java.util.List;

public class Equipo implements Iterable<Jugador> {


    private List<Jugador> jugadores;
    private int indice = 0;


    public Equipo(List<Jugador> jugadores) {
            this.jugadores = jugadores;
    }


    @Override
    public Iterator<Jugador> iterator() {
        return jugadores.iterator();
    }
}