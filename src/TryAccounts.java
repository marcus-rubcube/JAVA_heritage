public class TryAccounts {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(11, 111);
        ca.deposita(100);

        SavingAccount sa = new SavingAccount(22, 222);
        sa.deposita(200);

        ca.transfere(10,sa);

        System.out.println("ca: "+ca.getSaldo());
        System.out.println("sa: "+sa.getSaldo());
    }
}
