import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(new Jugador("Lamine Yamal", "Delantero", 27));
        listaJugadores.add(new Jugador("Ter Stegen", "Arquero", 1));
        listaJugadores.add(new Jugador("Pau Cubarsí", "Defensor", 33));

        Equipo e1 = new Equipo(listaJugadores);


        //Mostrar jugadores
        System.out.println("Lista de jugadores:");
        for (Jugador jugador : e1) {
            System.out.println(jugador);
        }
    }
}