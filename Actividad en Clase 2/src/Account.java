public class Account {


    //Atributos
    protected float balance;
    protected int numberOfConsignments;
    protected int numberOfWithdrawals;
    protected float annualRate;
    protected float monthlyCommission;


    //Constructor Sobrecargado
    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }


    //Métodos
    public void consignar(float amount) {
        balance += amount;
        numberOfConsignments++;
        System.out.println("Se ha consignado la cantidad de $" + amount + " a su cuenta.");
    }


    public void retirar(float amount) {
        if (amount <= balance) {
            balance -= amount;
            numberOfWithdrawals++;
            System.out.println("Se ha retirado la cantidad de $" + amount + " de su cuenta.");
        }
        else {
            System.out.println("El monto a retirar no puede exeder el saldo actual.");
        }
    }


    public void calcularInteres() {
        float monthlyInterest = balance * (annualRate / 12) /100;
        balance += monthlyInterest;
    }


    public void extractoMensual() {
        balance -= monthlyCommission;
        calcularInteres();
    }


    public void imprimir() {
        System.out.println("Detalles de la Cuenta:");
        System.out.println("Saldo Actual: " + balance);
        System.out.println("Número de Consignaciones: " + numberOfConsignments);
        System.out.println("Número de Retiros: " + numberOfWithdrawals);
        System.out.println("Porcentaje de Tasa Anual: " + annualRate);
        System.out.println("Comisión Mensual: " + monthlyCommission);
    }
}