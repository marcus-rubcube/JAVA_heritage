public class AuthUtil {
    public int password;
    public void setPassword(int password){
        this.password = password;
    }
    public boolean authentication(int password) {
        return this.password == password;
    }
}
