public class Manager extends Official implements Auth {
    private int password;

private final AuthUtil util;

    public Manager() {
        this.util = new AuthUtil();
    }

    public double getBonus(){
        return super.getSalary();
    }

    @Override
    public void setPassword(int password){
        this.util.setPassword(password);
    }

    @Override
    public boolean authentication(int password) {
        return this.util.authentication(password);
    }
}
