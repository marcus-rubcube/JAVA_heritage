package Account;

public class TryTaxable {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        CurrentAccount cc = new CurrentAccount(222, 333);
        cc.deposita(100);

        LifeInsurance insurance = new LifeInsurance();

        calculator.register(cc);
        calculator.register(insurance);

        System.out.println(calculator.getTotalTax());
    }
}
