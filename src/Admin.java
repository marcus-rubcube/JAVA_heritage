public class Admin extends Official implements Auth {
    private int password;
    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authentication(int password) {
        return this.password == password;
    }
}
