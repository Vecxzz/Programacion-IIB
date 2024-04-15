package Composicion;

import java.util.ArrayList;
import java.util.List;

public class Casa {


    //Atributos
    private List<Puerta> doors;


    //Constructor
    public Casa(int cantPuertas, String materialPuerta) {
        doors = new ArrayList<>();
        for (int i = 0; i < cantPuertas; i++) {
            doors.add(new Puerta(materialPuerta));
        }
    }


    //Getters
    public List<Puerta> getDoors() {
        return doors;
    }
}