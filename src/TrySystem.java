public class TrySystem {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setPassword(2222);

        Admin ad = new Admin();
        ad.setPassword(3333);

        Client cli = new Client();
        cli.setPassword(4444);

        InternalSystem is = new InternalSystem();
        is.authentication(m);
        is.authentication(ad);
        is.authentication(cli);
    }
}
