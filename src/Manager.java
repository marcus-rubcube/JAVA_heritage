public class Manager extends Official implements Auth {
    private int password;
    public double getBonus(){
        return super.getSalary();
    }

    @Override
    public void setPassword(int password){
        this.password = password;
    }

    @Override
    public boolean authentication(int password) {
        return this.password == password;
    }
}
