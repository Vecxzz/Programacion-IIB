public class Main {
    public static void main(String[] args) {

        //Crear Cuenta de Ahorros
        SavingsAccount ca1 = new SavingsAccount(12000, 5);

        //Invocar Métodos
        ca1.consignar(2000);
        ca1.retirar(1000);
        ca1.extractoMensual();
        ca1.imprimir();
    }
}