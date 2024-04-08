import java.util.Random;

public class Mago extends PersonajeBase {


    //Constructor
    public Mago(String name, int level, int hp) {
        super(name, level, hp);
    }


    //Métodos
    public int attack() {
        return level * level;
    }

    @Override
    public void defend(int damage) {
        hp -= damage / 2;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " ha sido eliminado");
        }
    }
}