public class Main {
    public static void main(String[] args) {

        //Crear objetos
        Operario op1 = new Operario("Manuel", "Gomez", 43453219, "Maquinas");
        Directivo dir1 = new Directivo("Jorge", "Cuervo", 43564321, "Maquinaria");
        Oficial ofi1 = new Oficial("Damian", "Perez", 41234588, "Gruas", 12);
        Tecnico tec1 = new Tecnico("Martin", "Pagano", 42132576, "Sistemas", "Informatica");


        //Imprimir datos
        System.out.println(op1.toString());
        op1.operar();
        System.out.println("--------------------------");
        System.out.println(dir1.toString());
        dir1.supervisar();
        System.out.println("--------------------------");
        System.out.println(ofi1.toString());
        ofi1.dirigir();
        System.out.println("--------------------------");
        System.out.println(tec1.toString());
        tec1.programar();
    }
}