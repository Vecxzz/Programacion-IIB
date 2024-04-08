import java.util.Random;

public class Picaro extends PersonajeBase {


    //Constructor
    public Picaro(String name, int level, int hp) {
        super(name, level, hp);
    }


    //Métodos
    public int attack() {
        return level * 2;
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