public class Admin extends Official implements Auth {
    private int password;

    private final AuthUtil util;

    public Admin() {
        this.util = new AuthUtil();
    }
    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public void setPassword(int password) {
        this.util.setPassword(password);
    }

    @Override
    public boolean authentication(int password) {
        return this.util.authentication(password);
    }
}
