public class CurrentAccount extends Account {


    //Atributos
    private float overdraft = 0;


    //Constructor Sobrecargado
    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
        overdraft = 0;
    }


    //Métodos
    @Override
    public void retirar(float amount) {
        balance -= amount;

        if (balance < 0) {
            overdraft -= balance;
            balance = 0;
        }
        numberOfWithdrawals++;
    }


    @Override
    public void consignar(float amount) {
        super.consignar(amount);

        if (overdraft > 0) {
            if (amount <= overdraft) {
                overdraft -= amount;
            }
            else {
                overdraft = 0;
            }
        }
    }


    public void imprimir() {
        System.out.println("Sobregiro: $" + overdraft);
    }
}