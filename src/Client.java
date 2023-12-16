public class Client implements Auth {
    private int password;

    private final AuthUtil util;

    public Client() {
        this.util = new AuthUtil();
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
