public class SavingsAccount extends Account {


    //Atributos
    private boolean active;


    //Constructor Sobrecargado
    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        active = (balance >= 10000);
    }


    //Métodos
    @Override
    public void consignar(float amount) {
        if (active) {
            super.consignar(amount);
        }
        else {
            System.out.println("Su cuenta de ahorros se encuentra INACTIVA. No se puede realizar la consignación");
        }
    }


    @Override
    public void retirar(float amount) {
        if (active) {
            super.retirar(amount);
        }
        else {
            System.out.println("Su cuenta de ahorros se encuentra INACTIVA. No se puede realizar el retiro");
        }
    }


    @Override
    public void extractoMensual() {
        if (numberOfWithdrawals > 4) {
            monthlyCommission += (numberOfWithdrawals - 4) * 1000;
        }
        active = (balance >= 10000);
        super.extractoMensual();
    }


    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta Activa: " + active);
    }
}