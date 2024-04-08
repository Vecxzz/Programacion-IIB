public abstract class PersonajeBase implements Personaje {


    //Atributos
    protected String name;
    protected int level;
    protected int hp;


    //Constructor
    public PersonajeBase(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public void mostrarVida() {
        System.out.println(name + " - Puntos de vida: " + hp);
    }
}