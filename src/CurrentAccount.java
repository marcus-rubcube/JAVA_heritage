public class CurrentAccount extends Account {
    public CurrentAccount(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public boolean saca(double valor){
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    public void deposita(double valor){
        super.saldo += valor;
    }
}
