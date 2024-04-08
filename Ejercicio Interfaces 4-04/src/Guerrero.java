public class Guerrero extends PersonajeBase {


    //Constructor
    public Guerrero(String name, int level, int hp) {
        super(name, level, hp);
    }


    //Metodos
    @Override
    public int attack() {
        return level * 3;
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