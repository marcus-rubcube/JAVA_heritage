public class Client implements Auth {
    private int password;
    @Override
    public void setPassword(int password) {
        this.password = password;
    }
    @Override
    public boolean authentication(int password) {
        return this.password == password;
    }
}
