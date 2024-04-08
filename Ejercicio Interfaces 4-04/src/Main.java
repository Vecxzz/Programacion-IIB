public class Main {
    public static void main(String[] args) {

        Guerrero g1 = new Guerrero("Garen", 8, 500);
        Mago m1 = new Mago("Veigar", 10, 320);
        Picaro p1 = new Picaro("Twitch", 8, 250);

        System.out.println("Comienza la batalla");

        for (int i = 0; i < 3; i++) {
            System.out.println("Turno " + (i+1) + ":");

            //Ataque Guerreros
            int damageG = g1.attack();
            m1.defend(damageG);
            p1.defend(damageG);

            //Ataque Magos
            int damageM = m1.attack();
            g1.defend(damageM);
            p1.defend(damageM);

            //Ataque Picaros
            int damageP = p1.attack();
            g1.defend(damageP);
            m1.defend(damageP);

            //Mostrar estado de los personajes después de cada turno
            g1.mostrarVida();
            m1.mostrarVida();
            p1.mostrarVida();
        }
        System.out.println("La batalla ha terminado");
    }
}