package Account;

public class SavingAccount extends Account{
    public SavingAccount (int agencia, int numero){
        super(agencia, numero);
    }

    public void deposita(double valor){
        super.saldo += valor;
    }
}
